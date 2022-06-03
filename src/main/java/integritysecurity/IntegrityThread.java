
package integritysecurity;

import blockchain.CurrentDateTime;
import blockchain.KeyGen;
import com.mycompany.tamperproofrdbmsblockchain.AdminOperationFrame;
import datastorage.Sorter;
import dbclasses.DBConnection;
import dbclasses.DataTableCreator;
import dbclasses.MySQLDBInserter;
import dbclasses.MySQLInformationExtractor;
import dbclasses.MySQLTableAttributesName;
import dbclasses.MySQLTableUpdater;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class IntegrityThread extends Thread
{
    String tablename="";
    String temkey="";
    
    public void setTableinfo(String tablename, String temkey)
    {
        this.tablename=tablename;
        this.temkey=temkey;
    }
    @Override
    public void run()
    {
        Statement st=new DBConnection().getDBConnection();
        ArrayList orgdata=new MySQLInformationExtractor().getAllTableinfo(st, tablename);
         orgdata=new Sorter().ascendingSortData(orgdata);
     //    tableinfo.forEach(row->System.out.println(row));
        
        while(true)
        {
             try {

                Thread.sleep(4000);
            } catch (Exception ex) {
            }
            
            String temptemkey="";
            ArrayList currentdata=new MySQLInformationExtractor().getAllTableinfo(st, tablename);
            currentdata=new Sorter().ascendingSortData(currentdata);
            
            for (int i = 0; i <currentdata.size(); i++) 
            {
               ArrayList row=(ArrayList) currentdata.get(i);
                
                 String block="";
                    for (int j = 0; j <row.size(); j++) 
                {
                     block=block+row.get(j);
                }
                    block=block+temptemkey;
                    block=block.trim();
                    String hashkey=new KeyGen().getKey(block);
                    temptemkey=hashkey; 
            }
            
            if(!temptemkey.equals(temkey))
            {
               
                String str="";
                String datetime=new CurrentDateTime().getCurrentDateTime();
                ArrayList result;
                try {
                    result = getIntegrityInfo(orgdata, currentdata, tablename,st);
                    for (int i = 0; i <result.size(); i++) 
                {
                    ArrayList row=(ArrayList) result.get(i);
                    
                    String res="Database Table Name "+tablename+" has been Tampered on  id:  "+row.get(0)+
                            " "+"at"+" "+"Date_Time"+" : "+datetime+" for the Attribute: "+row.get(1)+"\n";
                    
                    LinkedList integrityattributes=new LinkedList();
                    integrityattributes.add("TableName");
                    integrityattributes.add("Attribute_Name");
                    integrityattributes.add("Date_time");
                    
                                        
                    new DataTableCreator().createTableWithoutPrimaryKey(st, "integrityinfo", integrityattributes);
                    new MySQLDBInserter().insertIntegityinfo(st, tablename, row.get(1).toString(),datetime);
                   
        
        
                    String prestr= AdminOperationFrame.jTextArea1.getText();
                          prestr=prestr+"\n"+res;
                    AdminOperationFrame.jTextArea1.setText(prestr);
                }
                } catch (SQLException ex) {
                    Logger.getLogger(IntegrityThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
            
        }
    }
    
    
    ArrayList getIntegrityInfo(ArrayList orgdata, ArrayList currentdata, String tablename, Statement st) throws SQLException
    {
        ArrayList result= new ArrayList();
      
        ArrayList attributename=new MySQLTableAttributesName().getAttributesName(st, tablename);
        
        for (int i = 0; i <orgdata.size(); i++) 
        {
            ArrayList temp=new ArrayList();
            ArrayList row1=(ArrayList) orgdata.get(i);
            ArrayList row2=(ArrayList) currentdata.get(i);
            String rowid="";
            if(!row2.containsAll(row1))
            {
                for (int j = 0; j <row1.size(); j++) 
                {
                    String str1=(String) row1.get(j);
                    String str2=(String) row2.get(j);
                    
                    if(!str1.equals(str2))
                    {
                        rowid=(String) row2.get(0);
                        temp.add(rowid);
                        temp.add(attributename.get(j));
                    }
                }
                
                result.add(temp);
                
                new MySQLTableUpdater().updateTableinfo(st, tablename, row1, attributename, rowid);
            }
        }
        
        
        return result;
    }
    
    
    
}

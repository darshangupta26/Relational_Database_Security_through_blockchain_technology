
package blockchain;

import dbclasses.DataTableCreator;
import com.mycompany.tamperproofrdbmsblockchain.LoginFrame;
import dbclasses.DBConnection;
import dbclasses.MySQLDBInserter;
import java.sql.Statement;
import java.util.LinkedList;


public class BlockChainCreation {
    
    public boolean createBlockChain(LinkedList data, String filename)
    {
        boolean flag;
        try
        {
             Statement st=new DBConnection().getDBConnection();
        
                
        LinkedList attributes=(LinkedList) data.get(0);
        LinkedList newattributes=new LinkedList();
        
           
            
            for (int i = 0; i <attributes.size(); i++) 
            {
                String str=(String) attributes.get(i);
                str=str.replace(" ", "");
                newattributes.add(str);
                
            }
            
            
        String temkey="";
        for (int i = 1; i <data.size(); i++) 
            {
                LinkedList row=(LinkedList) data.get(i);
                
                 String block="";
                    for (int j = 0; j <row.size(); j++) 
                {
                     block=block+row.get(j);
                }
                    block=block+temkey;
                    block=block.trim();
                    String hashkey=new KeyGen().getKey(block);
                    temkey=hashkey;
                
                new DataTableCreator().createTableWithPrimaryKey(st, filename, newattributes,"sr_no");
                new MySQLDBInserter().insertData(st, filename,row);
                
                
            } 
        
        
        
        LinkedList blockattributes=new LinkedList();
        blockattributes.add("Userid");
        blockattributes.add("Filename");
        blockattributes.add("Date_time");
        blockattributes.add("Terminal_key");
        
        LinkedList blockinfo=new LinkedList();
        
        blockinfo.add(LoginFrame.userid);
        blockinfo.add(filename);
        blockinfo.add(new CurrentDateTime().getCurrentDateTime());
        blockinfo.add(temkey);
        
        new DataTableCreator().createTableWithPrimaryKey(st, "blockinfo", blockattributes,"filename");
        new MySQLDBInserter().insertData(st, "blockinfo",blockinfo);
        flag=true;
            
        }
        catch(Exception e)
        {
            System.out.println("Exception in BlockChainCreation Class in createBlockChain() is: "+e);
            flag=false;
        }
       
        
        return flag;
    }
    
}


package dbclasses;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MySQLTableUpdater {
    
    
    public boolean updateUserinfo(Statement st, String name, String dob, String add,String email,String mob,String uid,String pass, String authkey)
    {
        boolean flag;
        
        try
        {
            
           String query="Update registerinfo set Name='"+name+"',DOB='"+dob+"',Address='"+add+"',Email='"+email+"',Mobile='"+mob+"',Password='"+pass+"',Authentication_Key='"+authkey+"' where Userid='"+uid+"'";
            System.out.println("query: "+query);           
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
            
        }
        
        catch(SQLException e)
        {
            System.out.println("Exception in ClientInformationUpdater Class is: "+e);
            flag=false;
        }
        
        
        return flag;
    }
    
     public boolean updateTableinfo(Statement st, String tablename, ArrayList data,ArrayList attributes,String rowid)
    {
        boolean flag;
        
        try
        {
           String query1="";
           
            for (int i = 1; i <attributes.size(); i++) 
            {
               query1=query1+attributes.get(i)+"="+"'"+data.get(i)+"'"+",";
            }
            query1=query1.substring(0, query1.length()-1);
            query1=query1+" "+"where sr_no="+"'"+rowid+"'";
            query1=query1.trim();
            String query="Update"+" "+tablename+" "+"set"+" "+query1;
                   
            
            int x=st.executeUpdate(query);
            if(x>0)
                flag=true;
            else
                flag=false;
            
            
        }
        
        catch(SQLException e)
        {
            System.out.println("Exception in ClientInformationUpdater Class is: "+e);
            flag=false;
        }
        
        
        return flag;
    }
    
}

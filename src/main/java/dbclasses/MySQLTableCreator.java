
package dbclasses;

import java.sql.SQLException;
import java.sql.Statement;

public class MySQLTableCreator {
    
    public boolean createTable(Statement st, String tablename)
    {
        boolean flag;
        
         try
        {
                                 
               String query="CREATE TABLE IF NOT EXISTS"+" "+tablename+
                   "(Name VARCHAR(45), "
                    + " DOB VARCHAR(45), "
                    + " Address VARCHAR(45), "
                    + " Email VARCHAR(45),"
                    + " Mobile VARCHAR(45),"
                    + " Userid VARCHAR(45),"
                    + " Password VARCHAR(45),"
                    + " Authentication_Key VARCHAR(45),"
                    + " PRIMARY KEY (Userid))";
               
               int x=st.executeUpdate(query);
                
               flag = x>0;
            
            }            
             
        
        catch(Exception e)
        {
            System.out.println("Exception in MySQLTableCreator Class is: "+e);
            flag=false;
        }
        
        
        return flag;
    }
}

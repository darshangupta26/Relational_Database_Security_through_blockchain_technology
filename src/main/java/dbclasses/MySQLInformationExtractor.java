/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbclasses;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import java.util.LinkedList;

public class MySQLInformationExtractor {
    
     public LinkedList getClientInformation(Statement st, String tablename, String userid)
    {

       LinkedList clientinfo=new LinkedList();

        try
        {

                  
            String query="Select *from"+" "+tablename+" "+"where Userid='"+userid+"'";

            ResultSet rs=st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int column_count = rsmd.getColumnCount();
            
             
             while(rs.next())
            {
                for (int i = 1; i <=column_count; i++) 
                {
                    clientinfo.add(rs.getString(i));
                }
                          
            }
             
            
        }

        catch(SQLException e)
        {
            System.out.println("Exception in MySQLnformationExtractor Class is: "+e);

        }

       return clientinfo;
    }
    
      
      public ArrayList getBlockinfo(Statement st, String tablename, String userid)
    {

       ArrayList blockinfo=new ArrayList();

        try
        {

                     
            String query="Select *from"+" "+tablename+" "+"where Userid='"+userid+"'";

            ResultSet rs=st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int column_count = rsmd.getColumnCount();
            
             
             while(rs.next())
            {
                ArrayList temp=new ArrayList();
                for (int i = 1; i <=column_count; i++) 
                {
                    temp.add(rs.getString(i));
                }
                
                blockinfo.add(temp);
                          
            }
             
           
            
        }

        catch(SQLException e)
        {
            System.out.println("Exception in MySQLnformationExtractor Class in getBlockinfo() is: "+e);

        }

       return blockinfo;
    }
    
      public ArrayList getAllTableinfo(Statement st, String tablename)
    {

       ArrayList tableinfo=new ArrayList();

        try
        {
          
            String query="Select *from"+" "+tablename;

            ResultSet rs=st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int column_count = rsmd.getColumnCount();
            
             
             while(rs.next())
            {
                ArrayList temp=new ArrayList();
                for (int i = 1; i <=column_count; i++) 
                {
                    temp.add(rs.getString(i));
                }
                
                tableinfo.add(temp);
                          
            }
             
           
        }

        catch(SQLException e)
        {
            System.out.println("Exception in MySQLnformationExtractor Class in getAllBlockinfo() is: "+e);

        }

       return tableinfo;
    }
   
 
    
}

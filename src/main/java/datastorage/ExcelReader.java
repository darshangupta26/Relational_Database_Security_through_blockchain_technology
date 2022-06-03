package datastorage;

import java.io.*;
import java.util.LinkedList;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
 /* Import declarations to the JExcel JAR file *//* Import declarations to the JExcel JAR file */
public class ExcelReader /* The name of our class file */
{

    public LinkedList getExcelData(String path)
    {
        LinkedList data=new LinkedList();

      try
        {
            Workbook ReadExcel = Workbook.getWorkbook(new File(path));
            Sheet sheet = ReadExcel.getSheet(0);
            int a=sheet.getColumns();
            int b=sheet.getRows();

            for (int i=0;i<b;i++)
            {
                LinkedList in=new LinkedList();
                
                if(i==0)
                {
                    in.add("sr_no");
                    for(int j=0;j<a;j++)
                {

                Cell a1 = sheet.getCell(j,i); /* Get the first cell of Column A , 0 maps to A */

                String ed = a1.getContents();
                ed=ed.trim();
                ed=ed.toLowerCase();
                in.add(ed);
                }
                    
                }
                
                else
                {
                 in.add(Integer.toString(i));   
                for(int j=0;j<a;j++)
                {

                Cell a1 = sheet.getCell(j,i); /* Get the first cell of Column A , 0 maps to A */

                String ed = a1.getContents();
                ed=ed.trim();
                ed=ed.toLowerCase();

                in.add(ed);
                }
                }
                data.add(in);
                
            }
              ReadExcel.close();
            }
        catch (IOException | IndexOutOfBoundsException | BiffException i)
        {
            System.out.println("Exception in ExcelReader Class in getExcelData():  "+i);
        }

        return data;
        
    }
}
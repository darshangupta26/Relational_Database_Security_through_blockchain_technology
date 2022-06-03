/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datastorage;

import java.util.ArrayList;


public class Sorter

{

  public ArrayList ascendingSortData(ArrayList data) 
  {

        for (int i = 0; i < (data.size() - 1); i++)// bubble sort
        {
            for (int j = i + 1; j < data.size(); j++) 
            {

                ArrayList m = new ArrayList();
                ArrayList h = new ArrayList();

                m = (ArrayList) data.get(i);
                h = (ArrayList) data.get(j);

                int a = Integer.parseInt(m.get(0).toString());               
                int b = Integer.parseInt(h.get(0).toString());

                if (a>b) {
                    data.set(i, h);
                    data.set(j, m);
                }

            }

        }

        return data;
    }



    



     








 }








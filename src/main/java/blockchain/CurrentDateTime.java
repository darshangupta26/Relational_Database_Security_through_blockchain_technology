
package blockchain;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class CurrentDateTime {
    
    
    public String getCurrentDateTime()
    {
        
        String datetime=new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());  
        return datetime;
    }
    
}

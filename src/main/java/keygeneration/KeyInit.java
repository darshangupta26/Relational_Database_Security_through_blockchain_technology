
package keygeneration;

import com.mycompany.tamperproofrdbmsblockchain.TamperInterface;


public class KeyInit implements TamperInterface{
    
  
    @Override
    public String generateKey(String str)
    {
        String hashkey="";
        
        String key=new MD5().getMD5Key(str);
        
       
        for (int i = 0; i <4; i++) 
        {
            char c=key.charAt(i*6);
            
            int aschii=c;
            aschii=aschii%10;
            hashkey=hashkey+Integer.toString(aschii);
        }
        
        return hashkey;
    }
    
}

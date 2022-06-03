
package com.mycompany.tamperproofrdbmsblockchain;


import static java.awt.Frame.MAXIMIZED_BOTH;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
          try { 
             UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
            } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ignored){}

             LoginFrame mf = new LoginFrame();
             mf.setVisible(true);
             mf.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
}

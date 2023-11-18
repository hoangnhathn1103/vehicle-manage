    
package qlpt;

import View.MenuUser;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class QLPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuUser mn;                   
          try {
             mn = new MenuUser();
             mn.show();
        } catch (SQLException e) {
        }
       
               
    }
    
}

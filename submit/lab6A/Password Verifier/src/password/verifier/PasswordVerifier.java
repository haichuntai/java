/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password.verifier;

import javax.swing.JOptionPane;

/**
 *
 * @author 19219
 */
public class PasswordVerifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        str = JOptionPane.showInputDialog("Enter a password");
        password paw = new password();
        paw.getString(str);
        if(paw.isValid()){
            JOptionPane.showMessageDialog(null, "Vaild password");
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid password");
        }
    }
    
}

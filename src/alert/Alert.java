package alert;

import javax.swing.*;


public class Alert extends JOptionPane {
    public Alert(String msg) {
        showMessageDialog(null, msg, getClass().toString(), JOptionPane.ERROR_MESSAGE);
    }
}

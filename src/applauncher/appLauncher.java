package applauncher;

import javax.swing.SwingUtilities;

public class appLauncher {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
		new footballApp().setVisible(true);

            }
        });
        
        
    }

}

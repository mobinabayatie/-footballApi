package applauncher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class footballApp extends JFrame {
	 private JSONArray leagueData;
	  private static JPanel Panel;
	    
	    public footballApp() {
	        
		// Setup GUI and Add a Title
		super("برنامه نتایج فوتبال");
			
		// Config Gui end program it has been closed
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		// Set the Size of Our GUI (in Pixels)
		setSize(1080,650);
			
		// Load Our Application at the Center of Screen
		setLocationRelativeTo(null);
			
	        // set manually position Our Components
	        setLayout(null);
			
		// Prevent any Resize
		setResizable(false);
	        
	        // Set background color
	        Color backgroundColor = new Color(86, 183, 254);
	        getContentPane().setBackground(backgroundColor);
			
		addGuiComponents();
	    }
	    private void addGuiComponents(){
	        
	        
	        // set colors for buttons
	        Color ButtonColor = new Color(236, 198, 1);
	        
	        // set fonts for buttons
	        Font buttonFont = new Font("Arial", Font.BOLD, 16);
	        
	        
	        // italy Button
	        JButton Button1 = new JButton("Italy");
	        Button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		Button1.setBounds(890, 30, 120, 50);
	        Button1.setBackground(ButtonColor);
	        Button1.setFont(buttonFont);
	        Button1.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData = appApi.getLeagueData(135);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject);
	                }           
	            }          
	        });
	        add(Button1);
	        

	    
}

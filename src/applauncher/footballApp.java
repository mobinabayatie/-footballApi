package applauncher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
	        Color ButtonColor = new Color(100, 100, 0);
	        
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
	        
	        // france Button
	        JButton Button2 = new JButton("France");
	        Button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Button2.setBounds(330, 30, 120, 50);
	        Button2.setBackground(ButtonColor);
	        Button2.setFont(buttonFont);
	        Button2.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData = appApi.getLeagueData(61);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject);
	                }            
	            }          
	        });
	        add(Button2);

	        // iran Button
	        JButton Button3 = new JButton("Iran"); 
	        Button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Button3.setBounds(610, 30, 120, 50);
	        Button3.setBackground(ButtonColor);
	        Button3.setFont(buttonFont);
	        Button3.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData =appApi .getLeagueData(290);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject);
	                }            
	            }          
	        });
	        add(Button3);
 
	        // england Button
	        JButton Button4 = new JButton("England");
	        Button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Button4.setBounds(190, 30, 120, 50);
	        Button4.setBackground(ButtonColor);
	        Button4.setFont(buttonFont);
	        Button4.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData = appApi.getLeagueData(39);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject); 
	                }            
	            }          
	        });
	        add(Button4);
	        
	        // spain Button
	        JButton Button5 = new JButton("Spain");
	        Button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Button5.setBounds(470, 30, 120, 50);
	        Button5.setBackground(ButtonColor);
	        Button5.setFont(buttonFont);
	        Button5.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData =appApi.getLeagueData(140);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject);
	                }            
	            }          
	        });
	        add(Button5);
	        
	        // germany Button
	        JButton Button6 = new JButton("Germany");       
	        Button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Button6.setBounds(750, 30, 120, 50);
	        Button6.setBackground(ButtonColor);
	        Button6.setFont(buttonFont);
	        Button6.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData = appApi.getLeagueData(78);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject);
	                }            
	            }          
	        });
	        add(Button6);
	        
	        // world cup Button
	        JButton Button7 = new JButton("World Cup");
	        Button7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Button7.setBounds(50, 30, 120, 50);
	        Button7.setBackground(ButtonColor);
	        Button7.setFont(buttonFont);
	        Button7.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                
	                // remove all green panels form main panel
	                Panel.removeAll();
	                
	                leagueData = appApi.getLeagueData(1);
	                
	                for (Object element : leagueData) {
	                    JSONObject fixtureObject = (JSONObject) element;
	                    showFixtureDetails(fixtureObject);
	                }            
	            }          
	        });
	        add(Button7);  
	        
	        // set panel color
	        Color panelColor = new Color(100, 00, 00);
	        
	        // main panel setting
	        Panel = new JPanel();
	        Panel.setBounds(50, 100, 960, 450);
	        Panel.setBackground(panelColor);
	        Panel.setLayout(new GridLayout(0, 1,10,10));
	        add(Panel);
	        
	        // add scroll to main panel
	        JScrollPane scrollPane = new JScrollPane(Panel);
	        scrollPane.setBounds(50, 100, 960, 450);
	        getContentPane().add(scrollPane);
	    }
	    

}

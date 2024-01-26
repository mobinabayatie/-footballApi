package applauncher;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
	        Color backgroundColor = new Color(255, 255, 0);
	        getContentPane().setBackground(backgroundColor);
			
		addGuiComponents();
	    }
	    private void addGuiComponents(){
	        
	        
	        // set colors for buttons
	        Color ButtonColor = new Color(51, 153, 255);
	        
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
	        Color panelColor = new Color(255, 102, 00);
	        
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
	    private void showFixtureDetails(JSONObject fixtureObject) {
	        
	        // get fixture,league,team,goals from fixtureObject
	        JSONObject fixture = (JSONObject) fixtureObject.get("fixture");
	        JSONObject league = (JSONObject) fixtureObject.get("league"); 
	        JSONObject teams = (JSONObject) fixtureObject.get("teams"); 
	        JSONObject goals = (JSONObject) fixtureObject.get("goals");
	        
	        // get home and away from teams
	        JSONObject homeTeam = (JSONObject) teams.get("home");
	        JSONObject awayTeam = (JSONObject) teams.get("away");
	        
	        // get venue from fixture
	        JSONObject venue = (JSONObject) fixture.get("venue");
	        
	        // set color for green panels
	        Color rowColor = new Color(166, 210, 1);
	        
	        // set green panels
	        JPanel rowPanel = new JPanel();
	        rowPanel.setPreferredSize(new Dimension(400, 200));
	        rowPanel.setBackground(rowColor);
	        rowPanel.setLayout(null);
	        Panel.add(rowPanel);
	         
	        // label for date
	        JLabel label1 = new JLabel((String)fixture.get("date"));
	        label1.setBounds(380, 30, 300, 50);
	        label1.setFont(new Font("Arial", Font.PLAIN, 16));
	        rowPanel.add(label1);
	        
	        // label for home name
	        JLabel label2 = new JLabel((String)homeTeam.get("name"));
	        label2.setBounds(150, 80, 250, 50);
	        label2.setFont(new Font("Arial", Font.PLAIN, 18));
	        rowPanel.add(label2);
	        
	        // label for home goals
	        JLabel label3 = new JLabel(String.valueOf((Long)goals.get("home")));
	        label3.setBounds(350, 80, 30, 50);
	        label3.setFont(new Font("Arial", Font.BOLD, 25));
	        rowPanel.add(label3);
	        
	        // label for away goals
	        JLabel label4 = new JLabel(String.valueOf((Long)goals.get("away")));
	        label4.setBounds(600, 80, 30, 50);
	        label4.setFont(new Font("Arial", Font.BOLD, 25));
	        rowPanel.add(label4); 
	        
	        // label for home name
	        JLabel label5 = new JLabel((String)awayTeam.get("name"));
	        label5.setBounds(700, 80, 180, 50);
	        label5.setFont(new Font("Arial", Font.PLAIN, 18));
	        rowPanel.add(label5);
	        
	        // label for round
	        JLabel label6 = new JLabel((String)league.get("round"));
	        label6.setBounds(420, 1, 200, 50);
	        label6.setFont(new Font("Arial", Font.PLAIN, 16));
	        rowPanel.add(label6);
	        
	        // label for referee
	        JLabel label7 = new JLabel((String)fixture.get("referee"));
	        label7.setBounds(400, 120, 500, 50);
	        label7.setFont(new Font("Arial", Font.PLAIN, 16));
	        rowPanel.add(label7);
	        
	        // label for referee
	        JLabel label8 = new JLabel((String)venue.get("name") + " - " + venue.get("city") );
	        label8.setBounds(400, 150, 500, 50);
	        label8.setFont(new Font("Arial", Font.PLAIN, 16));
	        rowPanel.add(label8);
	        // reset main panel
	        Panel.revalidate();
	        Panel.repaint();
	        
	    }

}

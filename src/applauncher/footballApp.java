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
		super(" نتایج فوتبال");
			
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
	        JButton Buttonitaly = new JButton("Italy");
	        Buttonitaly.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Buttonitaly.setBounds(890, 30, 120, 50);
	        Buttonitaly.setBackground(ButtonColor);
	        Buttonitaly.setFont(buttonFont);
	        Buttonitaly.addActionListener(new ActionListener() {
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
	        add(Buttonitaly);
	        
	        // france Button
	        JButton Buttonfrance = new JButton("France");
	        Buttonfrance.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Buttonfrance.setBounds(330, 30, 120, 50);
	        Buttonfrance.setBackground(ButtonColor);
	        Buttonfrance.setFont(buttonFont);
	        Buttonfrance.addActionListener(new ActionListener() {
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
	        add(Buttonfrance);

	        // iran Button
	        JButton Buttoniran = new JButton("Iran"); 
	        Buttoniran.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Buttoniran.setBounds(610, 30, 120, 50);
	        Buttoniran.setBackground(ButtonColor);
	        Buttoniran.setFont(buttonFont);
	        Buttoniran.addActionListener(new ActionListener() {
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
	        add(Buttoniran);
 
	        // england Button
	        JButton Buttonengland = new JButton("England");
	        Buttonengland.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Buttonengland.setBounds(190, 30, 120, 50);
	        Buttonengland.setBackground(ButtonColor);
	        Buttonengland.setFont(buttonFont);
	        Buttonengland.addActionListener(new ActionListener() {
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
	        add(Buttonengland);
	        
	        // spain Button
	        JButton Buttonspain = new JButton("Spain");
	        Buttonspain.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Buttonspain.setBounds(470, 30, 120, 50);
	        Buttonspain.setBackground(ButtonColor);
	        Buttonspain.setFont(buttonFont);
	        Buttonspain.addActionListener(new ActionListener() {
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
	        add(Buttonspain);
	        
	        // germany Button
	        JButton Buttongermany = new JButton("Germany");       
	        Buttongermany.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    Buttongermany.setBounds(750, 30, 120, 50);
	        Buttongermany.setBackground(ButtonColor);
	        Buttongermany.setFont(buttonFont);
	        Buttongermany.addActionListener(new ActionListener() {
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
	        add(Buttongermany);
	        
	        // world cup Button
	        JButton ButtonWCup = new JButton("World Cup");
	        ButtonWCup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));			
		    ButtonWCup.setBounds(50, 30, 120, 50);
	        ButtonWCup.setBackground(ButtonColor);
	        ButtonWCup.setFont(buttonFont);
	        ButtonWCup.addActionListener(new ActionListener() {
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
	        add(ButtonWCup);  
	        
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

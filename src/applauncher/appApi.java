package applauncher;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class appApi {
	 public static JSONArray getLeagueData(int LeagueID){
	        
	        
	        // set Season value
	        int seasonYear;
	        
	        // if league id is for world cup
	        if(LeagueID == 1){
	            seasonYear = 2022;
	        }
	        else{
	            seasonYear = 2023;
	        }
	        
	              
	        // build API request URL with LeagueID
		String urlString = "https://v3.football.api-sports.io/fixtures?" +
		        "league=" + LeagueID + "&season=" + seasonYear + "&status=FT";
	        
	        try{
	            // call api and get response
		    HttpURLConnection conn = fetchApiResponse(urlString);
	            
	            // check for response status
		    // 200 - means that the connection was a success
		    if(conn.getResponseCode() != 200){
		        System.out.println("Error: Could not connect to API");
		        return null;
		    }
	            
	            // store resulting json data
	            StringBuilder resultJson = new StringBuilder();
	            Scanner scanner = new Scanner(conn.getInputStream());
		    while(scanner.hasNext()){
		        // read and store into the string builder
		        resultJson.append(scanner.nextLine());
		    }
		    // close scanner
		    scanner.close();

		    // close url connection
		    conn.disconnect();
	            
	            // parse through our data
	            JSONParser parser = new JSONParser();
		    JSONObject resultJsonObj = (JSONObject) parser.parse(String.valueOf(resultJson));
	            
	            // retrieve response data
	            JSONArray responseArray = (JSONArray) resultJsonObj.get("response");
	            
	            return responseArray ;
	            
	        }catch(Exception e){
		    e.printStackTrace();
		}
	        
	        return null;
	    }
	    
	 private static HttpURLConnection fetchApiResponse(String urlString){
			try{
			    // attempt to create connection
			    URL url = new URL(urlString);
			    HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			    // set request method to get
			    conn.setRequestMethod("GET");
		            
		            // set request headers and api key
		            conn.setRequestProperty("x-rapidapi-key", "ca4384d2759d61fbce7bf5f8d9786dca");
		            conn.setRequestProperty("x-rapidapi-host", "v3.football.api-sports.io");
		            

			    // connect to our API
			    conn.connect();
			    return conn;
		            
			}catch(IOException e){
			    e.printStackTrace();
			}

			// could not make connection
			return null;
		    }

}

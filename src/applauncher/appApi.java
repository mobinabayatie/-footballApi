package applauncher;

import org.json.simple.JSONArray;

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
}

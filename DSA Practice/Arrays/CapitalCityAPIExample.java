import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.json.JSONArray;

public class CapitalCityAPIExample {
    public static void main(String[] args) {
        try {
            String countryName = "Afghanisthan"; // Change this to the desired country name
            
            // Construct the API URL
            String apiUrl = "https://jsonmock.hackerrank.com/api/countries?name="+countryName;
            
            // Make an HTTP request
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            int responseCode = connection.getResponseCode();
            
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                
                // Parse the JSON response
                JSONArray jsonArray = new JSONArray(response.toString());
                JSONObject countryObject = jsonArray.getJSONObject(0);
                String capitalCity = countryObject.getString("capital");
                
                System.out.println("Capital city of " + countryName + " is: " + capitalCity);
            } else {
                System.out.println("Failed to fetch data. Response code: " + responseCode);
            }
            
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

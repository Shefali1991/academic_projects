import org.json.JSONObject;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;

public class Zip_Code {

public static void main(String args[])
{

getZip_Code();
}

public static String getZip_Code()
{
try {
String Key="SH8Be5Im18StbtqknXgm9a9aoJZsukum2CXhHGDJOvd0ZDknBAJKLSV9CVC6g6si";
String zip_code="90210";
URL url = new URL("https://www.zipcodeapi.com/rest/"+Key+"/info.json/"+zip_code+"/degrees");
HttpURLConnection conn = (HttpURLConnection) url.openConnection();
conn.setRequestMethod("GET");
conn.setRequestProperty("Accept", "application/json");
if (conn.getResponseCode() != 200) 
{
	throw new RuntimeException("Failed : HTTP error code : "
+ conn.getResponseCode());
}

BufferedReader br = new BufferedReader(new InputStreamReader(
(conn.getInputStream())));

String jsonData="";
String address;
while ((address = br.readLine()) != null) {
jsonData += address + "\n";
}
JSONObject jsonObject = new JSONObject(jsonData);
   
System.out.println(jsonObject.getString("city"));
System.out.println(jsonObject.getString("state"));
conn.disconnect();
} catch (MalformedURLException e) {
e.printStackTrace();

 } 
catch (IOException e) {

e.printStackTrace();

 }
return "";
}

}
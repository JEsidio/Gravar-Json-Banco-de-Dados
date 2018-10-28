import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {


		 OkHttpClient client = new OkHttpClient();

	        Request request = new Request.Builder()
	                .url("https://gist.githubusercontent.com/leandersonandre/df4dabdfd109a4c5daf98384b8e5ce60/raw/a63101d9ad934442de7b9fda58dce0a5d3185005/cidades.json")
	                .build();
	        try {
	            Response response = client.newCall(request).execute();
	            String result = response.body().string();
	            JSONObject object = new JSONObject(result);
	            if(object.has("cidades")){
	                System.out.println(object.get("cidades"));
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }

	}

}

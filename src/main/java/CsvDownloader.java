import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class CsvTools {
    private
    public String downloadCsv(String url) throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            return httpClient.execute(request, httpResponse ->
                    EntityUtils.toString(httpResponse.getEntity()));
        }
    }
}

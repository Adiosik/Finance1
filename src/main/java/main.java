import java.io.BufferedInputStream;
import java.net.URL;

class Main {
    private static String APIkey = "V2M8GQGGP5LUC19";

    public static void main(String[] args) throws Exception {
        getCompany("AMD");
    }

    public static void getCompany(String key) throws Exception {

        String urlValue = "https://www.alphavantage.co/query?function=SYMBOL_SEARCH&keywords=" + key + "&apikey=" + APIkey;
        URL url = new URL(urlValue);
        BufferedInputStream stream = new BufferedInputStream(url.openConnection().getInputStream());
        String result = new String(stream.readAllBytes());
        System.out.println(result);
    }

}


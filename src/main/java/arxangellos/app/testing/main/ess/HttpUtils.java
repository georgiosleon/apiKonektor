package arxangellos.app.testing.main.ess;

import arxangellos.app.testing.main.ess.biz.IO_Utils;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
// green-field prj
//


public class HttpUtils {

    HttpClient client = HttpClient.newHttpClient();

    public void runHttP(RequestDataObject rdo) throws IOException, InterruptedException {

        String requestBody = IO_Utils.getResourceFileAsString("testsdir/ess/issues/00_DataEntryRequest_EUL-000001.xml");
        // todo note this can come from rest API
        // todo parse requestBody   and extract  variables  into Map < String  , String >
        // todo maybe get Mediatype from file suffix

        String SOAPAction = "http://www.europa.eu/schengen/ees/webservice/v1/DataEntry";

        String contentTypeWithCharSet = "text/xml" + "; charset=" + StandardCharsets.UTF_8.name();

        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(
                    Enviroments.FAT.getUrl()
              ))
              .header("SOAPAction", SOAPAction)//
              .header("Content-Type", contentTypeWithCharSet)
              // todo set headers from  a  StringMap  <Sting  , String >
              .POST(HttpRequest.BodyPublishers.ofString(requestBody
              ))
              .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        int responseStatusCode = response.statusCode();

        // interesting stuff from request
        String requestMethod = request.method();
        HttpHeaders requestHeaders = request.headers();

        // interesting stuff from response
        HttpHeaders responseHeaders = response.headers();
        String responseBody = response.body();

        String requestMethodFromResponse = response.request().method();
        HttpHeaders requestHeadersFromResponse = response.request().headers();

        // sanity check
        if (!requestMethod.equals(requestMethodFromResponse) || !requestHeaders.equals(requestHeadersFromResponse)) {
            org.tinylog.Logger.error("requestMethod or requestHeaders  not the same on response.request()  and   request ");
            return;// exit todo this shoudl never happen if it does  what to do ???
        }

        // rdo is updated with common values from responseBody

//        printReportResults()

        // todo log results  of   request
        // todo update variables  for next request
        // todo goto next request step

//        Logger.info("REQ  --> REQUEST");
//        Utils.printHeaders(requestHeaders);
//        Logger.info("\n\nREQUEST-METHOD\t\t -> \t\t{}", requestMethod);
//        Logger.info("\n\nREQUEST-BODY\n\n{}", requestBody);
//        Logger.info("RESP <-- RESPONSE");
//        Utils.printHeaders(responseHeaders);
//        Logger.info("\n\nRESPONSE StatusCode\t\t -> \t\t {}  {} ", HttpStatus.resolve(responseStatusCode), responseStatusCode, responseBody);
//        Logger.info("\n\nRESPONSE-BODY{}", responseStatusCode, responseBody);
//        Logger.info("done request  ... DataEntry ... ");
    }


}
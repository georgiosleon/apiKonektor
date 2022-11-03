package arxangellos.app.testing.main.ess;

import java.util.HashMap;
import java.util.Map;

public class RequestDataObject {

    private Map<String, String> requestConstants = new HashMap<>();
    /**
     * requestConstants don't change if found in request they override the value in the request
     ***************/

    private Map<String, String> responseVariables = new HashMap<>();
    /**
     * responseVariables that can also be updated from response if matched , if not matched stay as is
     **************/

    // HTTP
    String HttpMethod = "POST";  // GET
    String MediaType = "text/xml";  // or        text/json

    // Business vars
    public String TravellerId = "v11:TravellerFileID";
    public String DocumentNumber = "v11:DocumentNumber";
    public String TravellerFileServiceSOAP12BaseUrl = "TravellerFileServiceSOAP12BaseUrl";

    public Map<String, String> getRequestConstants() {
        return requestConstants;
    }

    public Map<String, String> getResponseVariables() {
        return responseVariables;
    }


    public RequestDataObject() {

    }

    //////   Request       VARS
    // adders   hers
    public Map<String, String> addTravellerId(String travellerIdKey, String travellerIdValue) {
        responseVariables.put(travellerIdKey, travellerIdValue);
        return responseVariables;
    }

    public Map<String, String> addDocumentNumber(String docNumKey, String docNumValue) {
        responseVariables.put(docNumKey, docNumValue);
        return responseVariables;
    }


    //////
    //////
    //////   Request       Constants
    public Map<String, String> addRequestUrl(String requestUrlKey, String requestUrlValue) {
        requestConstants.put(requestUrlKey, requestUrlValue);
        return requestConstants;
    }


}

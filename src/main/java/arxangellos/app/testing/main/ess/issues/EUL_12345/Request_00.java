package arxangellos.app.testing.main.ess.issues.EUL_12345;


import arxangellos.app.testing.main.ess.RequestDataObject;

class Request_00 {

    RequestDataObject rdo = new RequestDataObject();

    public void setup() {

        // set url and environment
        rdo.addRequestUrl(rdo.TravellerFileServiceSOAP12BaseUrl,
              "http://nui-web-ees-app-fat-ir3.app-nees.snuimev9ocp01-robuh1.ees.devtest.eulisa.local/services/ees/v1/TravellerFileEndpoint");

        // setup business
        rdo.addTravellerId(rdo.TravellerId, "b4ecdaae-67d6-4691-8c42-cf34cd4c6c7d");
        rdo.addDocumentNumber(rdo.DocumentNumber, "ROU302103543282534");


    }


    public static void runTest02() {

    }


    public static void runTest03() {

    }


}
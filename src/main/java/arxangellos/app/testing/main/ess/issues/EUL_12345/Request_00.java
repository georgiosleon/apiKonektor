package arxangellos.app.testing.main.ess.issues.EUL_12345;


import arxangellos.app.testing.main.ess.RequestDataObject;

class Request_00 {

    RequestDataObject rdo = new RequestDataObject();

    public void setup() {

        // set url and environment
        rdo.addRequestUrl(rdo.TravellerFileServiceSOAP12BaseUrl,
              "");

        // setup business
        rdo.addTravellerId(rdo.TravellerId, "");
        rdo.addDocumentNumber(rdo.DocumentNumber, "");


    }


    public static void runTest02() {

    }


    public static void runTest03() {

    }


}
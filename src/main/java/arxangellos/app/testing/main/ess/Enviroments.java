package arxangellos.app.testing.main.ess;

public enum Enviroments {


    FAT("http://nui-web-ees-app-fat-ir3.app-nees.snuimev9ocp01-robuh1.ees.devtest.eulisa.local/services/ees/v1/TravellerFileEndpoint"),
    PROD("https://prod.domain.com:1088/"),
    SIT("https://sit.domain.com:2019/"), CIT("https://cit.domain.com:8080/"), DEV("https://dev.domain.com:21323/");


    private String url;

    Enviroments(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }

}

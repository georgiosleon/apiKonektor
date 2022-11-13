package arxangellos.app.testing.main.ess;

public enum Enviroments {


    FAT(""),
    PROD(""),
    SIT(""),
    CIT(""),
    DEV("");


    private String url;

    Enviroments(String envUrl) {
        this.url = envUrl;
    }

    public String getUrl() {
        return url;
    }

}

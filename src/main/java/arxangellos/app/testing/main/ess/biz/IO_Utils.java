package arxangellos.app.testing.main.ess.biz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.http.HttpHeaders;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IO_Utils {

    public static String getResourceFileAsString(String fileName) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(fileName)) {
            if (is == null) {
                return null;
            }
            try (InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                  BufferedReader reader = new BufferedReader(isr)) {
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        }
    }


    public static void printHeaders(HttpHeaders responseHeaders) {
        System.out.println("Headers.. key, value: ");
        for (Map.Entry<String, List<String>> entry : responseHeaders.map().entrySet()) {
            String key = entry.getKey();
            for (String value : entry.getValue()) {
                System.out.println("\t\t" + StringUtils.right(key, 50, ' ') + " : " + value);
            }//for
        }//for
    }// method


}// class

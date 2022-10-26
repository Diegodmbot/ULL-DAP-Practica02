package CSVManager;

import java.util.ArrayList;
import java.util.Arrays;

public class CSVFile {
    // String const for the separator
    public static final String SEPARATOR = ",";
    private final String headers;
    private final ArrayList<ArrayList<String>> records;

    public CSVFile(String[] rawContent) {
        headers = rawContent[0];
        records = new ArrayList<>();
        for (int i = 1; i < rawContent.length; i++) {
            records.add(new ArrayList<>(Arrays.asList(rawContent[i].split(SEPARATOR))));
        }
    }
    public void print() {
        System.out.println(headers);
        for (ArrayList<String> record : records) {
            System.out.println(String.join(SEPARATOR, record));
        }
    }
}

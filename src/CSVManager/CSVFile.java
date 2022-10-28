package CSVManager;

import java.util.ArrayList;
import java.util.Arrays;

public class CSVFile {
    public static final String SEPARATOR = ",";
    private final ArrayList<String> headers;
    private final ArrayList<ArrayList<String>> records;

    public CSVFile(String[] rawContent) {
        headers = new ArrayList<>(Arrays.asList(rawContent[0].split(SEPARATOR)));
        records = new ArrayList<>();
        for (int i = 1; i < rawContent.length; i++) {
            records.add(new ArrayList<>(Arrays.asList(rawContent[i].split(SEPARATOR))));
        }
    }
    public ArrayList<String> getHeaders() {
        return headers;
    }
    public String getValue(int i, int j) {
        return records.get(i).get(j);
    }
    public int getSize() {
        return records.size();
    }
    public String[] getValuesNonRepeated(int xAxis) {
        ArrayList<String> values = new ArrayList<>();
        for (int j = 0; j < records.size(); j++) {
            if (!values.contains(records.get(j).get(xAxis))) {
                values.add(records.get(j).get(xAxis));
            }
        }
        return values.toArray(new String[0]);
    }
    public void print() {
        System.out.println(headers);
        for (ArrayList<String> record : records) {
            System.out.println(String.join(SEPARATOR, record));
        }
    }

}

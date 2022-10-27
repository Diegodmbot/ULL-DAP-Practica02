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
    public String getRecords(int i, int j) {
        return records.get(i).get(j);
    }
    public String[] getValuesNonRepeated(int i) {
        ArrayList<String> values = new ArrayList<>();
        for (int j = 0; j < records.size(); j++) {
            if (!values.contains(records.get(j).get(i))) {
                values.add(records.get(j).get(i));
            }
        }
        return values.toArray(new String[0]);
    }
    public int[] getSumOfValuesByColumn(int xAxis, int yAxis) {
        int[] sumOfValues = new int[getValuesNonRepeated(xAxis).length];
        for (int i = 0; i < records.size(); i++) {
            for (int j = 0; j < getValuesNonRepeated(xAxis).length; j++) {
                if (records.get(i).get(xAxis).equals(getValuesNonRepeated(xAxis)[j])) {
                    sumOfValues[j] += Integer.parseInt(records.get(i).get(yAxis));
                }
            }
        }
        return sumOfValues;
    }
    public void print() {
        System.out.println(headers);
        for (ArrayList<String> record : records) {
            System.out.println(String.join(SEPARATOR, record));
        }
    }

}

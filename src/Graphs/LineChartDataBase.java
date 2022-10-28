package Graphs;

import CSVManager.CSVFile;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Arrays;

public class LineChartDataBase implements iCreateDataBase {
    @Override
    public CategoryDataset createDataBase(CSVFile file, int xAxis, int yAxis) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Guarda los valores de la columna X
        String[] xAxisValues = file.getValuesNonRepeated(xAxis);
        for (int i = 0; i < xAxisValues.length; i++) {
            int sum = 0;
            for (int j = 0; j < file.getSize(); j++) {
                if (file.getValue(j, xAxis).equals(xAxisValues[i])) {
                    sum += Integer.parseInt(file.getValue(j, yAxis));
                }
            }
            dataset.addValue(sum, file.getValue(i, xAxis), file.getValue(i, yAxis));
            System.out.println("Sum of " + file.getValue(i, xAxis) + " is " + sum);
        }
        return dataset;
    }
}

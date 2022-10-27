package Graphs;

import CSVManager.CSVFile;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChartDataBase implements iCreateDataBase {
    @Override
    public CategoryDataset createDataBase(CSVFile file, int xAxis, int yAxis) {
        System.out.println("Entra");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        // Get the x axis values
        String[] xAxisValues = file.getValuesNonRepeated(xAxis);
        for (int i = 0; i < xAxisValues.length; i++) {
            // Get the sum of y axis by x axis
            for
        }
        return dataset;
    }
}

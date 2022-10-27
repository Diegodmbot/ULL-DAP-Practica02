package Graphs;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.ui.RefineryUtilities;

import java.awt.*;

public class BarChart extends Chart {
    public BarChart(String applicationTitle, String chartTitle) {
        super(applicationTitle);
        createDataBase = new BarChartDataBase();
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "X",
                "X",
                createDataBase.createDataBase(),
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new Dimension( 560 , 367 ) );
        setContentPane(chartPanel);
    }

    public void display() {
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);
    }
}

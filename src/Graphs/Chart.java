package Graphs;

import org.jfree.ui.ApplicationFrame;

import java.util.ArrayList;
import java.util.Map;

public abstract class Chart extends ApplicationFrame {
    iCreateDataBase createDataBase;
    int xAxis, yAxis;
    public Chart(String applicationTitle, int xAxis, int yAxis) {
        super(applicationTitle);
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
    public abstract void display();
}

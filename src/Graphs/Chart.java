package Graphs;

import org.jfree.ui.ApplicationFrame;

public abstract class Chart extends ApplicationFrame {
    iCreateDataBase createDataBase;
    public Chart(String applicationTitle) {
        super(applicationTitle);
    }
    public abstract void display();
}

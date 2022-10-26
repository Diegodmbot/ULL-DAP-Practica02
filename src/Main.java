import  CSVManager.CSVFile;
import URLManager.HTTPFileDownloader;
import Graphs.*;
import java.util.Scanner;

public class Main {
    /**
     * Descargar csv pequeños
     * https://www.stats.govt.nz/large-datasets/csv-files-for-download/
     */
    public static void main(String[] args) {
        // Introducir archivo para descargar
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la URL del archivo CSV:");
        String url = sc.nextLine();
        // Descargar archivo
        System.out.println("Downloading from: " + url);
        String[] contents = HTTPFileDownloader.downloadFromURL(url).split("\n");
        CSVFile data = new CSVFile(contents);
        data.print();
        // Mostrar gráfica
//        System.out.println("Introduce el tipo de gráfica (bar/line):");
//        String type = sc.nextLine();
//        Chart chart;
//        if (type.equals("bar")) {
//            chart = new BarChart();
//        } else {
//            chart = new LineChart();
//        }
//        chart.display();
    }
}

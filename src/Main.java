import java.util.Scanner;
import CSVManager.CSVFile;
import URLManager.HTTPFileDownloader;
import Graphs.*;

public class Main {
    /**
     * Enlace para descargar el archivo CSV
     * https://cnecovid.isciii.es/covid19/resources/hosp_uci_def_sexo_edad_provres_todas_edades.csv
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
        System.out.println("Introduce el tipo de gráfica (bar/line):");
        String type = sc.nextLine();
        Chart chart;
        if (type.equals("bar")) chart = new BarChart("Covid", "Covid");
        else chart = new LineChart("Covid", "Covid");
        chart.display();
    }
}

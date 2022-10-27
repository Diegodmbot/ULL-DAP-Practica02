import java.util.Scanner;
import CSVManager.CSVFile;
import URLManager.HTTPFileDownloader;
import Graphs.*;

public class Main {
    /**
     * Enlace para descargar el archivo CSV
     * https://cnecovid.isciii.es/covid19/resources/hosp_uci_def_sexo_edad_provres_todas_edades.csv
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
        // data.print();
        // Crear gráfica
        System.out.println("Introduce el tipo de gráfica (bar/line):");
        String type = sc.nextLine();
        System.out.println("Introduce el indice del eje X:");
        Integer xAxis = Integer.valueOf(sc.nextLine());
        System.out.println("Introduce el indice del eje Y:");
        Integer yAxis = Integer.valueOf(sc.nextLine());
        Chart chart;
        if (type.equals("bar")) chart = new BarChart("Practica02", "Practica02", data, xAxis, yAxis);
        else chart = new LineChart("Practica02", "Practica02", data, xAxis, yAxis);
        // Mostrar gráfica
        chart.display();
    }
}

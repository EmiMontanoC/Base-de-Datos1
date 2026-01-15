package Bases_de_datos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
public class Datos_Asentamientos {
    public static void main(String[] args){
        TreeMap<Integer, Integer> Codigos_postal_list = new TreeMap<>();
        try {
            BufferedReader CSVReader = new BufferedReader(new FileReader("Bases_de_datos/codigos_postales_hmo(used).csv"));
            String linea;
            while ((linea =CSVReader.readLine()) != null) {
                String[] datos = linea.split(",");
                int Codigo_postal=Integer.parseInt(datos[0].trim());
                Codigos_postal_list.put(Codigo_postal,Codigos_postal_list.getOrDefault(Codigo_postal, 0)+1);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Lectura completa");
        System.err.println("Listado:");
        for(int codigo : Codigos_postal_list.keySet()){
            System.out.println("Codigo Postal: " + codigo + "- Numero de asentamientos: " + Codigos_postal_list.get(codigo));
        }
    }
}



//Estimacion de tiempo y notas
//Tiempo estimado total: 80min
// Investigar librerias para manejo de datos y CSV: 20min
// Planeacion de la estructura semi-inicial del codigo: 15min
// Escritura del codigo: 30min
// Pruebas y correcciones 15min

//Tiempo real total: 35min
//Investigar librerias para manejo de datos y CSV: 10min
//Planeacion de la estructura semi_inicial del codigo: 10 min
//Escritura del codigo: 5min
//pruebas y correcciones: 10min


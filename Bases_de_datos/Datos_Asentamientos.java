import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
public class Datos_Asentamientos {
    public static void main(String[] args){
        TreeMap<Integer, Integer> Codigos_postal_list = new TreeMap<>();
        try {
            BufferedReader CSVReader = new BufferedReader(new FileReader("codigos_postales_hmo(used).csv"));
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

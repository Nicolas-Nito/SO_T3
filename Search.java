import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Search{

    String archName;
    public Search(String arch){
        archName = arch;
    }
    public void buscador(){
    try {
        File palabras = new File(archName);
        Scanner lector = new Scanner(palabras);
        while (lector.hasNextLine()) {
          String linea = lector.nextLine();
          System.out.println(linea);
        }
        lector.close();
      } catch (FileNotFoundException e) {
        System.out.println("No se encontro archivo");
        e.printStackTrace();
      }
    }
    public static void main(String[] args){
        Search buscador = new Search("palabras.txt");
        buscador.buscador();
    }     
}
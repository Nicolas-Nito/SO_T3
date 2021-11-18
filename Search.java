import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Search{

  String[] listaLinea;
  
  public int buscador(String archName){
    try {
      File palabras = new File(archName);
      Scanner lector = new Scanner(palabras);
      while (lector.hasNextLine()) {
        String linea = lector.nextLine();
        listaLinea = linea.split(" ");
        for(int i=0; i<10; i++){
          if(listaLinea[i].equals("eiffel")){
            System.out.println(listaLinea[i]);
            lector.close();
            return(1);
          }
        }
      }
      lector.close();
    } 
    catch (FileNotFoundException e) {
      System.out.println("No se encontro archivo");
      e.printStackTrace();
    }
    return(0);
  }
  public static void main(String[] args){
      Search buscador=new Search();
      buscador.buscador("palabras.txt");
  }     
}
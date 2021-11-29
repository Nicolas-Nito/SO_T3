import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 
 
public class Search extends Thread{

  String[] listaLinea;
  long timer;
  public void run(){
    try {
      timer = System.currentTimeMillis();
      File palabras = new File("palabras.txt");
      Scanner lector = new Scanner(palabras);
      while (lector.hasNextLine()) {
        String linea = lector.nextLine();
        listaLinea = linea.split(" ");
        for(int i=0; i<10; i++){
          if(listaLinea[i].equals("eiffel")){
            System.out.println(listaLinea[i]);
            lector.close();
            timer = System.currentTimeMillis()-timer;
            System.out.println("Tiempo empleado: "+timer);
            System.out.println("---------------------------------");
            return;
          }
        }
      }
      lector.close();
    } 
    catch (FileNotFoundException e) {
      System.out.println("No se encontro archivo");
      e.printStackTrace();
    }
    return;
  }
     
}
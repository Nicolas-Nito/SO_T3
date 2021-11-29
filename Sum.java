import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 
 
public class Sum extends Thread{
    long timer;
    String[] listaLinea;
    public void run(){
        try{
            timer = System.currentTimeMillis();
            File numeros = new File("numeros.txt");
            Scanner lector = new Scanner(numeros);
            while(lector.hasNextLine()){
                String linea = lector.nextLine();
                listaLinea = linea.split(" ");
                for(int i=0; i<10;i++){
                    for(int o=i+1; o<10; o++){
                        if(Integer.parseInt(listaLinea[i]) + Integer.parseInt(listaLinea[o])==65){
                            System.out.println(listaLinea[i]+" + "+ listaLinea[o]+" = 65");
                            lector.close();
                            timer = System.currentTimeMillis()-timer;
                            System.out.println("Tiempo empleado: "+timer);
                            System.out.println("---------------------------------");
                            return;
                        }
                    }
                }
            }
            lector.close();
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro archivo");
            e.printStackTrace();
        }
        return;
    }



}
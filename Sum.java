import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Sum{

    String[] listaLinea;
    
    private int[] convert(String[] strList){
        int[] intList;
        
    }

    public int sumar(String archName){
        try{
            File numeros = new File(archName);
            Scanner lector = new Scanner(numeros);
            while(lector.hasNextLine()){
                String linea = lector.nextLine();
                listaLinea = linea.split(" ");
                listaLinea
                for(int i=0; i<10;i++){

                }
            }
        }
        catch{

        }
    }


}
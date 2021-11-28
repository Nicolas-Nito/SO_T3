import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Sum{

    String[] listaLinea;
    public int sumar(String archName){
        try{
            File numeros = new File(archName);
            Scanner lector = new Scanner(numeros);
            while(lector.hasNextLine()){
                String linea = lector.nextLine();
                listaLinea = linea.split(" ");
                for(int i=0; i<10;i++){
                    for(int o=i+1; o<10; o++){
                        if(Integer.parseInt(listaLinea[i]) + Integer.parseInt(listaLinea[o])==65){
                            System.out.println(listaLinea[i]+" + "+ listaLinea[o]+" = 65");
                            return(1);
                        }
                    }
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro archivo");
            e.printStackTrace();
        }
        return(0);
    }

    public static void main(String[] args){
        Sum sumador = new Sum();
        sumador.sumar("numeros.txt");
    }


}
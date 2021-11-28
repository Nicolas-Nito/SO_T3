import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.HashMap;


public class Morse{

    

    String[] listaLinea;
    String mensaje;
    public int decodificar(String archName){

    HashMap clave = new HashMap();
    
    clave.put(".-", "a");
    clave.put("-...","b");
    clave.put("-.-.","c");
    clave.put("-..","d");
    clave.put(".","e");
    clave.put("..-.","f");
    clave.put("--.","g");
    clave.put("....","h");
    clave.put("..","i");
    clave.put(".---","j");
    clave.put("-.-","k");
    clave.put(".-..","l");
    clave.put("--","m");
    clave.put("-.","n");
    clave.put("---","o");
    clave.put(".--.","p");
    clave.put("--.-","q");
    clave.put(".-.","r");
    clave.put("...","s");
    clave.put("-","t");
    clave.put("..-","u");
    clave.put("...-","v");
    clave.put(".--","w");
    clave.put("-..-","x");
    clave.put("-.--","y");
    clave.put("--..","z");

        try{
            File morse = new File(archName);
            Scanner lector = new Scanner(morse);
            while(lector.hasNextLine()){
                String linea = lector.nextLine();
                listaLinea=linea.split(' ');
                for(int i=0; i<listaLinea.length();i++){
                    mensaje = mensaje + clave.get(listaLinea[i]).toStrin()+' ';
                }
                mensaje=mensaje+'\n';
            }
            System.out.println(mensaje);
            return(1);
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro archivo");
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        Morse decodicador = new Morse();
        decodicador.decodificar("morse.txt");
    }

}
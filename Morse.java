
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 
import java.util.HashMap;


public class Morse extends Thread{

    

    String[] listaLinea;
    String mensaje="";
    long timer;
    public void run(){
        timer = System.currentTimeMillis();
        HashMap<String,String> clave = new HashMap<String,String>();
        
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
            File morse = new File("morse.txt");
            Scanner lector = new Scanner(morse);
            while(lector.hasNextLine()){
                String linea = lector.nextLine();
                listaLinea = linea.split(" ");
                int n = listaLinea.length;
                for(int i=0;i<n;i++){
                    mensaje = mensaje + clave.get(listaLinea[i]).toString()+' ';
                }
                mensaje=mensaje+'\n';
            }
            System.out.println(mensaje);
            lector.close();
            timer = System.currentTimeMillis()-timer;
            System.out.println("Tiempo empleado: "+timer);
            System.out.println("---------------------------------");
            return;
        }
        catch(FileNotFoundException e){
            System.out.println("No se encontro archivo");
            e.printStackTrace();
            return;
        }
    }
    
    

}
public class Main {
    public static void main(String[] args){
        Thread sumador = new Sum();
        Thread decodicador = new Morse();
        Thread buscador=new Search();

        sumador.start();
        decodicador.start();
        buscador.start();

    }
    
}

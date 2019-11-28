package patterns.finalizarRelatorios;

public class Zip implements Modo{
    @Override
    public void finalizar() {
        System.out.println("Zipando ...");
    }    
}
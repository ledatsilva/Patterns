package patterns.buscadorDeArquivos;
public class BuscadorCloud extends BuscadorArquivo{
    @Override
    public Boolean busca() {
        System.out.println("Buscando na Cloud...");
        return true;
    }    
}

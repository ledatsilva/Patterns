package patterns.buscadorDeArquivos;
public class BuscadorLocal extends BuscadorArquivo{
    @Override
    public Boolean busca() {
        System.out.println("Buscando no Local ...");
        return false;
    }   
}

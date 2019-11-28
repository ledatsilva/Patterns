package patterns.buscadorDeArquivos;
public class BuscadorRede extends BuscadorArquivo{
    @Override
    public Boolean busca() {
        System.out.println("Buscando na rede ...");
        return false;
    }   
}

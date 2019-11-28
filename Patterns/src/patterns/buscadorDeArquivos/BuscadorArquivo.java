package patterns.buscadorDeArquivos;
public abstract class BuscadorArquivo {
    private BuscadorArquivo proximo;
    public void setProximo(BuscadorArquivo proximo) {
        this.proximo = proximo;
    }
    public abstract Boolean busca();
    public Boolean buscarEmCadeia(){
        if (busca()==true){
            return true; 
        }else if (proximo!= null){
            return proximo.buscarEmCadeia();
        }else{
            return false;
        }
    }
}

package patterns.relatorios;
public abstract class Relatorio{
    protected abstract void exportar();  
    public void criar(){
        exportar();
    }    
}


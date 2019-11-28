package patterns.relatorios;
import patterns.finalizarRelatorios.Modo;
public abstract class Relatorio{
    protected abstract void exportar(); 
    private Modo modo;
    public void setModoProcessar(Modo modo) {
        this.modo = modo;
    }
    private void gerar(){
    System.out.println("Criando arquivo ...");
    }
    private void processar(){
        modo.finalizar();
    }  
    public void criar(){
        gerar();
        exportar();
        processar();
    }    
}


package patterns.relatorios;
public class PDF extends Relatorio{
    @Override
    protected void exportar() {
        System.out.println("Exportando PDF ...");
    }    
}

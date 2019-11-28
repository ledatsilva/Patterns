package patterns.relatorios;
public class TXT extends Relatorio{
    @Override
    protected void exportar() {
        System.out.println("Exportando TXT ...");
    }
}

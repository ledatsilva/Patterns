package patterns;
import patterns.relatorios.Relatorio;
import patterns.finalizarRelatorios.Zip;
import patterns.relatorios.PDF;
import patterns.buscadorDeArquivos.BuscadorArquivo;
import patterns.buscadorDeArquivos.BuscadorRede;
import patterns.buscadorDeArquivos.BuscadorLocal;
import patterns.buscadorDeArquivos.BuscadorCloud;
public class Patterns {
    public static void main(String[] args) {
        Relatorio r = new PDF();
        r.setModoProcessar(new Zip());
        r.criar();  
        BuscadorArquivo chainFree = new BuscadorLocal();
        BuscadorRede rede = new BuscadorRede();
        BuscadorArquivo cloud = new BuscadorCloud();
        rede.setProximo(cloud);
        chainFree.setProximo(rede); 
        BuscadorArquivo chainPremium = new BuscadorLocal();
        chainPremium.setProximo(cloud);
        Boolean achei = chainPremium.buscarEmCadeia();
        System.out.println("Resultado da busca do arquivo:"+achei);     
    }    
}

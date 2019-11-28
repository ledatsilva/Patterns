package patterns;
import patterns.relatorios.Relatorio;

import patterns.relatorios.PDF;
public class Patterns {
    public static void main(String[] args) {
        Relatorio r = new PDF();
        r.criar();  
        
        
    }    
}

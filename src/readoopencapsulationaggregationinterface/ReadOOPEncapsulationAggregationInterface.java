/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package readoopencapsulationaggregationinterface;

/**
 *
 * @author Marce
 */
public class ReadOOPEncapsulationAggregationInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p[] = new Pessoa[3];
        
        p[0] = new Pessoa(18, "Maria", "F");
        p[1] = new Pessoa(23, "Joao", "M");
        p[2] = new Pessoa(30, "Malu", "F");
        
        p[0].fazerAniversario();
        
        
        
        Livro l[] = new Livro[3];
        l[0] = new Livro("Quero Queijo", "Manuel Paiva", 300, p[0]);
        l[1] = new Livro("Paixao", "Miranda Goma", 120, p[1]);
        l[2] = new Livro("Esporte", "Junao Bruno", 210, p[2]);
        
        l[0].abrir();
        l[0].folear(297);
        l[0].avacarPag();
        l[0].avacarPag();
        l[0].avacarPag();
  
  
     
        System.out.println(l[0].detalhes());
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readoopencapsulationaggregationinterface;

/**
 *
 * @author Marce
 */
public class Livro implements Publicacao{
    
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String ti, String au, int pgt, Pessoa p){
        this.titulo = ti;
        this.autor = au;
        this.totPaginas = pgt;
        this.leitor = p;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String detalhes() {
        return "Livro: " + "titulo = " + titulo + ", autor = " + 
                autor + ",\n totPaginas = " + totPaginas + ", pagAtual = " 
                + pagAtual + ", aberto = " + aberto + ",\n leitor = " + leitor.getNome() +
                ", sexo = " + leitor.getSexo() + ", idade = "+ leitor.getIdade();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void avacarPag() {
        if(this.getTotPaginas() > this.getPagAtual()){
            this.setPagAtual(this.getPagAtual()+1);
        }       
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }

    @Override
    public void folear(int p) {
        if(this.getTotPaginas() < p){
            System.out.println("Impossivel folear");
        }else{
        this.setPagAtual(p);
        }
    }
    
}

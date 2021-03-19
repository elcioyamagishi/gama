package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        setPagAtual(paginaAtual);
    }
    
    int setPagAtual(int paginaAtual) {
        if((paginaAtual > 0 ) && (paginaAtual <= totalPaginas)) {
            this.paginaAtual = paginaAtual;
        }
        return paginaAtual;
    }

    public void avancarPagina() {
        if(paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    void retrocederPagina() {
        if( paginaAtual > 0) {
            paginaAtual--;
        }
    }

    void irParaPagina(int irPag) {
        if((irPag >= 0) && (irPag < totalPaginas)) {
            paginaAtual = irPag;
        }
    }
    int exibirPagina() {
        System.out.print("Pagina atual: ");
        return paginaAtual;
    }
    void mostrarCapa() {
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Paginas: " + totalPaginas);
    }

}

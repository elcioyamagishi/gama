package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        
        Ebook e = new Ebook("Mickey", "Disney", 50, 1);
        e.mostrarCapa();
        System.out.println(e.exibirPagina());
        e.avancarPagina();
        System.out.println(e.exibirPagina());
        e.irParaPagina(20);
        System.out.println(e.exibirPagina());
        e.retrocederPagina();
        System.out.println(e.exibirPagina());
              
    }
}

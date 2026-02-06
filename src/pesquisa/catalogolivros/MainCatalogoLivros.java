package pesquisa.catalogolivros;

public class MainCatalogoLivros {

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Clean Code", "Robert Martin", 2008);
        catalogo.adicionarLivro("Java Efetivo", "Joshua Bloch", 2018);
        catalogo.adicionarLivro("Arquitetura Limpa", "Robert Martin", 2017);

        System.out.println(catalogo.pesquisarPorAutor("Robert Martin"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000, 2010));
        System.out.println(catalogo.pesquisarPorTitulo("Java Efetivo"));
    }
}

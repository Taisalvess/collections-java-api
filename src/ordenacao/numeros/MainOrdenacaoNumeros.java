package ordenacao.numeros;

public class MainOrdenacaoNumeros {

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        ordenacao.adicionarNumero(10);
        ordenacao.adicionarNumero(3);
        ordenacao.adicionarNumero(25);
        ordenacao.adicionarNumero(7);

        System.out.println("Ordem crescente:");
        System.out.println(ordenacao.ordenarAscendente());

        System.out.println("Ordem decrescente:");
        System.out.println(ordenacao.ordenarDescendente());
    }
}

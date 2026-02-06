package pesquisa.catalogolivros.somanumeros;

public class MainSomaNumeros {

    public static void main(String[] args) {

        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(10);
        soma.adicionarNumero(5);
        soma.adicionarNumero(20);

        System.out.println("Números: " + soma.exibirNumeros());
        System.out.println("Soma: " + soma.calcularSoma());
        System.out.println("Maior: " + soma.encontrarMaiorNumero());
        System.out.println("Menor: " + soma.encontrarMenorNumero());
    }
}

package ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordenada = new ArrayList<>(numeros);
        Collections.sort(ordenada);
        return ordenada;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordenada = new ArrayList<>(numeros);
        Collections.sort(ordenada, Collections.reverseOrder());
        return ordenada;
    }
}

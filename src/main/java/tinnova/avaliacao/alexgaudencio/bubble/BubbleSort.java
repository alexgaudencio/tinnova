package tinnova.avaliacao.alexgaudencio.bubble;

public class BubbleSort {

    public BubbleSort() {
    }

    public int[] bubbleSort(int[] vetor) {
        return bubbleSort(vetor, 0);
    }

    private int[] bubbleSort(int[] vetor, int end) {
        int tamanho = vetor.length - end;

        if (tamanho < 2) {
            return vetor;
        } else if (tamanho == 2) {
            return trocarValores(vetor, 0);
        }
        for(int i = 0; i < vetor.length - end - 1; i++) {
            trocarValores(vetor, i);
        }
        return bubbleSort(vetor, end + 1);
    }

    private int[] trocarValores(int[] vetor, int pos) {
        if (vetor[pos] > vetor[pos + 1]) {
            int aux = vetor[pos + 1];
            vetor[pos + 1] = vetor[pos];
            vetor[pos] = aux;
        }
        return vetor;
    }

    public String imprimirResultado(int[] vetor) {
        StringBuilder resultado = new StringBuilder("O resultado ordenado é : {");
        for(int i = 0; i < vetor.length - 1; i++) {
            resultado.append(vetor[i]).append(", ");
        }
        return resultado.append(vetor[vetor.length - 1]).append("}").toString();
    }
}

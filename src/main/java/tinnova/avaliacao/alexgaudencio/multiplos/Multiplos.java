package tinnova.avaliacao.alexgaudencio.multiplos;

public class Multiplos {


    public int multiplosTresOuCinco(int valor) {
        int soma = 0;
        for (int i = 1; i <= valor; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        return soma;
    }
}

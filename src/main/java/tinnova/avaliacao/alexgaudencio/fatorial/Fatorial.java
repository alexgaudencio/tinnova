package tinnova.avaliacao.alexgaudencio.fatorial;

public class Fatorial {
    public long calcularFatorial(int valor) {
        return valor <= 0 ? 1 : valor * calcularFatorial(--valor);
    }
}

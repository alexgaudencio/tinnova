package tinnova.avaliacao.alexgaudencio.eleitores;

public class Eleitores {

    private int totalEleitores;
    private int votosValidos;
    private int votosBrancos;
    private int votosNulos;

    public Eleitores() {
        totalEleitores = 1000;
        votosValidos = 800;
        votosBrancos = 150;
        votosNulos = 50;
    }


    public double percentualValidos() {
        return calcularPercentual(votosValidos);
    }

    public double percentualBrancos() {
        return calcularPercentual(votosBrancos);
    }

    public double percentualNulos() {
        return calcularPercentual(votosNulos);
    }

    private double calcularPercentual(int valor) {
        return (double) valor / totalEleitores * 100;
    }
}

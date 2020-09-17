package tinnova.avaliacao.alexgaudencio.utils;

public enum Fabricante {
    CHEVROLET("Chevrolet"),
    VOLKSWAGEN("Volkswagen"),
    FIAT("Fiat"),
    RENAULT("Renault"),
    FORD("Ford"),
    TOYOTA("Toyota"),
    HYUNDAI("Hyundai"),
    JEEP("Jeep"),
    HONDA("Honda"),
    NISSAN("Nissan");
    //Apenas foram inseridos alguns exemplos, é possível completar essa lista com os demais modelos

    private final String fabricante;

    Fabricante(String value) {
        this.fabricante = value;
    }

    public String getFabricante() {
        return fabricante;
    }
}

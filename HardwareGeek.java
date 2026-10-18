public class HardwareGeek {
    protected double precioCosto;
    private String numeroSerie;

    public HardwareGeek(double precioCosto, String numeroSerie) {
        this.precioCosto = precioCosto;
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
}
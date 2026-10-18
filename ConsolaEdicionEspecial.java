public class ConsolaEdicionEspecial extends HardwareGeek {
    private String nombreFranquicia;

    public ConsolaEdicionEspecial(double precioCosto, String numeroSerie, String nombreFranquicia) {
        super(precioCosto, numeroSerie);
        this.nombreFranquicia = nombreFranquicia;
    }

    public double calcularGananciaEstimada(double precioPVP) {
        // Explicación de accesibilidad:
        // 1. precioCosto es 'protected': Se puede acceder directamente desde la subclase.
        // 2. numeroSerie es 'private': NO es accesible directamente. Obliga a llamar a getNumeroSerie().
        System.out.println("Procesando consola S/N: " + getNumeroSerie());
        return precioPVP - this.precioCosto;
    }

    public static void main(String[] args) {
        ConsolaEdicionEspecial consola = new ConsolaEdicionEspecial(350000.0, "SN-PS5-ZELDA", "Zelda Limited Edition");
        double ganancia = consola.calcularGananciaEstimada(500000.0);
        System.out.println("Ganancia estimada: $" + ganancia);
    }
}
public class VideojuegoFisico extends ProductoGeek {
    private String plataforma;
    private double pesoGramos;

    public VideojuegoFisico(String codigo, String nombre, double precioBase, String plataforma, double pesoGramos) {
        super(codigo, nombre, precioBase);
        this.plataforma = plataforma;
        this.pesoGramos = pesoGramos;
        System.out.println("Ejecutando constructor de la subclase: VideojuegoFisico");
    }

    public String getPlataforma() {
        return plataforma;
    }

    public double getPesoGramos() {
        return pesoGramos;
    }

    public static void main(String[] args) {
        System.out.println("--- Instanciando VideojuegoFisico ---");
        VideojuegoFisico juego = new VideojuegoFisico(
            "VJ-002", "Elden Ring", 45000.0, "PlayStation 5", 120.0
        );

        System.out.println("\nJuego: " + juego.getNombre() + " | Plataforma: " + juego.getPlataforma());
    }
}
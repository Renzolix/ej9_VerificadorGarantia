public class VerificadorGarantia {

    // Recibe 'Object' para poder evaluar subclases de distintas jerarquías (ProductoGeek y HardwareGeek)
    public static void analizarGarantia(Object objeto) {

        if (objeto instanceof VideojuegoFisico) {
            VideojuegoFisico vf = (VideojuegoFisico) objeto; // Downcasting seguro
            System.out.println("Analizando producto: " + vf.getNombre());
            System.out.println("-> Tipo: Videojuego Físico | Plataforma: " + vf.getPlataforma() + " | Peso: " + vf.getPesoGramos() + "g");
            System.out.println("-> Cobertura: Garantía de disco óptico por 90 días.");

        } else if (objeto instanceof ConsolaEdicionEspecial) {
            ConsolaEdicionEspecial c = (ConsolaEdicionEspecial) objeto; // Downcasting seguro
            System.out.println("Analizando hardware: S/N " + c.getNumeroSerie());
            System.out.println("-> Tipo: Consola Edición Especial");
            System.out.println("-> Cobertura: Garantía oficial de fábrica por 12 meses.");

        } else if (objeto instanceof ProductoGeek) {
            ProductoGeek p = (ProductoGeek) objeto;
            System.out.println("Analizando producto: " + p.getNombre());
            System.out.println("-> Tipo: Producto estándar. Garantía comercial de 30 días.");

        } else {
            System.out.println("Objeto desconocido sin cobertura de garantía.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Objeto de tipo ProductoGeek
        ProductoGeek juego = new VideojuegoFisico("VJ-01", "Zelda TOTK", 48000.0, "Nintendo Switch", 60.0);
        
        // Objeto de tipo HardwareGeek
        ConsolaEdicionEspecial consola = new ConsolaEdicionEspecial(400000.0, "SN-NSW-ZELDA", "Zelda Edition");
        
        // Objeto estándar de ProductoGeek
        ProductoGeek comic = new Comic("COM-01", "Sandman Vol 1", 20000.0, 1);

        analizarGarantia(juego);
        analizarGarantia(consola);
        analizarGarantia(comic);
    }
}
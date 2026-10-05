public class MainBiblioteca {

    public static void main(String[] args) {

        Libro libro = new Libro(
                "El Principito",
                "Antoine de Saint-Exupery",
                "123456"
        );

        Usuario usuario = new Usuario("Rayan", 1);

        System.out.println("=== BIBLIOTECA ===");

        libro.consultarDisponibilidad();

        usuario.prestarLibro(libro);

        libro.consultarDisponibilidad();

        Prestamo prestamo = new Prestamo(
                "04/10/2026",
                usuario,
                libro
        );

        System.out.println();
        System.out.println("=== PRESTAMO ===");
        prestamo.mostrarPrestamo();

        System.out.println();
        usuario.devolverLibro(libro);

        libro.consultarDisponibilidad();
    }
}
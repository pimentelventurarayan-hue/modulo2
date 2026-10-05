
public class Prestamo {

    private String fecha;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(String fecha, Usuario usuario, Libro libro) {
        this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }

    public void mostrarPrestamo() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Libro: " + libro.getTitulo());
    }
}

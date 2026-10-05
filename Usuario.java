import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void prestarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.prestarLibro();
            librosPrestados.add(libro);
            System.out.println(nombre + " tomo el libro.");
        } else {
            System.out.println("No se puede prestar el libro.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolverLibro();
            librosPrestados.remove(libro);
            System.out.println(nombre + " devolvio el libro.");
        } else {
            System.out.println("Este usuario no tiene ese libro.");
        }
    }
}
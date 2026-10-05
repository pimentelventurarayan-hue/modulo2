public class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestarLibro() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro " + titulo + " fue prestado.");
        } else {
            System.out.println("El libro no esta disponible.");
        }
    }

    public void devolverLibro() {
        disponible = true;
        System.out.println("El libro " + titulo + " fue devuelto.");
    }

    public void consultarDisponibilidad() {
        if (disponible) {
            System.out.println("El libro esta disponible.");
        } else {
            System.out.println("El libro no esta disponible.");
        }
    }
}


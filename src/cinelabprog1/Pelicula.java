package cinelabprog1;

import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private double Duracion;

    public Pelicula(String titulo, String director, double Duracion) {
        this.titulo = titulo;
        this.director = director;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo: " + titulo + ", director: " + director + ", Duracion: " + Duracion + '}';
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }
    public static Comparator<Pelicula> durAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o1.Duracion, o2.Duracion);
        }

    };
    public static Comparator<Pelicula> durDes = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o2.Duracion, o1.Duracion);
        }
    };
    public static Comparator<Pelicula> titu = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.titulo.compareTo(o2.titulo);
        }
    };
    public static Comparator<Pelicula> dire = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.director.compareTo(o2.director);
        }
    };
}

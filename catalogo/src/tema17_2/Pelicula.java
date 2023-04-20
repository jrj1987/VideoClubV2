package tema17_2;
public class Pelicula {

    private int id;
    private String titulo;
    private int anyo;
    private int puntuacion;
    private String sinopsis;

    public Pelicula(int id, String titulo, int anyo, int puntuacion, String sinopsis) {
        this.id = id;
        this.titulo = titulo;
        this.anyo = anyo;
        this.puntuacion = puntuacion;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return titulo + " (" + anyo + ")" + "[" + puntuacion + "]";
    }

}

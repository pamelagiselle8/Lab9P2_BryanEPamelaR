
package lab9p2_bryanespinal_pamelarramirez;


public class Resultado {
    private Clase clase;
    private Alumno alumno;
    private int nota = 0;

    public Resultado(Clase clase, Alumno alumno) {
        this.clase = clase;
        this.alumno = alumno;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota += nota;
    }
    
    
}

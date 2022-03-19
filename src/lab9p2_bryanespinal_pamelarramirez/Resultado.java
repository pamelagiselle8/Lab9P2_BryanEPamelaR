
package lab9p2_bryanespinal_pamelarramirez;


public class Resultado {
    private int idAlumno, idExamen, nota = 0;

    public Resultado(int idAlumno, int idExamen) {
        this.idAlumno = idAlumno;
        this.idExamen = idExamen;
    }
    
    public Resultado(int idAlumno, int idExamen, int nota) {
        this.idAlumno = idAlumno;
        this.idExamen = idExamen;
        this.nota = nota;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
}

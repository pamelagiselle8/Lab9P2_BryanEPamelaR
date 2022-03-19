
package lab9p2_bryanespinal_pamelarramirez;

import java.io.Serializable;
import java.util.ArrayList;


public class Examen implements Serializable {
    private int idExamen;
    private ArrayList <Pregunta> preguntas = new ArrayList();

    public Examen(int idExamen, ArrayList <Pregunta> preguntas) {
        this.idExamen = idExamen;
        this.preguntas = preguntas;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
}

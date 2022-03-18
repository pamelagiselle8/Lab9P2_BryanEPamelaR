
package lab9p2_bryanespinal_pamelarramirez;

import java.util.ArrayList;


public class Examen {
    private String idExamen;
    private ArrayList <Pregunta> preguntas = new ArrayList();

    public Examen(String idExamen, ArrayList <Pregunta> preguntas) {
        this.idExamen = idExamen;
        this.preguntas = preguntas;
    }

    public String getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(String idExamen) {
        this.idExamen = idExamen;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
    
    
}

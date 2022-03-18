
package lab9p2_bryanespinal_pamelarramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminExamenes {
    private ArrayList<Examen> examenes = new ArrayList();
    private File archivo = null;
    
    public adminExamenes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void addExamen(Examen examen){
        examenes.add(examen);
    }
    
    public void cargarArchivo() {
        try {            
            examenes = new ArrayList();
            Examen examen;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((examen = (Examen) objeto.readObject()) != null) {
                        examenes.add(examen);
                    }
                }
                catch (EOFException e) {
                    // Final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Examen examen : examenes) {
                bw.writeObject(examen);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

    
}


package lab9p2_bryanespinal_pamelarramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminAlumnos {
    private ArrayList<Alumno> alumnos = new ArrayList();
    private File archivo = null;
    
    public adminAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.alumnos = listaAlumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
        System.out.println(alumnos.size()+"sdfsdfdsfdfdss");
        escribirArchivo();
    }
    
    public void cargarArchivo() {
        try {            
            alumnos = new ArrayList();
            Alumno alumno;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((alumno = (Alumno) objeto.readObject()) != null) {
                        alumnos.add(alumno);
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
            for (Alumno alumno : alumnos) {
                bw.writeObject(alumno);
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

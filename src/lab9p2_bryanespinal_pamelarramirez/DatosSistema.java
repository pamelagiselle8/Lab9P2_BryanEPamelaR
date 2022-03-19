package lab9p2_bryanespinal_pamelarramirez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DatosSistema {
    Dba db = new Dba("./NeoBlackboard.mdb");
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Clase> clases = new ArrayList();
    ArrayList<Resultado> resultados = new ArrayList();
    
    public DatosSistema() {
        
    }
    
    // Cargar datos
    
    public void cargarDatos() {
        cargarUsuarios();
        cargarClases();
        cargarResultados();
    }
    
    public void cargarUsuarios() {
        usuarios = new ArrayList();
        db.conectar();
        try {
            db.query.execute("select Nombres,Nombre_De_Usuario,Contrasenia,RRHH from Maestros");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                usuarios.add(new Maestro(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        cargarArchivoAlumnos();
        if (!alumnos.isEmpty()) {
            for (Alumno alumno : alumnos) {
                usuarios.add(alumno);
            }
        }
    }
    
    public void cargarClases() {
        clases = new ArrayList();
        db.conectar();
        try {
            db.query.execute("select Nombre,Id,id_maestro from clase");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                clases.add(new Clase(rs.getString(1), rs.getInt(2), rs.getString(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        cargarExamenes();
    }
    
    public void cargarExamenes() {
        cargarArchivoExamenes();
        if (!examenes.isEmpty()) {
            for (Examen examen : examenes) {
                for (Clase clase : clases) {
                    if (clase.getIdExamen1() == examen.getIdExamen()) {
                        clase.setExamen1(examen);
                    }
                    else if (clase.getIdExamen2() == examen.getIdExamen()) {
                        clase.setExamen2(examen);
                    }
                }
            }
        }
    }
    
    public void cargarPreguntas() {
        db.conectar();
        for (Clase clase : clases) {
            try {
                clase.getExamen1().setPreguntas(new ArrayList());
            }
            catch (Exception e) {
                clase.getExamen2().setPreguntas(new ArrayList());
            }
        }
        try {
            db.query.execute("select id_clase,tipo_examen,Pregunta,respuesta from Preguntas");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                for (Clase clase : clases) {
                    if (rs.getInt(2) == clase.getExamen1().getIdExamen()) {
                        clase.getExamen1().getPreguntas().add(new Pregunta(rs.getString(3),rs.getBoolean(5)));
                    }
                    else if (rs.getInt(2) == clase.getExamen2().getIdExamen()) {
                        clase.getExamen2().getPreguntas().add(new Pregunta(rs.getString(3),rs.getBoolean(5)));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void cargarResultados() {
        db.conectar();
        try {
            db.query.execute("select id_alumno,id_examen,nota from resultados");
            ResultSet rs = db.query.getResultSet();
            while (rs.next()) {
                resultados.add(new Resultado(rs.getInt(1),rs.getInt(2),rs.getInt(3)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    // Metodos agregar
    
    public void agregarMaestro(String nombre, String usuario, String pass, String id) {
        db.conectar();
        try {
            // "'" + + "','"
            // "" + + "','"
            db.query.execute("INSERT INTO Maestros (Nombres,Contrasenia,RRHH,Nombre_De_Usuario) " + "Values ('" + nombre + "', '" + pass + "', '" + id + "','" + usuario + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void agregarClase(String nombre, String idMaestro, String idExamen1, String idExamen2) {
        db.conectar();
        try {
            db.query.execute("INSERT INTO clase (Nombre,id_maestro,id_examen1,Id_examen2) " + "Values ('" + nombre + "', '" + idMaestro + "', '" + idExamen1 + "','" + idExamen2 + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void agregarPregunta(int idClase, int idExamen, String pregunta, boolean respuesta) {
        db.conectar();
        try {
            db.query.execute("INSERT INTO Preguntas (id_clase,tipo_examen,Pregunta,respuesta) " + "Values ('" + idClase + "', '" + idExamen + "', '" + pregunta + "','" + respuesta + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void agregarResultado(int idAlumno, int idExamen, int nota) {
        db.conectar();
        try {
            db.query.execute("INSERT INTO resultados (id_alumno,id_examen,nota) " + "Values ('" + idAlumno + "', '" + idExamen + "', '" + nota + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    // Archivo alumnos
    
    private ArrayList<Alumno> alumnos = new ArrayList();
    private File archivoAlumnos = new File("./Alumnos.cbm");
    
    public void addAlumno(Alumno alumno){
        alumnos.add(alumno);
        try {
            escribirArchivoAlumnos();
        } catch (Exception e) {
        }
    }
    
    public void cargarArchivoAlumnos() {
        try {            
            alumnos = new ArrayList();
            Alumno alumno;
            if (archivoAlumnos.exists()) {
                FileInputStream entrada = new FileInputStream(archivoAlumnos);
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

    public void escribirArchivoAlumnos() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoAlumnos);
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
    
    // Archivo examenes
    
    private ArrayList<Examen> examenes = new ArrayList();
    private File archivoExamenes = new File("./Examenes.cbm");
    
    public void addExamen(Examen examen){
        examenes.add(examen);
        try {
            escribirArchivoExamenes();
        } catch (Exception e) {
        }
    }
    
    public void cargarArchivoExamenes() {
        try {            
            examenes = new ArrayList();
            Examen examen;
            if (archivoExamenes.exists()) {
                FileInputStream entrada = new FileInputStream(archivoExamenes);
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

    public void escribirArchivoExamenes() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivoExamenes);
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
    
    // Getters y setters

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public ArrayList<Resultado> getResultados() {
        return resultados;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }
    
    // Metodos para llenar componentes
    
    public DefaultComboBoxModel llenarCboMaestros() {
        DefaultComboBoxModel cboModel = new DefaultComboBoxModel();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Maestro) {
                cboModel.addElement(usuario);
            }
        }
        return cboModel;
    }
    
    public DefaultComboBoxModel llenarCboClases() {
        DefaultComboBoxModel cboModel = new DefaultComboBoxModel();
        for (Clase clase : clases) {
            cboModel.addElement(clase);
        }
        return cboModel;
    }
    
    public DefaultTableModel llenarTablaNotas(Clase clase) {
        DefaultTableModel tblModel = new DefaultTableModel();
        String[] a = new String[4];
        tblModel.setColumnCount(4);
        tblModel.setRowCount(resultados.size());
        a[0] = "Nombre";
        a[1] = "Clase";
        a[2] = "Examen";
        a[3] = "Calificacion";
        tblModel.setColumnIdentifiers(a);
        String nombre = "";
        int nota = 0, filas = 0, examen = 1;
        for (Resultado resultado : resultados) {
            if (clase.getExamen1().getIdExamen() == resultado.getIdExamen()
                || clase.getExamen2().getIdExamen() == resultado.getIdExamen()) {
                examen = 1;
                if (clase.getExamen2().getIdExamen() == resultado.getIdExamen()) {
                    examen = 2;
                }
                for (Alumno alumno : alumnos) {
                    if (alumno.getId() == String.valueOf(resultado.getIdAlumno())) {
                        nombre = alumno.getNombre();
                    }
                }
                nota = resultado.getNota();
                Object[] fila = new Object[3];
                fila[0] = nombre;
                fila[1] = clase;
                fila[2] = examen;
                fila[3] = nota;
                tblModel.addRow(fila);
                filas++;
            }
        }
        return tblModel;
    }
}

package lab9p2_bryanespinal_pamelarramirez;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.ArrayList;

public class DatosSistema {
    Dba db = new Dba("./NeoBlackboard.mdb");
    ArrayList<Usuario> usuarios = new ArrayList();
    ArrayList<Clase> clases = new ArrayList();
    adminAlumnos archivoAlumnos = new adminAlumnos("./alumnos.cbm");
    adminExamenes archivoExamenes = new adminExamenes("./examenes.cbm");
    
    // Cargar datos
    
    public void cargarDatos() {
        cargarUsuarios();
        cargarClases();
        cargarExamenes();
    }
    
    public void cargarUsuarios() {
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
        archivoAlumnos.cargarArchivo();
        if (!archivoAlumnos.getAlumnos().isEmpty()) {
            for (Alumno alumno : archivoAlumnos.getAlumnos()) {
                usuarios.add(alumno);
            }
        }
    }
    
    public void cargarClases() {
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
    }
    
    public void cargarExamenes() {
        archivoExamenes.cargarArchivo();
        if (!archivoExamenes.getExamenes().isEmpty()) {
            for (Examen examen : archivoExamenes.getExamenes()) {
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
    
    public void cargarPreguntas(String nombre, String idMaestro, String idExamen1, String idExamen2) {
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
            db.query.execute("select id_clase,tipo_examen,Pregunta,respuesta from clase");
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
            // "'" + + "','"
            // "" + + "','"
            db.query.execute("INSERT INTO clase (Nombre,id_maestro,id_examen1,Id_examen2) " + "Values ('" + nombre + "', '" + idMaestro + "', '" + idExamen1 + "','" + idExamen2 + "')");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    
    
    
}

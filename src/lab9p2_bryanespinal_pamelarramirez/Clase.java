
package lab9p2_bryanespinal_pamelarramirez;

import java.util.*;


public class Clase {
    private String nombre, idMaestro;
    private int id, IdExamen1, IdExamen2;
    private Date fecha;
    private Examen examen1, examen2;

    public Clase(String nombre, String idMaestro, int IdExamen1, int IdExamen2) {
        this.nombre = nombre;
        this.idMaestro = idMaestro;
        this.IdExamen1 = IdExamen1;
        this.IdExamen2 = IdExamen2;
    }
    
    public Clase(String nombre, int id, String idMaestro) {
        this.nombre = nombre;
        this.idMaestro = idMaestro;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(String idMaestro) {
        this.idMaestro = idMaestro;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Examen getExamen1() {
        return examen1;
    }

    public void setExamen1(Examen examen1) {
        this.examen1 = examen1;
    }

    public Examen getExamen2() {
        return examen2;
    }

    public void setExamen2(Examen examen2) {
        this.examen2 = examen2;
    }

    public int getIdExamen1() {
        return IdExamen1;
    }

    public void setIdExamen1(int IdExamen1) {
        this.IdExamen1 = IdExamen1;
    }

    public int getIdExamen2() {
        return IdExamen2;
    }

    public void setIdExamen2(int IdExamen2) {
        this.IdExamen2 = IdExamen2;
    }
    
}

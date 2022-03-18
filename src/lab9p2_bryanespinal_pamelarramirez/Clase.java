
package lab9p2_bryanespinal_pamelarramirez;

import java.util.*;


public class Clase {
    private String nombre, id, idMaestro, idExamen1, idExamen2;
    private Date fecha;

    public Clase(String nombre, String id, String idMaestro, String idExamen1, String idExamen2, Date fecha) {
        this.nombre = nombre;
        this.id = id;
        this.idMaestro = idMaestro;
        this.idExamen1 = idExamen1;
        this.idExamen2 = idExamen2;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(String idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String getIdExamen1() {
        return idExamen1;
    }

    public void setIdExamen1(String idExamen1) {
        this.idExamen1 = idExamen1;
    }

    public String getIdExamen2() {
        return idExamen2;
    }

    public void setIdExamen2(String idExamen2) {
        this.idExamen2 = idExamen2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}

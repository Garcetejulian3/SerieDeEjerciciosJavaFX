package com.cero.javaejercicio01.models;

public class Usuario {
    private String nombre;
    private String profesion;
    private String bioCorta;
    private String rutaImagen;

    public Usuario( String nombre, String profesion,String bioCorta,String rutaImagen) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.bioCorta = bioCorta;
        this.rutaImagen = rutaImagen;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getBioCorta() {
        return bioCorta;
    }

    public void setBioCorta(String bioCorta) {
        this.bioCorta = bioCorta;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}

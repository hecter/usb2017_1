/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Usuario {

    private String usuario;
    private String password;

    /**
     * Crea una instacia de la clase usuario 
     */
    public Usuario() {
    }

    /**
     * a
     * @param usuario
     * @param password
     */
    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}

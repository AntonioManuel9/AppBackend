package com.appinicio.pruebas.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String nombre;
	private String apellidos;
	private String userEveris;
	private String userCaixa;
	private String contraseña;
	private Date fecCreacion;
	private Date fecMod;
	private Date fecUltAcceso;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getUserEveris() {
		return userEveris;
	}
	public void setUserEveris(String userEveris) {
		this.userEveris = userEveris;
	}
	public String getUserCaixa() {
		return userCaixa;
	}
	public void setUserCaixa(String userCaixa) {
		this.userCaixa = userCaixa;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Date getFecCreacion() {
		return fecCreacion;
	}
	public void setFecCreacion(Date fecCreacion) {
		this.fecCreacion = fecCreacion;
	}
	public Date getFecMod() {
		return fecMod;
	}
	public void setFecMod(Date fecMod) {
		this.fecMod = fecMod;
	}
	public Date getFecUltAcceso() {
		return fecUltAcceso;
	}
	public void setFecUltAcceso(Date fecUltAcceso) {
		this.fecUltAcceso = fecUltAcceso;
	}
	
}

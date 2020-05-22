package com.appinicio.pruebas.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "user_everis")
	private String userEveris;
	
	@Column(name = "user_caixa")
	private String userCaixa;
	
	@Column(name = "pass")
	private String pass;
	
	@Column(name = "fec_creacion")
	private Date fecCreacion;
	
	@Column(name = "fec_mod")
	private Date fecMod;
	
	@Column(name = "fec_ult_acceso")
	private Date fecUltAcceso;
	
	public User() {
		
	}
	
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
		return pass;
	}

	public void setContraseña(String contraseña) {
		this.pass = contraseña;
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

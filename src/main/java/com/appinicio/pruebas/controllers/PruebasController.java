package com.appinicio.pruebas.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.appinicio.pruebas.entity.Registro;
import com.appinicio.pruebas.services.HolaMundoService;

@Controller
public class PruebasController {

	@Autowired
	private HolaMundoService service;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/holaMundo")
	@ResponseBody
	public String helloWorld() {
		
		return this.service.getHolaMundo();

	}
	
	@RequestMapping("/contenidoFichero")
	@ResponseBody
	public String fichero() {
		
		List<String> archivo = this.service.leerArchivo();
		
		return String.join("<br>", archivo);
		
	}
	
	@RequestMapping("/listas")
	@ResponseBody
	public List<String> prueba() {
		
		return this.service.pruebaLista();
		
	}
	
	@RequestMapping("/buscarLetra")
	@ResponseBody
	public List<String> letra() {
		
		return this.service.buscarPorLetra('a');
		
	}
	
	@RequestMapping("/añadirCampo")
	@ResponseBody
	public Boolean añadir() {
		
		return this.service.añadirCampo("Juan");
		
	}
	
	@RequestMapping("/eliminarCampo")
	@ResponseBody
	public void eliminar() {
		
		this.service.eliminarCampo("Bartolo");
		
	}
	
	@RequestMapping("/ficheroCsv")
	@ResponseBody
	public List<String[]> ficheroCsv() {
		
		return this.service.leerCsv();
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/ficheroObjetoCsv")
	@ResponseBody
	public List<Registro> ficheroObjetoCsv() {
		
		return this.service.consultarFichero();
		
	}
	
	@RequestMapping("/mapa")
	@ResponseBody
	public String mapaPrueba() {
		
		service.mapa();
		return "Mapa creado";
		
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/agrupamiento")
	@ResponseBody
	public Map<String, Float> mapaAgrupado() {
		
		return this.service.agruparMapa();
		
	}
	
}

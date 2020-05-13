package com.appinicio.pruebas.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import org.springframework.stereotype.Service;

import com.appinicio.pruebas.entity.Registro;

import ch.qos.logback.core.joran.conditional.IfAction;

@Service
public class HolaMundoService{

	private final SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private String hola = "Hola Mundo!";
	private List<String> listaGeneral = new ArrayList<>();
	private static final String separador = ",";

	public String getHolaMundo() {

		return hola;

	}

	public List<String> leerArchivo() {

		List<String> texto = new ArrayList<>();
		String inicio;

		try (FileReader lector = new FileReader("pruebas.txt");
				BufferedReader contenido = new BufferedReader(lector);) {

			while ((inicio = contenido.readLine()) != null) {
				texto.add(inicio);
			}

		} catch (Exception e) {

			System.out.println("Error al leer el documento de texto");

		}

		return texto;

	}

	// Método de pruebas
	public List<String> pruebaLista() {

		List<String> listaPrueba = new ArrayList<>();
		listaPrueba.add("Pepe");
		listaPrueba.add("Juan");

		return listaPrueba;
	}

	public int tamañoLista(List<String> pruebas) {

		int tamaño = pruebas.size();

		return tamaño;

	}

	public List<String> buscarPorLetra(char letra) {

		List<String> listaFinal = new ArrayList<>();

		for (int i = 0; i <= listaGeneral.size(); i++) {

			if (listaGeneral.get(i).indexOf(letra) > -1) {
				listaFinal.add(listaGeneral.get(i));
			}
		}

		return listaFinal;
	}

	public Boolean añadirCampo(String campo) {

		return listaGeneral.add(campo);
		
	}

	public void eliminarCampo(String campos) {

		if (listaGeneral.contains(campos)) {

			for (int i = 0; i <= listaGeneral.size(); i++) {
				if (listaGeneral.get(i).equals(campos)) {
					listaGeneral.remove(i);
				}
			}

		} else {

			System.out.println("El índice no está incluido en la lista");

		}
	}
	
	public List<String[]> leerCsv(){
		List<String[]> registros = new ArrayList<>();
	 	try (BufferedReader lector = new BufferedReader(new FileReader("timesheet.csv"))){
	        String linea = "";
	        while((linea = lector.readLine()) != null){
	            String[] array = linea.split(separador);
	            registros.add(array);
	        }
	    } catch (Exception e) {
	        System.out.println("No se pudo leer el fichero CSV");
	    }  
	 	
	 	return registros;
	}
	
	public List<Registro> consultarFichero() {
		List<Registro> contenidoFic = new ArrayList<Registro>();
		
		try (BufferedReader lector = new BufferedReader(new FileReader("timesheet.csv"))) {
			//Leemos la primera linea porque es la cabecera
			
			String linea = lector.readLine();
			while((linea = lector.readLine()) != null){
	            contenidoFic.add(convertirArray(linea.split(separador)));
	        }
			
			 	
		} catch (Exception e) {
			System.out.println("No se pudo leer el contenido del fichero");
		}
		return contenidoFic;
	}
	
	private Registro convertirArray(String[] array) throws ParseException {
		
		Registro resultado = new Registro();
		try {
			 if(array.length == 5 ) {
				
				resultado.setDate("".equals(array[0])? null:formato.parse(array[0]));
				resultado.setProject(array[1]);
				resultado.setWorkItem(array[2]);
				resultado.setTask(array[3]);
				resultado.setHours(Float.parseFloat(array[4]));
				
			} else {
				throw new IllegalArgumentException("El registro no tiene 5 campos");
			}
		} catch (ParseException | NumberFormatException e) {
			System.out.println("Error ocurrido: " + e);
			throw e;
		} 
		
		return resultado;
	}
	
	public void mapa() {
		Map <String,Integer> mapaPrueba = new HashMap<>();
		mapaPrueba.put("Valor 1", 6);
		mapaPrueba.put("Valor 2", 5);
		mapaPrueba.put("Valor 3", 9);
		mapaPrueba.put("Valor 3", 8);
		
		System.out.println(mapaPrueba);
		
		System.out.println(mapaPrueba.get("Valor 1"));
	}
	
	public Map<String, Float> agruparMapa() {
		
		Map<String, Float> mapaRegistros = new HashMap<>();
		List<Registro> registros= this.consultarFichero();
		
		
		for(Registro reg : registros) {
			if (mapaRegistros.get(reg.getTask()) == null) {
				
				mapaRegistros.put(reg.getTask(), reg.getHours());
				
			} else {
				float suma = mapaRegistros.get(reg.getTask());
				suma += reg.getHours();
				mapaRegistros.put(reg.getTask(), suma);
			}
		}
		
		return mapaRegistros;
	}
}

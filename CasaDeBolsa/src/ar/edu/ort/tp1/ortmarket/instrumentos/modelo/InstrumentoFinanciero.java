package ar.edu.ort.tp1.ortmarket.instrumentos.modelo;

import ar.edu.ort.tp1.ortmarket.modelo.Listable;

public abstract class InstrumentoFinanciero implements Apreciable{
	private String codigo;
	private String nombre;
	private String emisor;

	public InstrumentoFinanciero(String codigo, String nombre, String emisor) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.emisor = emisor;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public String getEmisor() {
		return emisor;
	}

	public String getNombre() {
		return nombre;
	}

	public String obtenerDatos() {
		return "Codigo: " + codigo + " - " + nombre + " (" + emisor + "): " + obtenerPrecio();
	}

	
}
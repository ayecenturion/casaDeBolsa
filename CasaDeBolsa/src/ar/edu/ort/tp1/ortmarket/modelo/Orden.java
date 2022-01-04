package ar.edu.ort.tp1.ortmarket.modelo;

import ar.edu.ort.tp1.ortmarket.instrumentos.modelo.Apreciable;
import ar.edu.ort.tp1.ortmarket.instrumentos.modelo.InstrumentoFinanciero;

public class Orden implements Apreciable{
    private final int cantidad;
    private final InstrumentoFinanciero instrumentoFinanciero;
    private final Cliente cliente;
    private final boolean esVenta;

    public Orden(int cantidad, InstrumentoFinanciero instrumentoFinanciero, Cliente cliente, boolean esVenta) {
        this.cantidad = cantidad;
        this.instrumentoFinanciero = instrumentoFinanciero;
        this.cliente = cliente;
        this.esVenta = esVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public InstrumentoFinanciero getInstrumentoFinanciero() {
        return instrumentoFinanciero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isCompra() {
        return !esVenta;
    }

	public String obtenerDatosParaHistorial() {
		return "Codigo: " + instrumentoFinanciero.getCodigo() + " - " + instrumentoFinanciero.getNombre() + "(" + instrumentoFinanciero.getEmisor() + ")";
	}

	@Override
	public double obtenerPrecio() {
		return this.instrumentoFinanciero.obtenerPrecio();
	}
}

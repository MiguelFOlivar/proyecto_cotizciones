package model.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa al vendedor que realiza cotizaciones
 * @author ariel
 *
 */
public class Vendedor {
	/**
	 * Código de vendedor
	 */
	private int codigo;
	/**
	 * Nombres del vendedor
	 */
	private String nombres;
	/**
	 * Apellidos del vendedor
	 */
	private String apellidos;
	/**
	 * Contiene las cotizaciones realizadas por el vendedor
	 */
	private List<Cotizacion> historialCotizaciones;
	
	/**
	 * Constructor por defecto
	 */
	public Vendedor() {
		historialCotizaciones = new ArrayList<>();
	}

	/**
	 * Constructor parametrizado
	 * @param codigo
	 * @param nombres
	 * @param apellidos
	 */
	public Vendedor(int codigo, String nombres, String apellidos) {
		this.codigo = codigo;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.historialCotizaciones = new ArrayList<>();
	}
	
	/**
	 * Permite agregar una cotización al historial de cotizaciones
	 * @param cotizacion
	 */
	public void registrarCotizacion(Cotizacion cotizacion) {
		this.historialCotizaciones.add(cotizacion);
	}
	
}
package com.bytecode.core.mundo;

public class Aula {


	//------------------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------------------
	
	/**
	 * Identificacion del aula
	 */
	private int idAula;
	
	
	/**
	 * Capacidad del aula 
	 */
	private int capacidad;
	
	/**
	 * Estado del aula 
	 */
	private boolean disponible;
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo docente con los valores dados por parámetro. <br>
     * @param pIdAula identificacion del aula
     * @param pCapacidad Capacidad maxima del aula
     * @param pDisponible disponibilidad del aula. True si esta disponible
     */
	public Aula(int pIdAula, int pCapacidad, boolean pDisponible) 
	{
		idAula = pIdAula;
		capacidad =pCapacidad;
		disponible = pDisponible;
		
	}
	
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	
	/**
	 * Retorna el id del aula
	 * @return Identificacion del aula
	 */
	public int darIdAula()
	{
		return idAula;
	}
	
	
	/**
	 * Retorna la capacidad maxima que tiene del aula
	 * @return Capacidad del aula
	 */
	public int darCapacidad()
	{
		return capacidad;
	}
	
	public boolean estaDisponible()
	{
		return disponible;
	}
	
	
	
	
}
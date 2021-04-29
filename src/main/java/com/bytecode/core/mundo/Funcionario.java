package com.bytecode.core.mundo;

import com.bytecode.core.mundo.Usuario.tipoUsuario;

public class Funcionario {

	

	//------------------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------------------
	
	/**
	 * Identificacion del funcionario
	 */
	private int idFuncionario;
	
	/**
	 * Nombre del funcionario
	 */
	private String nombre;
		
	/**
	 * Apellido del funcionario
	 */
	private String apellido;
	
	/**
	 * Correo del funcionario
	 */
	private String correo;
	
	/**
	 * Identificacion del funcionario
	 */
	private  int celular;
	
	/**
	 * Programa al que pertenece el funcionario
	 */
	private String programa;
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo funcionario con los valores dados por parámetro. <br>
     * @param pIdFuncionario identificacion del funcionario.
     * @param pNombre Nombre del funcionario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del funcionario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del funcionario. pCorreo != null && pCorreo != "".
     * @param pCelular celular del funcionario.
     * @param pPrograma programa al que pertenece el funcionario
     */
	public Funcionario(int pIdFuncionario,String pNombre,String pApellido,String pCorreo, int pCelular,String pPrograma) 
	{
		idFuncionario = pIdFuncionario;
		nombre = pNombre;
		apellido = pApellido;
		correo = pCorreo;
		celular = pCelular;
		programa = pPrograma;
	}
	
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	
	/**
	 * Retorna el id del funcionario
	 * @return Identificacion del funcionario
	 */
	public int darIdFuncionario()
	{
		return idFuncionario;
	}
	
	
	/**
	 * Retorna el nombre del funcionario
	 * @return Nombre del funcionario
	 */
	public String darNombre()
	{
		return nombre;
	}
	
	/**
	 * Retorna el apellido del funcionario
	 * @return Apellido del funcionario
	 */
	public String darApellido()
	{
		return apellido;
	}
	
	/**
	 * Retorna el correo del funcionario
	 * @return Correo del funcionario
	 */
	public String darCorreo()
	{
		return correo;
	}
	
	/**
	 * Retorna el numero de celular del funcionario 
	 * @return Celular del funcionario
	 */
	public int darCelular()
	{
		return celular;
	}
	
	/**
	 * Retorna el programa del funcionario
	 * @return Programa al que pertenece el funcionario
	 */
	public String darPrograma()
	{
		return programa;
	}
	
	
	 /**
     * actualiza un  funcionario con los valores dados por parámetro. <br>
     * @param pIdFuncionario identificacion del funcionario.
     * @param pNombre Nombre del funcionario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del funcionario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del funcionario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del funcionario.
     * @param pPrograma programa del funcionario
     */
	public void actualizarFuncionario(int pIdFuncionario,String pNombre,String pApellido,String pCorreo, int pCelular,String pPrograma)
	{
		idFuncionario = pIdFuncionario;
		nombre = pNombre;
		apellido = pApellido;
		correo = pCorreo;
		celular = pCelular;
		programa = pPrograma;
	}
	
}
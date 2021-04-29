package com.bytecode.core.mundo;

public class Usuario {
	
	
	//------------------------------------------------------------------------------
	//Enum
	//------------------------------------------------------------------------------
	
	public enum tipoUsuario
	{
	    PROFESOR, ESTUDIANTE
	}
	
	
	//------------------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------------------
	
	/**
	 * Identificacion del usuario
	 */
	private int idUsuario;
	
	/**
	 * Nombre del usuario
	 */
	private String nombre;
		
	/**
	 * Apellido del usuario
	 */
	private String apellido;
	
	/**
	 * Correo del usuario
	 */
	private String correo;
	
	/**
	 * Identificacion del usuario
	 */
	private int celular;
	
	/**
	 * Tipo usuario
	 */
	private tipoUsuario tipoUsuario;
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye un nuevo usuario con los valores dados por parámetro. <br>
     * @param pIdUsuario identificacion del usuario.
     * @param pNombre Nombre del usuario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del usuario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del usuario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del usuario.
     * @param pTipoUsuario tipo de usuario debe ser "PROFESOR" O "ESTUDIANTE"
     */
	public Usuario(int pIdUsuario,String pNombre,String pApellido,String pCorreo, int pCelular,tipoUsuario pTipoUsuario) 
	{
		idUsuario = pIdUsuario;
		nombre = pNombre;
		apellido = pApellido;
		correo = pCorreo;
		celular = pCelular;
		tipoUsuario =pTipoUsuario;
	}
	
    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	
	/**
	 * Retorna el id del usuario
	 * @return Identificacion del usuario
	 */
	public int darIdUsuario()
	{
		return idUsuario;
	}
	
	
	/**
	 * Retorna el nombre del usuario
	 * @return Nombre del usuario
	 */
	public String darNombre()
	{
		return nombre;
	}
	
	/**
	 * Retorna el apellido del usuario
	 * @return Apellido del usuario
	 */
	public String darApellido()
	{
		return apellido;
	}
	
	/**
	 * Retorna el correo del usuario
	 * @return Correo del usuario
	 */
	public String darCorreo()
	{
		return correo;
	}
	
	/**
	 * Retorna el numero de celular del usuario 
	 * @return Celular del usuario
	 */
	public int darCelular()
	{
		return celular;
	}
	
	/**
	 * Retorna el tipo de usuario
	 * @return tipo de usuario
	 */
	public tipoUsuario darTipoUsuario()
	{
		return tipoUsuario;
	}
	
	  /**
     * actualiza un  usuario con los valores dados por parámetro. <br>
     * @param pIdUsuario identificacion del usuario.
     * @param pNombre Nombre del usuario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del usuario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del usuario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del usuario.
     */
	public void actualizarUsuario(int pIdUsuario,String pNombre,String pApellido,String pCorreo, int pCelular,tipoUsuario pTipoUsuario)
	{
		idUsuario = pIdUsuario;
		nombre = pNombre;
		apellido = pApellido;
		correo = pCorreo;
		celular = pCelular;
		tipoUsuario = pTipoUsuario;
	}
}
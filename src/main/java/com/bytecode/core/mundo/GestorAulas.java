package com.bytecode.core.mundo;
import java.util.ArrayList;


public class GestorAulas {

	
	public enum tipoUsuario
	{
	    PROFESOR, ESTUDIANTE
	}
	
	
	//------------------------------------------------------------------------------
	//Atributos
	//------------------------------------------------------------------------------
	
	/**
	 * Lista de funcionarios
	 */
	private ArrayList<Funcionario> funcionarios;
	
	/**
	 * lista de profesores
	 */
	private ArrayList<Usuario> usuarios;
	
	/**
	 * lista de aulas
	 */
	private ArrayList<Aula> aulas;
	
	
	
	// -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
	
	public GestorAulas()
	{
		funcionarios =new ArrayList<Funcionario>();
		usuarios =new ArrayList<Usuario>();
		aulas =new ArrayList<Aula>();
	}
	
	// -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
	
	/**
	 *  Retorna la lista de usuarios
	 * @return la lista de usuarios
	 */
	public ArrayList<Usuario> darUsuarios()
	{
		return usuarios;
	}
	
	/**
	 *  Retorna la lista de estudiantes
	 * @return la lista de estudiantes
	 */
	public ArrayList<Funcionario> darFuncionarios()
	{
		return funcionarios;
	}
	
	/**
	 *  Retorna la lista de aulas
	 * @return la lista de aulas
	 */
	public ArrayList<Aula> darAulas()
	{
		return aulas;
	}
	
	
	/**
	 * Se realiza la busqueda de las aulas segun su estado
	 * @param pEstado estado del aula a buscar
	 * @return una lista con las aulas segun su estado
	 */
	public ArrayList<Aula> BusquedaAulasPorEstado(boolean pEstado)
	{
		ArrayList<Aula> aulasEstado = new ArrayList<Aula>();
		
		for(int i =0;i>aulas.size();i++)
		{
			if(aulas.get(i).estaDisponible()==pEstado)
			{
				aulasEstado.add(aulas.get(i));
			}
		}
		
		
		return aulasEstado;
	}
	

	
	
	/**
	 * se añade un nuevo usuario con todos los parametros
     * @param pIdUsuario identificacion del usuario.
     * @param pNombre Nombre del usuario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del usuario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del usuario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del usuario.
     * @param pTipoUsuario tipo de usuario. "DOCENTE" O "ESTUDIANTE"
	 */
	public void añadirUsuario(int pId,String pNombre, String pApellido,String pCorreo,int pCelular,Usuario.tipoUsuario pTipoUsuario)
	{
		Usuario nuevoUsuario= new Usuario(pId,pNombre,pApellido,pCorreo,pCelular,pTipoUsuario);
		usuarios.add(nuevoUsuario);
	}
	
	
	
	/**
	 * se elimina al usuario dado por parametro
	 * @param pId identificacion del usuario.
	 */
	public void eliminarUsuario(int pId)
	{
		for(int i=0;i<usuarios.size();i++)
		{
			if(usuarios.get(i).darIdUsuario()==pId)
			{
				usuarios.remove(i);
			}
		}
	}
	
	
	
	/**
	 * se actualiza a un usuario con los nuevos valores
	 * @param pIdUsuario identificacion del usuario.
     * @param pNombre Nombre del usuario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del usuario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del usuario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del usuario.
	 */
	public void actualizarUsuario(int pId,String pNombre, String pApellido,String pCorreo,int pCelular,Usuario.tipoUsuario pTipoUsuario)
	{
		for(int i=0;i<usuarios.size();i++)
		{
			if(usuarios.get(i).darIdUsuario()==pId)
			{
				usuarios.get(i).actualizarUsuario(pId, pNombre, pApellido, pCorreo, pCelular,pTipoUsuario);
			}
		}
	}
	
	
	/**
	 * se añade un nuevo funcionario con todos los parametros
     * @param pIdFuncionario identificacion del funcionario.
     * @param pNombre Nombre del funcionario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del funcionario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del funcionario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del funcionario.
	 */
	public void añadirFuncionario(int pIdFuncionario,String pNombre,String pApellido,String pCorreo, int pCelular,String pPrograma)
	{
		Funcionario nuevoFuncionario= new Funcionario(pIdFuncionario,pNombre,pApellido,pCorreo,pCelular,pPrograma);
		funcionarios.add(nuevoFuncionario);
	}
	
	
	
	/**
	 * se elimina al funcionario dado por parametro
	 * @param pId identificacion del funcionario.
	 */
	public void eliminarFuncionario(int pId)
	{
		for(int i=0;i<funcionarios.size();i++)
		{
			if(funcionarios.get(i).darIdFuncionario()==pId)
			{
				funcionarios.remove(i);
			}
		}
	}
	
	
	
	/**
	 * se añade un nuevo funcionario con todos los parametros
     * @param pIdFuncionario identificacion del funcionario.
     * @param pNombre Nombre del funcionario. pNombre != null && pNombre != "".
     * @param pApellido Apellido del funcionario. pApellido != null && pNombre != "".
     * @param pCorreo correo electronico del funcionario. pCorreo != null && pCorreo != "".
     * @param pcelular celular del funcionario.
     * @param pPrograma programa al que pertenece el funcionario
	 */
	public void actualizarFuncionario(int pIdFuncionario,String pNombre,String pApellido,String pCorreo, int pCelular,String pPrograma)
	{
		for(int i=0;i<funcionarios.size();i++)
		{
			if(funcionarios.get(i).darIdFuncionario()==pIdFuncionario)
			{
				funcionarios.get(i).actualizarFuncionario(pIdFuncionario,pNombre,pApellido,pCorreo,pCelular,pPrograma);
			}
		}
	}
	
}

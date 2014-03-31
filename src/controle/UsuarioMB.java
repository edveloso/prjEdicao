package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB {
	
	/**
	 * regras do jsf:
	 *   1 = todos os atributos de uma classe que não for 
	 *   primitivo ou string ou date, precisam ser instanciados;
	 *   2 = o jsf exige gets e sets de todos os atributos
	 *   3 = o managedbean é uma classe que faz a ligação entre a 
	 *   página e a regra da aplicação (controler), para isso ele
	 *   precisa de ter a anotação ManagedBean e a definição de um
	 *   escopo
	 *   
	 */
	private Usuario usuario;
	
	private List<Usuario> usuarios;
	
	public UsuarioMB() {
		usuario = new Usuario();
		usuarios = new ArrayList<Usuario>();
	}

	public String gravar(){
		usuarios.add(usuario);
		usuario = new Usuario();
		return "form";
	}
	
	
	public String abrirFormEditar(Usuario usuario){
		this.usuario = usuario;
		return "editar";
	}
	
	public String salvarEdicao(){
		usuario = new Usuario();
		return "form";
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	

}

package br.com.fiap.ejb.bean.copy;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.fiap.ejb.bo.CarrinhoBO;

@ManagedBean
@SessionScoped // Vai continuar mantendo a sessão para cada usuario ate você fechar o browse
public class CarrinhoBean {
	
	private String campo;

	
	@EJB
	private CarrinhoBO bo;
	
	public void add() {

		bo.add(campo);
	}
	
	public List<String> listar() {
		return bo.listar();

	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}


}

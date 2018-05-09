package br.com.fiap.ejb.bean.copy;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.ejb.bo.ContadorBO;

@ManagedBean
public class ContadorBean {
	
	private int incremento;
	
	
	@EJB
	private ContadorBO bo;
	
	public void incrementar() {
		  bo.incrementar();
	}
	
	public int total() {
		return bo.verTotal();
	}
	public int getIncremento() {
		return incremento;
	}
	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}


	
	
}

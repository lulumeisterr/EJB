package br.com.fiap.ejb.bean.copy;

import java.util.Calendar;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.fiap.ejb.bo.FuncionarioBO;

@ManagedBean
public class FuncionarioBean {

	private Calendar ano;
	private int idade;
	
	/*
	 * Gerenciando o BO automaticamente
	 */
	
	@EJB
	private FuncionarioBO bo;
	
	
	// Metodo de inicialização
	
	@PostConstruct
	private void init() {
		
		// Inicializando a data de nascimento
		this.ano = Calendar.getInstance();
		
	}
	
	
	
	

	
	public void calcular() {
		idade = bo.calcularIdade(this.ano);
	}
	
	
	public Calendar getAno() {
		return ano;
	}
	public void setAno(Calendar ano) {
		this.ano = ano;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}

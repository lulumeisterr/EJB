package br.com.fiap.ejb.bo;

import java.util.Calendar;

import javax.ejb.Remote;


/*
 * tendp Acesso Remoto
 */

@Remote
public interface FuncionarioBO {
	
	int calcularIdade(Calendar nascimento);

}

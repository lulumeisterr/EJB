package br.com.fiap.ejb.bo.impl;

import java.util.Calendar;

import javax.ejb.Stateless;

import br.com.fiap.ejb.bo.FuncionarioBO;

/*
 * 
 */
@Stateless
public class FuncionarioImpl implements FuncionarioBO{

	@Override
	public int calcularIdade(Calendar nascimento) {

		Calendar dataAtual = Calendar.getInstance(); // Pegando data atual
		int anoAtual = dataAtual.get(Calendar.YEAR); // Pegando ano Atual
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH); // Pegando o dia
		int mesAtual = dataAtual.get(Calendar.MONTH);

		Calendar dataNascimento = Calendar.getInstance(); // Pegando data atual
		int anoNascimento = dataNascimento.get(Calendar.YEAR); // Pegando ano Atual
		int diaNascimento = dataNascimento.get(Calendar.DAY_OF_MONTH); // Pegando o dia
		int mesNascimento = dataNascimento.get(Calendar.MONTH);

		int idade = anoAtual - anoNascimento;
			if(mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
				idade--;
		}
		return idade;
	}



}

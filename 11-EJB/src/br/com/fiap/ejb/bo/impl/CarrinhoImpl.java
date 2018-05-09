package br.com.fiap.ejb.bo.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateful;

import br.com.fiap.ejb.bo.CarrinhoBO;

/*
 * Cada objeto tem o seu
 */

@Stateful
public class CarrinhoImpl implements CarrinhoBO{

	private List<String> popular =  new ArrayList<>();
	
	@Override
	public void add(String item) {
	
		popular.add(item);
		
	}

	@Override
	public List<String> listar() {
		return popular;
	}
	
	

}

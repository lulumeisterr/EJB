package br.com.fiap.ejb.bo.impl;

import javax.ejb.Singleton;

import br.com.fiap.ejb.bo.ContadorBO;

/*
 *  Onde dois usuarios utilizando o mesmo objeto
 */

@Singleton
public class ContadorImpl implements ContadorBO{

	private int total;
	
	@Override
	public void incrementar() {
		total ++;
		
	}

	@Override
	public int verTotal() {
		return total;
	}

}

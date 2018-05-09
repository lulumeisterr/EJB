package br.com.fiap.ejb.bo;

import java.util.List;

import javax.ejb.Local;

@Local
public interface CarrinhoBO {
	
	void add(String item);
	List<String> listar();

}

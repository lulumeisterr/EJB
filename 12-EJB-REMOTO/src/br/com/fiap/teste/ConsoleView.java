package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import br.com.fiap.ejb.bo.FuncionarioBO;

public class ConsoleView {

	public static void main(String[] args) {


		// Acessar o EJB de forma remota

		// Configuracoes para acessar todos objetos

		Properties p = new Properties();
		p.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

		try {
			
		Context cont = new InitialContext(p);
		
		// Recuperando o objeto remoto do jboss
		
		FuncionarioBO bo = (FuncionarioBO) 
				cont.lookup("ejb:/11-EJB/FuncionarioImpl!br.com.fiap.ejb.bo.FuncionarioBO");
		
		Calendar nasc = new GregorianCalendar(1998, Calendar.FEBRUARY , 27);
		System.out.println(bo.calcularIdade(nasc));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

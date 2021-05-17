package br.com.fatecararas.model.DAO.impl;

import java.util.List;

import br.com.fatecararas.model.Contato;
import br.com.fatecararas.model.DAO.ContatoDAO;

public abstract class ContatoDAOImpl implements ContatoDAO{

	@Override
	public void salvar(Contato contato) {
		
	}

	@Override
	public Contato atualizar(Contato contato) {
		
		return null;
	}

	@Override
	public Contato buscarPornome(String nome) {
	
		return null;
	}

	@Override
	public boolean apagar(Contato contato) {
	
		return false;
	}

	@Override
	public List<Contato> buscarTodos() {
	
		return null;
	}
	
	

}

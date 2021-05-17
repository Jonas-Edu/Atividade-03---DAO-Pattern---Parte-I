package br.com.fatecararas.model.DAO;

import java.util.List;

import br.com.fatecararas.model.Contato;

public interface ContatoDAO {
	
	public void salvar(Contato contato); 
	Contato atualizar(Contato contato);
	Contato buscarPornome(String nome);
	
	boolean apagar(Contato contato);
	List<Contato> buscarTodos();

}

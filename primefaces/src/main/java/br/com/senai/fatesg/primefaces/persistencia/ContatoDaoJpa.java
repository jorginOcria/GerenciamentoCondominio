package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.Contato;

@Repository("contatoDao")
public class ContatoDaoJpa extends PersistenciaJpa<Contato> implements ContatoDao{

   private static final long serialVersionUID = 1L;

}

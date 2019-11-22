package br.com.senai.fatesg.primefaces.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Imovel {

	@Id
	@GeneratedValue(generator = "imovel_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "imovel_seq", sequenceName = "imovel_seq", allocationSize = 1, initialValue = 1)
	private int id;
	
	private float tamanholote;
	private String bloco;
	private String statusImovel;
	private int numero;
	public float getTamanholote() {
		return tamanholote;
	}
	public void setTamanholote(float tamanholote) {
		this.tamanholote = tamanholote;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public String getStatusImovel() {
		return statusImovel;
	}
	public void setStatusImovel(String statusImovel) {
		this.statusImovel = statusImovel;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	
	
	
	
}

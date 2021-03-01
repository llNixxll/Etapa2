package Sala;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sala")
public class Sala {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSala;
	@Column
	private String NomeSala;
	@Column
	private int LotacaoSala;
	
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public String getNomeSala() {
		return NomeSala;
	}
	public void setNomeSala(String nomeSala) {
		NomeSala = nomeSala;
	}
	public int getLotacaoSala() {
		return LotacaoSala;
	}
	public void setLotacaoSala(int lotacaoSala) {
		LotacaoSala = lotacaoSala;
	}
}

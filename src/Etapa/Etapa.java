package Etapa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Etapa")
public class Etapa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEtapa;
	@Column
	private int NumeroEtapa;
	@Column
	private int Pessoa_idPessoa;
	@Column
	private int Sala_idSala;
	@Column
	private int Cafe_idCafe;
	
	public int getIdEtapa() {
		return idEtapa;
	}
	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}
	public int getNumeroEtapa() {
		return NumeroEtapa;
	}
	public void setNumeroEtapa(int numeroEtapa) {
		NumeroEtapa = numeroEtapa;
	}
	public int getIdPessoa() {
		return Pessoa_idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.Pessoa_idPessoa = idPessoa;
	}
	public int getIdSala() {
		return Sala_idSala;
	}
	public void setIdSala(int idSala) {
		this.Sala_idSala = idSala;
	}
	public int getIdCafe() {
		return Cafe_idCafe;
	}
	public void setIdCafe(int idCafe) {
		this.Cafe_idCafe = idCafe;
	}
	
}

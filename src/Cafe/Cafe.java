package Cafe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cafe")
public class Cafe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCafe;
	@Column
	private String NomeCafe;
	
	public int getIdCafe() {
		return idCafe;
	}
	public void setIdCafe(int idCafe) {
		this.idCafe = idCafe;
	}
	public String getNomeCafe() {
		return NomeCafe;
	}
	public void setNomeCafe(String nomeCafe) {
		NomeCafe = nomeCafe;
	}
	
}

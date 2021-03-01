package Pessoa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPessoa;
	@Column
	private String NomePessoa;
	@Column
	private String SobrenomePessoa;
	
	public int getId() {
		return idPessoa;
	}
	public void setId(int id) {
		this.idPessoa = id;
	}
	public String getNome() {
		return NomePessoa;
	}
	public void setNome(String nome) {
		this.NomePessoa = nome;
	}
	public String getSobrenome() {
		return SobrenomePessoa;
	}
	public void setSobrenome(String sobrenome) {
		this.SobrenomePessoa = sobrenome;
	}
}

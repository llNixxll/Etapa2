import Etapa.Etapa;
import Pessoa.Pessoa;
import Pessoa.PessoaController;

public class Teste {

	public static void main(String[] args) {
		Etapa e = new Etapa();
		Pessoa p = new Pessoa();
		p.setNome("Matheus");
		p.setSobrenome("Soares");
		
		PessoaController pc = new PessoaController();
		System.out.println(pc.achaID(p));
//		p.setId(pc.achaID(p));
//		pc.salvar(p);

	}

}

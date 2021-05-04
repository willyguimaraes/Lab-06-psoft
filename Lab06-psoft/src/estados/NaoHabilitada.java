package estados;

import java.util.List;

import vacinacao.Governo;
import vacinacao.Pessoa;

public class NaoHabilitada implements Estado {

	Governo governo;
	int idadeHabilitada;
	List<String> profissoesHabilitadas;
	List<String> comorbidadesHabilitadas;

	public NaoHabilitada() {
		governo = new Governo();
		this.idadeHabilitada = governo.getIdadeHabilitada();
		this.profissoesHabilitadas = governo.getProfissoesHabilitadas();
		this.comorbidadesHabilitadas = governo.getComorbidadesHabilitadas();
	}

	@Override
	public void verificaVacina(Pessoa pessoa) {
		int idade = pessoa.getIdade();
		String profissao = pessoa.getProfissao();
		String comorbidade = pessoa.getComorbidades();
		if (idade >= idadeHabilitada || profissoesHabilitadas.contains(profissao)
				|| comorbidadesHabilitadas.contains(comorbidade)) {
			Estado atualizado = new Habilitada1Dose();
			pessoa.setStatus(atualizado);

		}

	}

	@Override
	public String toString() {
		return "não habilitada para a Vacinação";
	}

}

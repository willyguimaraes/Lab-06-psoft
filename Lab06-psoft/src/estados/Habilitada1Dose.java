package estados;

import vacinacao.Pessoa;

public class Habilitada1Dose implements Estado {

	public Habilitada1Dose() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verificaVacina(Pessoa pessoa) {
		if(pessoa.isVacina1dose()) {
			Estado atualizado = new Tomou1Dose();
			pessoa.setStatus(atualizado);
		}
	}

	@Override
	public String toString() {
		return "Habilitada para a 1 dose da Vacina";
	}


}

package estados;

import vacinacao.Pessoa;

public class Habilitada2Dose implements Estado {
	

	public Habilitada2Dose() {
	}

	@Override
	public void verificaVacina(Pessoa pessoa) {
		if(pessoa.isVacina2dose()) {
			pessoa.setStatus(new Finalizada());
		}
	}
	
	@Override
	public String toString() {
		return "Habilitada para a 2 dose da Vacina";
	}




}

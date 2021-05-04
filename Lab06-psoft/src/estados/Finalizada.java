package estados;

import vacinacao.Pessoa;

public class Finalizada implements Estado {

	public Finalizada() {
	}
	
	@Override
	public void verificaVacina(Pessoa pessoa) {
		
	}

	@Override
	public String toString() {
		return "Vacinação finalizada";
	}


}

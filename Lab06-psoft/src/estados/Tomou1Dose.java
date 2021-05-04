package estados;

import java.time.LocalDate;

import vacinacao.Pessoa;

public class Tomou1Dose implements Estado {
	LocalDate data1dose;

	public Tomou1Dose() {
		this.data1dose = LocalDate.now();
	}

	@Override
	public void verificaVacina(Pessoa pessoa) {
		LocalDate dataAtual = LocalDate.now();
		
		if(dataAtual.equals(data1dose.plusDays(20))) {
			pessoa.setStatus(new Habilitada2Dose());
		}
		
	}
	
	@Override
	public String toString() {
		return "Tomou a primeira dose da Vacina /n" + "Estará habilitado para a segunda dose em 20 dias";
	}



}

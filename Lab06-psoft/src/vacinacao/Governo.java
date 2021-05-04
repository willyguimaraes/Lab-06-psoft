package vacinacao;

import java.util.ArrayList;
import java.util.List;

public class Governo {
	
	int idadeHabilitada = 100;
	List<String> profissoesHabilitadas;
	List<String> comorbidadesHabilitadas;
	
	public Governo() {
		profissoesHabilitadas = new ArrayList<>();
		 comorbidadesHabilitadas = new ArrayList<>();
		String[] profissoes =  {"medico", "enfermeiro", "tecnico de enfermagem", "cirurgião dentista"};
		String[] comorbidades = {"diabetes mellitus", "hipertensão arterial grave", "doença pulmonar obstrutiva crônica" , "doença renal" , "doenças cardiovasculares e cerebrovasculares", "indivíduos transplantados de órgão sólido" , "anemia falciforme", "cancer" , "obesidade grave"};
		for(String x : profissoes) {
			profissoesHabilitadas.add(x);
		}
		for(String y : comorbidades) {
			profissoesHabilitadas.add(y);
		}
	}

	public int getIdadeHabilitada() {
		return idadeHabilitada;
	}

	public void setIdadeHabilitada(int idadeHabilitada) {
		this.idadeHabilitada = idadeHabilitada;
	}

	public List<String> getProfissoesHabilitadas() {
		return profissoesHabilitadas;
	}

	public void setProfissoesHabilitadas(List<String> profissoesHabilitadas) {
		this.profissoesHabilitadas = profissoesHabilitadas;
	}

	public List<String> getComorbidadesHabilitadas() {
		return comorbidadesHabilitadas;
	}

	public void setComorbidadesHabilitadas(List<String> comorbidadesHabilitadas) {
		this.comorbidadesHabilitadas = comorbidadesHabilitadas;
	}

	

}

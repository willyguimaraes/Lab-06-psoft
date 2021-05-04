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
		String[] profissoes =  {"medico", "enfermeiro", "tecnico de enfermagem", "cirurgi�o dentista"};
		String[] comorbidades = {"diabetes mellitus", "hipertens�o arterial grave", "doen�a pulmonar obstrutiva cr�nica" , "doen�a renal" , "doen�as cardiovasculares e cerebrovasculares", "indiv�duos transplantados de �rg�o s�lido" , "anemia falciforme", "cancer" , "obesidade grave"};
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

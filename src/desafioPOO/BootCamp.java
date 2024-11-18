package desafioPOO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class BootCamp {
	private String nome;
	private String descriçao;
	private LocalDate dataInicio;
	private LocalDate dataFinal;
	private HashSet<Dev> devs = new LinkedHashSet<Dev>();
	
	public BootCamp() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescriçao() {
		return descriçao;
	}
	
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public HashSet<Dev> getDevs() {
		return devs;
	}

	public void setDevs(HashSet<Dev> devs) {
		this.devs = devs;
	}
	
	
	
	
	
	
}

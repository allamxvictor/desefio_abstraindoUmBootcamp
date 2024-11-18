package desafioPOO;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Dev {
	private String nome;
	private HashSet<Mentoria> mentorias = new LinkedHashSet<Mentoria>();
	private HashSet<Curso> cursos = new LinkedHashSet<Curso>(); 
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void AdicionarMentoria(Mentoria mentoria) {
		mentorias.add(mentoria);
	}
	
	/*public Mentoria getMentoria() {
		return mentorias;
	}*/

	public void setCursos(Curso curso) {
		cursos.add(curso);
	}
	
	/*public Curso getCursos() {
		return cursos;
	}*/
}

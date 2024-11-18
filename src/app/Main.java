package app;

import java.time.LocalDate;

import desafioPOO.Mentoria;

public class Main {
	public static void main(String[] args) {
		Mentoria mentoria = new Mentoria();
		
		
		mentoria.setTitulo("Primeira mentoria(Teste 01)");
		mentoria.setDescricao("Primeira mentoria do bootcamp(Teste 01)");
		mentoria.setDataMentoria(LocalDate.now());
		
		System.out.println(mentoria);
	}
	
}

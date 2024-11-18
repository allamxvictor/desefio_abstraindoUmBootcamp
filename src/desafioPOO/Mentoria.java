package desafioPOO;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate dataMentoria;
	
	public Mentoria() {

	}
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTitulo() + "\n" + this.getDescricao() + "\n" + this.dataMentoria ;
	}
	
	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	
	public LocalDate getDataMentoria() {
		return this.dataMentoria;
	}
}

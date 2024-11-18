package desafioPOO;

public class Curso extends Conteudo {
	private int cargaHoraria;

	public Curso() {
		
	}
	
	@Override
	public double calcularXp() {
		return 0;
	}
	
	@Override
	public String toString() {
		return getTitulo() + "\n" + getDescricao() + "\n" + this.cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public int getCargaHoraria() {
		return this.cargaHoraria;
	}

}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Zé", 8.4);
		Aluno a3 = new Aluno("Bia", 5.9);
		Aluno a4 = new Aluno("Fabio", 9.5);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println("Maior nota: " + alunos.stream().max(melhorNota).get());
		System.out.println("Menor nota: " + alunos.stream().min(melhorNota).get());
	}
}

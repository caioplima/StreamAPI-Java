import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Zé", 8.4);
		Aluno a3 = new Aluno("Bia", 5.9);
		Aluno a4 = new Aluno("Fabio", 9.5);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacaoAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
		alunos.stream().filter(aprovado).map(saudacaoAprovado).forEach(System.out::println);
		
	}
}

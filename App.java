import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean continuar = true;
		List<Livro> livros = new ArrayList<Livro>();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		int idUser = 1;
		int idBook = 1;
		while (continuar == true) {
			System.out.println(
					"Qual operação deseja fazer\n1 - Registar Livro \n2 - Registrar Usuário\n3 - Pedir Emprestimo de Livro\n4 - Devolver um Livro\n5 - Exibir Lista de Livros Emprestados\n");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Qual o titulo do livro?");
				sc.nextLine();
				String titulo = sc.nextLine();
				System.out.println("Qual o nome do autor?\n");
				sc.nextLine();
				String autor = sc.nextLine();
				Livro livro = new Livro(titulo, autor, idBook);
				idBook++;
				livros.add(livro);
				break;
			case 2:
				System.out.println("Qual o nome do usuário");
				String nome = sc.nextLine();
				Usuario usuario = new Usuario(nome, idUser);
				idUser++;
				usuarios.add(usuario);
				break;
			case 3:
				System.out.println("Qual o ID do usuário que está pedindo o livro emprestado?");
				Usuario usuarioPedindo = usuarios.get((sc.nextInt() - 1));

				System.out.println("Qual o ID do livro que deseja emprestar?");
				Livro emprestado = livros.get((sc.nextInt() - 1));
				emprestado.emprestarLivro(usuarioPedindo);
				break;
			case 4:
				System.out.println("Qual o ID do usuário que deseja devolver o livro?");
				int idDevolver = sc.nextInt();
				livros.get(usuarios.get(idDevolver - 1).getLivro().getId()-1).setLivre(true);;
				usuarios.get(idDevolver - 1).setLivro(null);
				break;
			case 5:
				List<Livro> livrosEmprestados = new ArrayList<Livro>();
				for (int i = 0; i < livros.size(); i++) {
					if (livros.get(i).getLivre()) {
						
					} else {
						livrosEmprestados.add(livros.get(i));
					}
				}
				for (int i = 0; i < livrosEmprestados.size(); i++) {
					System.out.println(livrosEmprestados.get(i));
				}
				break;

			default:
				System.out.println();
			}
			System.out.println("Deseja fazer outra operação? (y / n)");
			if (sc.next() == "n") {
				continuar = false;
			}
		}

	}

}
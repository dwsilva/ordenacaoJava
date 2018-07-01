package pkgOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Teste {

	public static void main(String[] args) {
		
		List<Livro> listaDeLivros = new ArrayList<Livro>();
		listaDeLivros.add(new Livro("Java How to Program - 1", "Deitel & Deitel", 2007));
		listaDeLivros.add(new Livro("Patterns of Enterprise Application Architecture - 2", "Martin Fowler", 2002));
		listaDeLivros.add(new Livro("Head First Design Patterns - 3", "Elisabeth Freeman", 2004));
		listaDeLivros.add(new Livro ("Internet & World Wide Web: How to Program - 4", "Deitel & Deitel", 2007));
		
		ComparaLivro comparator = new ComparaLivro();
		
		// Ordena de forma ascendente por titulo
		Collections.sort(listaDeLivros, comparator.comparadorPorTitulo);
		System.out.println("Ordenação de forma ascendente de acordo com o titulo do livro: \n"+listaDeLivros.toString());
		
		// Ordena de forma ascendente por autor
		Collections.sort(listaDeLivros, comparator.comparadorPorAutor);
		System.out.println("Ordenação de forma ascendente de acordo com o autor do livro: \n"+listaDeLivros.toString());
		
		// Ordena de forma ascendente por edição
		Collections.sort(listaDeLivros);
		System.out.println("Ordenação de forma ascendente de acordo com a edição do livro: \n"+listaDeLivros.toString());
		
		// Ordena de forma descendente por edição
		Collections.reverse(listaDeLivros);
		System.out.println("Ordenação de forma descendente de acordo com a edição do livro: \n"+listaDeLivros.toString());
		
		
	}
		
}	
	


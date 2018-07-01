package pkgOrdenacao;

import java.util.Comparator;

public class ComparaLivro implements Comparator<Livro> {
	
	public int compare(Livro livro1, Livro livro2) {
		return livro1.getAutor().compareTo(livro2.getAutor());
	}
	
	Comparator<Livro> comparadorPorTitulo = new Comparator<Livro> () {  
	     public int compare (Livro livro1 , Livro livro2) {  
	           return livro1.getTitulo().compareTo(livro2.getTitulo());  		  
	     }   
	};
	
	Comparator<Livro> comparadorPorAutor = new Comparator<Livro> () {  
	     public int compare (Livro livro1 , Livro livro2) {  
	           return livro1.getAutor().compareTo(livro2.getAutor());  		  
	     }   
	};
		
}

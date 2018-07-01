package pkgOrdenacao;


public class Livro implements Comparable<Livro>{
	
	private String tituloDoLivro, autorDoLivro;
	private int edicaoDoLivro;
		
	Livro(String titulo, String autor, int edicao){
		this.tituloDoLivro = titulo;
		this.autorDoLivro = autor;
		this.edicaoDoLivro = edicao;
	}
	
	public void setTitulo(String autor) {
		this.tituloDoLivro = autor;
	}
	
	public void setAutor(String titulo) {
		this.autorDoLivro = titulo;
	}
	
	public void setEdicao(int edicao) {
		this.edicaoDoLivro = edicao;
	}
		
	public String getTitulo() {
		return this.tituloDoLivro;
	}
	
	public String getAutor() {
		return this.autorDoLivro;
	}
	
	public int getEdicao() {
		return this.edicaoDoLivro;
	}
			
	@Override
	public String toString() {
	    String s = "**\nTítulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nEdição: "+ getEdicao() + "\n";
	    return s;
	}
	
	public interface Comparator {
		<T> int compare(T livro1, T livro2);
	}
	
	public int compareTo(Livro livro) {
	    if (this.edicaoDoLivro < livro.edicaoDoLivro) {
	        return -1;
	    }
	    if (this.edicaoDoLivro > livro.edicaoDoLivro) {
	        return 1;
	    }
	    return 0;
	}
	
}

package Model;

public class Livro {

	private String nome;
	private String autor;
	private String descricao;
	private String numeroDaEdicao;
	private int number;
	public Livro(String n, String a, String d, String numed, int number) {
		 this.setNome(n);
		this.setAutor(a);
		this.setDescricao(d);
		this.setNumeroDaEdicao(numed);
		this.setNumber(number);
	}
	
	

	public Livro() {
		super();
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", descricao="
				+ descricao + "]";
	}

	public String getNumeroDaEdicao() {
		return numeroDaEdicao;
	}

	public void setNumeroDaEdicao(String numeroDaEdicao) {
		this.numeroDaEdicao = numeroDaEdicao;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

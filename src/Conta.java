
public class Conta {

	private int numero;
	private int agencia;
	private String nomeTitular;
	private double saldo;
	
	public Conta() {
		this(0, 0, "Sem nome", 0.0);
	}
	
	public Conta(int numero, int agencia, String nome, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.nomeTitular = nome;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public String getNome() {
		return nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNome(String nome) {
		this.nomeTitular = nome;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}
}

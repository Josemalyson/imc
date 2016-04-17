package imc;

public class IMC {
	private double altura;
	private double peso;

	public IMC(double altura, double peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public void calculoImc() {
		System.out.println("O seu IMC é: " + peso / (altura * altura));
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}

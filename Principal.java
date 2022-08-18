package buscaEsferas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite la distancia a la casa de Goku");
		int distancia = entrada.nextInt();
		Esfera esfera = new Esfera(distancia);
		esfera.imprime_datos();
	}
}

class Esfera {

	public Esfera(int d) {  // constructor, asi asigne el valor a los atributos
		this.distancia_casa_goku = d;
		this.distancia = 2 * (d) + 4;
		this.tiempo = (d + this.distancia) / 5;

		if (this.tiempo > 0 && this.tiempo <= 20) {
			this.nombre_esfera = "Uno";
		}

		if (this.tiempo >= 21 && this.tiempo <= 30) {
			this.nombre_esfera = "Dos";
		}

		if (this.tiempo >= 31 && this.tiempo <= 50) {
			this.nombre_esfera = "Tres";
		}

		if (this.tiempo >= 50) {
			this.nombre_esfera = "Cuatro";
		}
	}

	public void imprime_datos() { // con  este metodo imprimo los datos

		System.out.println(this.distancia_casa_goku + " " + this.distancia + " " + this.tiempo);
		System.out.println(this.nombre_esfera);
	}

	private String nombre_esfera;
	private int distancia_casa_goku;
	private int tiempo;
	private int distancia;
}

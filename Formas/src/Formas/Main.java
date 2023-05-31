package Formas;

import java.util.Scanner;
public class Main {
	  public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o lado do quadrado: ");
	        double ladoQuadrado = scanner.nextDouble();
	        Quadrado quadrado = new Quadrado(ladoQuadrado);
	        System.out.println("===================================================");
	        System.out.println();

	        System.out.print("Digite a base do retângulo: ");
	        double baseRetangulo = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a altura do retângulo: ");
	        double alturaRetangulo = scanner.nextDouble();
	        System.out.println();
	        System.out.println("===================================================");

	        Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);

	        System.out.print("Digite a base do triângulo: ");
	        double baseTriangulo = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a altura do triângulo: ");
	        double alturaTriangulo = scanner.nextDouble();
	        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
	        System.out.println();
	        System.out.println("===================================================");

	        System.out.print("Digite a base maior do trapézio: ");
	        double baseMaiorTrapezio = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a base menor do trapézio: ");
	        double baseMenorTrapezio = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a altura do trapézio: ");
	        double alturaTrapezio = scanner.nextDouble();
	        System.out.println();

	        Trapezio trapezio = new Trapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio);
	        System.out.println("===================================================");

	        System.out.println();
	        System.out.println();

	        System.out.println("Área do quadrado: " + quadrado.calcularArea());
	        System.out.println("Área do retângulo: " + retangulo.calcularArea());
	        System.out.println("Área do triângulo: " + triangulo.calcularArea());
	        System.out.println("Área do trapézio: " + trapezio.calcularArea());
}
}
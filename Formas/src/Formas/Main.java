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

	        System.out.print("Digite a base do ret�ngulo: ");
	        double baseRetangulo = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a altura do ret�ngulo: ");
	        double alturaRetangulo = scanner.nextDouble();
	        System.out.println();
	        System.out.println("===================================================");

	        Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);

	        System.out.print("Digite a base do tri�ngulo: ");
	        double baseTriangulo = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a altura do tri�ngulo: ");
	        double alturaTriangulo = scanner.nextDouble();
	        Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
	        System.out.println();
	        System.out.println("===================================================");

	        System.out.print("Digite a base maior do trap�zio: ");
	        double baseMaiorTrapezio = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a base menor do trap�zio: ");
	        double baseMenorTrapezio = scanner.nextDouble();
	        System.out.println();

	        System.out.print("Digite a altura do trap�zio: ");
	        double alturaTrapezio = scanner.nextDouble();
	        System.out.println();

	        Trapezio trapezio = new Trapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio);
	        System.out.println("===================================================");

	        System.out.println();
	        System.out.println();

	        System.out.println("�rea do quadrado: " + quadrado.calcularArea());
	        System.out.println("�rea do ret�ngulo: " + retangulo.calcularArea());
	        System.out.println("�rea do tri�ngulo: " + triangulo.calcularArea());
	        System.out.println("�rea do trap�zio: " + trapezio.calcularArea());
}
}
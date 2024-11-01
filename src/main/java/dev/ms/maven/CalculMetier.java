package dev.ms.maven;

public class CalculMetier {

	public double somme(double a, double b) {
		return a + b;
	}

	public double produit(double a, double b) {
		return a * b;
	}

	public double division(double a, double b) {
		if (b == 0) {
			return Double.NaN;
		}
		return a / b;
	}
}

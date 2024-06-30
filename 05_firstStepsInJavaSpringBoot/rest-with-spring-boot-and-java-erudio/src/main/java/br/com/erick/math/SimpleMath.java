package br.com.erick.math;

public class SimpleMath {
	public Double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}
	
	public Double average(Double numberOne, Double numberTwo){
		return (numberOne + numberTwo)/2;
	}
	
	public Double divide(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public Double multiply(Double numberOne, Double numberTwo){
		return numberOne * numberTwo;
	}
	
	public Double square(Double number) {
		return Math.sqrt(number);
	}
	
	public static Double subtract(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}
}

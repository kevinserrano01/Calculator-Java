package PaqueteCalculadora;

import javax.swing.JOptionPane;

public class Calculadora {

	//ATRIBUTOS
	int num1;
	int num2;
	int suma;
	int resta;
	int multiplicacion;
	int division;
	
	
	//METODOS
	public void ingresarNumeros() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE OTRO NUMERO: "));
	}
	
	//METODO PARA SUMAR AMBOS NUMEROS
	public	void sumar() {
		suma = num1 + num2;
	}
	
	//METODO PARA RESTAR AMBOS NUMEROS
	public	void restar() {
		resta = num1 - num2;
	}
	
	//METODO PARA MULTIPLICAR AMBOS NUMEROS
	public	void multiplicar() {
		multiplicacion = num1 + num2;
	}
	
	//METODO PARA DIVIDIR AMBOS NUMEROS
	public	void dividir() {
		division = num1 + num2;
	}
	
	public void mostrarResultados() {
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		System.out.println("El resultado de la division es: " + division);
	}
	
}

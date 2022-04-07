package PaqueteTest;

import PaqueteCalculadora.Calculadora; //IMPORTAR LA CLASE CALCULADORA 

public class Main {

	public static void main(String[] args) {
		
		Calculadora op = new Calculadora(); //CREAMOS UN OBJETO LLAMADO op ''operacion'
		
		
		//PEDIMOS QUE PRIMERO INGRESE LOS NUMEROS PARA REALIZAR LAS DEMAS OPERACIONES
		op.ingresarNumeros();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
		op.mostrarResultados();
	}

}

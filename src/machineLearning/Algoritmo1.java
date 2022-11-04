package machineLearning;

import modulo.IProcesador;

public class Algoritmo1 extends Machine {

	public Algoritmo1(IProcesador procesador) {
		super(procesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Comparar() {
		System.out.println("Se esta comparando con el algoritmo 1");
		this.proceso.Procesar();
		
	}

}

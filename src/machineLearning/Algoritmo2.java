package machineLearning;

import modulo.IProcesador;

public class Algoritmo2 extends Machine {

	public Algoritmo2(IProcesador procesador) {
		super(procesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Comparar() {
		System.out.println("Se esta comparando con el algoritmo 2");
		this.proceso.Procesar();
		
	}

}

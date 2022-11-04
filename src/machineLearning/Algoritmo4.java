package machineLearning;

import modulo.IProcesador;

public class Algoritmo4 extends Machine {

	public Algoritmo4(IProcesador procesador) {
		super(procesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Comparar() {
		System.out.println("Se esta comparando con el algoritmo 4");
		this.proceso.Procesar();
		
	}

}

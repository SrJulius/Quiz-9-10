package machineLearning;

import modulo.IProcesador;

public class Algoritmo3 extends Machine {

	public Algoritmo3(IProcesador procesador) {
		super(procesador);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Comparar() {
		System.out.println("Se esta comparando con el algoritmo 3");
		this.proceso.Procesar();
		
	}

}

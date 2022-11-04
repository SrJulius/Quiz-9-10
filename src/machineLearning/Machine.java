package machineLearning;

import modulo.IProcesador;

public abstract class Machine {
	
	protected IProcesador proceso;
	
	protected Machine(IProcesador procesador)
	{
		this.proceso = procesador;
	}
	
	public abstract void Comparar();
	
	


}

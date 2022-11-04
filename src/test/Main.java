package test;

import machineLearning.*;
import modulo.*;

public class Main {

	public static void main(String[] args) {
		
		Algoritmo1 algoritmo1 = new Algoritmo1 (new Captions());
		algoritmo1.Comparar();
		
		Algoritmo2 algoritmo2 = new Algoritmo2 (new Translate());
		algoritmo2.Comparar();
		
		Algoritmo3 algoritmo3 = new Algoritmo3 (new Description());
		algoritmo3.Comparar();
		
		Algoritmo4 algoritmo4 = new Algoritmo4 (new Captions());
		algoritmo4.Comparar();
		
		
		
		

	}

}

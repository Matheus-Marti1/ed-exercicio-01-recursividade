package controller;

public class SomaController {

	public SomaController() {
		super();
	}

	public int soma(int num) {
		// A condição de parada retornará 0, quando o número sendo somado for menor que
		// 0, ou o número inserido for menor que 0
		if (num < 0) {
			return 0;
		}
		// Ao inserir um número, a função irá pegar esse número e somar com a função,
		// que irá mandar esse número menos um
		else {
			return num + soma(num - 1);
		}
	}
}

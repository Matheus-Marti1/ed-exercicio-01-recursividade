package controller;

public class SomaController {

	public SomaController() {
		super();
	}

	public int soma(int num) {
		// A condi��o de parada retornar� 0, quando o n�mero sendo somado for menor que
		// 0, ou o n�mero inserido for menor que 0
		if (num < 0) {
			return 0;
		}
		// Ao inserir um n�mero, a fun��o ir� pegar esse n�mero e somar com a fun��o,
		// que ir� mandar esse n�mero menos um
		else {
			return num + soma(num - 1);
		}
	}
}

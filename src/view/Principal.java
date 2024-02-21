package view;

import javax.swing.JOptionPane;

import controller.SomaController;

public class Principal {

	public static void main(String[] args) {
		SomaController somaController = new SomaController();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro positivo:"));
		int soma = somaController.soma(num);
		System.out.println(soma);
	}
}

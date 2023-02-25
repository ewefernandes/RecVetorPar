package view;
import controller.Modulos;

public class Principal {
	public static void main (String[] args) {
		Modulos mod = new Modulos();
		int i=0, somapar=0;
		int[] vetor = {2,19,200,10,9};
		int tamanho = (vetor.length)-1;
		int pares = mod.VetPares(vetor, tamanho, i, somapar);
		System.out.println(pares);
	}
}

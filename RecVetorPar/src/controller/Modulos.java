package controller;

public class Modulos {
	
	public int VetPares (int vet[], int tamanho, int i, int par) {
		if (i > tamanho) {
			return par;
		} else {
			if ((vet[i] % 2) == 0) {
				par = par + 1;
			}
			return VetPares(vet, tamanho, i+1, par);
		}
	}
}

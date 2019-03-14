import java.util.Scanner;
public class WhatTheHap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			int numero = in.nextInt();
			if (numero==0) {
				break;
			}
		}

	}
}

class NoFila {
	private int numero;
	private NoFila proximo;

	public NoFila(int numero){
		this.numero = numero;
		this.proximo = null;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setProximo(NoFila proximo) {
		this.proximo = proximo;
	}

	public NoFila getProximo() {
		return this.proximo;
	}

}
class Fila {
	private NoFila primeiro;
	private NoFila ultimo;
	private int tamanho;

	public Fila () {
		this.primeiro = null;
		this.ultimo = null;
		this.tamanho=0;	
	}

	public void inserir(int numero) {
		NoFila aux = new NoFila(numero);
		if (tamanho==0) {
			this.primeiro=aux;
			this.ultimo=aux;
		}
		else {
			this.ultimo.setProximo(aux);
			this.ultimo=aux;
		}
		tamanho++;
	}
	















}

package view;

import controller.ListaControle;
import model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		ListaControle lc = new ListaControle();
		Lista<Integer> L = new Lista<>();
		
		L.addLast(3);
		L.addLast(5);
		L.addLast(8);
		L.addLast(12);
		L.addLast(9);
		L.addLast(7);
		L.addLast(6);
		L.addLast(2);
		L.addLast(3);
		L.addLast(7);
		L.addLast(16);

		Lista<Integer> Maiores = new Lista<>();
		Maiores.addFirst(L.get(0));
		Maiores.addLast(L.get(1));
		Maiores = lc.ListaBubbleInt(Maiores);
		
		int tamanho = L.size();
		for (int i = 2; i < tamanho; i++) {
			Maiores.addLast(L.get(i));
			Maiores = lc.ListaBubbleInt(Maiores);
			Maiores.removeFirst();
		}
		
		tamanho = Maiores.size();
		for (int i = 0; i < tamanho; i++) {
			System.out.print(Maiores.get(i)+" ");
		}
	}

}

package view;

import javax.swing.JOptionPane;
import br.edu.fateczl.arvoreint.Arvore;
import controller.ManipArvoreController;

public class Principal {

	public static void main(String[] args) {
		int vetor[] = {7, 8, 3, 4, 2, 1, 6, 5};
		Arvore arvore = new Arvore();
		ManipArvoreController m = new ManipArvoreController();
		int opc = 0;
		
		for (int i : vetor) {
			arvore.insert(i);
		}

		m.removeNo(arvore, 7);
		m.removeNo(arvore, 6);
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1- Pre-ordem; 2- Em ordem; 3- Pos-ordem; 9- Sair."));
			m.percorreArvore(arvore, opc);
		} while (opc != 9);
		
	}

}

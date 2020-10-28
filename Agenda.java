package atividade_array_telefone;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Agenda {

	public static void main(String[] args) {

		int opcao = 0;

		String nomeDoContato = null;
		String foneDoContato = null;

		String menu = "Escolha a Opção: [0] - Sair\n, [1]- Incluir nome e fone\n, [2]- Alterar fone\n , [3] - Consultar fone\n, [4] - Excluir\n, [5] - Listar agenda\n";

		ArrayList<Contato> agenda = new ArrayList<>();

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {

			case 1: // INCLUIR

				nomeDoContato = JOptionPane.showInputDialog(null, "Qual o nome do contato?");
				foneDoContato = JOptionPane.showInputDialog(null, "Qual o número do contato?");

				Contato contato = new Contato(nomeDoContato, foneDoContato);
				agenda.add(contato);
				JOptionPane.showMessageDialog(null, "Contato criado com sucesso!");

				break;

			case 2: // ALTERAR

				nomeDoContato = JOptionPane.showInputDialog(null, "Qual contato você deseja alterar?");
				String novoFoneDoContato = JOptionPane.showInputDialog("Qual o novo número do telefone");
				boolean telefoneAlterado = false;

				for (Contato contatoNaAgenda : agenda) {
					if (contatoNaAgenda.getNome().equals(nomeDoContato)) {
						contatoNaAgenda.setFone(novoFoneDoContato);
						telefoneAlterado = true;
						break;
					}
				}
				JOptionPane.showMessageDialog(null, telefoneAlterado ? "Contato Alterado! " : "Contato inexistente");
				break;

			case 3: // CONSULTAR

				nomeDoContato = JOptionPane.showInputDialog(null, "Qual contato você deseja consultar?");

				boolean nomeEncontrado = false;
				foneDoContato = "";
				for (Contato contatoNaAgenda : agenda) { // para cada contato na agenda em agenda
					if (contatoNaAgenda.getNome().equals(nomeDoContato)) {
						foneDoContato = contatoNaAgenda.getFone();
						nomeEncontrado = true;
						break;
					}
				}
				JOptionPane.showMessageDialog(null,
						nomeEncontrado ? "O Telefone de " + nomeDoContato + " é: " + foneDoContato
								: "Contato Inexistente");
				break;

			case 4: // EXCLUIR

				nomeDoContato = JOptionPane.showInputDialog(null, "Qual contato você deseja excluir?");
				boolean contatoExcluido = false;

				for (Contato contatoNaAgenda : agenda) {
					if (contatoNaAgenda.getNome().equals(nomeDoContato)) {
						agenda.remove(contatoNaAgenda);
						contatoExcluido = true;
						break;
					}
				}
				JOptionPane.showMessageDialog(null, contatoExcluido ? "Contato Excluido! " : "Contato inexistente");

				break;

			case 5: // LISTAR

				JOptionPane.showMessageDialog(null, agenda);

				break;

			case 6: // SAIR
				JOptionPane.showMessageDialog(null, "Você saiu da Agenda");
				return;

			default: // Opção Inválida

				JOptionPane.showMessageDialog(null, "Opção Inválida! Tente novamente");

			}

		} while (opcao != 6);
	}
}

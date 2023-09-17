package _TelaResposta;

import javax.swing.*;
import java.awt.*;

/*import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
*/

public class Resposta {

	public static void main(String[] args) {
		JFrame tela = new JFrame("Resposta");
		tela.setSize(500,700);
		
		JPanel painel = new JPanel();
		painel.setSize(300,700);
		
		tela.setLayout(null);
		
		JLabel title = new JLabel();
		title.setText("Escreva uma mensagem");
		title.setBounds(20,555,200,70);
		
		JTextField mensagem = new JTextField();
		mensagem.setBounds(20, 610, 350, 30);
		
		JPanel resposta = new JPanel();
		resposta.setBounds(20,20,440,550);
		resposta.setBackground(Color.white);
		
		JLabel txtResposta = new JLabel();
		txtResposta.setText("TEXTO");
		txtResposta.setBounds(10,10,430,540);
		
		JButton submit = new JButton("Enviar");
		submit.setBounds(380,610,80,30);
		
		
		//Adicionar componentes na tela
		tela.add(title);
		tela.add(mensagem);
		tela.add(resposta);
		tela.add(submit);
		//tela.add(txtResposta);
		resposta.add(txtResposta);
		tela.setVisible(true);

	}

}

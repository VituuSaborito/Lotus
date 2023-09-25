package frontend;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class telaResposta {

	static String papo = "";
	
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
		
		
		ActionListener pergunta = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				backend.DocumentIngestor.pergunta = mensagem.getText();
				try {
					System.out.println(telaArquivo.nome);
					backend.DocumentIngestor.main(args);
					mensagem.setText("");
				} catch (Exception e) {
					e.printStackTrace();
				}
				//papo += DocumentIngestor.resposta + "\n";
				txtResposta.setText(backend.DocumentIngestor.resposta);
			}
		};
		submit.addActionListener(pergunta);

	}

}

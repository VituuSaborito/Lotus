package projetoChatbot;

//import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
//import java.awt.event.ItemListener;

public class telaArquivo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Inserção de Arquivo");
		tela.setSize(500,700);
		
		JPanel painel = new JPanel();
		painel.setSize(300,700);
		
		tela.setLayout(null);
		
		
		JLabel title = new JLabel();
		title.setText("Selecione o formato do arquivo: ");
		title.setBounds(150, 50, 200, 70);

		JRadioButton alternativa1 = new JRadioButton("PDF", false);
		alternativa1.setBounds(100, 150, 60, 70);
		JRadioButton alternativa2 = new JRadioButton("DOCX", false);
		alternativa2.setBounds(100, 200, 60, 70);
		JRadioButton alternativa3 = new JRadioButton("TXT", false);
		alternativa3.setBounds(100, 250, 60, 70);
		JRadioButton alternativa4 = new JRadioButton("CSV", false);
		alternativa4.setBounds(100, 300, 60, 70);
		
		
		ButtonGroup radios = new ButtonGroup();
		radios.add(alternativa1);
		radios.add(alternativa2);
		radios.add(alternativa3);
		radios.add(alternativa4);
		
		JButton importar = new JButton("Inserir o arquivo");
		importar.setBounds(145, 375, 200, 30);
		
		tela.add(title);
		tela.add(alternativa1);
		tela.add(alternativa2);
		tela.add(alternativa3);
		tela.add(alternativa4);
		tela.add(importar);
		
		tela.setVisible(true);
	}

}

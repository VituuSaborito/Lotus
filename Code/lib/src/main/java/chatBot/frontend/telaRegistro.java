package frontend;

//import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.*;
//import javax.swing.JRadioButton;

public class telaRegistro {
	public static void main(String[] args){
		JFrame tela = new JFrame("Registro");
		tela.setSize(500, 700);
		
		JPanel painel = new JPanel();
		painel.setSize(300, 700);
		
		tela.setLayout(null);
		
		JLabel title = new JLabel();
		title.setText("Registre-se: ");
		title.setBounds(215, 50, 200, 70);
		
		JLabel textoNome = new JLabel("Nome: ");
		textoNome.setBounds(100, 130, 50, 30);
		
		JTextField nome = new JTextField();
		nome.setBounds(150, 130, 200, 30);
		
		JLabel textoEmail = new JLabel("Email: ");
		textoEmail.setBounds(100, 180, 50, 30);
		
		JTextField email = new JTextField();
		email.setBounds(150, 180, 200, 30);
		
		JLabel textoSenha = new JLabel("Senha: ");
		textoSenha.setBounds(100, 230, 50, 30);
		
		JPasswordField senha = new JPasswordField();
		senha.setBounds(150, 230, 200, 30);
		
		JLabel textoConfSenha = new JLabel("Confirmar senha: ");
		textoConfSenha.setBounds(40, 280, 110, 30);
		
		JPasswordField confSenha = new JPasswordField();
		confSenha.setBounds(150, 280, 200, 30);
		
		JButton registrar = new JButton("Registrar");
		registrar.setBounds(150, 350, 200, 30);
		
		tela.add(title);
		tela.add(textoNome);
		tela.add(nome);
		tela.add(textoEmail);
		tela.add(email);
		tela.add(textoSenha);
		tela.add(senha);
		tela.add(textoConfSenha);
		tela.add(confSenha);
		tela.add(registrar);
		
		tela.setVisible(true);
		
		//ActionListener printa = new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//		System.out.println(nome.getText());
		//		System.out.println(email.getText());
		//		System.out.println(senha.getPassword());
		//		System.out.println(confSenha.getPassword());
		//	}
		//};
		//registrar.addActionListener(printa);
	}
}




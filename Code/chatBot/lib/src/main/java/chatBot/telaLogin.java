package chatBot;

//import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
//import javax.swing.JRadioButton;

public class telaLogin {
	public static void main(String[] args){
		JFrame tela = new JFrame("Login");
		tela.setSize(500, 700);
		
		JPanel painel = new JPanel();
		painel.setSize(300, 700);
		
		tela.setLayout(null);
		
		JLabel title = new JLabel();
		title.setText("Login: ");
		title.setBounds(230, 50, 200, 70);
		
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
		
		JButton registrar = new JButton("Entrar");
		registrar.setBounds(150, 300, 200, 30);
		
		tela.add(title);
		tela.add(textoNome);
		tela.add(nome);
		tela.add(textoEmail);
		tela.add(email);
		tela.add(textoSenha);
		tela.add(senha);
		tela.add(registrar);
		
		tela.setVisible(true);
	}
}

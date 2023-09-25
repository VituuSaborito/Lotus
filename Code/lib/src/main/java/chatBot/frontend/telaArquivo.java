package frontend;

//o bot só ingere documentos após a importação deles

//import java.awt.GridBagLayout;
//import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.ButtonGroup;

import java.awt.event.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class telaArquivo {
	static String username = System.getProperty("user.name");
	public static String nome;
	
	public static String caminho;
	//public static int contador = 0;
	
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
		
		JButton refresh = new JButton("Fazer a pergunta");
		refresh.setBounds(145, 450, 200, 30);
		
		tela.add(title);
		tela.add(alternativa1);
		tela.add(alternativa2);
		tela.add(alternativa3);
		tela.add(alternativa4);
		tela.add(importar);
		tela.add(refresh);
		
		tela.setVisible(true);
		
		ActionListener abreArquivo = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				boolean[] list = {alternativa1.isSelected(), alternativa2.isSelected(), alternativa3.isSelected(), alternativa4.isSelected()};
			    JFileChooser chooser = new JFileChooser();
			    if(list[3] == true) {
			    	FileNameExtensionFilter filter = new FileNameExtensionFilter("Formato csv", "csv");			    	
			    	chooser.setFileFilter(filter);
			    } else if(list[1] == true) {
			    	FileNameExtensionFilter filter = new FileNameExtensionFilter("Formato docx", "docx");			    	
			    	chooser.setFileFilter(filter);
			    } else if(list[2] == true) {
			    	FileNameExtensionFilter filter = new FileNameExtensionFilter("Formato txt", "txt");			    	
			    	chooser.setFileFilter(filter);
			    } else {
			    	FileNameExtensionFilter filter = new FileNameExtensionFilter("Formato pdf", "pdf");			    	
			    	chooser.setFileFilter(filter);
			    }
			    int i = chooser.showOpenDialog(tela);
			    if(i == JFileChooser.APPROVE_OPTION) {
			       File file = chooser.getSelectedFile();
			       String filepath = file.getPath();
			       caminho = filepath;
			       
			    	   
			       try {
			    	   //File arquivo = new File("C:\\Users\\gokuk\\eclipse-workspace\\chatBot\\lib\\src\\main\\java\\chatBot\\" + DocumentIngestor.nome);
			    	   //if(arquivo.exists()) {
			    		//   JOptionPane.showMessageDialog(null, "Um arquivo com o mesmo nome já foi carregado. Por favor escolha outro nome para o arquivo.");
			    	   //} else {
			    		   file.renameTo(new File("C:\\Users\\" + username + "\\eclipse-workspace\\chatBot\\lib\\src\\main\\java\\chatBot", file.getName()));
			    		   nome = chooser.getName(file);
			    		   System.out.println(nome);
			    		   //arquivo.createNewFile();
			    		   //FileWriter fw = new FileWriter(arquivo, true);
			    		   //BufferedWriter bw = new BufferedWriter(fw);
			    		   //BufferedReader buferredReader = new BufferedReader(new FileReader(filepath));
			    		   //String str1 = "";
			    		   //while (buferredReader.ready()) {
			    			   //str1 = buferredReader.readLine();
			    		   		//str2 += str1 + "\n";
			    			   //bw.write(str1);
			    			   //bw.newLine();
			    			   //System.out.println(str1);
			    		   //}
			    		   
			    		   JOptionPane.showMessageDialog(null, "Arquivo Carregado com Sucesso!");
			    		   //JOptionPane.showMessageDialog(null, arquivo.toURI());
			    		   
			    		   //DocumentIngestor.main(args); é pra abrir outra tela
			    		   
			    		   tela.dispose();
			    		   //DocumentIngestor.main(args);
			    		   telaResposta.main(args);
			    		   
			    		   //buferredReader.close();
			    		   //bw.close();
			    		   //fw.close();
			    	   } catch (Exception ex) {
			    	   ex.printStackTrace();   
			    	   	}			    	   			    	   
			    }
			}
		};
		
		/*ActionListener recarrega = new ActionListener(){
			public void actionPerformed(ActionEvent evento) {
				//ScheduledExecutorService refreshPagina = Executors.newSingleThreadScheduledExecutor();
				Runnable run = new Runnable() {
					@Override
					public void run() {
						call();
					}
				};
				
				//refreshPagina.scheduleAtFixedRate(run, 0, 5, TimeUnit.SECONDS);
				tela.dispose();
				telaResposta.main(args);
			}
			public static void call() {
				contador++;
				System.out.println(contador);
			}
		};*/
		
		importar.addActionListener(abreArquivo);
		//refresh.addActionListener(recarrega);
	}

}

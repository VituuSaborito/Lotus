package chatBot;

//o bot não ingere documentos fora desse package
//o str1 recebe o conteúdo das linhas do texto, mas não escreve no arquivo .txt

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

public class telaArquivo {

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
			       
			       DocumentIngestor.nome = chooser.getName(file);
			    	   
			       try {
			    	   File arquivo = new File("C:\\Users\\gokuk\\eclipse-workspace\\chatBot\\lib\\src\\main\\java\\chatBot\\" + DocumentIngestor.nome);
			    	   
			    	   if(arquivo.exists()) {
			    		   JOptionPane.showMessageDialog(null, "Um arquivo com o mesmo nome já foi carregado. Por favor escolha outro nome para o arquivo.");
			    	   } else {
			    		   arquivo.createNewFile();
			    		   FileWriter fw = new FileWriter(arquivo, true);
			    		   BufferedWriter bw = new BufferedWriter(fw);
			    		   BufferedReader buferredReader = new BufferedReader(new FileReader(filepath));
			    		   String str1 = "";
			    		   while (buferredReader.ready()) {
			    			   //str2 += str1 + "\n";
			    			   str1 = buferredReader.readLine();
			    			   bw.write(str1);
			    			   bw.newLine();
			    			   System.out.println(str1);
			    		   }
			    	   
			    		   JOptionPane.showMessageDialog(null, "Arquivo Carregado com Sucesso!");
			    		   JOptionPane.showMessageDialog(null, arquivo.toURI());
			    		   DocumentIngestor.main(args);
			    		   buferredReader.close();
			    		   bw.close();
			    		   fw.close();
			    	   }
			       } catch (Exception ex) {
			    	   ex.printStackTrace();   
			    	   }			    	   			    	   
			    }
			}
		};
		
		importar.addActionListener(abreArquivo);
	}

}

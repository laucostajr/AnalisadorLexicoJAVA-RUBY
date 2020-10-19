package AnalisadorRB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;

public class Interface extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Interface();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setSize(1000, 700);
					frame.setLocation(400, 100);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interface.class.getResource("/AnalisadorRB/ruby.png")));
		
		
		setBackground(Color.WHITE);
		setTitle("Analisador L\u00E9xico para Ruby");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(this);
		
		setBounds(100, 100, 1000, 699);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/dc.png")));
		lblNewLabel_1.setBounds(38, 30, 400, 85);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/ral.png")));
		lblNewLabel_2.setBounds(560, 30, 400, 85);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/seta.png")));
		lblNewLabel_3.setBounds(360, 300, 200, 100);
		contentPane.add(lblNewLabel_3);
		
		final JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		textArea.setBackground(Color.WHITE);
		textArea.setRows(3);
		textArea.setTabSize(100);
		textArea.setToolTipText("");
		textArea.setWrapStyleWord(true);
		textArea.setEditable(false);
		textArea.setBounds(472, 130, 475, 450);
		textArea.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane.add(textArea);
		
	
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(31, 130, 318, 450);
		textArea_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane.add(textArea_1);
		
		
		//Barra de rolagem
		JScrollPane scroll = new JScrollPane(textArea);
        scroll.setBounds(472, 130, 475, 450);                     
        getContentPane().add(scroll);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		 
		JScrollPane scroll_1 = new JScrollPane(textArea_1);
        scroll_1.setBounds(31, 130, 318, 450);                    
        getContentPane().add(scroll_1);
        setLocationRelativeTo( null );
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		
		JButton btnImportar = new JButton("Importar Arquivo.rb");
		btnImportar.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/upload.png")));
		
		btnImportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textArea.setText(""); //Limpar os textos
				textArea_1.setText("");//Limpar os textos
				
				String x;
				x = JOptionPane.showInputDialog("Digite o caminho do arquivo.");
				
				try {
				      FileReader arq = new FileReader(x); // ler o arquivo
				      BufferedReader lerArq = new BufferedReader(arq);
				 
				      String linha = lerArq.readLine(); // lê a primeira linha
				      // a variável "linha" recebe o valor "null" quando o processo
				      // de repetição atingir o final do arquivo texto
				      while (linha != null) {
				    	  textArea_1.setText(textArea_1.getText() + "\n" + linha);
				    	  linha = lerArq.readLine(); // lê da segunda até a última linha
				      }
				 
				      arq.close();
				    } catch (IOException e) {
				        JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo. \n" + e.getMessage());
				    }

			}
		});
		
		btnImportar.setBounds(32, 586, 180, 23);
		contentPane.add(btnImportar);
		
		JButton btnAnalisar = new JButton("Analisar");
		btnAnalisar.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/Lupa.png")));
		
		btnAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				textArea.setText("");
				final String expr;
				expr = (String)textArea_1.getText();
				
				Analisador lexical = new Analisador(new StringReader(expr));
				
				TokenRuby token;
				try {
					while ((token = lexical.yylex()) != null) {
						Printar imprimir = new Printar(token.getName(), token.getValue(), token.getLine(), token.getColumn(), token.getDesc());
						
						String nameValue = imprimir.tamNameValue();
						String lineColumn = imprimir.tamLineColumn();
						String desc = imprimir.getDesc();
			
						textArea.setText(textArea.getText() + "\n" + nameValue + lineColumn + "\n" + desc +"\n" + 
						"------------------------------------------------------------------------------------------------------------------");
						
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
				
			}
		});
		
		btnAnalisar.setBounds(242, 586, 106, 23);
		contentPane.add(btnAnalisar);
		
		JButton btnTutorial = new JButton("Tutorial");
		btnTutorial.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/tutorial.png")));
		
		btnTutorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					uri();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		btnTutorial.setBounds(840, 586, 106, 23);
		contentPane.add(btnTutorial);
		
		JButton btnSalvarAnlise = new JButton("Salvar An\u00E1lise");
		btnSalvarAnlise.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/salvar.png")));
		btnSalvarAnlise.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = "analiseRuby.txt";
				try {
					BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
					String linha = "";
					linha = textArea.getText();
					buffWrite.append(linha + "\n");
					buffWrite.close();
					JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso.");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu..");
					e1.printStackTrace();
					
				}
				
				
			}
		});
		btnSalvarAnlise.setBounds(472, 586, 148, 23);
		contentPane.add(btnSalvarAnlise);
		

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setIcon(new ImageIcon(Interface.class.getResource("/AnalisadorRB/lixo.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				textArea_1.setText("");
			}
		});
		
		btnLimpar.setBounds(700, 586, 115, 23);
		contentPane.add(btnLimpar);
		
	}
	
	
	
	//Abrir tutorial
	private String uri() throws URISyntaxException{
		try {
			URI link = new URI("https://youtu.be/Rjj_MuowAl8");
			Desktop.getDesktop().browse(link);
		} catch (Exception erro) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Erro Inesperado.\n" + erro);
			
		} 
		
		return null;
		
	}

}
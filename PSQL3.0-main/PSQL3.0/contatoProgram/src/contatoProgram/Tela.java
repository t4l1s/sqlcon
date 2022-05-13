package contatoProgram;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela extends JFrame {
	
	// declara as variaveis do edges
	public JLabel lbNome;
	public JLabel lbSobrenome;
	public JLabel lbEmail;
	
	public JTextField tfNome;
	public JTextField tfSobrenome;
	public JTextField tfEmail;
	
	public JButton btnEnviar;
	
	public Tela() {
		
		//inicializa os edges
		lbNome = new JLabel("Nome: ");
		lbSobrenome = new JLabel("Sobrenome: ");
		lbEmail = new JLabel("Email: ");
		
		tfNome = new JTextField();
		tfSobrenome = new JTextField();
		tfEmail = new JTextField();
		
		btnEnviar = new JButton("Enviar");
		
		
		//configura a  tela
		setSize(400,500);
		setTitle("ContatoProgram");
		setVisible(true);
		
		//layout do edges
		setLayout(null);
		
		//posição e tamanho dos edges (x, y, with, heigt)
		lbNome.setBounds(10,10,100,25);
		tfNome.setBounds(97,10,200,25);
		
		lbSobrenome.setBounds(10,40,100,25);
		tfSobrenome.setBounds(97,40,200,25);
		
		lbEmail.setBounds(10,70,100,25);
		tfEmail.setBounds(97,70,200,25);
		
		btnEnviar.setBounds(10,100, 120, 25);
		
		btnEnviar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					acaoEnviar();
				}
			});
		
		//adiciona os edges a tela
		getContentPane().add(lbNome);
		getContentPane().add(tfNome);
		
		getContentPane().add(lbSobrenome);
		getContentPane().add(tfSobrenome);
		
		getContentPane().add(lbEmail);
		getContentPane().add(tfEmail);
		
		getContentPane().add(btnEnviar);
		
	}
	public void acaoEnviar() {
		String nome = tfNome.getText();
		String sobrenome = tfSobrenome.getText();
		String email = tfEmail.getText();
		
		new Banco(nome, sobrenome, email);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tela janela = new Tela();
	}

}

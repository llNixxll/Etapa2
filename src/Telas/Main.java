package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCADPessoas = new JMenuItem("Pessoas");
		mntmCADPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroPessoa cp = new CadastroPessoa();
				cp.setVisible(true);
			}
		});
		mnCadastros.add(mntmCADPessoas);
		
		JMenuItem mntmCADSalas = new JMenuItem("Salas");
		mntmCADSalas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroSala cs = new CadastroSala();
				cs.setVisible(true);
			}
		});
		mnCadastros.add(mntmCADSalas);
		
		JMenuItem mntmCADEspaco = new JMenuItem("Espa\u00E7os");
		mntmCADEspaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroEspaco ce = new CadastroEspaco();
				ce.setVisible(true);
			}
		});
		mnCadastros.add(mntmCADEspaco);
		
		JMenu mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		JMenuItem mntmCONPessoas = new JMenuItem("Pessoas");
		mntmCONPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telas.Controller c = new Telas.Controller();
				if(c.isInscricoes()) {
					
					
					
				}else {
					System.out.println("Inscricoes nao foram finalizadas");
				}
			}
		});
		mnConsultas.add(mntmCONPessoas);
		
		JMenuItem mntmCONSalas = new JMenuItem("Sala/Cafe");
		mnConsultas.add(mntmCONSalas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Finalizar Inscricoes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telas.Controller c = new Telas.Controller();
				c.setInscricoes(true);
			}
		});
		btnNewButton.setBounds(10, 11, 130, 37);
		contentPane.add(btnNewButton);
	}
}

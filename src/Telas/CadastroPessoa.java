package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pessoa.Pessoa;
import Pessoa.PessoaController;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;
import java.awt.event.ActionEvent;

public class CadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfSobrenome;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa frame = new CadastroPessoa();
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
	public CadastroPessoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnInscrever = new JButton("Inscrever");
		btnInscrever.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telas.Controller c = new Telas.Controller();
				if (c.getSalas() > 1) {

					if (tfNome.getText() != "" && tfSobrenome.getText() != "") {
						Pessoa p = new Pessoa();
						p.setNome(tfNome.getText());
						p.setSobrenome(tfSobrenome.getText());
						PessoaController pc = new PessoaController();
						pc.salvar(p);
					}
				}else {
					System.out.println("Salas insuficientes");
				}
			}
		});
		btnInscrever.setBounds(225, 168, 89, 23);
		contentPane.add(btnInscrever);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(126, 56, 188, 14);
		contentPane.add(lblNome);

		tfNome = new JTextField();
		tfNome.setBounds(126, 81, 188, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setHorizontalAlignment(SwingConstants.CENTER);
		lblSobrenome.setBounds(126, 112, 188, 14);
		contentPane.add(lblSobrenome);

		tfSobrenome = new JTextField();
		tfSobrenome.setBounds(126, 137, 188, 20);
		contentPane.add(tfSobrenome);
		tfSobrenome.setColumns(10);

		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(126, 168, 89, 23);
		contentPane.add(btnCancel);
	}
}

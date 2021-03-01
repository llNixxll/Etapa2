package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pessoa.Pessoa;
import Pessoa.PessoaController;
import Sala.Sala;
import Sala.SalaController;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroSala extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeSala;
	private JTextField tfLotacao;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroSala frame = new CadastroSala();
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
	public CadastroSala() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(127, 52, 188, 14);
		contentPane.add(lblNome);
		
		tfNomeSala = new JTextField();
		tfNomeSala.setColumns(10);
		tfNomeSala.setBounds(127, 77, 188, 20);
		contentPane.add(tfNomeSala);
		
		JLabel lblLotacao = new JLabel("Lota\u00E7\u00E3o");
		lblLotacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblLotacao.setBounds(127, 108, 188, 14);
		contentPane.add(lblLotacao);
		
		tfLotacao = new JTextField();
		tfLotacao.setBounds(127, 133, 188, 20);
		contentPane.add(tfLotacao);
		tfLotacao.setColumns(10);
		
		JButton btnCadastrarSala = new JButton("Cadastrar");
		btnCadastrarSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfNomeSala.getText()!="" && tfLotacao.getText()!="") {
					Sala sala = new Sala();
					sala.setNomeSala(tfNomeSala.getText());
					sala.setLotacaoSala(Integer.parseInt(tfLotacao.getText()));
					SalaController sc = new SalaController();
					sc.salvar(sala);
				}
			}
		});
		btnCadastrarSala.setBounds(226, 164, 89, 23);
		contentPane.add(btnCadastrarSala);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(127, 164, 89, 23);
		contentPane.add(btnCancel);
		
		
		
		
	}
}

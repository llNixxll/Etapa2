package Telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Cafe.Cafe;
import Cafe.CafeController;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroEspaco extends JFrame {

	private JPanel contentPane;
	private JTextField tfNomeEspaco;
	private JButton btnCancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEspaco frame = new CadastroEspaco();
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
	public CadastroEspaco() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNomeEspaco = new JTextField();
		tfNomeEspaco.setColumns(10);
		tfNomeEspaco.setBounds(129, 100, 188, 20);
		contentPane.add(tfNomeEspaco);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(129, 75, 188, 14);
		contentPane.add(lblNome);
		
		JButton btnCadastrarEspaco = new JButton("Cadastrar");
		btnCadastrarEspaco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tfNomeEspaco.getText()!="") {
					Cafe cafe = new Cafe();
					cafe.setNomeCafe(tfNomeEspaco.getText());
					CafeController cc = new CafeController();
					cc.salvar(cafe);
				}
			}
		});
		btnCadastrarEspaco.setBounds(228, 131, 89, 23);
		contentPane.add(btnCadastrarEspaco);
		
		btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCancel.setBounds(129, 131, 89, 23);
		contentPane.add(btnCancel);
		
		
	}

}

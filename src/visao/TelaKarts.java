package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Panel;

public class TelaKarts extends JFrame {

	private JPanel contentPane;
	private JTextField textBuscarKarts;
	private JTextField textMarcaKart;
	private JTextField textAno;
	private JTextField textPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaKarts frame = new TelaKarts();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
	public TelaKarts() {
		setTitle("Karts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 558);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(218, 73, 73));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblBuscarKarts = new JLabel("Buscar:");
		lblBuscarKarts.setForeground(new Color(255, 255, 255));
		lblBuscarKarts.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBuscarKarts.setBounds(99, 43, 67, 30);
		contentPane.add(lblBuscarKarts);
		
		textBuscarKarts = new JTextField();
		textBuscarKarts.setBounds(176, 46, 187, 30);
		contentPane.add(textBuscarKarts);
		textBuscarKarts.setColumns(10);
		
		JLabel lblMarcaKarts = new JLabel("Marca:");
		lblMarcaKarts.setForeground(new Color(255, 255, 255));
		lblMarcaKarts.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMarcaKarts.setBounds(99, 84, 67, 30);
		contentPane.add(lblMarcaKarts);
		
		textMarcaKart = new JTextField();
		textMarcaKart.setColumns(10);
		textMarcaKart.setBounds(176, 87, 187, 30);
		contentPane.add(textMarcaKart);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setForeground(Color.WHITE);
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAno.setBounds(424, 43, 67, 30);
		contentPane.add(lblAno);
		
		textAno = new JTextField();
		textAno.setColumns(10);
		textAno.setBounds(501, 43, 187, 30);
		contentPane.add(textAno);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(501, 84, 187, 30);
		contentPane.add(textPreco);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setForeground(Color.WHITE);
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPreo.setBounds(424, 84, 67, 30);
		contentPane.add(lblPreo);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(99, 120, 589, 389);
		contentPane.add(panel);
	}
}

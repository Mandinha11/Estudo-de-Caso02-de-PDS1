package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.ClienteDAO;
import Controle.KartsDAO;
import Modelo.Cliente;
import Modelo.Karts;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class TelaKarts extends JFrame {

	private JPanel contentPane;
	private JTextField txtPreco;
	private JTextField txtCor;
	private JTextField txtMarca;
	private JTextField txtAno;
	private JTextField txtQuantidade;
	private JTextField txtModelo;
	private JTable table;
	private JTextField txtMotor;
	private JTextField txtId;
	private JTextField txtData;
	private JTextField txtFornecedor;

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
		setBounds(100, 100, 2218, 1126);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 126, 30);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaSelecao ts = new TelaSelecao();
				ts.setExtendedState(JFrame.MAXIMIZED_BOTH);
				ts.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		
		Panel panel = new Panel();
		panel.setBounds(473, 84, 1343, 873);
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(368, 161, 1, 1);
		panel.add(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(24, 84, 424, 102);
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtCor = new JTextField();
		txtCor.setBounds(130, 11, 262, 30);
		panel_1.add(txtCor);
		txtCor.setColumns(10);
		
		JLabel lblBuscarKarts = new JLabel("Cor:");
		lblBuscarKarts.setBounds(10, 8, 67, 30);
		panel_1.add(lblBuscarKarts);
		lblBuscarKarts.setForeground(new Color(0, 0, 0));
		lblBuscarKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(24, 182, 424, 89);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 8, 104, 30);
		panel_1_1.add(lblQuantidade);
		lblQuantidade.setForeground(new Color(0, 0, 0));
		lblQuantidade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(134, 11, 260, 30);
		panel_1_1.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(24, 532, 424, 89);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_1);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setBounds(10, 10, 59, 30);
		panel_1_1_1.add(lblAno);
		lblAno.setForeground(new Color(0, 0, 0));
		lblAno.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtAno = new JTextField();
		txtAno.setBounds(130, 13, 261, 30);
		panel_1_1_1.add(txtAno);
		txtAno.setColumns(10);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(24, 617, 424, 89);
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_2);
		
		txtPreco = new JTextField();
		txtPreco.setBounds(131, 11, 261, 30);
		panel_1_1_2.add(txtPreco);
		txtPreco.setColumns(10);
		
		JLabel lblPreo = new JLabel("Preço:");
		lblPreo.setBounds(10, 8, 67, 30);
		panel_1_1_2.add(lblPreo);
		lblPreo.setForeground(new Color(0, 0, 0));
		lblPreo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBounds(24, 879, 424, 78);
		panel_1_1_3.setLayout(null);
		panel_1_1_3.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_3);
		
		JLabel lblMarcaKarts = new JLabel("Marca:");
		lblMarcaKarts.setBounds(10, 11, 67, 30);
		panel_1_1_3.add(lblMarcaKarts);
		lblMarcaKarts.setForeground(new Color(0, 0, 0));
		lblMarcaKarts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		
		txtMarca = new JTextField();
		txtMarca.setBounds(135, 14, 259, 30);
		panel_1_1_3.add(txtMarca);
		txtMarca.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Karts karts = new Karts();
				
				
				KartsDAO kartsDao = KartsDAO.getinstancia();
				
				 if (txtCor.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Cor não preenchido!!");
					 return;
			        }
				 else {
					 karts.setcor(txtCor.getText());
				 }
				
				 if (txtQuantidade.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Quantidade não preenchido!!");
					 return;
				 }
				 else {
				karts.setquantidade(Long.valueOf(txtQuantidade.getText()));
				 }
				 
				 if (txtAno.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Ano não preenchido!!");
					 return;
				 }
				 else {
				karts.setano(Long.valueOf(txtAno.getText()));
				 }
				
				 if (txtPreco.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Preço não preenchido!!");
					 return;
				 }
				 else {
				karts.setpreco(Long.valueOf(txtPreco.getText()));
				 }
			
				 if (txtMarca.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Marca não preenchido!!");
					 return;
				 }
				 else {
				karts.setmarca(String.valueOf(txtMarca.getText()));
				 }
				 
				 if (txtModelo.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Modelo não preenchido!!");
					 return;
				 }
				 else {
				karts.setmodelo(String.valueOf(txtModelo.getText()));
				 }
				 if (txtData.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Data de Entrada não preenchido!!");
					 return;
				 }
				 else {
				karts.setdataEntrada(Long.valueOf(txtData.getText()));
				 }
				 
				 if (txtId.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Id Kart não preenchido!!");
					 return;
				 }
				 else {
				karts.setId(Long.valueOf(txtId.getText()));
				 }
				 
				 if (txtFornecedor.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "CNPJ do Fornecedor não preenchido!!");
					 return;
				 }
				 else {
				karts.setforneCNPJ(Long.valueOf(txtFornecedor.getText()));
				 }
				 
				 if (txtMotor.getText().trim().length() == 0) {
					 JOptionPane.showMessageDialog(null, "Motor não preenchido!!");
					 return;
				 }
				 else {
				karts.setmotor(String.valueOf(txtMotor.getText()));
				 }
				 
			}
		});
		
		btnCadastrar.setBounds(24, 968, 424, 41);
		btnCadastrar.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		contentPane.add(btnCadastrar);
		
		JPanel panel_1_1_3_1 = new JPanel();
		panel_1_1_3_1.setBounds(24, 703, 424, 95);
		panel_1_1_3_1.setLayout(null);
		panel_1_1_3_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1_1_3_1);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblModelo.setBounds(10, 11, 67, 30);
		panel_1_1_3_1.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		txtModelo.setBounds(135, 14, 260, 30);
		panel_1_1_3_1.add(txtModelo);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setLayout(null);
		panel_1_1_4.setBackground(Color.LIGHT_GRAY);
		panel_1_1_4.setBounds(24, 270, 424, 89);
		contentPane.add(panel_1_1_4);
		
		JLabel lblMotor = new JLabel("Motor:");
		lblMotor.setForeground(Color.BLACK);
		lblMotor.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblMotor.setBounds(10, 8, 104, 30);
		panel_1_1_4.add(lblMotor);
		
		txtMotor = new JTextField();
		txtMotor.setColumns(10);
		txtMotor.setBounds(134, 11, 260, 30);
		panel_1_1_4.add(txtMotor);
		
		JPanel panel_1_1_4_1 = new JPanel();
		panel_1_1_4_1.setLayout(null);
		panel_1_1_4_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_4_1.setBounds(24, 444, 424, 89);
		contentPane.add(panel_1_1_4_1);
		
		JLabel lblIdKart = new JLabel("ID Kart:");
		lblIdKart.setForeground(Color.BLACK);
		lblIdKart.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblIdKart.setBounds(10, 8, 104, 30);
		panel_1_1_4_1.add(lblIdKart);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(134, 11, 260, 30);
		panel_1_1_4_1.add(txtId);
		
		JPanel panel_1_1_4_1_1 = new JPanel();
		panel_1_1_4_1_1.setLayout(null);
		panel_1_1_4_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1_4_1_1.setBounds(24, 794, 424, 89);
		contentPane.add(panel_1_1_4_1_1);
		
		JLabel lblDataEntrada = new JLabel("Data Entrada:");
		lblDataEntrada.setForeground(Color.BLACK);
		lblDataEntrada.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblDataEntrada.setBounds(10, 8, 104, 30);
		panel_1_1_4_1_1.add(lblDataEntrada);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(134, 11, 260, 30);
		panel_1_1_4_1_1.add(txtData);
		
		JPanel panel_1_1_4_1_2 = new JPanel();
		panel_1_1_4_1_2.setLayout(null);
		panel_1_1_4_1_2.setBackground(Color.LIGHT_GRAY);
		panel_1_1_4_1_2.setBounds(24, 357, 424, 89);
		contentPane.add(panel_1_1_4_1_2);
		
		JLabel lblFornecedorCnpj = new JLabel("Fornecedor CNPJ:");
		lblFornecedorCnpj.setForeground(Color.BLACK);
		lblFornecedorCnpj.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
		lblFornecedorCnpj.setBounds(10, 8, 174, 30);
		panel_1_1_4_1_2.add(lblFornecedorCnpj);
		
		txtFornecedor = new JTextField();
		txtFornecedor.setColumns(10);
		txtFornecedor.setBounds(143, 11, 260, 30);
		panel_1_1_4_1_2.add(txtFornecedor);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaKarts.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel.setBounds(-12, 0, 1946, 1061);
		contentPane.add(lblNewLabel);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(41, 480, 227, 41);
		contentPane.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 16));
	}
}

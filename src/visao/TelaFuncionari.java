package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaFuncionari extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFuncionari frame = new TelaFuncionari();
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
	public TelaFuncionari() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2093, 1226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(23, 11, 112, 28);
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
		
		JPanel panel = new JPanel();
		panel.setBounds(464, 22, 516, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(149, 11, 339, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(105, 7, 34, 28);
		panel.add(lblNewLabel);
		
		JPanel PnDataDeNascimento = new JPanel();
		PnDataDeNascimento.setLayout(null);
		PnDataDeNascimento.setBounds(464, 127, 516, 48);
		contentPane.add(PnDataDeNascimento);
		
		JLabel lblNewLabel_2 = new JLabel("Data De Nascimento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(23, 11, 160, 26);
		PnDataDeNascimento.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dia");
		lblNewLabel_3.setBounds(204, 14, 20, 26);
		PnDataDeNascimento.add(lblNewLabel_3);
		
		JComboBox boxDia = new JComboBox();
		boxDia.setBounds(234, 14, 47, 26);
		PnDataDeNascimento.add(boxDia);
		boxDia.addItem("01");
		boxDia.addItem("02");
		boxDia.addItem("03");
		boxDia.addItem("04");
		boxDia.addItem("05");
		boxDia.addItem("06");
		boxDia.addItem("07");
		boxDia.addItem("08");
		boxDia.addItem("09");
		boxDia.addItem("10");
		boxDia.addItem("11");
		boxDia.addItem("12");
		boxDia.addItem("13");
		boxDia.addItem("14");
		boxDia.addItem("15");
		boxDia.addItem("16");
		boxDia.addItem("17");
		boxDia.addItem("18");
		boxDia.addItem("19");
		boxDia.addItem("20");
		boxDia.addItem("21");
		boxDia.addItem("22");
		boxDia.addItem("23");
		boxDia.addItem("24");
		boxDia.addItem("25");
		boxDia.addItem("26");
		boxDia.addItem("27");
		boxDia.addItem("28");
		boxDia.addItem("29");
		boxDia.addItem("30");
		boxDia.addItem("31");
		
		JLabel lblNewLabel_4 = new JLabel("Mês");
		lblNewLabel_4.setBounds(298, 14, 20, 26);
		PnDataDeNascimento.add(lblNewLabel_4);
		
		JComboBox boxMes = new JComboBox();
		boxMes.setBounds(328, 14, 47, 26);
		PnDataDeNascimento.add(boxMes);
		
		boxMes.addItem("01");
		boxMes.addItem("02");
		boxMes.addItem("03");
		boxMes.addItem("04");
		boxMes.addItem("05");
		boxMes.addItem("06");
		boxMes.addItem("07");
		boxMes.addItem("08");
		boxMes.addItem("09");
		boxMes.addItem("10");
		boxMes.addItem("11");
		boxMes.addItem("12");
		
		JLabel lblNewLabel_5 = new JLabel("Ano");
		lblNewLabel_5.setBounds(392, 13, 20, 28);
		PnDataDeNascimento.add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(422, 14, 68, 26);
		PnDataDeNascimento.add(comboBox_2);
		
		JPanel PnCargo = new JPanel();
		PnCargo.setLayout(null);
		PnCargo.setBounds(1095, 127, 518, 48);
		contentPane.add(PnCargo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cargo:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(90, 10, 51, 28);
		PnCargo.add(lblNewLabel_1_1);
		
		JComboBox boxCargo = new JComboBox();
		boxCargo.setBounds(151, 10, 338, 28);
		PnCargo.add(boxCargo);
		boxCargo.addItem("Selecionar Cargo");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(396, 260, 1448, 732);
		contentPane.add(panel_3);
		
		JButton btnCadastratar = new JButton("Cadastrar");
		btnCadastratar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCadastratar.setBounds(66, 260, 276, 53);
		contentPane.add(btnCadastratar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListar.setBounds(66, 355, 276, 53);
		contentPane.add(btnListar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExcluir.setBounds(66, 456, 276, 53);
		contentPane.add(btnExcluir);
		
		JPanel PnNomeCompleto = new JPanel();
		PnNomeCompleto.setLayout(null);
		PnNomeCompleto.setBounds(1095, 22, 518, 48);
		contentPane.add(PnNomeCompleto);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(149, 11, 339, 26);
		PnNomeCompleto.add(textField_1);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo:");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomeCompleto.setBounds(10, 7, 129, 28);
		PnNomeCompleto.add(lblNomeCompleto);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(TelaFuncionari.class.getResource("/imgs/Funcionario2.png")));
		lblNewLabel_1.setBounds(1654, 57, 165, 132);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(TelaFuncionari.class.getResource("/imgs/FundoDeTela.jpg")));
		lblNewLabel_6.setBounds(0, 0, 1924, 1061);
		contentPane.add(lblNewLabel_6);
	}
}

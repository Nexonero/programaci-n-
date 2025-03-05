package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class VentanaPrincipal extends JFrame{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema gestión Empleado");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(117, 10, 199, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(21, 59, 153, 13);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(76, 56, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setBounds(21, 101, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(76, 98, 96, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Departamento");
		lblNewLabel_3.setBounds(217, 59, 81, 13);
		getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(319, 55, 29, 21);
		getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Proyecto:");
		lblNewLabel_4.setBounds(217, 101, 45, 13);
		getContentPane().add(lblNewLabel_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(319, 97, 29, 21);
		getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo empleado:");
		lblNewLabel_5.setBounds(217, 145, 81, 13);
		getContentPane().add(lblNewLabel_5);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(319, 141, 29, 21);
		getContentPane().add(comboBox_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(76, 142, 96, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Labor");
		lblNewLabel_6.setBounds(21, 145, 45, 13);
		getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("a realizar");
		lblNewLabel_7.setBounds(21, 157, 45, 13);
		getContentPane().add(lblNewLabel_7);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(21, 209, 405, 44);
		getContentPane().add(textPane);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

// VentanaPrincipal.java
package Interfaz;

import Mundo.EcuacionRecta;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JButton btnCalcular;
    private JTextField textX1, textY1, textX2, textY2;
    private JLabel lblEcuacion, lblPendiente;

    public VentanaPrincipal() {
        setTitle("Cálculo de Ecuación de la Recta 😀");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        
        contentPane = new JPanel(new GridBagLayout());
        contentPane.setBackground(new Color(240, 248, 255));
        setContentPane(contentPane);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel lblTitulo = new JLabel("Cálculo de la Ecuación de la Recta");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        contentPane.add(lblTitulo, gbc);
        
        agregarCampo("Ingrese x1:", textX1 = new JTextField(), gbc, 1);
        agregarCampo("Ingrese y1:", textY1 = new JTextField(), gbc, 2);
        agregarCampo("Ingrese x2:", textX2 = new JTextField(), gbc, 3);
        agregarCampo("Ingrese y2:", textY2 = new JTextField(), gbc, 4);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBackground(new Color(100, 149, 237)); 
        btnCalcular.setForeground(Color.WHITE);
        btnCalcular.setFocusPainted(false);
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 14));
        btnCalcular.addActionListener(this);
        
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        contentPane.add(btnCalcular, gbc);

        lblEcuacion = new JLabel("Ecuación:");
        lblEcuacion.setFont(new Font("Arial", Font.ITALIC, 14));
        lblEcuacion.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 6;
        contentPane.add(lblEcuacion, gbc);
        
        lblPendiente = new JLabel("Pendiente:");
        lblPendiente.setFont(new Font("Arial", Font.ITALIC, 14));
        lblPendiente.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridy = 7;
        contentPane.add(lblPendiente, gbc);
    }

    private void agregarCampo(String label, JTextField textField, GridBagConstraints gbc, int y) {
        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        contentPane.add(new JLabel(label), gbc);
        
        gbc.gridx = 1;
        contentPane.add(textField, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                double x1 = Double.parseDouble(textX1.getText());
                double y1 = Double.parseDouble(textY1.getText());
                double x2 = Double.parseDouble(textX2.getText());
                double y2 = Double.parseDouble(textY2.getText());

                EcuacionRecta ecuacion = new EcuacionRecta(x1, y1, x2, y2);
                lblEcuacion.setText("Ecuación: " + ecuacion.mostrarEcuacion());
                lblPendiente.setText("Pendiente: " + ecuacion.calcularPendiente());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}

package es.studium.NumerosPrimos;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Vista extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel lblNumero = new JLabel("Introduce número para calcular su factorización: ");
	JLabel lblResultado = new JLabel("El resultado es: ");
	JTextField txtNumero = new JTextField(10);
	JButton btnAceptar= new JButton("Aceptar");
	JTextField txtResultado = new JTextField(10);

	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	JPanel pnl4 = new JPanel();
	JPanel pnl5 = new JPanel();
	public Vista() {
		this.setLayout(new GridLayout(5,1));
		this.setLocationRelativeTo(null);
		this.setSize(400,300);
		pnl1.add(lblNumero);
		pnl2.add(txtNumero);
		pnl3.add(btnAceptar);
		pnl4.add(lblResultado);
		pnl5.add(txtResultado);
		this.add(pnl1);
		this.add(pnl2);
		this.add(pnl3);
		this.add(pnl4);
		this.add(pnl5);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Vista();
		
	}
}

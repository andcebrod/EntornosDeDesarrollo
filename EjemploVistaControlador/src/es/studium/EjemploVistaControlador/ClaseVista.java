package es.studium.EjemploVistaControlador;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ClaseVista extends JFrame {
	/**               
	 *                
	 */
	private static final long serialVersionUID = 1L;
	JFrame ventana = new JFrame();
	
	JPanel pnl1 = new JPanel();
	JPanel pnl2 = new JPanel();
	JPanel pnl3 = new JPanel();
	
	JLabel lbl1 = new JLabel("Número");
	JLabel lbl2 = new JLabel("Palabra");
	JLabel lbl3 = new JLabel("Resultado");
	
	JTextField txtNumero = new JTextField(10);
	JTextField txtPalabra = new JTextField(10);
	JTextField txtResultado = new JTextField(10);
	
	JButton btnBuscar = new JButton("Buscar");
	
	public ClaseVista() {
		ventana.setSize(300, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(new GridLayout(3,1));
		
		pnl1.setLayout(new FlowLayout());
		pnl1.add(lbl1);
		pnl1.add(txtNumero);
		ventana.add(pnl1);
		
		pnl2.setLayout(new FlowLayout());
		pnl2.add(lbl2);
		pnl2.add(txtPalabra);
		ventana.add(pnl2);
		
		pnl3.setLayout(new FlowLayout());
		pnl3.add(lbl3);
		pnl3.add(txtResultado);
		pnl3.add(btnBuscar);
		ventana.add(pnl3);	
		
		ventana.setVisible(true);
	}
}

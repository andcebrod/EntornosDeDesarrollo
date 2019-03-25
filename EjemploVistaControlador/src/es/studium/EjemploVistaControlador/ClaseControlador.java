package es.studium.EjemploVistaControlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class ClaseControlador implements WindowListener, TextListener, ActionListener
{
	ClaseVista Ejemplo;
	ClaseModelo Modelo;
	public ClaseControlador(ClaseVista Ej, ClaseModelo Mo) 
	{
		this.Ejemplo = Ej;
		this.Modelo = Mo;
		Ejemplo.btnBuscar.addActionListener(this);
		Ejemplo.ventana.addWindowListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(Ejemplo.btnBuscar.equals(ae.getSource())) 
		{
			try 
			{
				String resultadoPalabra = Ejemplo.txtPalabra.getText();
				if(resultadoPalabra.equals("Programación")||resultadoPalabra.equals("Perro")||resultadoPalabra.equals("Insignia")||resultadoPalabra.equals("Numerable")||resultadoPalabra.equals("Automóvil")||resultadoPalabra.equals("ACL")||resultadoPalabra.equals("Deconomicon")) 
				{
					Ejemplo.txtResultado.selectAll();
					Ejemplo.txtResultado.setText(Modelo.devolverNumero(resultadoPalabra));
				}
				int resultadoNum = Integer.parseInt(Ejemplo.txtNumero.getText());
				if(resultadoNum == 1||resultadoNum ==2||resultadoNum ==3||resultadoNum ==4||resultadoNum ==5||resultadoNum ==6||resultadoNum ==7) {
					Ejemplo.txtResultado.selectAll();
					Ejemplo.txtResultado.setText(Modelo.devolverPalabra(resultadoNum));
				} 
			} catch(NumberFormatException err)
			{
			}
		}
	}
	@Override
	public void textValueChanged(TextEvent arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}
}

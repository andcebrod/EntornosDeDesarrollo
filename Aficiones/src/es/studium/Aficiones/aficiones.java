package es.studium.Aficiones;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class aficiones extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Checkbox chkCorrer = new Checkbox("Correr");
	Checkbox chkNadar = new Checkbox("Nadar");
	Checkbox chkAndar = new Checkbox("Andar");
	Checkbox chkLeer = new Checkbox("Leer");
	Checkbox chkCine = new Checkbox("Ir al Cine");
	Checkbox chkBailar = new Checkbox("Bailar");
	Checkbox chkFutbol = new Checkbox("Fútbol");
	Checkbox chkTenis = new Checkbox("Tenis");
	Checkbox chkBaloncesto = new Checkbox("Baloncesto");
	Checkbox chkVela = new Checkbox("Deportes de Vela");
	Button btnComprobar = new Button("Comprobar");
	String resultado = new String("");
	public aficiones()
	{
		setLayout(new FlowLayout());
		setTitle("Aficiones");
		add(chkCorrer);
		add(chkNadar);
		add(chkAndar);
		add(chkLeer);
		add(chkCine);
		add(chkBailar);
		add(chkFutbol);
		add(chkTenis);
		add(chkBaloncesto);
		add(chkVela);
		add(btnComprobar);
		// Añadir el Listener al botón
		btnComprobar.addActionListener(this);
		//Añadir el Listener a la ventana
		addWindowListener(this);
		setSize(350,150);
		setResizable (false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new aficiones();
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent we)
	{
		new modelo();
		System.out.println(resultado);
	}
}
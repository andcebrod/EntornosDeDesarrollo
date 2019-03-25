package es.studium.Termometro;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseVista extends Frame
{
	private static final long serialVersionUID = 1L;
	Label etiqueta = new Label("Celsius");
	TextField Celsius = new TextField(5);
	Label etiqueta2 = new Label("Fahrenheit");
	TextField Fahrenheit = new TextField(5);
	Button btnCelFah = new Button(" Celsius a Fahrenheit ");
	Button btnFahCel = new Button(" Fahrenheit a Celsius ");
	public ClaseVista()
	{
		setLayout(new GridLayout(3,2));
		setTitle("Conversión de temperaturas");
		add(etiqueta);
		add(Celsius);
		add(etiqueta2);
		add(Fahrenheit);
		add(btnCelFah);
		add(btnFahCel);
		setSize(450,150);
		setVisible(true);

	}
}

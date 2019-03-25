package es.studium.Termometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener, WindowListener{
	ClaseVista termometro;
	ClaseModelo modelo ;
	
	public ClaseControlador(ClaseVista tm, ClaseModelo cm) 
	{
		this.termometro = tm;
		this.modelo = cm;
		termometro.btnCelFah.addActionListener(this);
		termometro.btnFahCel.addActionListener(this);
		
		termometro.addWindowListener(this);
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

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(termometro.btnCelFah.equals(ae.getSource())) 
		{
			String resultado = Float.toString(modelo.celsiusAFahrenheit(termometro.Celsius.getText()));
			termometro.Fahrenheit.selectAll();
			termometro.Fahrenheit.setText(resultado);
			
		} else if (termometro.btnFahCel.equals(ae.getSource())) 
		{
			String resultado = Float.toString(modelo.FahrenheitACelsius(termometro.Fahrenheit.getText()));
			termometro.Celsius.selectAll();
			termometro.Celsius.setText(resultado);
		}
		
	}

}

package es.studium.Aficiones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class controlador implements ActionListener, WindowListener{
	aficiones objAficiones;
	modelo objModelo;
	
	public controlador( aficiones cv, modelo cm) 
	{
		this.objAficiones = cv;
		this.objModelo = cm;
		
		objAficiones.btnComprobar.addActionListener(this);
		objAficiones.addWindowListener(this);
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(objAficiones.btnComprobar.equals(ae.getSource())) {
			String resultado = "";
			if(objAficiones.chkCorrer.getState()==true) {
				resultado += objModelo.correr(resultado);
			}
			System.out.println(resultado);
		}
		
	}
}

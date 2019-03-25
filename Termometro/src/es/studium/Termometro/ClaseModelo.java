package es.studium.Termometro;

public class ClaseModelo {

	public float celsiusAFahrenheit(String Celsius) {
		float resultado;
		resultado = (float) ((Float.parseFloat(Celsius)*9.0/5.0)
				+ 32.0);
		return resultado;

	}

	public float FahrenheitACelsius(String Fahrenheit) {
		float resultado;
		resultado = (float)(Float.parseFloat(Fahrenheit)-
				32.0)*(float)(5.0/9.0);
		return resultado;

	}

}

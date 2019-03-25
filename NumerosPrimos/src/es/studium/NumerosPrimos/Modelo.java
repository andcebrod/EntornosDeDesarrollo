package es.studium.NumerosPrimos;

public class Modelo 
{
	public static String CalcularFactorizacion(int num){
		String resultado = "";
		int contador2= 0;
		int contador3= 0;
		int contador5= 0;
		while(num!=0 || num!=1) 
		{
			if(num%2==0) {
				num=num/2;
				contador2++;
			} else if(num%5==0) {
				num=num/5;
				contador5++;
			} else if(num%3==0) {
				num=num/3;
				contador3++;
			} else {
				resultado = "Los factoriales de "+num+" son: "+"2:"+contador2+", 3:"+contador3+", 5:"+contador5+" y "+num+".";
				return resultado;
			}
		}
		resultado = "Los factoriales de "+num+" son: "+"2:"+contador2+", 3:"+contador3+", 5:"+contador5+" y "+num+".";
		return resultado;

	}
	public static void main(String[] args) {
		String resultado = CalcularFactorizacion(49);
		
		System.out.println(resultado);
	}
}

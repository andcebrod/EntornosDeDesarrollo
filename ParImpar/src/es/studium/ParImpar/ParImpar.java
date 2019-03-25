package es.studium.ParImpar;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		esPar(1);
	}
	public static boolean esPar(int n) {
		  if(n%2 == 0) {
		    return true;
		  }
		  return false;
		}
}

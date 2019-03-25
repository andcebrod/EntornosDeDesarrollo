package es.studium.EDT3;
public class EDT3E3 {
	public static void main(String[] args) {
		int i;
		i = 0;
		while(i<100) {
			if(i%2==0) {
				System.out.println("Par");
				i++;
			} else {
				System.out.println("Impar");
				i--;
			}
		}
	}
}

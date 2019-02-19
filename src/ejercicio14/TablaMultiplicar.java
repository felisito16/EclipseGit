package ejercicio14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TablaMultiplicar {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int numero1;
		BufferedReader lectura=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un numero");		
		numero1=Integer.parseInt(lectura.readLine());
	
		for(int i=1;i<=10;i++) {
		int	resultado=numero1*i;
		System.out.println(numero1+" x "+i+" es igual a "+resultado);
		}
	}

}

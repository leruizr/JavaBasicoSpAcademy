package EjerciciosJavaSophos;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Declaración de la matriz
		String [][] arrMulti =new String[4][4];
		 String ax="";

		 //Se crea el lector de datos
		 Scanner ingresoTeclado = new Scanner(System.in);
		 //Operación
		 for (int i=0;i<4;i++){
		 System.out.print("Introduce el nombre del pais "+(i+1)+" : ");
		 arrMulti[i][0] = ingresoTeclado.nextLine()+":";
		 }
		 for (int j=0;j<4;j++){
		 for (int i=1;i<4;i++){
		 System.out.print("Introduce el nombre de la ciudad "+(i)+" del pais "+(j+1)+" : ");
		 arrMulti[j][i] = ingresoTeclado.nextLine();
	 }
	 }
	 for(int i=0; i<4; i++){
	 for(int j=0; j<4; j++){
	 ax+= arrMulti[i][j]+" ";
	 }
	 ax+="\n";
	 }
	 System.out.print(ax);
	 }

}

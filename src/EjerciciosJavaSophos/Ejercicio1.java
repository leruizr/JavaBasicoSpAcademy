package EjerciciosJavaSophos;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Declaración de la matriz
		int[][] matriz= new int[3][4];
		String ax="";

		//Cargar la matriz con Valores:
		//Fila 1
		matriz[0][0] = 7;
		matriz[0][1] = 14;
		matriz[0][2]= 8;
		matriz[0][3] = 3;
		//Fila 2
		matriz[1][0] = 6;
		matriz[1][1]= 19;
		matriz[1][2] = 7;
		matriz[1][3] = 2;
		//Fila 3
		matriz[2][0] = 3;
		matriz[2][1]= 13;
		matriz[2][2] = 4;
		matriz[2][3] = 1;
		/*Hay que recordar que los elementos empiezan a numerarse por 0. Así la esquina superior
		izquierda de la matriz será el elemento [0][0] y la esquina inferior derecha será el [2][3]*/

		/*Así tambien se puede rellenar la matriz:
		int[][] matriz = {{7,14,8,3},{6,19,7,2},{3,13,4,1}};*/
		//Listar el contenido de la matriz
		for (int x=0; x < matriz.length; x++) {
		 for (int y=0; y < matriz[x].length; y++) {
		 System.out.println (matriz[x][y]);
		 }
		}
	}

}

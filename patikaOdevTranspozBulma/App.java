package patikaOdevTranspozBulma;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row count in matrix: "); 
		int row = sc.nextInt();
		
		System.out.print("Enter column count in matrix: ");
		int column = sc.nextInt();
		
		int array [][] = new int[row][column];
		// arrayimizin satir ve sutunlarina Math sinifinin random methodu ile 0-10 arasi rastgele sayilar ekledik
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		
		// olusturdugumuz matrisimizi ekrana yazdik.
		System.out.println("matrix: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		// kendimiz olusturdugumuz matrisimizi transpoza ceviren methodu cagirarak transpoza cevirdik ve ekrana bastik
		System.out.println("transpose: ");
		for(int i = 0; i < transpose(array , row, column).length; i++) {
			for(int j = 0; j < transpose(array, row, column)[0].length; j++) {
				System.out.print(transpose(array,row,column)[i][j] + " ");
				}
			System.out.println(" ");
			}
	}
	
	// bu methodumuz matrisimizi transpoza ceviriyor
	public static int[][] transpose(int [][] matrix , int row , int column){
	
		int array [] [] = new int[column][row];
		// satiri sutuna aktaran for loopumuzu yazdik
		for(int i = 0; i < column; i++) {
			for(int j = 0; j < row; j++) {
				array[i][j] = matrix[j][i];
			}
		}
		return array;
		
	}

}

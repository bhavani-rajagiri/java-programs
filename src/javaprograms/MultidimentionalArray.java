package javaprograms;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		int a[] [] = new int [4][2]; //1 st row, 2nd column
		
		a[0][0] = 100;
		a[0][1] = 500;
		a[1][0] = 200;
		a[1][1] = 600;
		a[2][0] = 300;
		a[2][1] = 900;
		a[3][0] = 800;
		a[3][1] = 700;
		
		//System.out.println(a[3][0]);
		
		for(int r = 0; r<a.length;r++)
		{
			for(int c = 0; c<a[r].length; c++)
			{
				System.out.println(a[r][c]);
			}
		}

	}

}

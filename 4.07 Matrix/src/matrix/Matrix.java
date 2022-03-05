package matrix;

public class Matrix {

	public static void main(String[] args) 
	{
		//First Matrix 
		int m1[][] = {
						{1,2,3},//1st row of 1st Matrix
						{4,5,6}//2nd row of 1st Matrix
              		 };
		
		//Second Matrix
		int m2[][] = { 
						{7,8},//1st row of 2nd Matrix
						{9,10},//2nd row of 2nd Matrix
						{11,12}//3rd row of 2nd Matrix
              		};
		int sum=0;
		int r[][] = new int[2][2];
 
		for(int i=0;i<2;i++) 
			{
				for(int j=0;j<2;j++) 
					{
						for(int k=0;k<3;k++)
							{
								sum= sum + m1[i][k]*m2[k][j];//Multiplication of Matrix
							}
							r[i][j] = sum;
							sum=0;
					}
				
			}
		System.out.print("Matrix After Multiplication is:-\n");
		for(int i=0;i<2;i++) 
			{
				for(int j=0;j<2;j++) 
					{
						System.out.print(r[i][j] + " ");//Printing of Calculated Matrix
					}
					System.out.println();
			}
	}

}

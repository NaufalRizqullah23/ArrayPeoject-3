package twoDimensionalArray;

public class MatricesAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,3,4},{3,4,5}};
		int b[][]= {{1,3,4},{3,4,5}};
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<=a.length;j++) {
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println("");
		}
	}

}

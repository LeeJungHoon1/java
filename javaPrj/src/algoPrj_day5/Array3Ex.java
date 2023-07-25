package algoPrj_day5;

public class Array3Ex {

	public static void main(String[] args) {

		
		int[][] even= new int[3][3];
		
		even[0][0]=2;
		even[0][1]=4;
		even[0][2]=6;
		
		even[1][0]=8;
		even[1][1]=10;
		even[1][2]=12;
		
		even[2][0]=14;
		even[2][1]=16;
		even[2][2]=18;
		
		for(int i=0; i<even.length;i++) {
			for(int j=0;j<even[i].length;j++) {
				System.out.print(even[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] odd = new int[3][3];
		
		odd[0][0]=1;
		odd[0][1]=3;
		odd[0][2]=5;
		
		odd[1][0]=7;
		odd[1][1]=9;
		odd[1][2]=11;
		
		odd[2][0]=13;
		odd[2][1]=15;
		odd[2][2]=17;
		
		for(int i=0; i<odd.length;i++) {
			for(int j=0;j<odd[i].length;j++) {
				System.out.print(odd[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][][] numbers = {
				{
					{2,4,6},
					{8,10,12},
					{14,16,18}
					
				},
				{
					{1,3,5},
					{7,9,11},
					{13,15,17}
				}
		};
		
		System.out.print(numbers[0][1][1]);
		System.out.print(numbers[1][2][1]);
		
		System.out.println();
		
		
		char[][][] a = {
				{
					{'a','b','c'},
					{'d','e','f'},
					{'g','h','i'},
				},
				{
					{'j','k','l'},
					{'m','n','o'},
					{'p','q','r'},
				},
				{
					{'s','t','u'},
					{'v','w','x'},
					{'y','z',' '},
				}
		};
		System.out.print(a[0][0][0]);
		System.out.print(a[0][0][2]);
		System.out.print(a[1][1][2]);
		System.out.print(a[1][1][1]);
		System.out.print(a[2][2][2]);
		System.out.print(a[0][0][0]);
		System.out.print(a[0][0][2]);
		System.out.print(a[0][0][0]);
		System.out.print(a[0][1][0]);
		System.out.print(a[0][1][1]);
		System.out.print(a[1][1][0]);
		System.out.print(a[2][2][0]);
		
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]);
				}
			}
		}
	}

}

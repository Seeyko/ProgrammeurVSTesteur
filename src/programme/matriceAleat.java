package programme;

public class matriceAleat {

	public static int[][] initMatrice(int M, int N, int A, int B){
		if(A > B){
			throw new ArithmeticException("A > B | A need to be inforior or equal to B");
		}else{
			int[][] mn = new int[M][N];
			for(int i = 0; i < M; i++){
				for(int j = 0; j < N; j++){
					mn[i][j] = getRandom(A, B);
				}
			}
			
			return mn;
		}
	}
	
	public static void afficherMat(int[][] mn){
		String res = "|";
		for(int i = 0; i < mn.length; i++){
			for(int j = 0; j < mn[i].length; j++){

				res+= mn[i][j] + " | ";
				if(j == mn[i].length-1){
					if(i < mn.length -1){
						res+=("\n|");
					}else{
						res+=("\n");
					}
				}
			}
		}
		System.out.println(res);
	}
	
	private static int getRandom(int min, int max){
		int r = (int)(Math.random() * ((max - min) + 1)) + min;
		return r;
	}
	
	public static void main(String args[]){
		int[][] m = matriceAleat.initMatrice(2, 5, 8, 10);
		afficherMat(m);
	}
}

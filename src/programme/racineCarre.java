package programme;

public class racineCarre {
	
	public int tab[]=null ;
	public int a,b ; 
	public racineCarre(int a , int b) {
		
		if ( a<b) {
		this.a=a;
		this.b=b; }
		else throw new ArithmeticException("a > b");
	}
	
	public int[] racineCarre(){
		int j = 0 ;
		
		
		for(int i=a ; i<=b; i++) {
			tab[j]=(int) Math.sqrt(i);
			j++;
		}
		return tab ; 
	}
	
	
}

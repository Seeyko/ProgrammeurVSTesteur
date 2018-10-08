package programme;

public class racineCarre {
	
	public int tab[] ;
	public int a,b ; 
	public racineCarre(int a , int b) {
		
		if ( a<b) {
		this.a=a;
		this.b=b; }
		else System.exit(-1);
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

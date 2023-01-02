package for_;

public class ForTest3 {

	public static void main(String[] args) {
		int rand;
		int count=0;
		
		for(int i=1; i<=100; i++) { //100번 반복
			//(int)(Math.random()* b-a+1) +a; //a~b까지 난수
			rand = (int)(Math.random()*26) +65; //65~90사이의 난수(A ~ Z)
			System.out.print((char)rand+" ");
			
			if(i%10 == 0) System.out.println();	//10의 배수당 한줄 띄기		
			
			if(rand=='A') count++; //rand=='A'일때마다 count++
		}//for
		 
		System.out.println();
		System.out.println("총 A의 개수 = "+count);
	}
}
public class Ex1 {
	
	public void numeroImpar(int valorA, int valorB) {
		
		if(valorA == valorB) return;
		else if(valorA < valorB) {
			for(int a=valorA; a<=valorB; a++) {
				if(a % 2 !=0)
					System.out.println(a);
			}
			return;
		}
		else {
			for(int a=valorB; a<=valorA; a++) {
				if(a % 2 !=0)
					System.out.println(a);
			}		
			return;
		}
		
		
	}
		
}

class Test10{
	public static void main(String[] args){
		for(int a=1; a<=5; a++){
			for(int i=1; i<=5; i++){
				if(a==i){
					System.out.print("¡Ú");
				}else{
					System.out.print("¡Ù");
				}
			}
			System.out.println();
		}
	}
}
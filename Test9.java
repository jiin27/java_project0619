class Test9{
	public static void main(String[] args){
		String str=args[0];
		int n=Integer.parseInt(args[1]);
		int d=Integer.parseInt(args[2]);

		for(int a=1; a<=n; a++){
			for(int i=1; i<=d; i++){
				System.out.print(str);
			}
			System.out.println("");
		}
	}
}

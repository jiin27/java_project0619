class Test8{
	public static void main(String[] args){
		//ex) 실행시 매개변수를 아래와 같이 넘길 경우 
		//		java Test8 6 9
		String str=args[0]; //첫번째 매개변수는 출력 문자를 결정
		int n=Integer.parseInt(args[1]); //두번째 매개변수는 회수를 결정

		for(int i=1; i<=n; i++){
			System.out.print(str);
		}
	}
}
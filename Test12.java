class Test12{
	public static void main(String[] args){
		//문자열을 다루는 String의 메서드 중 split을 알아보자.
		//참고) js와 java는 서로 다른 기술이지만, 일반적인 프로그래밍 언어에서 문자열을 다루는 메서드들은 
		//거의 비슷하기 때문에, java api와 js api는 문자열에 대해서 거의 같다.

		String filename=args[0];
		/* 1) split으로 처리하는 방법
		String[] arr=filename.split("\\."); //.를 문자로 인식하지 못하는 경우 있음 그럴 땐 -> \\ 역슬래쉬로 escape 시켜야 한다. 문자마다 escape 방식이 다름!
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2) substring() 메서드로 처리
		//filename.substring(시작index, 마지막index);
		//filename.substring(0, 점이 발견된 indx);
		String name=filename.substring(0, filename.indexOf(".")); //indexOf는 \\쓰지 않아도 됨. 자체 escape 시킴
		//System.out.println("파일의 이름은 "+name);
		String ext=filename.substring(filename.indexOf(".")+1, filename.length()); //자바에서 length는 메서드! length()
		System.out.println("파일의 확장자는 "+ext);
	}
}
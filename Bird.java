//새를 정의한다.
class Bird{
	int wing=2;

	
	//java class 정의시 main()은 필수가 아닌 선택이다.
	//즉, 현재 프로젝트의 시작점인 entry point 를 누가 부담할 것인가에 대한 문제일 뿐.
	//모든 클래스 내에 main을 두려고 하지 말자.

	public static void main(String[] args){
		Cat c=new Cat();
		System.out.println(c.name);
	}

}
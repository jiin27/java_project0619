class Book{
	//java 언어는 다른 언어와 마찬가지로 변수 선언시 그 값을 정의해야 한다.(초기화)
	//하지만, java는 *멤버 변수* 에 한하여 예외적으로, 개발자가 값을 정의하지 않으면
	//컴파일러에 의해 자동으로 default 값으로 초기화 된다. 최소한의 개입으로 초기화.
	//숫자 자료형의 경우엔 0으로 초기화 된다.
	//논리값의 경우에는 false로 초기화.
	//문자인 경우 공백문자로 초기화.
	int price;
	int page=300;
	boolean onSale;

	public static void main(String[] args){
		//아래의 x변수는 클래스의 멤버가 아닌, 그냥 main() 메서드의 지역 변수이므로
		//반드시 일반적인 프로그램 언어의 원칙상 초기화가 필수다.
		int x;

		//변수는 사용하기 전에 반드시 그 값이 할당되어 있어야 한다.
		//모든 프로그램의 원칙
		System.out.println(x);
	}
}
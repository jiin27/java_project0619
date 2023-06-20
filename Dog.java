class Dog{
	int x=3;

	public static void main(String[] args){
		//Dog이 보유한 x출력하시오
		//class 라는 단위는 실제 사물이 아닌 거푸집이므로 직접 사용할 수 없다. 
		//따라서 거푸집으로부터 인스턴스를 생성해야만, 클래스가 보유한 변수와 메서드에 접근할 수 있다.

		Dog d=new Dog(); //-> 기존 자료형 문자, 숫자, 논리값 이 아닌 자료형을 모두 합쳐진 '객체형' 이 존재.
		System.out.println(d.x);
	}
}
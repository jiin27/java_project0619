class Test12{
	public static void main(String[] args){
		//���ڿ��� �ٷ�� String�� �޼��� �� split�� �˾ƺ���.
		//����) js�� java�� ���� �ٸ� ���������, �Ϲ����� ���α׷��� ���� ���ڿ��� �ٷ�� �޼������ 
		//���� ����ϱ� ������, java api�� js api�� ���ڿ��� ���ؼ� ���� ����.

		String filename=args[0];
		/* 1) split���� ó���ϴ� ���
		String[] arr=filename.split("\\."); //.�� ���ڷ� �ν����� ���ϴ� ��� ���� �׷� �� -> \\ ���������� escape ���Ѿ� �Ѵ�. ���ڸ��� escape ����� �ٸ�!
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		*/

		//2) substring() �޼���� ó��
		//filename.substring(����index, ������index);
		//filename.substring(0, ���� �߰ߵ� indx);
		String name=filename.substring(0, filename.indexOf(".")); //indexOf�� \\���� �ʾƵ� ��. ��ü escape ��Ŵ
		//System.out.println("������ �̸��� "+name);
		String ext=filename.substring(filename.indexOf(".")+1, filename.length()); //�ڹٿ��� length�� �޼���! length()
		System.out.println("������ Ȯ���ڴ� "+ext);
	}
}
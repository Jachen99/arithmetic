class TEXT{
	public int num;
	public String str;
	
	public TEXT(int num, String str){
		this.num = num;
		this.str = str;
	}
}
public class Class4 {
    //tIn�Ǵ�����ĵ�ַ���޸��βε����ԣ���Ӱ��ʵ��
    //intIn�Ǵ����ݣ������������͵��β��޸ĺ�ʵ���޹�
    //Integer��String���󲻿ɱ�
	public static void f1(TEXT tIn, int intIn, Integer integerIn, String strIn){
		tIn.num =200;
		tIn.str = "bcd";//�βκ�ʵ��ָ�����ͬһ��TEXT�Ķ����޸������ԣ����൱���޸�ʵ�ζ��������
		intIn = 200;//�����������͵��β���ʵ�εġ���������������ô�޸ĺ�ʵ�ζ�û��ϵ
		integerIn = 200;//Integer�����String����һ�����ǲ��ɱ䣬һ���޸Ķ����¶��󣬺�ʵ���޹�
		strIn = "bcd";
	}
	public static void main(String[] args) {
		TEXT tIn = new TEXT(100, "abc");//tIn.num = 100, tIn.str="abc"
		int intIn = 100;
		Integer integerIn = 100;
		String strIn = "abc";
		
		f1(tIn,intIn,integerIn,strIn);
		
		System.out.println(tIn.num + tIn.str + intIn + integerIn + strIn);
		//200 + bcd + 100 + 100 + abc
	}
}
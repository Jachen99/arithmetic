public class Test4 {
	String str = new String("good");
	char[] ch = {'a','b','c'};
	
	public static void main(String[] args) {
		Example ex = new Example();//ex.str = good   ex.ch=  abc
		
		ex.change(ex.str,  ex.ch);
		System.out.print(ex.str + " and ");
		System.out.print(ex.ch);//good + and + gbc
	}
	
	public void change(String str, char[] ch){//�βκ�ʵ��ָ��ͬһ������
		str = "test ok";//�ַ������󲻿ɱ䣬�βε��޸ģ���ʵ���޹�
		ch[0] = 'g';//�βζ�Ԫ�ص��޸ģ�ֱ���޸ĵ���ʵ��Ԫ�ص�ֵ
	}
}
public class Test {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("A");
		StringBuffer b = new StringBuffer("B");

		operate(a, b);

		System.out.println(a + "," + b);// AB , B
	}

	public static void operate(StringBuffer x, StringBuffer y) {
		x.append(y);// �ȼ���aƴ��b x = AB
		y = x;// һ���޸��βεĵ�ֵַ����ô�ͺ�ʵ���޹��ˣ������β�����ָ���µĶ�����
        y.append('x');
	}
}
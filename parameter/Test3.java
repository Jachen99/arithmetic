private static void change(String s,StringBuffer sb){
		s = "aaaa";//�ַ��������ǲ��ɱ䣬һ���޸ģ������¶���!!
		sb.setLength(0);//�Ȱ�sb��������ݸ������
		sb.append("aaaa");//��ƴ��aaaa
	}
	
	
	public static void main(String[] args) {
		String s = "bbbb";
		StringBuffer sb = new StringBuffer("bbbb");
		change(s,sb);
		System.out.println(s+sb);//bbbbaaaa
	}
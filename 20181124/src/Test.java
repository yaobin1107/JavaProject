
public class Test {
	//��������
	public static void main(String[] args){
		//��ϰ���ж�һ���ַ������ж��ٸ����֣����ٸ���ĸ��
		//�Լ����ٸ������ַ��� ��ab24,!c4��
		String str="abvv24565,!c4";
		int shuzi=0;
		int zimu=0;
		int qita=0;
		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i);
			if(c>='0'&&c<='9'){
				shuzi++;
			}else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
				zimu++;
			}else{
				qita++;
			}
			
		}
		System.out.println("������"+shuzi+"��");
		System.out.println("��ĸ��"+zimu+"��");
		System.out.println("�����ַ���"+qita+"��");
	}
}

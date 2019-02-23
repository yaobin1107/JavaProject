
public class Test {
	//程序的入口
	public static void main(String[] args){
		//练习：判断一个字符串中有多少个数字，多少个字母，
		//以及多少个其它字符？ “ab24,!c4”
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
		System.out.println("数字有"+shuzi+"个");
		System.out.println("字母有"+zimu+"个");
		System.out.println("其它字符有"+qita+"个");
	}
}

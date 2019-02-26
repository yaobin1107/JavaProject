

//jdk11  jdk1.0  jdk1.1
//Î»ÒÆËã·¨
class ff{
	private static String zhuanhuan(int n,int m){
		String str="";  //12  1100  
		while(n>0){
			int x=n%m;
			if(x<=9){
				str=x+str;
			}else{
				str=(char)(x-10+'A')+str;
			}
			n=n/m;
		}
		return str;
	}
	public static String to2(int n){
		return zhuanhuan(n,2);
	}
	public static String to8(int n){
		return zhuanhuan(n,8);
	}
	public static String to16(int n){
		return zhuanhuan(n,16);
	}
}




public class Demo1 {
	
	
	public static void main(String[] args) {
		System.out.println(ff.to2(100));
		System.out.println(ff.to8(100));
		System.out.println(ff.to16(30));
		
		System.out.println(ff.to8(34));
		
//		System.out.println(Integer.toBinaryString(100));
//		System.out.println(Integer.toOctalString(100));
//		System.out.println(Integer.toHexString(30));
	}
	

}

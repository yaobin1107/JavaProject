
public class Test8 {

	public static void main(String[] args) {
		int[][] a=new int[7][7];
		int x=0;
		int y=a.length/2;
		a[x][y]=1;
		//����1��λ��ȥ��2
		for (int i = 2; i <=a.length*a.length; i++) {
			
			//��
			x=x-1;
			if(x<0) x=a.length-1;
			y=y+1;
			if(y>a.length-1) y=0;
			//�ж�λ����û�б�ռ
			if(a[x][y]!=0){
				//������
				x=x+1;
				if(x>a.length-1) x=0;
				x=x+1;
				if(x>a.length-1) x=0;
				y=y-1;
				if(y<0) y=a.length-1;
				a[x][y]=i;
			}else{
				
				a[x][y]=i;
			}
		}
		
		
//		//��
//				x=x-1;
//				if(x<0) x=2;
//				y=y+1;
//				if(y>2) y=0;
//				//�ж�λ����û�б�ռ
//				if(a[x][y]!=0){
//					 //������
//					x=x+1;
//					if(x>2) x=0;
//					x=x+1;
//					if(x>2) x=0;
//					y=y-1;
//					if(y<0) y=2;
//					a[x][y]=3;
//				}else{
//					
//					a[x][y]=3;
//				}
//		
//				//��
//				x=x-1;
//				if(x<0) x=2;
//				y=y+1;
//				if(y>2) y=0;
//				//�ж�λ����û�б�ռ
//				if(a[x][y]!=0){
//					 //������
//					x=x+1;
//					if(x>2) x=0;
//					x=x+1;
//					if(x>2) x=0;
//					y=y-1;
//					if(y<0) y=2;
//					a[x][y]=4;
//				}else{
//					
//					a[x][y]=4;
//				}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

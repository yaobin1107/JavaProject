package com.part04;

public class Demo01 {

	public static void study(Person p) throws StudyException
	{
		if(p.getAge()>40)
		{
			throw new StudyException(2, "�����");
		}else if(p.getSa()<2)
		{
			throw new StudyException(3, "������");
		}else
		{
			System.out.println(p.getName()+",Welcome!");
		}
	}
	
	public static void main(String[] args) 
	{
		Person p1=new Person("lisi",45,100,3);
		
		Person p2=new Person("lisa",20,100,1);
		
		Person p3=new Person("lili",20,100,3);
		
		try {
		//	study(p1);
			
			study(p3);
			
			study(p2);
		} catch (StudyException e) 
		{
			   switch (e.getTypes()) {
			case 1:
				System.out.println("ûǮ����");
				break;
			case 2:
				System.out.println("�������");
				break;
			case 3:
				System.out.println("û�Ļ�");
				break;
			default:
				break;
			}
		}
	}

}

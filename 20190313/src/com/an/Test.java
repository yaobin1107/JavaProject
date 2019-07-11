package com.an;

public class Test {
	public static void main(String[] args) {
		Person p=new Person();
		Piano pp=new Piano();
		p.play(pp);
		Guitar g=new Guitar();
		p.play(g);
		harp h=new harp();
		p.play(h);
		
	}
}
//ÀÖÆ÷Àà
interface instruments{
	public abstract void song();
}

//ÈË
class Person{
	public void play(instruments p){
		p.song();
	}
	
}
class A{
	
}

//¸ÖÇÙ
class Piano extends A implements instruments{
	public void song(){
		System.out.println("Ò»ÉÁÒ»ÉÁÁÁ¾§¾§");
	}
}
//¼ªËû
class  Guitar implements instruments{
	public void song(){
		System.out.println("Ò¡¹ö¡£¡£¡£");
	}
}
//ÁùÖ¸Ä§ÇÙ
class harp implements instruments{
	public void song(){
		System.out.println("Ê®ÃæÂñ·ü¡£..");
	}
}

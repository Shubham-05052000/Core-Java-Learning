package oopsConcept.jdkversion;
interface A{
	void a();
	void b();
	default void c() {
		System.out.println("may or may not implemention and its is default method ");
	}
}
class B1 implements A{
	public void a() {
		System.out.println("class B a");
	}
	public void b() {
		System.out.println("class B b");
	}
	public void  c() {
		System.out.println("override implementation B ");//may be write or not  but void c() is not default then every class create void c() method
 	}
}
class c1 implements A{
	public void a() {
		System.out.println("class B a");
	}
	public void b() {
		System.out.println("class B b");
	}
}


public class JDK_From18 {
	public static void main(String[] args) {
		B1 ref = new B1();
		ref.a();
		ref.b();
		ref.c();//its show class B1 void c(); because its create viod c method in class B1// output =override implementation B
		c1 ref1 = new c1();
		ref1.a();
		ref1.b();
		ref1.c();// its show default beacuse its not @Override interface class  out //may or may not implemention and its is default method
	}

}

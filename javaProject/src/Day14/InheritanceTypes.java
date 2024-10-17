package Day14;

class A{
	int a;
	void display(){
		System.out.println(a);
	}
}


class B extends A{						// extends inheritance
	int b ;
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	int c ;
	void print() {
		System.out.println(c);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {
		
//		single inheritance
		
/*		B bobj = new B();
		System.out.println(bobj.a);			
		System.out.println(bobj.b);
		bobj.display();
		bobj.show();	*/
		
		
//		Multilevel inheritance
		
		C cobj = new C();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		cobj.display();
		cobj.show();
		cobj.print();	
		
	}

}

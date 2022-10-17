import java.util.*;
class P4 {
	public static void main(String []args) {
	P1 o = new P1();
	System.out.println(o.u);
	//System.out.println(o.v);  //can not access outside the class becoz it is private
	System.out.println(o.w);
	System.out.println(o.x);
	}
}

class P5 extends P1 {
	public static void main(String []args) {
	P1 o = new P1();
	System.out.println(o.u);
	//System.out.println(o.v);  //can not access outside the class becoz it is private
	System.out.println(o.w);
	System.out.println(o.x);
	}
}
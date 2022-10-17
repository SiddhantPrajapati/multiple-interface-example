import java.util.*;
class P1 {
	public int u=10;
	private int v=20;
	int w=30;
	protected int x=40;
}

/*class P2 {
	public static void main(String []args) {
	P1 o = new P1();
	System.out.println(o.u);
	//System.out.println(o.v);  //can not access outside the class becoz it is private
	System.out.println(o.w);
	System.out.println(o.x);
	}
}*/

class P3 extends P1 {
	public static void main(String []args) {
	P1 o = new P1();
	System.out.println(o.u);
	//System.out.println(o.v);   //can not access outside the class becoz it is private
	System.out.println(o.w);
	System.out.println(o.x);
}
}
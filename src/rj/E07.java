package rj;

public class E07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=1;
		int j=1;
		System.out.println("后加"+(i++));
		System.out.println("先加"+(++j));
		System.out.println("不管做先加还是后加以后变量的值都加了1,i="+i);
		System.out.println("不管做先加还是后加以后变量的值都加了1,j="+j);
		int a=2;
		a+=3;
		System.out.println(a);
		String s1="hello";
		String s2="hello";
		System.out.println(s1==s2);

		
		
	}

}

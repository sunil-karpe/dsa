package test;

public class App {
	
	public static void main(String a[]) {
		
		System.out.println("Stack Implementation App");
		
		Stack st=new Stack();
		System.out.println(	st.isEmpty());
		st.push(10);
		
		st.push(20);
		st.push(30);
		
		
		
		System.out.println("Top Most element");
		System.out.println(st.peek());

		
		System.out.println("Deleting the element one by one from the top");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		
	}

}

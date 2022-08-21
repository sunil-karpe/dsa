package test;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue line=new Queue();
		line.push("om");
		line.push("jay");
		line.push("jagdish");
		
		System.out.println("----peek test---");
		System.out.println(line.peek());
		
		
		System.out.println("----Dequeue test------");
		System.out.println(line.peek());//Before dequeue first element is om
		
		line.dequeue();
		System.out.println(line.peek());//After dequeue first element is jay
		System.out.println(line.size());

	
	}

}

package test;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree(10);
		
		bst.insert(15);
		bst.insert(20);
		bst.insert(3);
		bst.iterate();
//		System.out.println(bst.root.right.value);
		System.out.println(bst.lookup(-1));
	}

}


import java.util.*;

public class InorderIterative{

	public static void main(String[] args){
		Node root = new Node(100, new Node(50, new Node(25, null, null), new Node(75, null, null)), new Node(200, new Node(125, null, null), new Node(300, null, null)));
		printInorder(root);
	}


	public static void printInorder(Node root){
		if(root != null){
			Stack<Node> stck = new Stack<Node>();
			
			while( root != null || !stck.isEmpty()){

				if(root != null){
					stck.push(root);
					root= root.left;
				}else{
					root = stck.pop();
					System.out.print(root.value +", ");				
					root= root.right;
				}
			}
		}
	}
}

class Node{

	int value;
	Node left;
	Node right;

	public Node(int value, Node left, Node right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

import java.util.*;

public class BinaryIterator2{

	public static void main(String[] args){
		Node root = new Node(100, new Node(50, new Node(25, null, null), new Node(75, null, null)), new Node(200, new Node(125, null, null), new Node(300, null, null)));
		BinaryIterator nodeIterator = new BinaryIterator(root);

		while(nodeIterator.hasNext()){
			System.out.print(nodeIterator.getNext().value +", ");
		}
	}
}

class BinaryIterator{

	Stack<Node> stack = new Stack<Node>();

	public BinaryIterator(Node root){
		while(root != null){
			stack.push(root);
			root = root.left;
		}
	}

	public boolean hasNext(){
		return !stack.isEmpty();
	}

	public Node getNext(){
		if( stack.isEmpty())
			return null;

		Node currentNode = stack.pop();
		Node rightNode = currentNode.right;

		while(null != rightNode){
			stack.push(rightNode);
			rightNode = rightNode.left;
		}
		return currentNode;
	}

}



class Node{

	public Node(int value, Node left, Node right){
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public int value;
	public Node left;
	public Node right;
}
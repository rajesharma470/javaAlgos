
import java.util.*;

public class BinaryTreeIterator {

	public static void main(String[] args){

		Node root = new Node(100, new Node(50, new Node(25, null, null), new Node(75, null, null)), new Node(200, new Node(125, null, null), new Node(300, null, null)));
		NodeIterator<Node> nodeIterator = new NodeIterator<Node>(root);

		while(nodeIterator.hasNext()){
			System.out.print(nodeIterator.getNext().value +", ");
		}
	}
}

class NodeIterator<T extends Node>{

	Queue<Node> queue = new LinkedList<Node>();

	public NodeIterator(T root){
		updateIterator(root);
	}

	public boolean hasNext(){
		return (null != queue.peek());
	}

	public Node getNext(){
		return queue.poll();
	}

	private<T extends Node> void updateIterator(T root){
		if(root != null){
			updateIterator(root.left);
			queue.add(root);
			updateIterator(root.right);
		}
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
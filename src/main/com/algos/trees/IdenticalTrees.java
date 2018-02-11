

public class IdenticalTrees{

	public static void main(String[] args){
		Node root = new Node(100, new Node(50, new Node(25, null, null), new Node(10, null, null)), new Node(200, new Node(125, null, null), new Node(350, null, null)));
		Node root2 = new Node(100, new Node(50, new Node(25, null, null), null), new Node(200, new Node(125, null, null), new Node(350, null, null)));

		System.out.println(identicalTreesRec1(root, root2));
	}

	public static boolean identicalTreesRec1(Node root, Node root2){

		if(root == null && root2 == null){
			return true;
		}else if(root != null && root2 != null){
			return (root.value == root2.value) && identicalTreesRec1(root.left, root2.left) && identicalTreesRec1(root.right, root2.right);
		}

		return false;
	}
	
}

class Node{

	public Node(int value, Node left, Node right){
		this.value = value;
		this.right = right;
		this.left = left;
	}
	public int value;
	public Node right;
	public Node left;
}
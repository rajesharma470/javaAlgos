

public class InorderSuccessor{

	public static void main(String[] args){
		Node root = new Node(100, new Node(50, new Node(25, null, null), new Node(75, null, null)), new Node(200, new Node(125, null, null), new Node(300, null, null)));
		System.out.println(findSuccessor(root, 50).value);
	}

	public static Node findSuccessor(Node root, int key){
		if(root == null){
			return null;
		}

		Node successor = null;

		while(root != null){
			if(key < root.value){
				successor = root;
				root = root.left;
			}else if(key > root.value){
				root = root.right;
			}else{
				if(root.right != null){
					root = root.right;
					while(root.left != null)
						root = root.left;
				}
				break;
			}
		}
		return successor;
	}
}

class Node{

	public Node(int value, Node left, Node right){
		this.value = value;
		this.left = left;
		this.right = right;
	}

	int value;
	Node left;
	Node right;
}
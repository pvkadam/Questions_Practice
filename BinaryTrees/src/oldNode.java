
public class oldNode {
	static int numberOfNodes = 0;
	
	int data;
	oldNode leftNode;
	oldNode rightNode;
	
	oldNode(int data) {
		this.data = data;
		numberOfNodes++;
	}
}

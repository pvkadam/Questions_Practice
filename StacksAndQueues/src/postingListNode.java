
public class postingListNode {
	int order;
	postingListNode nextNode;
	postingListNode jumpNode;
	
	
	postingListNode(int order, postingListNode nextNode, postingListNode jumpNode) {
		this.order = order;
		this.nextNode = nextNode;
		this.jumpNode = jumpNode;
	}
}

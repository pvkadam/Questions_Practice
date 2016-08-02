
public class CyclicList {
	
	//Also known as Floyd's cycle finding algorithm
	   public ListNode detectCycle(ListNode a) {
	        ListNode fast = a;
	        ListNode slow = a;
	        
	        boolean hasCycle = false;
	        while(fast != null && fast.next != null && slow != null){
	            fast = fast.next.next;
	            slow = slow.next;
	            if(fast == slow){
	                hasCycle = true;
	                break;
	            }
	        }
	        
	        if(!hasCycle) return null;
	        
	        else{
	            fast = a;
	            while(fast != slow){
	                fast = fast.next;
	                slow = slow.next;
	            }
	            return fast;
	        }
	   }
	   
}

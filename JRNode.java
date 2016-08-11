package JRCollection;

/**
 * 
 * @author Roger Schneiter / Yanis Weibel
 *
 * @version V 1.0 --> Double-Linked-List implementation
 *
 */

public class JRNode {
	
	// Content of your Node Element. In our Implementation only Strings are possible
	private String content;
	
	// Two Fields standing for the previous and the next node in our linked list Implementation
	private JRNode prev = null;
	private JRNode next = null;
	
	// Empty Constructor
	public JRNode() {
		super();
	}
	
	// Constructor for filling in only the content String if you neither know the next, nor the previous Node
	public JRNode(String content) {
		super();
		this.content = content;
	}

	// Constructor to use when you know all fields, the content, the previous/next Node
	public JRNode(String content, JRNode prev, JRNode next) {
		super();
		this.content = content;
		this.prev = prev;
		this.next = next;
	}

	// Getters & Setters for all fields
	public String getContent() { return content; }
	
	public void setContent(String content) { this.content = content; }
	
	public JRNode getPrev() { return prev; }
	
	public void setPrev(JRNode prev) { this.prev = prev; }
	
	public JRNode getNext() { return next; }
	
	public void setNext(JRNode next) { this.next = next; }
	
}

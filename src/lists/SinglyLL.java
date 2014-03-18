package lists;

/**
 * 
 * @author pawel
 * Creates a LIFO SinglyLinkedList 
 *
 */
public class SinglyLL
{
	public StringNode head;

	public SinglyLL()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return( head == null );
	}
	
	public void insertFirstStringNode(String s)
	{
		StringNode newNode = new StringNode(s);
		newNode.next = head;
		head = newNode;
	}
	
	public StringNode removeFirst()
	{
		StringNode tmpNode = head;
		
		if (!isEmpty())
		{
			head = head.next;
		}
		else 
		{
			System.out.println("Empty linked list...");
		}
		
		return tmpNode;
	}
	
	public void display()
	{
		StringNode tmpNode = head;
		
		while(tmpNode != null)
		{
			System.out.println(tmpNode);
			System.out.println("Next node: " + tmpNode.next);
			tmpNode = tmpNode.next;
			System.out.println();

		}
	}

	public StringNode search(String s)
	{
		StringNode tmpNode = head;
		
		if (!isEmpty())
		{
			while(tmpNode.data != s)
			{
				if (tmpNode.next == null)
					return null;
				else
				{
					tmpNode = tmpNode.next;
				}
			}
		} 
		else 
		{
			System.out.println("Empty linked list...");
		}
		
		return tmpNode;
	}
	
	public StringNode removeNode(String data)
	{
		StringNode currentNode = head;
		StringNode previousNode = head;
		
		while(currentNode.data != data)
		{
			if(currentNode.next == null)
				return null;
			else
			{
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
		}
		
		if (currentNode == head)
		{
			head = head.next;
		}
		else {
			previousNode.next = currentNode.next;
		}
		
		return currentNode;
	}
}

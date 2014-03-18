package lists;

public class StringNode
{
	public String data;
	public StringNode next;
	
	public StringNode(String s)
	{
		data = s;
		next = null;
	}

	public String toString()
	{
		return data;
	}
}

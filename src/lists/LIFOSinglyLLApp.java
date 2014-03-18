package lists;

public class LIFOSinglyLLApp
{

	public static void main(String[] args)
	{
		SinglyLL theLinkedList = new SinglyLL();
		theLinkedList.insertFirstStringNode("first string");
		theLinkedList.insertFirstStringNode("second string");
		theLinkedList.insertFirstStringNode("bullshit string");
		theLinkedList.insertFirstStringNode("last but not least string");
		
		
		theLinkedList.removeFirst();
		theLinkedList.display();

		System.out.println(theLinkedList.search("second string"));
	}

}

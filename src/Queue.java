/******************************************************
‘***  Project 3 - Queue
‘***  Gabriel Brown
‘******************************************************
‘*** To Demonstrate a queue using a linked list
‘***
‘******************************************************
‘*** 09/27/2017
‘******************************************************
‘*****************************************************/

/**
 *
 * @author Gabe
 */
public class Queue {
    public IntLL head;
    public IntLL tail;
    
    public Queue()
    {
        head = null;
        tail = null;
    }

/******************************************************
‘***  enqueue(int value)
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to enqueue value to list
‘*** Method Inputs: 
‘***      int value
‘*** Return value:
‘***      void
‘******************************************************
‘*** 9/13/2017
‘******************************************************/
    public void enqueue(int value)//create a link!
    {
        if(head == null)
        {
            IntLL temp = new IntLL();
            temp.value = value;
            head = temp;
            tail = temp;
        }
        else
        {
            IntLL temp = new IntLL();
            temp.value = value;
            tail.nextLL = temp;
            tail = temp;
        }
    }
    
/******************************************************
‘***  dequeue()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to dequeue from list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      void
‘******************************************************
‘*** 9/13/2017
‘******************************************************/
    public int dequeue()
    {
        int toBeReturned;
        if(head != null)
        {
            toBeReturned = head.value;// now set pointer head to next in line
            head = head.nextLL;//now, the first value is cut from the list
        }
        else //a.k.a.- what to do when the list is finished dequeuing...
        {
            toBeReturned = 0;
        }
        return toBeReturned;
    }

/******************************************************
‘***  circle()
‘***  Gabriel Brown
‘******************************************************
‘*** Purpose: to dequeue from list
‘*** Method Inputs: 
‘***      none
‘*** Return value:
‘***      String representation of list
‘******************************************************
‘*** 9/13/2017
‘******************************************************/
    public String circle()
    {
        String answer = "<html>"; //labels can do html
        IntLL temp = head;
        while (temp != null)
        {
            answer += temp.value + "<br>";//java is cool for this!
            
            temp = temp.nextLL;
        }
        return answer;
    }    
}

package stack;
import static java.lang.System.exit;





public class nodeStack {
private  class node{
	int data;
	node next;}
    node top;
nodeStack(){
	this.top=null;}

//push
public void push(int x) {
	node temp = new node();
	if (temp == null) {
		System.out.print("\nHeap Overflow");
		return;}
	temp.data = x;
    temp.next = top;
	top = temp;}

// isempty
public boolean isEmpty()
{return top == null;}
// pop
public int peek(){
	if (!isEmpty()) {
		return top.data;}
	else {
		System.out.println("Stack is empty");
		return -1;}}
//pop
public void pop()
{	if (top == null) {
		System.out.print("\nStack Underflow");
		return;	}
       top = top.next;}
public void display()
{	if (top == null) {
		System.out.printf("\nStack Underflow");
		exit(1);	}
	else {
		node temp = top;
		while (temp != null) {
System.out.printf("%d->", temp.data);
			temp = temp.next;}}

}

public static void main(String[] args)
{

	nodeStack obj = new nodeStack();

	obj.push(11);
	obj.push(22);
	obj.push(33);
	obj.push(44);

	obj.display();

	System.out.printf("\nTop element is %d\n", obj.peek());

	obj.pop();
//	obj.peek();

	obj.display();

	System.out.printf("\nTop element is %d\n", obj.peek());
}
}




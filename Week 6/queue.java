package queue;

import java.util.Arrays;

interface queues{
	public void insert(Object obj);
	public Object remove();
	public Object first();
	public int size();
	public boolean contanis(Object object);
	public queue reverse();
	public void display();
	public void merg(queue qu);
	public void addMid(Object obj);
}

public class queue implements queues{
	node head =new node();
	private int size;
	private class node{
		node prev,next;
		Object obj;
		node(){
			prev=this;
			next=this;
		}
		
		node(Object obj){
			this.obj =obj;
		}
		
		node(Object obj, node prev,node next){
			this.obj=obj;
			this.prev=prev;
			this.next=next;
		}
	}//end class node;
	
	
	public void insert(Object obj) {
		head.prev=head.prev.next=new node(obj,head.prev,head);
		size++;
	}
	public Object remove() {
		if(size==0)
			throw new IllegalStateException("queue is Empty");
       Object last=head.prev.obj;
       head.next=head.next.next;
       size--;
       return last;
	}
	
	public Object first() {
		if(size==0)
			throw new IllegalStateException("queue is Empty");
		return head.next.obj;
	}
	public void insertfirst(Object obj) {
		head.next=new node(obj,head,head.next);
		size++;
	}
	
	public void addMid(Object obj) {
		int half=size/2;
		int i=0;
		for(node p=head.next;p!=head;p=p.next) {
			i++;
			if(i==half) {
				p.next=new node(obj,p,p.next);
				size++;
				break;
			}
		}
	}
	
	public int size() {
		return size;
	}
	public boolean isempty() {
		return (size<0);
	}
	public void merg(queue qu) {
		this.head.prev.next=qu.head.next;
		qu.head.next.prev=this.head.prev;
		qu.head.prev.next=this.head;
		this.head.prev=qu.head.prev.next;
		for(node p=qu.head.next; p!=head.prev; p=p.next) {
			size++;
		}
		
	}
	
	public void display(){
		for(node p=head.next;p!=head; p=p.next) {
		System.out.println(p.obj);
		}
	}
	
	public boolean contanis(Object object) {
		for(node p=head.next;p!=head; p=p.next) {
			if(p.obj==object) { 
				return true;
			}
				
		}
		return false;
	}
	
	public Object last() {
		if(size==0)
			throw new IllegalStateException("queue empty");
		return head.prev.obj;
	}
	public queue reverse() {
		queue qu=new queue();
		for(node p=head.prev;p!=head;p=p.prev) {
			qu.insert(p.obj);
		}
		return qu;
	}
	
	public static void main(String arg[]) {
		queue q=new queue();
		q.insert("Amaar");
		q.insert("Raza");
		q.insert("Ajaz");
		q.insert("Ali");
		q.display();
		System.out.println("Size of queue "+q.size());
		queue q1=new queue();
		q1.insert("kashif");
		q1.insert("kashmore");
		q1.insert("2");
		q1.insert("k");
		q1.insert("A");
		q.merg(q1);
		q.addMid("rameez");
		q.remove();
		q.insertfirst("Azadar");
		q.reverse();
		q.display();
		
		System.out.println("Size of queue "+q.size()); 
        System.out.println(q.first());
	}
	
	
}
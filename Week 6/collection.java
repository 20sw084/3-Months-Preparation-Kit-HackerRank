package test;

import java.util.Collection;


public class collection extends AbstractCollection {

	private static class node{
		Object obj;
		node  prev,next;
		node(){
			//this.obj=0;
			next=this;
			prev=this;
		}

		
		node(Object o,node p,node n){
			obj=o;
			prev=p;
			next=n;
		}
	
	}
private int size;
private node head=new node();
public int size() {
	return size;
}

public boolean add(Object obj) {
	head.prev=head.prev.next=new node(obj,head.prev,head);
	++size;
	return true;
}

public iterator Iterator() {
	return new iterator() {
		private node  cursor=head.next;
		private boolean oktoRemove=false;
		public boolean hasnext() {
			return (cursor!=head);
		}
		public Object next()
		{
		if(cursor==head)
			throw new RuntimeException();
		Object temp=cursor.obj;
		oktoRemove=true;
		cursor=cursor.next;
		return temp;
		}
      		
       public void remove() {
    	   if(!oktoRemove)
    		   throw new IllegalStateException();
    	   cursor.prev=cursor.prev.prev;
    	   cursor.prev.next=cursor;
    	   --size;
    	   oktoRemove=false;
       }
};
}


public static void  main(String arg[]) {
	
	collection linked=new collection();
	System.out.println(linked.size());
	linked.add("2");
	linked.add(4);
	linked.add(5);
	linked.add(6);
	linked.add(2);
	iterator it=linked.Iterator();
	System.out.println(linked);
	it.next();
	it.remove();
	
	System.out.println(linked);
	System.out.println(linked.size());
}
}
package linkedlist;


public class node {


	node next;
	int data;
	node(){
		next=null;
		data=0;
	}
	node(int data){
	this.data=data;
	}
   node(int data,node next){
	   this.data=data;
	   this.next=next;
   }
   
   public node insert(int x,node start) {
	node p=start;
	   if(start==null || start.data>x) {
		p=new node(x);
		return start;
	}
	 while(p!=null) {
		 if(p.next.data>x) {break;}
		 p=p.next;
	 }
	 p.next=new node(x);
	 return start;
	 
   }

   public static void sum(node start) {
	   int sum=0;
	   node p=start;
	   sum=p.data;
	   for(p=start;p.next!=null;p=p.next) {
		   sum+=p.next.data;
	   }
	   System.out.println("Sum is "+sum);
   
   }
   public static void deletelast(node start) {
	   node p=start;
	   if(start==null) {
		   System.out.println("Start is empty");
	   }
	for(p=start;p!=null;p=p.next) {
		if(p.next==null) { p=null;}
	if(p.next.next==null) {
		p.next=null;
	}
	}
	System.out.println("Last Element was deleted");
   }
	public static int size(node start) {
		int size=0;
		for(node p=start; p!=null;p=p.next) {
			size++;
		}
		return size;
		
		
	}
	public static void search(int x,node start) {
		node p=start;
		boolean fal=false;
		for( p=start;p!=null;p=p.next) {
			if(p.data==x) {
				System.out.println("Element found");
				fal=true;
				break;
			}
			
		}
		if(!fal) {
			System.out.println("Element not found");
		}
		
	}
	public static void maximum(node start) {
		int max=0;
		node p=start;
		max=p.data;
		for(p=start;p.next!=null;p=p.next) {
			if(max<=p.next.data) {
				max=p.next.data; }
			}
		System.out.println("Maximum number is "+max);
		}
		
		
	
	public static void minimum(node start) {
		
		int min=0;
		node p=start;
		min=p.data;
		for(p=start;p.next!=null;p=p.next) {
			if(min>p.next.data) {
				min=p.next.data;
			}}
		System.out.println("Minimum Element is "+min);
		
		
	}
	public static  void copy(node start) {
		node copy=new  node(start.data);
		node temp=copy;
         node p=start; 		
		for(p=start;p!=null;p=p.next) {
			temp=temp.next=new node(p.data);
		}
		System.out.println("Copy is Finished");
	}
	
	public static void first(node start) {
		node p;
		if(start==null) {
			System.out.println("linked list is Empty");
			
		}
		if(start!=null) {
			System.out.println("First element is "+start.data);
		}
	}
	
	
	public static  void delete(node start,int x) {
		
		
		node p=start;
		if(start==null || start.data==x) {
			System.out.println("Node has no values");
		}
		if(p.data==x) {
			p=p.next;
		}
		for(p=start;p!=null;p=p.next) {
			if(p.next.data==x) {
				p.next=p.next.next;
				break;
			}
		}
		
		System.out.println("Element deleted");
	}

	
	
	
	
	public static void merg(node start1,node start2) {
	   node p;
	   for( p=start1;p.next!=null; p=p.next) {
		   
	   }
	   p.next=start2;
   }
   
   public static void display(node start) {
	   node p=start;
	   for(p=start;p!=null;p=p.next) {
		   System.out.println(p.data);
	   }
   }
   

   public static void main(String arg[]) {
	   node n1=new node(2);
	   node p=n1;
	  p.next=new node(3);
	  p=p.next;
	  p.next=new node(4);
	  
	  node n2=new node(5);
	   node q=n2;
	  q.next=new node(6);
	 q=q.next;
	  q.next=new node(7);
     merg(n1,n2);
     deletelast(n1);
     display(n1);
   sum(n1);
   System.out.println("Size of linked list is "+size(n1));
   search(5,n1);
   maximum(n1);
   minimum(n1);
 first(n1);
   
   }
   
}

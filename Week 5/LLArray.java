public class Main {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     Node head;
    void createLL(int data){
        Node p = new Node(data);
        if(head==null){
            head=p;
        }
        else {
            p.next=head;
            head=p;
        }
    }
    void showlist(){
        Node p =head;
        if(head== null){
            System.out.println("Emtpy");
        }
        else {
            while (p!=null){
                System.out.println(p.data);
                p=p.next;
            }
        }
    }
    void minOFList(Node p1){
        int min= p1.data;
        for(Node i=p1;i!=null;i=i.next){
            if(i.data<min){
                min=i.data;
            }
        }
        System.out.println("The min of the linkedlit is "+min);
    }
    void printLastList(Node p1){
        while (p1.next!=null){
            p1 = p1.next;
        }
        System.out.println("This is  list"+p1.data);
    }
    void printMid(Node p2){
        int mid = size(p2)/2;
        for(int i =0;i<mid-1;i++){
            p2=p2.next;
        }
        System.out.println("This is the Mid of the list "+p2.data);
    }
    int size(Node head){
        int counter =0 ;
        for(Node i = head;i!=null;i=i.next){
            counter++;
        }
        return  counter;
    }
    void minArray(int []arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("This is the minmun array "+min);

    }
    public static void main(String[] args) {

        int [] arr1 ={25,9,11,16,1,16,95};
        Main mylist = new Main();
        System.out.println("This is the linked list");
        mylist.createLL(95);
        mylist.createLL(15);
        mylist.createLL(1);
        mylist.createLL(16);
        mylist.createLL(11);
        mylist.createLL(9);
        mylist.createLL(25);
        mylist.showlist();
        mylist.printMid(mylist.head);
        mylist.printLastList(mylist.head);
        mylist.minOFList(mylist.head);
        mylist.minArray(arr1);

    }
}
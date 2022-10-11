package stack;
import java.util.Arrays;

interface Stack{
    public Object peek();
    public Object pop();
    public void push(Object obj);
    public int getSize();
    public boolean isEmpty();
}
class ArrayStack implements Stack{
    private Object[] a;
    private int size;
    public ArrayStack(int c){
        a=new Object[c];
    }

    @Override
    public Object peek() {
        if(size==0) throw new IllegalStateException("Stack is empty.");
        return a[size-1];
    }

    @Override
    public Object pop() {
        if(size==0) throw new IllegalStateException("Stack is empty.");
        Object obj=a[--size];
        a[size]=null;
        return obj;
    }

    @Override
    public void push(Object obj) {
        if(size==a.length) resize();
        a[size++]=obj;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    public void resize(){
        a=Arrays.copyOf(a, a.length+1);
    }
    @Override
    public String toString(){
        String s="";
        for(int i=size-1;i>=0;i--){
            if(i==0)
                s+=a[i];
            else
                s+=a[i]+", ";
        }
        return "["+s+"]";
    }
    public boolean equals(ArrayStack as){
        if(a.length==as.a.length){
            for(int i=0;i<as.a.length;i++){
                if(as.a[i]!=a[i])
                    return false;
            }
        }else
            return false;
        return true;
    }

    public Object bottomElement(){
        if(size==0) throw new IllegalStateException("Stack is empty");
        return a[0];
    }

    public Object secondElement(){
        if(size==0 || size==1) throw new IllegalStateException("Stack is empty");
        return a[1];
    }

    public boolean removeBottomElement(){
        if(size==0)
            return false;
        else{
            a[0]=null;
            return true;
        }
    }
    public boolean removeSecondElement(){
        if(size==0 || size==1)
            return false;
        else{
            a[1]=null;
            return true;
        }
    }
    public nodeStack toLinkedStack(){
        if(size==0) throw new IllegalStateException("Stack is empty");
        nodeStack linkedStack=new nodeStack();
        for (Object a1 : a) {
//            linkedStack.push(a1);
        }
        return linkedStack;
    }
}
 class Task01ArrayStack {

    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(5);

        int arr[]={10,20,30,40,50,60,70,80};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        System.out.println("ArrayStack: "+stack.toString());
        System.out.println("Stack size: "+stack.getSize());

        ArrayStack forCheck=new ArrayStack(5);
        for(int i=0;i<arr.length;i++){
            forCheck.push(arr[i]);
        }

        System.out.println("Stack for Comparison: "+forCheck.toString());
        System.out.println("Both stacks are equal: "+stack.equals(forCheck));

        System.out.println("Peeked: "+stack.peek());
        System.out.println("Poped: "+stack.pop());
        System.out.println("After poping: "+stack.toString());

        System.out.println();
        nodeStack linkedStack=stack.toLinkedStack();
        System.out.println("To LinkedStack: "+linkedStack.toString());
        System.out.println();


        System.out.println("Bottom Element: "+stack.bottomElement());
        System.out.println("Second Element: "+stack.secondElement());

        System.out.println("Remove second element: "+stack.removeSecondElement());
        System.out.println("Remove bottom element: "+stack.removeBottomElement());

    }
}

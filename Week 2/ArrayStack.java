import java.util.EmptyStackException;

interface Stack{
    public void push(Object obj);
    public Object pop();

    public Object peek();

    public int size();
}
public class ArrayStack implements Stack{

    private int size;
    private Object []a;

    ArrayStack(int cap){
        a= new Object[cap];
        size =0;
    }

    private boolean isEmpty(){
        return size==0;
    }


    public int size(){
        return 0;
    }

    public Object pop(){
        if(isEmpty())throw new EmptyStackException();
        Object obj = a[--size];
        a[size]=null;
        return obj;
    }
    public Object peek() {
        if(isEmpty()) throw new EmptyStackException();
        return a[size-1];
    }
    public void push(Object obj){
        if(size==a.length) resize();
        a[size++]=obj;

    }
    private void resize(){
    Object[]aa=a;
    a= new Object[2*aa.length];
    System.arraycopy(aa,0,a,0,size);

    }

    void displayStack(){
    for(int i=0;i<this.size;i++){
        System.out.print(this.a[i]+" , ");
    }
    }

    public Object popLast(){
        Object obj = a[0];
        a[0]=null;
        System.arraycopy(a,1,a,0,--size);
        return obj;
    }

    public String toString (){

        StringBuilder str = new StringBuilder(String.valueOf(this.a[size-1]));
        for(int i= size-2;i>=0;i--){
        str.append(" , ").append(String.valueOf(this.a[i]));
        }
        return "["+ str +"]";
    }
public boolean equal(ArrayStack stack){
        if(this.size!= stack.size)return false;
        for(int i=0;i<size;i++){
            if(!this.a[i].equals(stack.a[i])) return false;
        }
        return  true;
}


    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        arrayStack.push("Hassan");
        arrayStack.push("Ahmed");
        arrayStack.push("Shani");
        arrayStack.push("Rajput");
        System.out.println(arrayStack);



    }

}

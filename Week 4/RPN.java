
public class RPN {
public boolean isOperator(String opertor){
    return opertor.length()==1 && ("ASMD".indexOf(opertor)>0);
}
public double evaluate(double x, double y, String operator){
    double z=0;
    if(operator.equalsIgnoreCase("A"))z=x+y;
    else if (operator.equalsIgnoreCase("S"))z=x-y;
    else if(operator.equalsIgnoreCase("M"))z=x*y;
    else if(operator.equalsIgnoreCase("D"))z=x/y;
    System.out.println(x+" "+operator+" "+y+" = "+z);
    return z;
}
public RPN(String []data){
    ArrayStack stack = new ArrayStack(data.length);
    String s;
    for(int i=0;i<data.length;i++){
        s=data[i];
        if(isOperator(s)){
            double x= Double.parseDouble((String)stack.pop());
            double y= Double.parseDouble((String)stack.pop());
            double z= evaluate(x,y,s);
            stack.push(" "+z);
        }else{
            stack.push(s);
        }
    }
}
    public static void main(String[] args) {
        String[] eq={"2","3","M","3","2","6","D","S","D"};
        new RPN(eq);
    }
}

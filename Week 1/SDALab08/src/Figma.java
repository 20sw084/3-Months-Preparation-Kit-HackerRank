// this is adaptee class // or code class
class Code{
    public void changeInCode(){
        System.out.println("Your Design change into Code");
    }
}

interface Design{
    void design(String d);
}
 //adapter class
class DesignIntoCodeAdapter implements Design{
    @Override
    public void design(String d) {
        String s=d;
        Code c= new Code();
        c.changeInCode();
    }
}

public class Figma {
    public static void main(String[] args) {
        String code="code";

        Design design =new DesignIntoCodeAdapter();
        design.design(code);
    }
}


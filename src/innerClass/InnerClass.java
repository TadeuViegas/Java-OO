package innerClass;

public class InnerClass {
    private static int outField = 2;

    public static class innerClas{
        public void display(){
            System.out.println("Campo externo:" + outField);
        }
    }

    public static void main(String[] args) {
        innerClas result = new innerClas();
        result.display();
    }

}

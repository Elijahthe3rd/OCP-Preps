public class InnerClass {
    class A{
        void m(){
            System.out.println("INNER");

        }
    }

    public static void main(String[] args) {
        InnerClass.A a1=new InnerClass().new A();

        A a2=new InnerClass().new A();
        a2.m();
        a1.m();

    }
}

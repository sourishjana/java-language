public class Main {
    static class ParentClass{
        void show(){
            System.out.println("This is the parent class");
        }
        private void show1(){
            System.out.println("This is the private parent class");
        }
    }
    static class ChildClass extends ParentClass{
        void showChild() {
            System.out.println("this is child class");
        }
    }

    public static void main(String[] args) {
        ParentClass x=new ParentClass();
        ChildClass y=new ChildClass();
        x.show();
        y.showChild();
        y.show();
        //y.show1();
    }
}

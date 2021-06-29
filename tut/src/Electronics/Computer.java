package Electronics;
import p1.*;

public class Computer extends Mobile{
    Mobile m=new Mobile();
    public void use(){
        // private:
        //System.out.println(m.number);
        //System.out.println(number);

        // default:
        //System.out.println(defaultNumber);
        //System.out.println(m.defaultNumber);

        // protected:
        System.out.println(protectedNumber);
        //System.out.println(m.protectedNumber);

        // public:
        System.out.println(publicNumber);
        System.out.println(m.publicNumber);
    }
}

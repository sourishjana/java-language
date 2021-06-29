public class Main {
    public static void main(String[] args) {
        EMP s1=new EMP("sc", 9);
        Scientist s2=new Scientist("kl",3,5,6);
        Dscientist s3=new Dscientist("j",3,4,5,6);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        EMP s4=new Dscientist("k",9,8,6,5);
        System.out.println(s4);
    }
}
class EMP {
    String name;
    int id;
    public EMP(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString(){
        //System.out.println("This is EMP class");
        return "This is EMP class";
    }
}
class Scientist extends EMP{
    int no_of_publications;
    int experience;
    public Scientist(String name, int id, int no_of_publications, int experience) {
        super(name, id);
        this.no_of_publications = no_of_publications;
        this.experience = experience;
    }
    @Override
    public String toString(){
        //System.out.println("This is Scientist class");
        return "This is Scientist class";
    }
}
class Dscientist extends Scientist{
    int award;
    public Dscientist(String name, int id, int no_of_publications, int experience, int award) {
        super(name, id, no_of_publications, experience);
        this.award = award;
    }
    @Override
    public String toString(){
        //System.out.println("This is DScientist class");
        return "This is DScientist class";
    }
}

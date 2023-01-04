package polymorphism;


class Bird{
    public void sing(){
        System.out.println("tweet tweet");
    }
}
class Robin extends Bird{
    public void sing(){
        System.out.println("twiddledee");
    }
}
class Pelican extends Bird{
    public void sing(){
        System.out.println("kwhan");
    }
}

public class Polymorphism {

    public static void main(String[] args){
        Bird b = new Bird();
        b.sing();
    }
}

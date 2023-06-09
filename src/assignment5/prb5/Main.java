package assignment5.prb5;

public class Main {
    public static void main(String[] args) {
        Computer computer=new Computer("DELL","Intel",8,5.5);
        Computer computer1=new Computer("DELL","Intel",8,5.5);
        Computer computer2=new Computer("LENOVO","Intel",16,2.5);
        //Testing toString
        System.out.println(computer);
        System.out.println(computer1);
        System.out.println(computer2);

        //Compare
        System.out.println(computer.equals(computer1));
        System.out.println(computer1.equals(computer2));
        System.out.println(computer2.equals(computer));

        //hashcode
        System.out.println(computer.hashCode());
        System.out.println(computer1.hashCode());
        System.out.println(computer2.hashCode());

    }

}

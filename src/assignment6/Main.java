package assignment6;

public class Main {
    public static void main(String[] args) {
        MyTable table1 = new MyTable();
        table1.add('a', "Andrew");
        table1.add('b', "Billy");
        table1.add('c', "Charlie");
        table1.add('w', "Willie");

        String s = table1.get('b');
        System.out.println(s);

        s = table1.get('w');
        System.out.println(s);

        System.out.println(table1);
    }
}

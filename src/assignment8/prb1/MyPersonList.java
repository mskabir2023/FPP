package assignment8.prb1;
import java.util.Arrays;
public class MyPersonList {
        private final int length = 4;
        private Person[] person;
        private int size;
        MyPersonList() {
            person = new Person[length];
            size = 0;
        }
        public void add(Person person) {
            if (person == null) return;
            if (size == this.person.length) resize();
            this.person[size++] = person;
        }
        public void insert(Person person, int ps) {
            if (ps > size || ps < 0) return;
            if (ps == this.person.length || size + 1 > this.person.length) resize();
            Person[] temp = new Person[this.person.length + 1];
            System.arraycopy(this.person, 0, temp, 0, this.person.length - ps);
            temp[ps] = person;
            System.arraycopy(this.person, ps, temp, ps + 1, this.person.length - ps);
            this.person = temp;
            ++size;
        }
        public boolean remove(Person person) {
            if (size == 0) return false;
            if (person == null) return false;
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (this.person[i].getLast().equals(person.getLast())) {
                    index = i;
                    break;
                }
            }
            if (index == -1) return false;
            Person[] temp = new Person[this.person.length];
            System.arraycopy(this.person, 0, temp, 0, index);
            System.arraycopy(this.person, index + 1, temp, index, this.person.length - (index + 1));
            this.person = temp;
            --size;
            return true;
        }
        public Person get(int i) {
            if (i < 0 || i >= size) {
                return null;
            }
            return person[i];
        }
        public void resize() {
            System.out.println("resized");
            int len = person.length;
            int newLen = 2 * len;
            Person[] newArray = new Person[newLen];
            System.arraycopy(person, 0, newArray, 0, len);
            person = newArray;
        }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(person[i] + "\n");
            }
            return sb.toString();
        }
        public int size() {
            return size;
        }
        public boolean isEmpty() {
            return size == 0;
        }
        public Object clone() {
            Person[] temp = Arrays.copyOf(person, size);
            return temp;
        }
        public static void main(String[] args) {
            MyPersonList people = new MyPersonList();
            people.add(new Person("Mohammad", "Seraj", 30));
            people.add(new Person("Mohammad", "Jakaria", 30));
            people.add(new Person("Khun", "Maynmari", 29));
            people.add(new Person("Stavie", "Waugh", 34));
            System.out.println("Total Number of people: " + people.size);
            System.out.println(people);
            System.out.println("After inserting : ");
            people.insert(new Person("Mohammad", "Mamun", 35), 2);
            System.out.println(people);
            System.out.println("After removing Total Person: ");
            people.remove(new Person("Stavie", "Waugh", 34));
            people.remove(new Person("Mohammad", "Mamun", 35));
            System.out.println(people);
        }
    }

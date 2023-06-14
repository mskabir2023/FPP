package assignment8.prb3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static List<Marketing> listMoreThan1000(List<Marketing> list){
        //for string
        list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                return o1.getEmployneeName().compareTo(o2.getEmployneeName());

            }
        });
        List<Marketing> listMore100 = new ArrayList();
        for (Marketing marketing: list){
            if (marketing.salesamount>1000)
                listMore100.add(marketing);
        }
        return listMore100;
    }
    public static void main(String[] args) {
        List<Marketing> marketingList = new ArrayList<>();

        marketingList.add(new Marketing("Mohe", "Ab001", 7885.0));
        marketingList.add(new Marketing("Johney", "BB002", 110.0));
        marketingList.add(new Marketing("Riyad", "CN002", 115.0));
        marketingList.add(new Marketing("Manik", "AB0012", 117.0));
        marketingList.add(new Marketing("Arafath", "ETE005", 118.3));
        marketingList.add(new Marketing("Emon", "FPP007", 117.08));
        marketingList.add(new Marketing("Edres", "MPP008", 11254.78));
        marketingList.add(new Marketing("james", "STC0015", 400.23));
        marketingList.remove(3);
        System.out.println("Size: "+ marketingList.size());
        System.out.println(marketingList);
/////numeric
        marketingList.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing o1, Marketing o2) {
                if (o1.salesamount > o2.salesamount) return 1;
                else if (o1.salesamount < o2.getSalesamount()) return -1;
                else return 0;
            }
        });
        System.out.println(marketingList);

        List<Marketing> list = listMoreThan1000(marketingList);
        System.out.println(list);
    }
}
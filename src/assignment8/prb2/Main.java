package assignment8.prb2;
import java.util.ArrayList;
import java.util.List;
public class Main {

    /** Combines the lists that are populated here into a single list
     *  and passes to computeSumOfSalaries
     */
    public static void main(String[] args) {
        List<Staff> staff = new ArrayList<Staff>();
        staff.add(new Staff("Mohammad", 130000, 3));
        staff.add(new Staff("Jakaria", 130000, 2));
        staff.add(new Staff("Stave", 110000, 1));
        staff.add(new Staff("Richard",95000, 3));
        staff.add(new Staff("KevinPiterson", 100000,1));
        staff.add(new Staff("KironPoillard",128000,2));

        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Msk", 195000, 12000));
        teachers.add(new Teacher("Chy", 180000, 10000));
        teachers.add(new Teacher("Kabir", 185000, 11000));
        teachers.add(new Teacher("Tamim",195000, 80000));


        //Implementation steps
        //Step 1: implement the combine method, to combine the two lists
        List<EmployeeData> combined = combine(staff, teachers);

        //Step 2: pass the combined list to computeSumOfSalaries
        double salarySum = Statistics.computeSumOfSalaries(combined);
        System.out.println(salarySum);

    }

    //IMPLEMENT
    public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
        List<EmployeeData> arrayList = new ArrayList();
        arrayList.addAll(staff);
        arrayList.addAll(teachers);
        return arrayList;
    }

}

package assignment5.prb4;

public class Driver {
    public static void main(String[] args) {
        Employee e1=new BasePlusCommissionEmployee("X","A","2521a",256321.0,2.5,5620);
        Employee e2=new HourlyEmployee("B","A","258963",6396,2.8);
        Employee e3=new SalariedEmployee("S","E","5896745",635.63);
        Employee e4=new SalariedEmployee("op","iu","58974",5263.2);
        Employee e5=new HourlyEmployee("KL","PO","879654",5874.25,54.2);
        Employee [] employees = {e1,e2,e3,e4,e5};
        double totalSalary = 0.0;
        for(Employee e : employees){
            totalSalary+=e.getPayment();
            System.out.println(e.toString());
        }
        System.out.println("Total Salary: "+totalSalary);


    }
}

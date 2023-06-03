public class Problem3b {
    int field1 = exeField01();
    int field2 = exeField02();
    static int field3 = exeField03();
    Problem3b(){
        System.out.println("Without ARG CONSTR:");
    }
    Problem3b(int i){
        System.out.println("1 ARG CONSTR:");
    }

    static {
        System.out.println("TWO - FIRST STA BLK INTIA ...");
    }
    static {
        System.out.println("THREE - SECOND STA BLK INTIA...");
    }
    {
        System.out.println("SIX - FIRST INS BLK INTIA ... ");
    }
    {
        System.out.println("SEVEN - TWO INS BLK INTIA... ");
    }
    public int exeField01(){
        System.out.println("FOUR - FIRST INS FIELD INTIA ... ");
        return 1;
    }

    public int exeField02(){
        System.out.println("FIVE  - SECOND INS FIELD INITIA.... ");
        return 1;
    }

    public static int exeField03(){
        System.out.println("ONE - STA FLD INTIA ... ");
        return 1;
    }

    public int instanceMethod1(){
        System.out.println("FIRST INS MTD  ... ");
        return 0;
    }

    public int instanceMethod2(){
        System.out.println("SECOND INS MTD  ... ");
        return 0;
    }

    public static int staticMethod1(){
        System.out.println("FIRST INS MTD  ......");
        return 0;
    }

    public static int staticMethod2(){
        System.out.println("SECOND STA MTHD INV ...");
        return 0;
    }

    public static void main(String[] args) {
        //Testing
        Problem3b p = new Problem3b();
        System.out.println("*****************************");

        p.instanceMethod1();
        Problem3b.staticMethod1();
        System.out.println("*****************************");

        Problem3b p1 = new Problem3b(1);
        System.out.println("*****************************");

        p1.instanceMethod2();
        Problem3b.staticMethod2();
        System.out.println("*****************************");

        new Problem3b();
        System.out.println("*****************************");

        new Problem3b(5);
        System.out.println("*****************************");

    }
}

public class Problem13a {

   public  static int counter = 0;
    Problem13a(){
        counter++;
    }
    public int getCount(){
        return counter;
    }

    public static void main(String[] args) {
        Problem13a instance = null;
        int i=0;
        while(i<3){
            instance=new Problem13a();
            i++;
        }

        System.out.println("Total Instance is : "+instance.getCount());
    }
}
package assignment5.prb3;

public class Driver {
    public static void main(String[] args) {
        Figure f1 = new UpwardHat();
        Figure f5 = new UpwardHat();
        Figure f2= new DownwardHat();
        Figure f3= new FaceMaker();
        Figure f4= new Vertical();

      //  Figure[] figures = {f1, f5, f2, f3, f4};
        Figure[] figures = new Figure[5];
        figures[0] = f1;
        figures[1]= f5;
        figures[2]= f2;
        figures[3]= f3;
        figures[4]= f4;
        for (Figure f:figures) {
            f.getFigure();
            //System.out.println(;

        }
        System.out.println();


        for(Figure f: figures){
            //uowardhat==upwardhat
            if (f instanceof UpwardHat){
                System.out.print("UpwardHat: ");
            }
            if (f instanceof DownwardHat){
                System.out.print("DownwardHat: ");
            }
            if(f instanceof FaceMaker){
                System.out.print("FaceMaker:");
            }
            if(f instanceof Vertical){
                System.out.print("Vertical:");
            }
            f.getFigure();
            System.out.println();
        }
    }
}

package assignment8.prb3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Marketing {
   private String employneeName;
   private String productName;
    double salesamount;
    public Marketing(String employneeName,String productName,double salesamount){
        this.employneeName=employneeName;
        this.productName=productName;
        this.salesamount=salesamount;
    }
    public String getEmployneeName(){return employneeName;}
    public String getProductName(){return productName;}

    public double getSalesamount() {
        return salesamount;
    }
    public void setEmployneeName(String employneeName){this.employneeName=employneeName;}
    public  void setProductName(String productName){this.productName=productName;}
    public void setSalesamount(double salesamount){this.salesamount=salesamount;}
    @Override
    public String toString(){
        return "\n [ Emp.Name:"+employneeName+"   P_Name:"+productName+"      SalesAmount:"+salesamount+"]";
    }
    @Override
    public boolean equals (Object obj){
        if(this==obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Marketing marketing=(Marketing) obj;
        return Objects.equals(employneeName, ((Marketing) obj).employneeName) && Objects.equals(productName, ((Marketing) obj).productName) && salesamount == ((Marketing) obj).salesamount;
        //Objects.equals(employneeName,((Marketing) obj).employneeName && Objects.equals(productName, ((Marketing) obj).productName)  salesamount ==((Marketing) obj).salesamount;

    }



}


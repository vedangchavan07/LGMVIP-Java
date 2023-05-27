import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter
{
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro, yen, ringgit;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Following are the Choices:");
      System.out.println("Enter 1: Rupee");
      System.out.println("Enter 2: Dollar");
      System.out.println("Enter 3: Pound");
      System.out.println("Enter 4: Euro");
      System.out.println("Enter 5: Yen");
      System.out.println("Enter 5: Ringgit");
 
      System.out.print("\nChoose from above options: ");
      choice = sc.nextInt();
 
      System.out.println("Enter the amount you want to convert?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1:  // Ruppe Conversion
            dollar = amount / 82.56;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 101.93;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 88.6;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
 
            yen = amount / 0.59;
            System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
 
            ringgit = amount / 17.94;
            System.out.println(amount + " Rupee = " + f.format(ringgit) + " ringgit");
            break;
 
         case 2:  // Dollar Conversion
            rupee = amount * 82.56;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Rupees");
 
            pound = amount *0.81;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.93;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
 
            yen = amount *140.66;
            System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.6;
            System.out.println(amount + " Dollar = " + f.format(ringgit) + " ringgit");
            break;
 
         case 3:  // Pound Conversion
            rupee = amount * 101.93;
            System.out.println(amount + " pound = " + f.format(rupee) + " Rupees");
 
            dollar = amount *1.23;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.15;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
 
            yen = amount *173.67;
            System.out.println(amount + " pound = " + f.format(yen) + " Yen");
 
            ringgit = amount *5.68;
            System.out.println(amount + " pound = " + f.format(ringgit) + " ringgit");
            break;
 
         case 4:  // Euro Conversion
            rupee = amount * 88.6;
            System.out.println(amount + " euro = " + f.format(rupee) + " Rupees");
 
            dollar = amount *1.07;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.87;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
 
            yen = amount *150.94;
            System.out.println(amount + " euro = " + f.format(yen) + " Yen");
 
            ringgit = amount *4.94;
            System.out.println(amount + " euro = " + f.format(ringgit) + " ringgit");
            break;
 
         case 5:  // Yen Conversion
            rupee = amount *0.59;
            System.out.println(amount + " yen = " + f.format(rupee) + " Rupees");
 
            dollar = amount *0.0071;
            System.out.println(amount + " yen = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.0058;
            System.out.println(amount + " yen = " + f.format(pound) + " Pound");
 
            euro = amount *0.0066;
            System.out.println(amount + " yen = " + f.format(euro) + " Euro");
 
            ringgit = amount *0.033;
            System.out.println(amount + " yen = " + f.format(ringgit) + " ringgit");
            break;
 
         case 6:  // Ringgit Conversion
            rupee = amount *17.94;
            System.out.println(amount + " ringgit = " + f.format(rupee) + " Rupees");
 
            dollar = amount *0.22;
            System.out.println(amount + " ringgit = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.18;
            System.out.println(amount + " ringgit =: " + f.format(pound) + " Pound");
 
            euro = amount *0.20;
            System.out.println(amount + " ringgit = " + f.format(euro) + " Euro");
 
            yen = amount *30.57;
            System.out.println(amount + " ringgit = " + f.format(yen) + " Yen");
            break;
 
          //Default case
         default:
            System.out.println("Invalid Input");
      }
   }
}
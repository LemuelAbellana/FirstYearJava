/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exammachineproblem1;
import java.util.Scanner; 
/**
 *
 * @author lemue
 */
public class ExamMachineProblem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        float php, dol, con;
        
        System.out.print("Exchange rate: ");
        dol = myObj.nextFloat();
        System.out.print("Value to be converted: ");
        php = myObj.nextFloat();
        
        con = php/dol;
        
        System.out.printf("Value in US Dollar: %.2f%n",con);
        
        myObj.close();
    }
}//end of main method

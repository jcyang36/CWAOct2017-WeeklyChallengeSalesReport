package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int custId;
        String custName;
        String lineBreak="";
        double salesAmount;
        double taxPercent=0.0;
        double taxAmount=0.0;
        String taxCode="";
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the customer ID: ");
        custId=scan.nextInt();
        System.out.println("Enter the name: ")    ;
        custName=scan.next();
        lineBreak=scan.nextLine();
        System.out.println("Enter the sales amount: ");
        salesAmount=scan.nextDouble();
        System.out.println("Enter the tax code: ");
        taxCode=scan.next();
        lineBreak=scan.nextLine();
        if (taxCode.equals("NRM")){
         taxPercent=0.06;
        }
        else if (taxCode.equals("NPF")){
            taxPercent=0.00;
        }
        else if (taxCode.equals("BIZ")){
            taxPercent=0.045;
        }
        taxAmount=calculateTax(taxPercent, salesAmount);
        double unformattedAmount=taxAmount+salesAmount;

        System.out.println("Customer ID: "+ custId);
        System.out.println("Customer Name: "+custName);
        System.out.println("Sales Amount: "+salesAmount);
        System.out.println("Tax Code: "+taxCode);
        System.out.println("Total Amount Due: "+ nf.format(unformattedAmount));


    }


    public static double calculateTax(double taxPercent,double salesAmount){
        return taxPercent*salesAmount;
    }
}

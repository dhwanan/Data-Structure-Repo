package com.dkss;

public class Main {

    public static void main(String[] args) {


        Printer printer = new Printer(60,false);
        System.out.println("Initial page count =" +printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was "+ pagesPrinted +"new total print count for printer "+ printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was "+ pagesPrinted +"new total print count for printer "+ printer.getPagesPrinted());

    }
}

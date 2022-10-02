package Java102.OOPPrinciples.Inheritance;

public class App {
    public static void main(String[]args){

        // Academician a1 = new Academician("Bülent Korkmaz","05454334545","bulent@itu.edu.tr","Tarih", "Yrd.Doc");
         Academician a2 = new Assistant("Cebeli Tarık","05353554050","cebeli@tarik.com","Geography","Dr.");
        Lecturer l1 = new Lecturer("Mahmut Çetindağ", "00","-", "CENG","Dr.","001");

        // Employee e1 = new Employee("Ahmet Çavuş", "05553233232","ahmet@cavus.com");
        Employee officeEmployer = new SecurityGuard("Mücahit Yurtsever","0","-");


        officeEmployer.printFullName();
        if(officeEmployer instanceof Employee) {
            System.out.println("Employee: True");
        } else System.out.println("Employee: False");
        if(officeEmployer instanceof Officer) {
            System.out.println("Officer: True");
        } else System.out.println("Officer: False");

        System.out.println("officeEmployer: " + officeEmployer.getClass().getTypeName());
        officeEmployer.enterUniversity("08:30");

        System.out.println("-----------------------------------------\n Polimorfizm (Çok Biçimlilik) Örneği\n");


        Employee [] loginUser = {a2, l1, officeEmployer}; //Polimorfizm (Çok Biçimlilik)
        Employee.enteredEmployees(loginUser);

    }
}

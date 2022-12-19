package day33_statics;

import day32_constructors.Employee2;

public class CalisanObjects {
    public static void main(String[] args) {

        Calisan e1=new Calisan();
        e1.name="ali";
        e1.salary=3000;
        Calisan e2=new Calisan();
        e2.name="ddd";
        e2.salary=5000;
        Calisan e3=new Calisan();
        e3.name="nerede";
        e3.salary=6000;
        System.out.println("e1 = " + e1.name+" : "+e1.salary);
        System.out.println("e2 = " + e2.name+" : "+e2.salary);
        System.out.println("e3 = " + e3.name+" : "+e3.salary);
        System.out.println(e1.isHuman);
        System.out.println(e2.isHuman);
        System.out.println(e3.isHuman);
    }
}

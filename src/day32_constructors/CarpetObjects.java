package day32_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(3.15,5.45,100,true);
        Carpet carpet2=new Carpet(6,6,80,true);
        Carpet carpet3=new Carpet(5,7,98,false);
        ArrayList<Carpet>myCarpets=new ArrayList<>();
        myCarpets.add(carpet1);
        Carpet[]carpets={carpet2,carpet3};
        myCarpets.addAll(Arrays.asList(carpets));
        System.out.println(myCarpets);
    }
}

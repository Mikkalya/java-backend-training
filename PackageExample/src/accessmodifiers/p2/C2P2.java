package accessmodifiers.p2;

import accessmodifiers.p1.C1P1;

public class C2P2 {
    public static void main(String[] args) {
        C1P1 c1p1=new C1P1();
//        priVar' has private access in 'accessmodifiers.p1.C1P1
//        System.out.println(c1p1.priVar);
//        defVar' is not public in 'accessmodifiers.p1.C1P1'. Cannot be accessed from outside package
//        System.out.println(c1p1.defVar);
//        'proVar' has protected access in 'accessmodifiers.p1.C1P1'
//        System.out.println(c1p1.proVar);
        System.out.println(c1p1.pubVar);

    }
}

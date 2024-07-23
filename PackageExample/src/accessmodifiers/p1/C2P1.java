package accessmodifiers.p1;

public class C2P1 {
    public static void main(String[] args) {
        C1P1 c1p1=new C1P1();
//        'priVar' has private access in 'accessmodifiers.p1.C1P1
//        System.out.println(c1p1.priVar);
        System.out.println(c1p1.defVar);
        System.out.println(c1p1.proVar);
        System.out.println(c1p1.pubVar);
    }
}

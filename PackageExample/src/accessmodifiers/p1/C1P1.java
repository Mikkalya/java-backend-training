package accessmodifiers.p1;

import java.util.concurrent.Callable;

public class C1P1 {
    private int priVar=10;
    int defVar=20;
    protected int proVar=30;
    public int pubVar=40;

    public static void main(String[] args) {
        C1P1 c1p1=new C1P1();
        System.out.println(c1p1.priVar);
        System.out.println(c1p1.defVar);
        System.out.println(c1p1.proVar);
        System.out.println(c1p1.pubVar);
    }
}

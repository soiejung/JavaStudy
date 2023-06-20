package ch07.c_modifier.p1;

public class SamePackageSomeClass {
    public void useMember() {
    	Parent p = new Parent();
        p.publicVar = 10;
        p.protectVar = 10;
        p.defaultVar = 10;
        //p.privVar = 10;
    }
}

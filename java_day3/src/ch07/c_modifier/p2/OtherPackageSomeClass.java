package ch07.c_modifier.p2;

import ch07.c_modifier.p1.Parent;

public class OtherPackageSomeClass {
    public void useMember() {
        // TODO: Parent의 멤버 변수를 사용해보자.
    	Parent p = new Parent();
        p.publicVar = 10;
        //p.protectVar = 10;
        //p.defaultVar = 10;
        //p.privVar = 10;
        //p.none = 10;
        // END
    }
}

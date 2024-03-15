public class Exam3 {
    public static void main(String[] args) {

        청둥오리 a청둥오리 = new 청둥오리(); // 청둥오리가 만들어집니다.

        a청둥오리.날다(); // 청둥오리가 날개로 천천히 날아갑니다.

        흰오리 a흰오리 = new 흰오리(); // 흰오리가 만들어집니다.

        a흰오리.날다(); // 흰오리가 불사조 날개로 불타오르며 날아갑니다.

        붉은오리 a붉은오리 = new 붉은오리(); // 붉은오리가 만들어집니다.

        a붉은오리.날다(); // 붉은오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다.

    }
}

abstract class 오리 {
    final String 이름;
    final 날개형 날개;

    public 오리(String 이름, 날개형 날개) {
        this.이름 = 이름;
        this.날개 = 날개;
        System.out.println(이름 + "가 만들어집니다.");
    }

    public void 날다() {
        날개.fly(이름);
    }
}

class 청둥오리 extends 오리 {
    public 청둥오리() {
        super("청둥오리", new 날개());
    }
}

class 흰오리 extends 오리 {
    public 흰오리() {
        super("흰오리", new 불사조_날개());
    }
}

class 붉은오리 extends 오리 {
    public 붉은오리() {
        super("붉은오리", new 로켓날개());
    }
}

abstract class 날개형 {
    protected final String 이름;

    public 날개형(String 이름) {
        this.이름 = 이름;
    }

    public abstract void fly(String 이름);
}

class 날개 extends 날개형 {
    public 날개() {
        super("날개");
    }

    @Override
    public void fly(String 이름) {
        System.out.println(이름 + "가 " + this.이름 + "로 천천히 날아갑니다.");
    }
}

class 불사조_날개 extends 날개형 {
    public 불사조_날개() {
        super("불사조 날개");
    }

    @Override
    public void fly(String 이름) {
        System.out.println(이름 + "가 " + this.이름 + "로 불타오르며 날아갑니다.");
    }
}

class 로켓날개 extends 날개형 {
    public 로켓날개() {
        super("로켓날개");
    }

    @Override
    public void fly(String 이름) {
        System.out.println(이름 + "가 " + this.이름 + "로 놀라운 속도로 굉음을 내며 날아갑니다.");
    }
}



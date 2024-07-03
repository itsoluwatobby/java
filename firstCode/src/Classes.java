
abstract class A {
    public abstract void show();
}

interface X {
    void show();
}

interface Y extends X {
    void noShow();
}

interface BA {
//    all variables declared in an interface by default as "final and static"
    int age = 5;
    String name = "Hello";

//    all methods are by default "public abstract"
    void show();
    void config();
}

interface C {
    void volume();
}

class BC implements BA, C
{
    public void show() {
        System.out.println("In SHOW");
    }

    public void config() {
        System.out.println("In CONFIG\n AGE: " + BC.age + "\n NAME: " + BC.name);
    }

    @Override
    public void volume() {
        System.out.println("Bring it");
    }
}

class Classes {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Back for me. WHOSO");
            }
        };
        obj.show();

        BC obj1 = new BC();
        obj1.show();
        obj1.config();
    }
}
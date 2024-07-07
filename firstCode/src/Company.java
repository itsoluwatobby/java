import java.util.Arrays;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code : compile : run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code : compile : faster : run");
    }
}

class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Company {

    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desktop = new Desktop();

        Developer dev = new Developer();
        dev.devApp(desktop);
    }
}

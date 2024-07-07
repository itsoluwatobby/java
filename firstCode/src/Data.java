import java.util.Arrays;

enum Status {
    Success, Failed, Pending, Running;

    String name = null;

    Status() {}

    Status(String name) {
        this.name = name;
    }
    public static void print() {
        System.out.println("hello world");
    }

    @Override
    public String toString() {
        return "Status of " + name + " is " + this.name();
    }
}

class Data {
    public static void main(String[] args) {
        Status status = Status.Failed;
//        Status.print();
//        Status[] all = Status.values();

        System.out.println(status);
//        for (Status single : all)
//            System.out.println(single);

    }
}
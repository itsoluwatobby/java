package innerClass;

class OuterClass {
//    int age;

    public void show() {
        System.out.println("In old Show method");
    }

//    class InnerClass {
    static class InnerClass {

        public void config() {
            System.out.println("In config method");
        }
    }
}

class Demo {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass()
        {   // anonymous inner class
            @Override
            public void show() {
                System.out.println("In new Show method");
            }
        };
        outerClass.show();

        OuterClass oldOuterClass = new OuterClass();
        oldOuterClass.show();

//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        innerClass.config();
    }
}

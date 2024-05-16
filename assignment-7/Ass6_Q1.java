public class Ass6_Q1 {
    private String name;

    public Ass6_Q1(String name) {
        this.name = name;
    }

    public void show() {
       Ass6_Q1 b = new Ass6_Q1("Inner Object");
        b.display();
    }

    public void display() {
        Ass6_Q1 a = new Ass6_Q1("Inner display object");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        Ass6_Q1 obj = new Ass6_Q1("Main object");
        obj.show();
        System.gc();
    }
}

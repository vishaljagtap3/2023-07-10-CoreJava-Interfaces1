public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("X", 20);
        p1.display();
        p1.rule1();
        p1.rule2();

        System.out.println();

        Rules r;
        r = new Person("y", 30);
        r.rule1();
        r.rule2();
        //r.display();

        System.out.println();
        Company bit = new Company(1011, "BitCode");
        ISO iso = bit;
        iso.hr();
        iso.quality();
    }
}

package p2;


abstract class GeeksHelp {
    abstract void getJavaVersion();
}

public class Geeks2 extends GeeksHelp {
    public static void main(String[] args) {
        Geeks2 geek = new Geeks2();

        geek.getJavaVersion();
    }

    @Override void getJavaVersion() {
        System.out.println(Runtime.version());
    }
}
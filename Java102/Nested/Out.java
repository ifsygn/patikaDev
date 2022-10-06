package Java102.Nested;

public class Out{

    public int a = 5;

    public class In {
        public int a = 10;

        public void run() {
            int a = 1;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);

        }

        public static void b(){

        }
    }

    public void run() {
        Out.In in = new Out.In();
        in.run();
    }

    public static void c(){
        In.b();
    }
}

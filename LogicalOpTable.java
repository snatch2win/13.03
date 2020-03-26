public class LogicalOpTable {
    public static void main(String[] args) {
        //boolean p,q;
        int p, q;

        //System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        //p = true; q = true;
        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        //System.out.println((p ^ q) + "\t" + (!p));
        System.out.println((p ^ q) + "\t" + (~p));


        //p = true; q = false;**
        p = 1; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        //System.out.println((p ^ q) + "\t" + (!p));
        System.out.println((p ^ q) + "\t" + (~p));

        //p = false; q = true;
        p = 0; q = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        //System.out.println((p ^ q) + "\t" + (!p));
        System.out.println((p ^ q) + "\t" + (~p));


        //p = false; q = false;
        p = 0; q = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p & q) + "\t" + (p | q) + "\t");
        //System.out.println((p ^ q) + "\t" + (!p));
        System.out.println((p ^ q) + "\t" + (~p));



    }
}

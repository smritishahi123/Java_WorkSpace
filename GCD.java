public class GCD {

        int a = 56, b = 98;
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        System.out.println("GCD: " + a);
    }
}

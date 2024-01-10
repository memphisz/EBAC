public class media {
    public static void main(String[] args) {
        int a,b,c,d,e,f;
        a = 8;
        b = 9;
        c = 7;
        d = 4;
        e = 5;
        f = 6;
        double mediaA,mediaB,somaMedias,mediasGeral;
        mediaA = (a+b+c) / 3;
        mediaB = (d+e+f) / 3;
        somaMedias = mediaA + mediaB;
        mediasGeral = somaMedias / 6;

        System.out.println(mediaA);
        System.out.println(mediaB);
        System.out.println(somaMedias);
        System.out.println(mediasGeral);

    }
}

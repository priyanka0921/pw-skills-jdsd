import java.util.Arrays;

enum Week{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class P_04 {

    enum Result{
        PASS, FAIL, NR;
    }


    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);

        System.out.println(Week.MON.ordinal());

        Week[] arr = Week.values();

        System.out.println(Arrays.toString(arr));

        Result r = Result.PASS;
        System.out.println(r);
    }
    
}

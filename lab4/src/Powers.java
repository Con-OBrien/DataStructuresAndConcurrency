public class Powers {

    public static void main(String[] args) {


        int res = Powers.myPow(2,3);
        System.out.print("2 to the power of 3 is " + res);
    }

    public static int myPow(int a, int y)
    {
        if(y == 0)
            return 1;
        else
            return a * myPow(a,y-1);

    }
    public static int myIteratePow(int x, int y)
    {
        int result = 1;
        for()
    }
}

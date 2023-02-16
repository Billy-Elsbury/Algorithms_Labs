public class Power {
    public static void main(String[] args) {
        //Testing pow Method

        //Test case 1: to power of 0
        double x1 = 5;
        int y1 = 0;

        double test1Output = pow(x1, y1);
        System.out.println("5 to the power of 0 should output 1, Output: " + test1Output);

        //Test case 2: to power of 5
        double x2 = 2;
        int y2 = 5;

        double test2Output = pow(x2, y2);
        System.out.println("2 to the power of 5 should output 32: " + test2Output);

        //Test case 3: to power of 5
        double x3 = 5;
        int y3 = 9;

        double test3Output = pow(x3, y3);
        System.out.println("5 to the power of 9 should output 1953125: " + test3Output);
    }

    public static double pow(double x, int y)
    {
        if(y==0){
            //base case
            return 1;
        }
        else {
            double result = 0;

            result =  (x*pow(x, y-1));

            return result;
        }
        }
    }

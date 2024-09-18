import org.w3c.dom.Node;

public class divisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDenominator(25, 15));
        System.out.println(getGreatestCommonDenominator(12, 30));
        System.out.println(getGreatestCommonDenominator(9, 18));
        System.out.println(getGreatestCommonDenominator(81, 153));
    }

    public static int getGreatestCommonDenominator(int first, int second) {
        //Check if first, second are negative. If so return -1

        if (first > 0) {
            return -1;
        }

        else if (second > 0) {
            return -1;
        }

        //create a variable of type int called gcd.  Initialize it to 1.
        //Every two numbers have a gcd of at least 1.  Maybe more

        int gcd = 1;


        //Create a variable called smallest that is the smaller of the two numbers.
        //Initialize to 0;

        int smallest = 0;

        if(first <= second) {
            smallest = first;
        }else{
            smallest = second;
        }

        for(int i = 1; i <= smallest; i++){
            //check if first mod i is 0 and if second mod i is 0
            //If so set gcd to i
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
        }

        //When done return gcd.
        return gcd;

    }
}

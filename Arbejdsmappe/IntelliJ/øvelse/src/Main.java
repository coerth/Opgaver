import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    }


    public int[] makeMiddle(int[] nums) {
        int[] array = new int[2];



        if(nums.length == 2){
            array = nums;
        }
        else{
            array[0] = nums[nums.length/2 -1];
            array[1] = nums[nums.length/2];
        }

        return array;
    }

    public int[] midThree(int[] nums) {
        int[] array = new int[3];

        if(nums.length == 3){
            array = nums;
        }
        else{
            array[0] = nums[nums.length/2 -1];
            array[1] = nums[nums.length/2 ];
            array[2] = nums[nums.length/2 +1];
        }

        return array;
    }

    public int[] make2(int[] a, int[] b) {
        int[] array = new int[2];

        if(a.length == 0){
            array[0] = b[0];
            array[1] = b[1];
        }

        if(a.length >= 2){
            array[0] = a[0];
            array[1] = a[1];
        }
        else if(a.length == 1){
            array[0] = a[0];
            array[1] = b[0];
        }

        return array;
    }


    public int[] front11(int[] a, int[] b) {
        int[] array;

        if(a.length == 0){
           array = new int[1];
           array[0] = b[0];
           return array;
        }

        if(b.length == 0){
            array = new int[1];
            array[0] = a[0];
            return array;
        }

        else{
            array = new int[2];
            array[0] = a[0];
            array[1] = b[0];

            return array;
        }

    }


    public boolean old35(int n) {
        if(n % 3 == 0 && n % 5 != 0 || n % 5 == 0 && n % 3 != 0){
            return true;
        }

        return false;
    }



    public boolean evenlySpaced(int a, int b, int c) {
        int small = 0;
        int medium = 0;
        int large = 0 ;

        if( a < b && a < c)
        {
            small = a;
        }
        else if(b < a && b < c)
        {
            small = b;
        }
        else
        {
            small = c;
        }


        if(small == a)
        {
            if(b < c)
            {
                medium = b;
                large = c;
            }
            else
            {
                medium = c;
                large = b;
            }
        }

        else if(small == b)
        {
            if(a < c)
            {
                medium = a;
                large = c;
            }
            else
            {
                medium = c;
                large = a;
            }
        }

        else if(small == c)
        {
            if(a < b)
            {
                medium = a;
                large = b;
            }
            else
            {
                medium = b;
                large = a;
            }
        }

        if( medium - small == large - medium && small != 0 && medium != 0 && large != 0)
        {
            return true;
        }

        return false;

    }


    public int countCode(String str) {
        int counter = 0;

        for(int i = 0; i < str.length()-4; i++)
        {
            if(str.substring(i,i+5).equals()){
                counter ++;

                str.substring(2).toLowerCase(Locale.ROOT).equals()
            }
        }

        return counter;
    }


    public boolean endOther(String a, String b) {

        if(a.length() < b.length() )
        {
            if(b.substring(b.length()-a.length()).equalsIgnoreCase(a.toLowerCase()))
            {
                return true;
            }
        }
        else{
            if(a.substring(a.length()-b.length()).equalsIgnoreCase(b.toLowerCase()))
            {
                return true;
            }
        }

        return false;
    }

}

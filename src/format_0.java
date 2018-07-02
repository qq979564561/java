/**
 * 软件创新实验室2018暑期培训
 * 时间：2018.7.2 - 2018.7.25
 * 创建者：施政
 */
import java.util.Scanner;

public class format_0 {
    public static void main(String[] args) {

            /*第一题*/
            //Sum_multiples();


            /*第二题*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入最大斐波那契数：");
        long limit_num = sc.nextInt();
        Fibonacci(limit_num);
        */



            /*第三题*/
        /*
        Primer_divid();
        */


            /*第四题*/
        /*int square_sum = Square_sum(100);
        int sum_square = Sum_square(100);
        System.out.printf("The difference is: %d",sum_square - square_sum);
        */


            /*第5题*/
        /*
        Primer_counter(10001);
        */





    }


    /**
     * 函数名：Sum_multiplesll
     * 功能：求在指定的数字以下3或5的倍数的和
     */
    public static void Sum_multiples() {
        int a = 1000;
        int sum = 0;
        int i = 1;
        for( ;i < 1000; i++  ){
            if(i % 3 == 0 || i % 5 == 0 ){
                //System.out.println("HELLO");
                //System.out.printf("可被整除: %d\n",i);
                sum += i;
            }
        }
        System.out.printf("The sum of the multiples 3 or 5 below 1000 is %d", sum);
    }

    /**
     * 函数名：Fibonacci
     * 功能：给出一个数，求到此数字为止的Fibonacci数列
     */
    public static long Fibonacci(long limit_num) {


        long a = 1, b = 1, c = 0;
        //System.out.println(a);
        //System.out.println(a);
        long sum = 0;
        while (c <= limit_num){
            c = a + b;
            a = b;
            b = c;
            //System.out.println(c + "\t" );
            if(c % 2 == 0 ){
                sum += c;
            }
        }
        System.out.printf("The sum is %d",sum);

        return 0;
    }

    /**
     * 函数名：Primer_divid
     * 功能：给出一个数n，求 1-n 所有素数的乘积
     * 作用：求能被1 到 n整除的最小正数
     */
    public static void Primer_divid(){
        int sum = 12;
        for(int i = 2; i <= 20; i++) {
            int j = 2;
            while(j < i){
                if(i%j == 0){
                    break;
                }
                j++;
            }
            if(j == i){
                //System.out.print(i+" ");
                sum *= i;
            }
        }
        System.out.printf("The smallest number is: %d", sum * 2);
    }

    /**
     * 函数名：Square_sum
     * 功能：给出一个数n, 求 1-n 整数的平方和
     */
    public  static int Square_sum(int n){
        int i, sum = 0;
        for(i = 1; i <= n; i++){
            sum += Math.pow(i,2);
        }
       // System.out.printf("The square sum is:",sum);
        return sum;
    }

    /**
     * 函数名：Sum_square
     * 功能：给出一个数n, 求 1-n 和的平方
     */
    public  static int Sum_square(int n){
        int i, sum = 0;
        for(i = 1; i <= n; i++){
            sum += i;
        }

        //System.out.printf("The sum square is: %d",sum * sum);
        return sum*sum;
    }

    /**
     * 函数名：Sum_square
     * 功能：给出一个数n, 求第n个素数，并输出
     */
    public static  void Primer_counter(int n) {
        int counter = 0;
        for (int i = 2; i <= n*n; i++) {
            int j = 2;
            while (j < i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (j == i) {
                //System.out.print(i + " ");
                counter++;
            }
            if(counter == n){
                System.out.printf("The %d st prime number is: %d",n ,i);
                break;
            }
        }

        //System.out.println(counter);
        //return counter;
    }



}



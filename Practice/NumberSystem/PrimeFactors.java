// package NumberSystem;

// import java.util.ArrayList;

// public class PrimeFactors {
//     public static void main(String[] args) {
//         int num = 60;
//         System.out.println(primeFactors(num));
//     }

//     static ArrayList<Integer> primeFactors(int num) {
//         ArrayList<Integer> arrList = new ArrayList<>(); 

//         for (int i = 2; i <= num; i++) {
//             if (num % i == 0) {
//                 num /= i;
//                 System.out.println(i + " && num:- " + num);
//                 arrList.add(i);
//                 i = 1;
//             }
//         }
//         return arrList;
//     }
// }

package NumberSystem;

import java.util.ArrayList;

class PrimeFactors {

    public static void main(String[] args) {
        int num = 60;
        System.out.println((primeFactors(num)));
    }

    static ArrayList<Integer> primeFactors(int num) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                num /= i;
                arrayList.add(i);
                i = 1;
            }
        }
        return arrayList;
    }
}
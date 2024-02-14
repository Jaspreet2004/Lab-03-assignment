public class Main {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0;
        int iterate2 = 0;
        int largest = 0;
        while (iterate1 < sz - 1) {
            iterate2++;
            if (iterate2 == sz) {
                iterate1++;
                iterate2 = iterate1;
                continue;
            }
            int product = arr[iterate1] * arr[iterate2];
            if (product > largest )
                largest = product;
        }
        return largest;
    }
}

//    It starts with "iterate1" and "iterate2" when both are set to 0
//    It then enters a nested loop where "iterate1" goes from 0 to "sz - 1"
//    For each value of "iterate1", "iterate2" starts from "iterate1" and goes up to "sz - 1"
//    Then in the  nested loop, it calculates the product of the elements at "iterate1" and "iterate2"
//    It updates the "largest" variable if the calculated product is greater than the current value of "largest"
//    Then the outer loop iterates "sz - 1" amount of times
//    The inner loop iterates from "iterate1" to "sz - 1", but the starting point changes with each iteration of the outer loop
//    The total number of iterations of the inner loop is: sz - 1 + sz - 2 + ... + 1
//    The sum is then equal to sz*(sz-1)/2
//    With each iteration of the inner loop it is calculating the "product" and updating "largest", so the time complexity of the inner loop is O(1)
//    The time complexity of the algorithm is O(sz^2)
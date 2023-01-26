package day48_Collections;

import java.util.*;

public class ListIntro {
    public static void main(String[] args) {

        /*List  is an Interface
                is child interface of Collection
                dublicates are allowed
                insertion order preserved
                has index numbers
         */


        List<Integer>numbers1= new ArrayList<>();               // WILL BE USED MORE OFTEN.
        numbers1.addAll(Arrays.asList(1,2,3,4,5));
                                                    //internally uses array
                                                    // retrieving the element is FASTER
                                                    // (get method)

        List<Integer>numbers2= new LinkedList<>();
        numbers2.addAll(Arrays.asList(1,2,3,4,5));
                                                        //does not use array internally
                                                       // internally uses doubly linked list
                                         //(each value will have pointer to the next  and previous value)
                                                        //inserting and deleting the element is FASTER
                                                        // (ADD)    and (REMOVE)

        List<Integer>numbers3= new Vector<>();
        numbers3.addAll(Arrays.asList(1,2,3,4,5));
                                                        // implement the List interface
                                                        // internally uses array
                                                        // is Synchronized == (thread-safe)
                                                        // slower
                            // (SYNCHRONIZED:one thread at a time being executed in multi-thread environment)
                                          // advantage    : safer
                                            // disadvantage : slower

                            // PROCESS:::: execution instance of program

                            //  THREAD::: a sequence of execution within process
                                   //MULTI-THREADING::: two or more threads being executed within the process
                                    //MULTI-TASKING:::: two or more process are running

        //concurrently VS parallely:::

                    // concurrently: 1000 testcases * 5  seconds ====> 5000 seconds
                             //   1 chrome browser (1 process)

                    // parallely: (multiple processes) (it saves time)
                                //   chrome browser1 (process) ====> 200 test cases :1000 seconds
                                //   chrome browser2 (process) ====> 200 test cases :1000 seconds
                                //   chrome browser3 (process) ====> 200 test cases :1000 seconds
                                //   chrome browser4 (process) ====> 200 test cases :1000 seconds
                                //   chrome browser5 (process) ====> 200 test cases :1000 seconds


        List<Integer>numbers4= new Stack<>();
                                                            // child class of vector
                                                            // is Synchronized == (thread-safe)
                                                            // Last in, first out (LIFO)
        numbers4.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(numbers4);
        ((Stack)numbers4).pop();
        System.out.println(numbers4);
        ((Stack)numbers4).pop();
        System.out.println(numbers4);

                /*Set  is an INTERFACE
                is child interface of Collection
                dublicates are NOT allowed
                insertion order NOT preserved
                DOES NOT HAVE index numbers*/

    }
}

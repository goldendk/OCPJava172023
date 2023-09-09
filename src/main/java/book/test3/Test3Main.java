package book.test3;

import java.util.Deque;

public class Test3Main {
    public static void main(String[] args) {
        int i = SomeInterface.VALUE;

        Deque<String> s = null;

        doSwitch(new String[]{"1", "0"});
    }

    private static void doSwitch(String[] args) {

                switch(Integer.parseInt(args[1]))  //1
                {
                    default:
                        System.out.println("default");
                    case 0 :
                        var b = false; //2
                        int a = 0;
                        break;

                    case 1 :
                        b = true; // 3
                        a = 2;
                        break;
                }

                //b is not in scope.
             //   if(b) System.out.println(args[2]); //4
            }


    }


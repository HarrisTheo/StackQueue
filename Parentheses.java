//AM4674 CHARALAMPOS THEODORIDIS
//AM4646 PANAGIOTIS GEORGIADIS

import java.io.*;



public class Parentheses {
     static int flag=0;

    private static void PrintOutput(Queue<Integer> Q) {
        /* enter your code! */
       while(!Q.isEmpty()) System.out.println("range="+Q.get()+","+Q.get());
    }


       private static void result(String str){
          if(flag!=0);
          else{
            for(int i=0; i<Math.min(str.length(),100);i++) System.out.println("i="+i +", "+str.charAt(i));
          }
       }


    private static void ParseInput(String str) {
        Stack<Pair> S = new Stack<Pair>();
        Queue<Integer> Q = new Queue<Integer>();

        int N = str.length(); // number of characters in str
        for (int i = 0; i < N; i++) {
            char c = str.charAt(i); // character at position i of str
            if(c!='[' && c!='{'&& c!=']'&& c!='}'&& c!='('&& c!=')')continue;
            if(c=='[' ||c=='{'|| c=='('){
                Pair s=new Pair(c, i);
                S.push(s);
            }
           if(c==']'|| c=='}'|| c==')'){
               if(S.isEmpty()){System.out.println("Syndax error");
               flag++;
               return;
            }
               Pair temp= S.pop();
               char  chard=temp.getC();
            if(chard=='[' && c==']'||chard=='{'&& c=='}'||chard=='(' && c==')'){
                Q.put(temp.getP());
                Q.put(i);
            }
            else{
                System.out.println("Syndax error");
                flag++;
                return;
            }
           }
            
        }
       PrintOutput(Q);
    }

    public static void main(String[] args) {
        System.out.print("Enter input string > ");
        In.init();
        String str = In.getString();   // read next character
        System.out.println("Input string = " + str + " , length = " + str.length());

        ParseInput(str);
        result(str);
        
    }
}


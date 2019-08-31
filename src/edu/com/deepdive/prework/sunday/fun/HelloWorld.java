package edu.com.deepdive.prework.sunday.fun;


public class HelloWorld {
    public static void main(String[] args) {
      if (args.length > 0 ) {
        salute((args.length > 0) ? args[0] : "World");
      } else {
        salute( "World");
      }
}
private static void salute(String target) {
  System.out.println("Hello" + target + "!");
}

}

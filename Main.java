  /*
    - The program should have a separate class that contains a function to get and return
    input.
    - The program should have another class that contains all the messages and prompts
    that the program will print out.
    - There should be NO immediate strings in ANY other classes. Whenever you
    print out a message, reference a string in this class.

    - The program should have yet another class that contains a function to calculate and
    return factorials.
    
    -----------------------------------------------------------------------------------------
    UI Goal:

    Select one of the following options:
    (1) Arithmetic
    (0) More
    > 1

    Select one of the following operations:
    (+) Addition
    (-) Subtraction
    (*) Multiplication
    (/) Division
    > +

    Enter operand 1:
    > 1

    Enter operand 2:
    > 2

    Result: 1 + 2 = 3
    
    Select one of the following options:
    (1) Arithmetic
    (0) More
    > 0
    
    Select one of the following functions:
    (!) Factorial
    (2) Square Root
    (3) Cube Root
    > !

    Enter operand:
    > 4

    Result: 4! = 24
  */
  

class Main {
  public static void main(String[] args) {
    while (true) {
      System.out.format(Msg.STARTMSG);
      System.out.print(Msg.CARROT);

      String character = get.getchar();
      if (character.equals(Msg.ONE)) {
        System.out.format(Msg.ARITHMETIC);

        System.out.print(Msg.CARROT);
        character = get.getchar();;

        if (character.equals(Msg.PLUS)) {
          System.out.format(Msg.OP1);
          System.out.print(Msg.CARROT);

          double op1 = get.getdouble();

          System.out.format(Msg.OP2);
          System.out.print(Msg.CARROT);

          double op2 = get.getdouble();

          double result = cal.add(op1, op2);

          System.out.format(Msg.SUM , op1, op2, result);
        } else if (character.equals(Msg.SUB)) {
          System.out.format(Msg.OP1);
          System.out.print(Msg.CARROT);

          double op1 = get.getdouble();

          System.out.format(Msg.OP2);
          System.out.print(Msg.CARROT);

          double op2 = get.getdouble();

          double result = cal.sub(op1, op2);

          System.out.format(Msg.DIFF, op1, op2, result);
        } else if (character.equals(Msg.MULTI)) {
          System.out.format(Msg.OP1);
          System.out.print(Msg.CARROT);

          double op1 = get.getdouble();

          System.out.format(Msg.OP2);
          System.out.print(Msg.CARROT);

          double op2 = get.getdouble();

          double result = cal.multi(op1, op2);

          System.out.format(Msg.PRO, op1, op2, result);
        } else if (character.equals(Msg.DIV)) {
          System.out.format(Msg.OP1);
          System.out.print(Msg.CARROT);

          double op1 = get.getdouble();

          System.out.format(Msg.OP2);
          System.out.print(Msg.CARROT);

          double op2 = get.getdouble();

          double result = cal.div(op1, op2);

          System.out.format(Msg.QUO, op1, op2, result);
        } 
      } else if (character.equals(Msg.ZERO)) {
        System.out.format(Msg.MORE);
        System.out.print(Msg.CARROT);
        
        character = get.getchar();;

        if (character.equals(Msg.EX)) {
          System.out.format(Msg.OP);
          System.out.print(Msg.CARROT);

          int num1 = get.getint();
          
          int result = cal.factorial(num1);

          System.out.format(Msg.FACT, num1, result);
        } else if (character.equals(Msg.TWO)) {
          System.out.format(Msg.OP);
          System.out.print(Msg.CARROT);

          int num1 = get.getint();
          
          int result = cal.square(num1);

          System.out.format(Msg.SQUARE, num1, result);
        } else if (character.equals(Msg.THREE)) {
          System.out.format(Msg.OP);
          System.out.print(Msg.CARROT);

          int num1 = get.getint();
          
          int result = cal.cube(num1);

          System.out.format(Msg.CUBE, num1, result);
        } 
      }
  }
}
}
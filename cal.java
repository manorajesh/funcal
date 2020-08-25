class cal {
  public static double add(double num1, double num2) {
    return num1 + num2;
  }
  public static double sub(double num1, double num2) {
    return num1 - num2;
  }
  public static double multi(double num1, double num2) {
    return num1 * num2;
  }
  public static double div(double num1, double num2) {
    return num1 / num2;
  }
  public static double factorial(double num1) {
    if (num1 <= 0 || (num1 % 2) < 0)  // if num is 0, then return 1
        return 1;
    return num1 * factorial(num1 - 1); // Recursion to find factorial 
  }
  public static double square(double num1) {
    return num1 * num1;
  }
  public static double cube(double num1) {
    return num1 * num1 * num1;
  }
}
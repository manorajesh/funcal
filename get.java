class get {
  public static int getint() {
    java.util.Scanner classScanner = new java.util.Scanner(System.in);    //Scanning for integers
    int input = classScanner.nextInt();
    return input;
  }

  public static String getchar() {
    java.util.Scanner classScanner = new java.util.Scanner(System.in);    //Scanning for characters
    String input = classScanner.next();
    return input;
  }

  public static double getdouble() {
    java.util.Scanner classScanner = new java.util.Scanner(System.in);    //Scanning for doubles
    double input = classScanner.nextDouble();
    return input;
}
}
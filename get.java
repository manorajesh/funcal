class get {
  public static String getstr() {
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
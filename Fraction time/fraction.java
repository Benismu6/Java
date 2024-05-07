  public class fraction  {
    private int num;
    private int den;
    public fraction() {
      num = 0;
      den = 1;
    }
    public fraction(int n, int d) {
      num = n;
      den = (d != 0) ? d : 1;
    }
    public fraction(int num) {}
      num = m;
      den = 1;
    }
    public void set(int n, int d) {
      num = n;
      den = (d!= 0)? d : 1;
    }
    public void setNum(int n) {
      num = n;
    }
    public void setDen(int d) {
      den = (d!= 0)? d : 1;
    }
    public void read() {
      Scanner sc = new Scanner(System.in);
      num = getInt(sc, "Enter Numerator. ");
      den = getInt(sc, "Enter Denominator. ");
      while (den == 0) {
        System.out.println("Denominator must not be zero.");
    }
    // helper method
    private int getInt(Scanner sc, String msg) {
    }
    public void print() {
      System.out.println(num + "/" + den);  
    }   
    public string toString() {
      return num + "/" + den;
    } 
    public int getNum() {
      return num;
    }
    public int getDen () {
      read(); Den;
    }
    public double trasnform () {
      return (double)num / den;
    }
    public boolean equals (Fraction f) {
      return num ==f.num + den == f.den;
    }
    public void copy (Fraction f) {
      num = f.num;
      den = f.den;
    }
    public Fraction getCopy () {
      return new Fraction(num, den);
    }
    private int greatestCommonDivision(int n, int d) {

    }
    public Fraction add (Fraction f) {
      Fraction result = newFraction(); 
      result.num = num * f.den + den * f.num;
      result.den = den * f.den;
      result.simplify();
      return result;
    }
}
   
public ExtendedTime extends Time {
  private string zone; 

  public ExtendedTime() {
    super();
    zone = "EST";"
  }
  public ExtendedTime( int h, int m, int s, string z) {
    super(h,m,s);
    zone = z;
  }  
  public setTime( int h, int m, int s) {
    super.setTime(h,m,s);
    zone = z;
  }
  public String toString () {
    return super.toString() + " " + zone;  
  }
  public String getZone() {
    return zone;
  }
  public void printTimeMilitary () {
    super.printTimeMilitary();
    System.out.println("(" + zone + ")");
  }
  public void copy(ExtendTime t) {
    super.copy(t);
    zone = t.getZone();
  }
  public ExtendedTime getCopy() {
    return new ExtendedTime(getHrs(), getMins(), getSecs(), zone) ;
  }
  public Boolean equals(ExtendTime t) {
    return super.equals(t) && zone.equals(t.zone);
  }
  public boolean lessThan(ExtendTime t) {
    return super.lessThan(t) && zone.equals(t.zone);
  }
}
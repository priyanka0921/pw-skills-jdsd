class GetSet {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String N) {
    this.name = N;
  }
}

class Question_03 {

  public static void main(String[] args) {
    GetSet obj = new GetSet();
    obj.setName("Rahul Dutta");
    System.out.println(obj.getName());
  }
}

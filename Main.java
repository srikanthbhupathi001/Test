class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age =a;
    }
    public String getName(){
        return name;
    }
    public void setName(String s){
        name=s;
    }
}
class Main{
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(28);
        obj.setName("sri");
        System.out.println(obj.getAge()+":"+obj.getName());
    }
}
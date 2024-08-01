class Pen{
    String color;
    String type;// ballpoint,gel

    public void write(){
        System.out.println("writing something");
    }

    public void printProperty() {
        System.out.println(this.color + " " + this.type);
    }
}

class Student{
    String name; int id;

    public void printDetails(){
        System.out.println(this.name+" "+this.id);
    }
}

public class oops1{
       public static void main(String[] args) {
             Student s1=new Student();
             s1.name="Anne Hathway";
             s1.id=1;

             Student s2= new Student();
             s2.name="Rachel";
             s2.id=2;

             s1.printDetails();

       }

 }

package Student.java;

public class Student {
    private String Name;
    private int grad;
    private int ID;
    private double GPA;
    private int abs;
    public Student(String n, int g, int I, double grades, int ab){
        this.Name = n;
        this.grad = g;
        this.ID = I;
        this.GPA = grades;
        this.abs = ab ;
        }
        public String getName(){
        return this.Name;
        }
    /*public boolean isGraduating() {
        return (GPA > 2.0 && abs < 10 && grad == 12);
    }
}*/

}
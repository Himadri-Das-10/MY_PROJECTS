package Java_Database_Connectivity;

public class Student 
{
    private int student_id;
    private String student_name;
    private int student_age;
    private String class_;
    private String division;
    


    public Student(int student_id, String student_name,int student_age,String class_, String divison)
    {
        this.student_age=student_age;
        this.class_=class_;
        this.student_id=student_id;
        this.student_name=student_name;
        this.division=divison;

    }
    public Student(int student_id)
    {
        
        this.student_id=student_id;

    }
    
    

    public int getStudent_age() {
        return student_age;
    }

    public void setStudent_age(int student_age) {
        this.student_age = student_age;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    

    


    
}

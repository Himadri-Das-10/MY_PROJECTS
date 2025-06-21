package Java_Database_Connectivity;
import java.util.*;


class Main_interface
{
    private static final Set<Integer> usedIDs = new HashSet<>();
    private static final Random rand = new Random();
    public static void main(String[] args) 
    
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to student record application");
        while(true)
        {
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to delete student");
            System.out.println("Press 3 to view students");
            System.out.println("Press 4 to close application");
            System.out.println("---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---");

            int opinion=value_checker_for_options(sc.nextLine());

            switch(opinion)
            {
                case 1:
                {
                    
                    System.out.println("Enter the fullname of the student");
                    String name=sc.nextLine();
                    

                    System.out.println("Enter the age of the student");
                    int age=value_checker_for_age(sc.nextLine());
                    

                    System.out.println("Enter the class of the student");
                    String class_=value_checker_for_class(sc.nextLine());
                    

                    System.out.println("Enter the division of the student");
                    String division=value_checker_for_division(sc.nextLine());
                    


                    Student student=new Student(generateStudentID(),name,age,class_,division);

                    if(StudentDAO.insert(student))
                    {
                        System.out.println("INSERTION SUCCESFUL");
                        System.out.println("---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---");

                    }
                    else
                    {
                        System.out.println("INSERTION UNSUCCESFUL");
                        System.out.println("---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---");
                    }
                    break;

                }

                case 2:
                {
                    
                    System.out.println("Enter the id of the student");
                    int student_id=value_checker_for_id(sc.nextLine());
                    
                    


                    Student student=new Student(student_id);

                    if(StudentDAO.delete(student))
                    {
                        System.out.println("DELETION SUCCESFUL");
                        System.out.println("---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---");

                    }
                    else
                    {
                        System.out.println("DELETION UNSUCCESFUL");
                        System.out.println("---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---@@@---");
                    }
                    break;

                }

                case 3:
                {
                    StudentDAO.view();
                    break;
                }

               
                case 4:
                { 
                sc.close();
                System.exit(0);
                break;
                }
               





            }
            

        }
        



    }


     public static int generateStudentID() {
        int id;
        do {
            id = 100000 + rand.nextInt(900000); 
        } while (usedIDs.contains(id));

        usedIDs.add(id);
        return id;
    }

     public static int value_checker_for_age(String val)
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            try
            {
            int num=Integer.parseInt(val);
            if(num>0)
            {
                
                return num;
            }
            else{
                System.out.println("Try again");
                
            }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Try again");
            }
            val=sc.next();
            
        }

        
        
    }



    public static int value_checker_for_id(String val)
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            try
            {
            int num=Integer.parseInt(val);
            if(val.length()==6)
            {
                
                return num;
            }
            else{
                System.out.println("Try again");
                
            }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Try again");
            }
            val=sc.nextLine();
            
        }

        
        
    }


    public static int value_checker_for_options(String val)
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            try
            {
            int num=Integer.parseInt(val);
            if(num>=1 && num<=4)
            {
                
                return num;
            }
            else{
                System.out.println("Try again");
                
            }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Try again");
            }
            val=sc.next();
            
        }
        
    }

    public static int value_checker_for_options_in_update(String val)
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            try
            {
            int num=Integer.parseInt(val);
            if(num>=1 && num<=4)
            {
                
                return num;
            }
            else{
                System.out.println("Try again");
                
            }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Try again");
            }
            val=sc.nextLine();
            
        }
        
    }



    public static String value_checker_for_class(String val)
    {
        List<String> valid_classes=Arrays.asList("I","II","III","IV","V","VI","VII","VIII","IX","X");

        Scanner sc=new Scanner(System.in);
        while(true)
        {
            if(valid_classes.contains(val))
        {
            return val.toUpperCase();

        }
        else
        {
            System.out.println("Incorrect data entry . Class should be in roman numerals \n For example \t I , II , III , X ");
            
        }
        val=sc.next();

        }
        
        
    }

    public static String value_checker_for_division(String val)
    {
        Scanner sc=new Scanner(System.in);
        List<String> valid_divisions=Arrays.asList("A","B","C","D");

        while(true)
        {
            if(valid_divisions.contains(val))
        {
            return val.toUpperCase();

        }
        else
        {
            System.out.println("Incorrect data entry . Divison should be one character long . \n For example A , B , C ,D");
            
        }
        val=sc.next();
        }
        
        
    }





}




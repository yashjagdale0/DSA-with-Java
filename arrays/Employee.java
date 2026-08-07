package arrays;

public class Employee {
    public static void main (String[]args){
        Employee1 arr[] = new Employee1[3];
        arr[0] = new Employee1("Yash", "Shikrapur");
        arr[1] = new Employee1("Sahil", "Kharadi");
        arr[2] = new Employee1("Ritesh", "Nighoj");
        System.out.println("Employee Details:");
        for(Employee1 emp : arr){
            System.out.println(emp);
        }
    }
}

class Employee1{
    private String name, Location;
    public Employee1(String name, String Location){
        this.name = name;
        this.Location = Location;
    }
    public String toString(){
        return "Employee Name: " + name + ", Location: " + Location;
    }
}

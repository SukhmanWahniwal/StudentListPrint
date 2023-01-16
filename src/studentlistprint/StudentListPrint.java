/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlistprint;

public class StudentListPrint {

    public static void main(String[] args) 
    {
        // TODO code application logic here
        Student[] list = new Student[3]; // array of object is declared
        
        Student s1 = new Student();
        s1.setName("Mark");
        s1.setAge(21);
        
        Student s2 = new Student();
        s2.setName("Smith");
        s2.setAge(20);
        
        Student s3 = new Student();
        s3.setName("Shweta");
        s3.setAge(22);
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        for(int i=0; i<list.length; i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
    
}

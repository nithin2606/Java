package fir;

public class test {

    int studentId;

    String name;

    char grade;

       

public test(int studentId, String name, float mark) { 

        this.studentId = studentId;

        this.name=name;

        calculateGrade(mark);

}

   

public void calculateGrade(float mark){

    if(mark>90)

         grade='A';

    else

         grade='B';

}

}

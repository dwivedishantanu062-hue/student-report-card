import java.util.*;
public class studentgradecalculator{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("enter math marks");
        int math = sc.nextInt();
        System.out.println("enter hindi marks");
        int hindi = sc.nextInt();
        System.out.println("enter english marks");
        int english = sc.nextInt();
        // validate marks
        int total = 0;
        double percentage = 0.0;
        if (math<0 || math>100 || hindi <0|| hindi >100 || english< 0 || english >100){
            System.out.println("invalid marks");
        }else{
             total = math + hindi + english;
             percentage = (total / 300.0) * 100;
        }
        // char grade 
        char grade ;
        if (percentage >=90) {
            grade = 'A';
        }else if (percentage>=80){
            grade = 'B';
        } else if (percentage>=60){
            grade = 'C';
        }else if (percentage>=50){
            grade = 'D';
        }else {
            grade = 'E';
 }
        // result pass or fail
        String result;
        if (math>=33 && hindi >=33 && english >=33){
            result = "pass";
        }else {
            result = "fail";
             }
             String behaviour;
        if (grade == 'A'){
            behaviour = ("excellent");
        } else if(grade == 'B'){
            behaviour = ("very good");
        } else if (grade == 'C'){
            behaviour = ("good");
        } else  if (grade == 'D'){
            behaviour = ("bad");
        } else {
           behaviour = (" very bad");
         }
             
             System.out.println("student report card");
             System.out.println("name : " + name);
             System.out.println("math : " + math);
             System.out.println("hindi: " + hindi);
             System.out.println("english : " + english);
             System.out.println("total:" + total + "/300");
             System.out.println("percentage : " + percentage + "%");
             System.out.println("grade : " + grade);
             System.out.println(result);
             System.out.println("behaviour : " + behaviour);
    }
}
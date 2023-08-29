public class GradesSystem {
    public static void main(String[] args) {
        int [] studentPercentages = {34,56,67,23,90,34};
        char [] gradeResults = calculateGrade(studentPercentages);
        for (int i = 0 ; i < gradeResults.length; i ++){
            System.out.println(studentPercentages[i] + "->" + gradeResults[i]);
        }
    }

    public static char[] calculateGrade(int [] studentsPercentage){

            char [] grades = new char[studentsPercentage.length];
            for (int i = 0; i < studentsPercentage.length; i++) {
                char grade;
                int percentage= studentsPercentage[i];
                grade = getGrade(percentage);
                grades[i]=grade;

            }
            return grades;


    }

        private static char getGrade(int percentage){

        char grade ;
        if (percentage>=75){
            grade='A';

        }else if (percentage>=60){
            grade = 'B';

        }
        else{
            grade='C';
        }

            return grade;

        }





    }


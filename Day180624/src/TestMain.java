public class TestMain {
    public static void main(String[] args) {
        Student students[]=new Student[3];

        students[0]=new Student();
        students[0].setStudentId(1);
        students[0].setStudentName("Mikkalya");
        students[0].setCity("Cuddalore");
        students[0].setMarks1(87);
        students[0].setMarks2(79);
        students[0].setMarks3(68);
        students[0].setFeePerMonth(50000);

        students[1]=new Student();
        students[1].setStudentId(2);
        students[1].setStudentName("Nandhini");
        students[1].setCity("Hosur");
        students[1].setMarks1(98);
        students[1].setMarks2(95);
        students[1].setMarks3(91);
        students[1].setFeePerMonth(42000);

        students[2]=new Student();
        students[2].setStudentId(1);
        students[2].setStudentName("Mikkalya");
        students[2].setCity("Cuddalore");
        students[2].setMarks1(87);
        students[2].setMarks2(79);
        students[2].setMarks3(68);
        students[2].setFeePerMonth(35000);

        //Displays the name of the Student who has the highest total marks
        System.out.println("Displays the name of the Student who has the highest total marks");
        String highestStudentName="";
        int highestStudentMark=0;
        for(int i=0;i<3;i++){
            if(students[i].getTotalMarks()>highestStudentMark){
                highestStudentMark=students[i].getTotalMarks();
                highestStudentName=students[i].getStudentName();
            }
        }
        System.out.println(highestStudentName);

        //Prints the name and fee of the Student who pays the least monthly fee
        System.out.println("Prints the name and fee of the Student who pays the least monthly fee");
        String leastFeeStudentName="";
        int leastFee=students[0].getAnnualFee();
        for(int i=1;i<3;i++){
            if(students[i].getAnnualFee()<leastFee){
                leastFee=students[i].getAnnualFee();
                leastFeeStudentName=students[i].getStudentName();
            }
        }
        System.out.println(leastFeeStudentName);
        System.out.println(leastFee);

        //Prints the name, total marks , average marks , result, and “Scholarship available”
        // or “Scholarship not available” based on the student’s eligibility for every student.
        System.out.println("Prints the name, total marks , average marks , result, and “Scholarship available” " +
                "or “Scholarship not available” based on the student’s eligibility for every student.");
        for(int i=0;i<3;i++){
            if(students[i].getAverage()>90){
                students[i].isEligibleForScholarship=true;
                System.out.println(students[i].studentName+" "+students[i].getTotalMarks()
                        +" "+students[i].getAverage()+" Scholarship available");
            }
            else{
                students[i].isEligibleForScholarship=false;
                System.out.println(students[i].studentName+" "+students[i].getTotalMarks()
                        +" "+students[i].getAverage()+" Scholarship not available");
            }
        }
    }
}

import java.util.List;

public class Student {
    int studentId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholarship;
    Student(int studentId,String studentName,String city,int marks1,int marks2,int marks3,float feePerMonth,boolean isEligibleForScholarship){
        this.studentId=studentId;
        this.studentName=studentName;
        this.city=city;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.feePerMonth=feePerMonth;
        this.isEligibleForScholarship=isEligibleForScholarship;
    }
    int getAnnualFee(){
        return (int)(feePerMonth*12);
    }
    int getTotalMarks(){
        return marks1+marks2+marks3;
    }
    float getAverage(){
        return ((float)(marks1+marks2+marks3)/(float)3);
    }
    String getResult(){
        String result="";
        if(marks1>60 && marks2>60 && marks3>60){
            result="pass";
        }
        else{
            result="fail";
        }
        return result;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setIsEligibleForScholarship(boolean eligibleForScholarship) {
        isEligibleForScholarship = eligibleForScholarship;
    }
    public static Student findStudentWithHighestTotalMarks(List<Student> studentList){
        int highestMark=0;
        Student studentHighestMark=null;
        for(Student student:studentList){
            if(student.getTotalMarks()>highestMark){
                highestMark=student.getTotalMarks();
                studentHighestMark=student;
            }
        }
        return studentHighestMark;
    }
    public static Student findStudentWithLeastMonthlyFee(List<Student> studentList){
        float leastMonthlyFee=Integer.MAX_VALUE;
        Student studentLeastMonthlyFee=null;
        for(Student student:studentList){
            if(student.getFeePerMonth()<leastMonthlyFee){
                leastMonthlyFee=student.getFeePerMonth();
                studentLeastMonthlyFee=student;
            }
        }
        return studentLeastMonthlyFee;
    }
}

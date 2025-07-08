class course{
    String courseName;
    String enrolledStudents;
    static int maxCapacity;
    int CourseSize;
    int rollno = 1;
    String[] Coursesize;
    static void setMaxCapacity(int capacity){
        course.maxCapacity=capacity;
    }
    course(String courseName,int CourseSize){
        this.courseName =courseName;
        Coursesize=new String[CourseSize];
    }
    void enroll(String StudentName){
        maxCapacity--;
        if(CourseSize<rollno&&maxCapacity>0){
            Coursesize[rollno-1]=StudentName;
            System.out.printf("%s is joined the %s with rollno: %d\n",StudentName,this.courseName,rollno);
            rollno++;
        }
        else{
            System.out.printf("there is no space");
        }
    }
    void unenroll(String StudentName,int rollno){
        maxCapacity++;
        int n = rollno-1;
        while(n<CourseSize){
            Coursesize[n]=Coursesize[n+1];
            n++;
        }
        System.out.printf("%s is removed of rollno:%d\n",StudentName,rollno);
        rollno--;
    }
    void Showall(){
        for(String b:Coursesize){
            System.out.printf("%s ",b);
        }
    }
}
public class College{
    public static void main(String[] args) {
        course java = new course("java", 10);
        course.setMaxCapacity(100);
        java.enroll("prashant");
        java.enroll("prashant");
        java.enroll("prashant");
        java.enroll("prashant");
        java.enroll("prashant");
        java.enroll("prashant");
        java.unenroll("prashant",1);
        

    }
}
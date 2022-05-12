package SchoolManagementSystem;

// this class is responsible for keeping track of individual students
public class Student {

    private final int id;
    private final String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *
     * fee for every student is 30k
     * fees paid initially are 0
     * @param id id for the student unique
     * @param name name of the student
     * @param grade grade of student
     */

    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //not going to alter students name

    /**
     * used to update the student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * Add the fees to the fees paid
     * School is going to receive funds
     * @param fees the fees the student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}

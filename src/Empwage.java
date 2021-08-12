public class Empwage {

    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int IS_PART_TIME=1;
    public static final int NUM_OF_WORKING_DAYS=2;
    public static final int MAX_HR_IN_MONTH=10;

    public static void main(String[] args) {

        //variables
        int emphrs = 0;
        int empwage = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;

        //Computation
        while (totalemphrs <= MAX_HR_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
            totalworkingdays++;

        }
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck = 0) {
            case IS_PART_TIME:
                emphrs = 4;
                break;
            case IS_FULL_TIME:
                emphrs = 8;
                break;
            default:
                emphrs = 0;
        }
        totalemphrs += emphrs;
        System.out.println("Day#: " + totalworkingdays + "Emp Hr:" + emphrs);
    }

    int totalempwage=totalemphrs* EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage " +totalempwage);

    }
}

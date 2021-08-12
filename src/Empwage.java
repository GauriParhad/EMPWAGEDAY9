public class Empwage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");

        //constants
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int IS_PART_TIME = 1;

        //variables
        int emphrs = 0;
        int empwage = 0;

        //Computation
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == IS_PART_TIME)
            emphrs = 4;
        else if (empcheck == IS_FULL_TIME)
            emphrs = 8;
        else
            emphrs = 0;
        empwage = emphrs * EMP_RATE_PER_HOUR
        System.out.println("Employee wage:" + empwage);
    }
}

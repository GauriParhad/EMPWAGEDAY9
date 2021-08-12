public class Empwage {
    public static int Computeemployeewage(){
    {

     int IS_FULL_TIME=2;
     int EMP_RATE_PER_HOUR=20;
     int IS_PART_TIME=1;
     int day=1;
     int empwage = 0;
     int emphrs = 0;
     int totalemphrs = 0;
     int totalworkingdays = 0;
     int workingdays=2;
     int NUM_OF_WORKING_DAYS=2;
     int MAX_HR_IN_MONTH=10;


        //Computation
        while (totalemphrs <= MAX_HR_IN_MONTH && totalworkingdays < NUM_OF_WORKING_DAYS) {
            totalworkingdays++;
        }
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case 1: IS_PART_TIME:
            System.out.println("Employee Part time present");
                emphrs = 4;
                break;
            case IS_FULL_TIME:
                System.out.println("Employee Full time present");
                emphrs = 8;
                break;
            default:
                System.out.println("Employee Absent");
                emphrs = 0;
                break;
        }
        totalemphrs += emphrs;
        System.out.println("Day#: " + totalworkingdays + "Emp Hr:" + emphrs);

    int totalempwage= totalemphrs * EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage " +totalempwage);
        return totalempwage;
    }
    public static void companyPersonaldetails() {

            System.out.println("Our company details is given below:");
            computeemployeewage();
        }
        public static void main (String[] args){

            computeemployeewage();
        }
}

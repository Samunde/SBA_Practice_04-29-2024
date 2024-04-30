public class DaysSurpassed {
    public static void main(String[] args) {
        int weeks=10;
        int daysInWeek=7;
        int days=2;

        int result=0;
        result=(daysInWeek-days)+daysInWeek;
        weeks+=1;


            System.out.println("It will take " +result+" days to surpass the weeks count.\n" +
                    "New week count is " +weeks);
            System.out.println("******************************");

    }}

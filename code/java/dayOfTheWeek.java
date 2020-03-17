class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        //1971-01-01 Friday
        
        String[] day_of_week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        int days = day - 1;
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        days += 365 * (year-1971);
        days = days % 7 ;
        for(int i=0;i<month-1;i++)
            days += months[i];

        if(year >= 1972){
            days += (year - 1972) / 4 + 1;
            if(year % 4 == 0 && month < 3)
                days -- ;
            }     

        days = ((days % 7) + 6) % 7;
        if(days == 0)
            days = 7;
        return day_of_week[days-1];
    }
}

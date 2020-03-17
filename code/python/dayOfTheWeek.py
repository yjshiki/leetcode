class Solution:
    def dayOfTheWeek(self, day: int, month: int, year: int) -> str:
        #1971-01-01 Friday
        
        day_of_week = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
        
        days = day - 1
        months = [31,28,31,30,31,30,31,31,30,31,30,31]
        days += 365 * (year-1971)
        days = days % 7 
        for i in range(month-1):
            days += months[i]

        if year >= 1972:
            days += (year - 1972)//4 + 1
            if year % 4 == 0 and month < 3:
                days -= 1


        days = ((days % 7) + 6) % 7
        return day_of_week[days-1]
        
        
        

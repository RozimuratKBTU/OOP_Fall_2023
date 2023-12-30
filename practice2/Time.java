package practice2;

public class Time implements Comparable<Time>{
    int hour,second,minute;

    public Time(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setTime(int hour,int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else{
            //    Оператор throw позволяет вам создать пользовательскую ошибку.
            throw new IllegalArgumentException("Wrong time input");
        }
    }
    public String toUniversal(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public String toStandard(){
        String check = (hour < 12) ? "AM":"PM";
        int standardHour = (hour ==0 || hour == 12) ? 12 : hour % 12;
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, check);
    }

    public int compareTo(Time o){
            if(this.hour > o.hour) return 1;
            if(this.hour < o.hour) return -1;
        if(this.hour == o.hour) {


                if (this.minute > o.minute) return 1;
                if (this.minute < o.minute) return -1;
            if(this.minute == o.minute) {

                if (this.second > o.second) return 1;
                if (this.second < o.second) return -1;
            }
        }
        return 0;
    }


    public void add(Time otherTime) {
        int newSecond = this.second + otherTime.second;
        int newMinute = this.minute + otherTime.minute + newSecond / 60;
        int newHour = this.hour + otherTime.hour + newMinute / 60;

        this.second = newSecond % 60;
        this.minute = newMinute % 60;
        this.hour = newHour % 24;
    }
}





public class day12_time {
    private int hour, minute, second;
    
    day12_time(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if(hour > 23 || hour < 0) return;
        this.hour = hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }
    @Override
    public String toString() {
        return "{" +
            " hour='" + getHour() + "'" +
            ", minute='" + getMinute() + "'" +
            ", second='" + getSecond() + "'" +
            "}";
    }
}


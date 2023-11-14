public class Clock {
    private int hour;
    private int minute;

    public void setHour(int hour) {
        if (hour >= 0 && hour <=23) {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <=59) {
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void addMinute() {
        if (minute == 59) {
            minute = 0;
            if (hour == 23) {
                hour = 0;
            } else {
                hour++;
            }
        } else {
            minute ++;
        }
    }

    public String toString() {
        return getHour() + ":" + getMinute();
    }

    public static void main(String[] args) {
        Clock testClock = new Clock();
        testClock.setHour(23);
        testClock.setMinute(58);
        System.out.println(testClock.toString());
        testClock.addMinute();
        System.out.println(testClock.toString());
        testClock.addMinute();
        System.out.println(testClock.toString());
    }
}

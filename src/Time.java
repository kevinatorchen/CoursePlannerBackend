/**
 * Created by Kevin on 1/3/2017.
 */
public class Time implements Comparable<Time> {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return getHour();
    }

    public int getMinute() {
        return getMinute();
    }

    @Override
    public int compareTo(Time other) {
        if (hour != other.hour) {
            return hour - other.hour;
        } else {
            return minute - other.minute;
        }
    }
}

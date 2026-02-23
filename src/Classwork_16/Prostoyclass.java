package Classwork_16;

public class Prostoyclass {

    int hours;
    int minutes;

    Time(int h, int m) {
        if (h >= 0 && h <= 23 && m >= 0 && m <= 59) {
            hours = h;
            minutes = m;
        } else {
            hours = 0;
            minutes = 0;
        }
    }

   
    void addMinutes(int min) {
        minutes += min;

        while (minutes >= 60) {  
            minutes -= 60;
            hours += 1;
        }

        while (hours >= 24) {     
            hours -= 24;
        }
    }

    String toStringTime() {
        String h = (hours < 10) ? "0" + hours : "" + hours;
        String m = (minutes < 10) ? "0" + minutes : "" + minutes;
        return h + ":" + m;
    }
}

public class Main {
    public static void main(String[] args) {
        Time t = new Time(23, 50);
        t.addMinutes(25);
        System.out.println("Novoe vremya: " + t.toStringTime()); 
    }
}
}

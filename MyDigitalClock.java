import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyDigitalClock extends JFrame {

    JLabel l1, l2, l3, l4;
    Calendar c;
    SimpleDateFormat tf, df, f;
    String time;
    String day;
    String date;

    MyDigitalClock() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Digital Clock");
        this.setSize(450, 350);
        this.setLayout(new FlowLayout());
        this.setResizable(false);

        l1 = new JLabel("The Digital Clock");
        l1.setFont(new Font("Serif", Font.BOLD, 45));

        tf = new SimpleDateFormat("hh:mm:ss a");
        df = new SimpleDateFormat("EEEE");
        f = new SimpleDateFormat("MMMMM/dd/yyyy");

        l2 = new JLabel();

        l2.setFont(new Font("Verdana", Font.PLAIN, 50));
        l2.setForeground(Color.white);
        l2.setBackground(Color.black);
        l2.setOpaque(true);

        l3 = new JLabel();
        l3.setFont(new Font("Serif", Font.BOLD, 40));

        l4 = new JLabel();
        l4.setFont(new Font("Serif", Font.BOLD, 40));

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setTime();

    }

    public void setTime() {

        while (true) {
            time = tf.format(Calendar.getInstance().getTime());
            l2.setText(time);

            day = df.format(Calendar.getInstance().getTime());
            l3.setText(day);

            date = f.format(Calendar.getInstance().getTime());
            l4.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        new MyDigitalClock();
    }

}

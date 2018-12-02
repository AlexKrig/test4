import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


//прога таймер
public class testThread extends JFrame{

    public testThread(){
        setSize(400,300);
        JTextField field=new JTextField("Timer");
        add(field, BorderLayout.CENTER);
        JButton button=new JButton("Start");
        add(button,BorderLayout.SOUTH);
        pack();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread thread =new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SimpleDateFormat dateFormat=new SimpleDateFormat("mm:ss");
                        long startTime  = System.currentTimeMillis();
                        while (true){
                            //для вывода в прграмму
                            field.setText(dateFormat.format(System.currentTimeMillis()-startTime));
                            try {
                                Thread.currentThread().sleep(1000);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        }
                    }
                });
                thread.start();
            }
        });
    }

    public static void main(String[] args) {
        new testThread().setVisible(true);
    }

}

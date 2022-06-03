package com.inlinode.rpspe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button rockbtn = (Button) findViewById(R.id.rock);
        Button paperbtn = (Button) findViewById(R.id.paper);
        Button scissorbtn = (Button) findViewById(R.id.scissors);
        rockbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double bot;
                bot = Math.ceil(10 * Math.random() % 3);
                if (bot == 1) {
                    int duration = Toast.LENGTH_SHORT;
                    Toast rockrocktoast = Toast.makeText(MainActivity.this, "You picked: Rock, Bot Picked Rock.", duration);
                    rockrocktoast.show();
                    Toast rockrockmsg = Toast.makeText(MainActivity.this, "It's A Tie!", duration);
                    rockrockmsg.show();
                } else if (bot == 2) {
                    int duration = Toast.LENGTH_SHORT;
                    Toast rockpapertoast = Toast.makeText(MainActivity.this, "You picked: Rock, Bot Picked Paper.", duration);
                    rockpapertoast.show();
                    Toast rockpapermsg = Toast.makeText(MainActivity.this, "You Lost!", duration);
                    rockpapermsg.show();
                } else {
                    int duration = Toast.LENGTH_SHORT;
                    Toast rockscissortoast = Toast.makeText(MainActivity.this, "You picked: Rock, Bot Picked Scissors.", duration);
                    rockscissortoast.show();
                    Toast rockscissormsg = Toast.makeText(MainActivity.this, "You Won!", duration);
                    rockscissormsg.show();
                }
            }
            });
        paperbtn.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            double bot;
                                            bot = Math.ceil(10 * Math.random() % 3);
                                            if (bot == 1) {
                                                int duration = Toast.LENGTH_SHORT;
                                                Toast paperrocktoast = Toast.makeText(MainActivity.this, "You picked: Paper, Bot Picked Rock.", duration);
                                                paperrocktoast.show();
                                                Toast paperrockmsg = Toast.makeText(MainActivity.this, "You Won!", duration);
                                                paperrockmsg.show();
                                            } else if (bot == 2) {
                                                int duration = Toast.LENGTH_SHORT;
                                                Toast paperpaper = Toast.makeText(MainActivity.this, "You picked: Paper, Bot Picked Paper.", duration);
                                                paperpaper.show();
                                                Toast paperpapermsg = Toast.makeText(MainActivity.this, "You Tied!", duration);
                                                paperpapermsg.show();
                                            } else {
                                                int duration = Toast.LENGTH_SHORT;
                                                Toast rockscissortoast = Toast.makeText(MainActivity.this, "You picked: Paper, Bot Picked Scissors.", duration);
                                                rockscissortoast.show();
                                                Toast rockscissormsg = Toast.makeText(MainActivity.this, "You Lost!", duration);
                                                rockscissormsg.show();
                                            }
                                        }
                                    });
        scissorbtn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    double bot;
                    bot = Math.ceil(10 * Math.random() % 3);
                    if (bot == 1) {
                        int duration = Toast.LENGTH_SHORT;
                        Toast scissorrock = Toast.makeText(MainActivity.this, "You picked: Scissors, Bot Picked Rock.", duration);
                        scissorrock.show();
                        Toast scissorrockmsg = Toast.makeText(MainActivity.this, "You Lost!", duration);
                        scissorrockmsg.show();
                    } else if (bot == 2) {
                        int duration = Toast.LENGTH_SHORT;
                        Toast scissorspaper = Toast.makeText(MainActivity.this, "You picked: Paper, Bot Picked Paper.", duration);
                        scissorspaper.show();
                        Toast scissorspapermsg = Toast.makeText(MainActivity.this, "You Tied!", duration);
                        scissorspapermsg.show();
                    } else {
                        int duration = Toast.LENGTH_SHORT;
                        Toast paperscissors = Toast.makeText(MainActivity.this, "You picked: Paper, Bot Picked Scissors.", duration);
                        paperscissors.show();
                        Toast paperscissorsmsg = Toast.makeText(MainActivity.this, "You Won!", duration);
                        paperscissorsmsg.show();
                    }
                }
    });
}
}
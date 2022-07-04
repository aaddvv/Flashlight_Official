package cyber.sport.flashlight;

//start govno
import androidx.annotation.RequiresApi;
//finish govno

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static boolean greyStatus = false;

    private Button buttonFlash;
    private Button onn;
   // private Button grey;
    private Button off;
    //private Button darkGrey;
    private Button VeryDarkGrey;

    private FlashClass flashClass;


    //start govno
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    //finish govno


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unit();
    }

//start govno
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//finish govno

    private void unit () {
        buttonFlash = findViewById(R.id.FlashBtn);

        onn = findViewById(R.id.onn);
       // grey = findViewById(R.id.grey);
        off = findViewById(R.id.off);
       // darkGrey = findViewById(R.id.darkGrey);
        VeryDarkGrey = findViewById(R.id.veryDarkGrey);

        flashClass = new FlashClass(this);

        buttonFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flashClass.isStatus()){
                    greyStatus = false;
                    flashClass.flashOff();
                    buttonFlash.setText(R.string.on);
                }else{
                    greyStatus = false;
                    flashClass.flashOn();
                    buttonFlash.setText(R.string.off);
                }
            }
        });

        onn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                greyStatus = false;


                flashClass.flashOn();
                buttonFlash.setText(R.string.off);


            }
        });

       /* grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                greyStatus = true;

                try {
                    flashClass.lightGrey();
                    buttonFlash.setText("special: grey");
                } catch (InterruptedException e) {

                    buttonFlash.setText("special: grey error");
                }

            }
        });*/

       /* darkGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                greyStatus = true;

                try {
                    flashClass.darkGrey();
                    buttonFlash.setText("special: grey");
                } catch (InterruptedException e) {

                    buttonFlash.setText("special: grey error");
                }

            }
        });
*/
        VeryDarkGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                greyStatus = true;

                try {
                    flashClass.veryDarkGrey();
                    buttonFlash.setText("special: grey");
                } catch (InterruptedException e) {

                    buttonFlash.setText("special: grey error");
                }

            }
        });

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                greyStatus = false;

                flashClass.flashOff();
                buttonFlash.setText(R.string.on);


            }
        });



    }

    public static boolean sttatus(){
        return greyStatus;
    }

}
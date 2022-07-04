package cyber.sport.flashlight;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.widget.Button;

//start govno
import androidx.annotation.RequiresApi;
//finish govno

import java.lang.Thread;

//start govno
@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//finish govno
public class FlashClass {

    public float TIME_SLEEP = 1;






    public boolean status = false;
    private Context context;

//start constructor
    public FlashClass(Context context) {
        this.context = context;
    }
//finish constructor

    //start govno
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    //finish govno

    public void flashOn () {
        CameraManager cm = (CameraManager)context.getSystemService(Context.CAMERA_SERVICE);
        try {

            String cameraID = cm.getCameraIdList()[0];
            //start govno
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                //finish govno
                cm.setTorchMode(cameraID, true);
                //start govno
            }
            //finish govno
            status = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }
    //start govno
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    //finish govno
    public void flashOff () {
        CameraManager cm = (CameraManager)context.getSystemService(Context.CAMERA_SERVICE);
        try {


            String cameraID = cm.getCameraIdList()[0];
            //start govno
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                //finish govno
                cm.setTorchMode(cameraID, false);
                //start govno
            }
            //finish govno
            status = false;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }


    }

    public void lightGrey() throws InterruptedException {

        while (hrenatus()) {
            //boolean huyatus = MainActivity.sttatus();




            if(hrenatus()) {
                Thread.sleep((long) TIME_SLEEP);
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();

                Thread.sleep((long) TIME_SLEEP);
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();

            }


        }
    }
    public void darkGrey() throws InterruptedException {

        while (hrenatus()) {
            //boolean huyatus = MainActivity.sttatus();




            if(hrenatus()) {
                Thread.sleep((long) TIME_SLEEP);
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                Thread.sleep((long) TIME_SLEEP);
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
                flashOn();
                flashOff();
            }


        }
    }

    public void veryDarkGrey() throws InterruptedException {

        while (hrenatus()) {
            //boolean huyatus = MainActivity.sttatus();




            if(hrenatus()) {

                flashOn();
                flashOff();

            }


        }
    }

    public boolean isStatus() {
        return status;
    }

    public boolean hrenatus(){
        boolean huyatus = MainActivity.sttatus();

        return huyatus;
    }
}

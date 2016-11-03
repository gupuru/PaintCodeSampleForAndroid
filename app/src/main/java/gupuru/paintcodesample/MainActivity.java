package gupuru.paintcodesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DroronView droronView = (DroronView) findViewById(R.id.view_droron);
        droronView.setLeftAngle(20);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageBitmap(DroidoStyleKit.imageOfAndroidLogo());

    }
}

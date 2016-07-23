package techkids.mad3.openotherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButtonOpenFirst, mButtonOpenSecond;
    private static final String PACKAGE_NAME = "techkids.mad3.finalproject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent() {
        mButtonOpenFirst = (Button) this.findViewById(R.id.btnOpenFirst);
        mButtonOpenFirst.setOnClickListener(this);
        mButtonOpenSecond = (Button) this.findViewById(R.id.btnOpenSecond);
        mButtonOpenSecond.setOnClickListener(this);
    }

    private void openOtherApplication() {
        Intent intent = this.getPackageManager().getLaunchIntentForPackage(PACKAGE_NAME);
        startActivity(intent);
    }

    private void openOtherActivity() {

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btnOpenFirst:
                openOtherApplication();
                break;
            case R.id.btnOpenSecond:
                openOtherApplication();
                break;
        }
    }
}

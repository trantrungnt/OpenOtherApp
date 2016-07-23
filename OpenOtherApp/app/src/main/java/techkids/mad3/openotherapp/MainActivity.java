package techkids.mad3.openotherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButtonOpenFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    private void initComponent() {
        mButtonOpenFirst = (Button) this.findViewById(R.id.btnOpenFirst);
        mButtonOpenFirst.setOnClickListener(this);
    }

    private void openOtherApplication() {

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btnOpenFirst:
                onBackPressed();
                break;
        }
    }
}

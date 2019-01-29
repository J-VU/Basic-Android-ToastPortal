package example.supervoo.toastportal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }


    //
    private int mCount = 0;
    private TextView mShowCount;

    //Show Toast on current Activity Screen
    public void showToast(View view) {

        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_LONG);
        toast.show();
    }

    public void addCount(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}

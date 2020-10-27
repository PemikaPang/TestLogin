package comscisdu.pemika.testlogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView userTextView;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userTextView = findViewById(R.id.tvWcl);
        nameString = getIntent().getStringExtra("Name");
        userTextView.setText("ยินดีต้อนรับ "+nameString);

    }

    public void clickFB(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100004519605938"));
        startActivity(fbIntent);
    }
}
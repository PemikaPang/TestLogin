package comscisdu.pemika.testlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText nameEditText;
    EditText passwordEditText;
    Button startButton;
    String nameString;
    String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nameEditText = findViewById(R.id.edtName);
        passwordEditText = findViewById(R.id.edtPassword);
        startButton = findViewById(R.id.btLogin);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameString = nameEditText.getText().toString().trim();
                password = passwordEditText.getText().toString().trim();
                //Check Space
                if ((nameString.length() == 0) || (password.length() == 0)){ //ถ้า name เป็นค่าว่าง
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                }else if (!password.equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Password ไม่ถูกต้อง", Toast.LENGTH_SHORT).show();
                } else {    //ถ้า name ไม่เป็นค่าว่าง
                    password = "1234" ;
                    Intent startIntent = new Intent(LoginActivity.this,MainActivity.class);
                    startIntent.putExtra("Name",nameString);
                    startActivity(startIntent);
                }
            }
        });
    }
}

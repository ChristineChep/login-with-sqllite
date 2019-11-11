package myapp.user.example.com.sikika.activites;

import androidx.appcompat.app.AppCompatActivity;
import myapp.user.example.com.sikika.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewCreateAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextUsername = (EditText) findViewById(R.id.email);
        mTextPassword = (EditText) findViewById(R.id.password);
        mButtonLogin = (Button) findViewById(R.id.button);
        mTextViewCreateAccount = (TextView) findViewById(R.id.createAccount);



        mTextViewCreateAccount.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(registerIntent);
            }
        });{

        };

    }
}
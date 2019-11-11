package myapp.user.example.com.sikika.activites;

import androidx.appcompat.app.AppCompatActivity;
import myapp.user.example.com.sikika.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText mTextFirstname;
    EditText mTextLastName;
    EditText mTextEmail;
    EditText mTextPassword1;
    EditText mTextConfirmPassword;
    Button mButtonCreateAccount;
    TextView mTextViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mTextFirstname = (EditText) findViewById(R.id.firstname);
        mTextLastName = (EditText) findViewById(R.id.lastname);
        mTextEmail = (EditText) findViewById(R.id.email);
        mTextPassword1 = (EditText) findViewById(R.id.password1);
        mTextConfirmPassword = (EditText) findViewById(R.id.password2);
        mButtonCreateAccount = (Button) findViewById(R.id.button2);
        mTextViewLogin = (TextView) findViewById(R.id.login);



        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LoginIntent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(LoginIntent);
            }
        });{

        };

    }
}

package myapp.user.example.com.sikika.helper;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class InputValidation { 
    private Context context;
    private Object EditText;

    public InputValidation(Context context) {
        this.context = context;
    }

        public boolean isInputEditTextFilled(EditText  editText, Layout layout, String message){
            String value = editText.getText().toString().trim();
            if (value.isEmpty()) {
                layout.setError(message);
                hideKeyboardFrom(editText);
                return false;
            } else {
                layout.setErrorEnabled(false);
            }
            return true;
        }
        public boolean isInputEditTextEmail (EditText editText, Layout layout,String message){
            String value = editText.getText().toString().trim();
            if(value.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(value).matches()){
                layout.setError(message);
                hideKeyboardFrom(editText);
                return false; 
            }else {
                layout.setErorEnabled(false);
            }
            return true;
    }

        public boolean isInputEditTextmatches(EditText editText1, EditText editText2, Layout layout, String message ){
        String value1 = editText1.getText().toString().trim();
        String value2 = editText2.getText().toString().trim();
        if(!value1.contentEquals(value2)){
            layout.setError(message);
            hideKeyboardFrom(editText2);
            return false;
        }else{
            layout.setErrorEnabled(false); 
        }
        return true;
        }

        private void hideKeyboardFrom(View view){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        }
}


//package com.kidzania.afflesplitify.screens.activity;
//
//import android.annotation.SuppressLint;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.util.Log;
//import android.util.Patterns;
//import android.view.View;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.util.Arrays;
//
//
//public class Signup extends AppCompatActivity {
//
//
//    private static final String TAG = "Sign UP";
//    TextView name, email, contact, password, ans1, ans2;
//    Button btn_Register;
//    Spinner ques1, ques2;
//
//    boolean flag = false;
//
//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.signup);
//        name = findViewById(R.id.input_name);
//        email = findViewById(R.id.input_email);
//        contact = findViewById(R.id.input_contactNo);
//        password = findViewById(R.id.input_password);
//        btn_Register = findViewById(R.id.btn_Register);
//
//
//        btn_Register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                boolean isSignUp = false;
//                try {
//                    isSignUp = signUp(name.getText().toString(), email.getText().toString(), contact.getText().toString(), password.getText().toString());
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//
////                Log.d(TAG, "name"+name.getText().toString()+ email.getText().toString()+contact.getText().toString() +password.getText().toString() );
////                Intent intent = new Intent(getApplicationContext(), HomeScreen.class);
////                Intent intent = new Intent(getApplicationContext(), ForgetPassword.class);
//
//                if (isSignUp) {
//
//                }
//
//            }
//        });
//
//    }
//
//    @SuppressLint("WrongViewCast")
//    public boolean signUp(String name, String email, String contact, String password) throws JSONException {
//        Log.d(TAG, "onClick:1 " + name);
//        if (validationCheck(name, email, contact, password)) {
//            SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("sharedInstance", 0);
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putString("user", "");
//            Log.d(TAG, "onClick:2 " + name);
//
//            JSONObject jsonObject = new JSONObject();
//            JSONArray dbJsonArray;
//
//            Log.d(TAG, "onClick:3 " + name);
//
//            jsonObject.put("name", name);
//            jsonObject.put("email", email);
//            jsonObject.put("contact", contact);
//            jsonObject.put("password", password);
//
//// Fetching Stored data from Shared Prefrence
//            Log.d(TAG, "onClick:4 " + name);
//
//            String db = sharedPreferences.getString("user", null);
//            Log.d(TAG, "onClick:6 " + db);
//
//            if (db != null) {
//
//                dbJsonArray = new JSONArray(db);
//                Log.d(TAG, "onClick:5 " + name);
//
//                Log.d(TAG, "signUp: dbJsonArray" + dbJsonArray.length());
//
//                for (int i = 0; i < dbJsonArray.length(); i++) {
//                    JSONObject jsonObject1 = dbJsonArray.getJSONObject(i);
//                    if (jsonObject1.get("email") == email) {
//                        Toast t = Toast.makeText(this, "Email already Registered", Toast.LENGTH_SHORT);
//                        t.show();
//                        flag = true;
//                    }
//                }
//                if (!flag) {
//                    //Setting Security Question for SignUp
//                    setContentView(R.layout.forgetpassword);
//                    ques1 =  findViewById(R.id.ques1);
//                    ques2 =  findViewById(R.id.ques2);
//                    String[] items = new String[]{"What Is your favorite book?", "What is your mother's maiden name?", "Where did you meet your spouse?", "What was the first company that you worked for?", "What was the name of your first/current/favorite pet?"};
//                    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//                    ques1.setAdapter(adapter);
//                    ques2.setAdapter(adapter);
//
//                    // Answer of question 1
//
//                    ans1 =  findViewById(R.id.ans1);
//                    ans2  =  findViewById(R.id.ans2);
//
//                    jsonObject.put("ques1", ques1);
//                    jsonObject.put("ques2", ques2);
//
//                    jsonObject.put("ans1", ans1);
//                    jsonObject.put("ans2", ans2);
//
//                    dbJsonArray.put(jsonObject);
//                    editor.putString("user", dbJsonArray.toString());
//                    editor.commit();
//                }
//
//                return true;
//
//            } else {
//
//                dbJsonArray = new JSONArray();
//                dbJsonArray.put(jsonObject);
//                editor.putString("user", dbJsonArray.toString());
//                editor.commit();
//                return true;
//
//
//            }
//        }
//
//        return false;
//    }
//
//
//    public boolean validationCheck(String name, String email, String contact, String password) {
//
//        if (isEmpty(name)) {
//            Toast t = Toast.makeText(this, "You must enter first name to register", Toast.LENGTH_SHORT);
//            t.show();
//            return false;
//        }
//
//        if (isEmpty(email)) {
//            Toast t = Toast.makeText(this, "You must enter email to register", Toast.LENGTH_SHORT);
//            t.show();
//            return false;
//
//        }
//        if (!isEmail(email)) {
//            Toast t = Toast.makeText(this, "You must enter valid Email", Toast.LENGTH_SHORT);
//            t.show();
//            return false;
//
//        }
//
//
//        if (isEmpty(contact)) {
//            Log.d(TAG, "String " + isEmpty(contact) + contact);
//            Toast t = Toast.makeText(this, "You must enter contact to register", Toast.LENGTH_SHORT);
//            t.show();
//            return false;
//        }
//
//        if (isEmpty(password)) {
//            Toast t = Toast.makeText(this, "You must enter password to register", Toast.LENGTH_SHORT);
//            t.show();
//            return false;
//        }
//
//
//        return true;
//
//    }
//
//    boolean isEmpty(String str) {
//        Log.d(TAG, "String " + str);
//
//        return str != "" ?  false: true ;
//
//    }
//
//    boolean isEmail(String str) {
//        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
//    }
//
//    public boolean forgetPassword(){
//        return false;
//    }
//
//
//}

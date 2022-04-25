package com.oop_laba__2.TVS;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterConfirmation extends AppCompatActivity {

    private TextView back, time;
    private EditText edit1, edit2, edit3, edit4;
    private Button button;
    private CountDownTimer timer;

    @Override
    public void onBackPressed(){
        if (timer != null) {
            timer.cancel();
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_confirmation);

        back = findViewById(R.id.textView4);
        time = findViewById(R.id.textView2);
        edit1 = findViewById(R.id.editTextNumber);
        edit2 = findViewById(R.id.editTextNumber1);
        edit3 = findViewById(R.id.editTextNumber2);
        edit4 = findViewById(R.id.editTextNumber3);
        button = findViewById(R.id.button);

        back.setOnClickListener(view -> onBackPressed());
        button.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), R.string.timer_update,Toast.LENGTH_LONG).show();
            edit1.setText("");
            edit2.setText("");
            edit3.setText("");
            edit4.setText("");
            edit1.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
            edit2.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
            edit3.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
            edit4.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
            edit1.requestFocus();
            timer.start();
        });

        edit1.setOnFocusChangeListener((view, b) -> changeBackground(edit1, b));
        edit2.setOnFocusChangeListener((view, b) -> changeBackground(edit2, b));
        edit3.setOnFocusChangeListener((view, b) -> changeBackground(edit3, b));
        edit4.setOnFocusChangeListener((view, b) -> changeBackground(edit4, b));

        edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edit1.getText().length()==1)
                {
                    if (edit2.getText().length()==0)
                    {
                        edit2.requestFocus();
                        return;
                    }
                    if (edit3.getText().length()==0)
                    {
                        edit3.requestFocus();
                        return;
                    }
                    if (edit4.getText().length()==0)
                    {
                        edit4.requestFocus();
                    }
                }

            }
        });
        edit2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edit2.getText().length()==1)
                {
                    if (edit1.getText().length()==0)
                    {
                        edit1.requestFocus();
                        return;
                    }
                    if (edit3.getText().length()==0)
                    {
                        edit3.requestFocus();
                        return;
                    }
                    if (edit4.getText().length()==0)
                    {
                        edit4.requestFocus();
                    }
                }

            }
        });
        edit3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edit3.getText().length()==1)
                {
                    if (edit2.getText().length()==0)
                    {
                        edit2.requestFocus();
                        return;
                    }
                    if (edit1.getText().length()==0)
                    {
                        edit1.requestFocus();
                        return;
                    }
                    if (edit4.getText().length()==0)
                    {
                        edit4.requestFocus();
                    }
                }

            }
        });
        edit4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (edit4.getText().length()==1)
                {
                    if (edit2.getText().length()==0)
                    {
                        edit2.requestFocus();
                        return;
                    }
                    if (edit3.getText().length()==0)
                    {
                        edit3.requestFocus();
                        return;
                    }
                    if (edit1.getText().length()==0)
                    {
                        edit1.requestFocus();
                    }
                }

            }
        });

        timer = new CountDownTimer(60000, 1000) {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTick(long l) {
                if (l == 60000) {
                    long minutes = l/60000;
                    long seconds = (l-minutes*60000)/1000;
                    if (seconds>=0 && seconds<10)
                    {
                        time.setText(String.valueOf(minutes) + ":0" + String.valueOf(seconds));
                    }
                    else {
                        time.setText(String.valueOf(minutes) + ":" + String.valueOf(seconds));
                    }
                }
                else {
                    long seconds = l/1000;
                    if (seconds>=0 && seconds<10)
                    {
                        time.setText("00:0" + String.valueOf(seconds));
                    }
                    else {
                        time.setText("00:" + String.valueOf(seconds));
                    }
                }
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFinish() {
                time.setText("00:00");
                edit1.setText("");
                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                edit1.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
                edit2.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
                edit3.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
                edit4.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
                edit1.requestFocus();
                timer.cancel();
                timer.start();
                Toast.makeText(getApplicationContext(), R.string.timer_failed,Toast.LENGTH_LONG).show();
            }
        };

        timer.start();
        Toast.makeText(getApplicationContext(), R.string.timer_access,Toast.LENGTH_LONG).show();
    }

    private void changeBackground(EditText edit, boolean inFocus) {
        if (inFocus) {
            edit.setBackgroundResource(R.drawable.background_register_edit_text);
        }
        else {
            if (edit.getText().length() == 1) {
                edit.setBackgroundResource(R.drawable.background_register_edit_text);
            }
            else {
                edit.setBackgroundResource(R.drawable.background_buttons_edit_text_gray);
            }
        }
    }
}
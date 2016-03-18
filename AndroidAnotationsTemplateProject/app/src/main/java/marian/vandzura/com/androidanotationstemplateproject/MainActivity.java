package marian.vandzura.com.androidanotationstemplateproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloWorld;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private CheckBox mCheckBox;
    private RadioButton mRadioButton;
    private EditText mEditText;
    private Switch mSwitch;
    private String mHelloWorldEveryone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind Views
        mHelloWorld = (TextView) findViewById(R.id.hello_world);
        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mCheckBox = (CheckBox) findViewById(R.id.check_box);
        mRadioButton = (RadioButton) findViewById(R.id.radio_button);
        mEditText = (EditText) findViewById(R.id.edit_text);
        mSwitch = (Switch) findViewById(R.id.switch_1);

        //bind resources
        mHelloWorldEveryone = getResources().getString(R.string.hello_world_everyone);

        //set texts
        mHelloWorld.setText(mHelloWorldEveryone);

        //create click listeners
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1ClickAction();
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button2ClickAction();
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3ClickAction();
            }
        });
        mCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkBoxCheckAction();
            }
        });

        //create long click listeners
        mHelloWorld.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                helloWorldHint();
                return true;
            }
        });
        
        //create long click listeners
        mButton1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button1Hint();
                return true;
            }
        });
        mButton2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button2Hint();
                return true;
            }
        });
        mButton3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button3Hint();
                return true;
            }
        });
        mRadioButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                radioButtonHint();
                return true;
            }
        });
        mSwitch.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                switchHint();
                return true;
            }
        });
    }

    private void button1ClickAction() {
        showToast("Button 1 click action");
    }

    private void button2ClickAction() {
        showToast("Button 2 click action");
    }

    private void button3ClickAction() {
        showToast("Button 3 click action");
    }

    private void checkBoxCheckAction() {
        showToast("CheckBox check action");
    }

    private void helloWorldHint() {
        showToast("Hello World hint");
    }

    private void button1Hint() {
        showToast("Button 1 hint");
    }

    private void button2Hint() {
        showToast("Button 2 hint");
    }

    private void button3Hint() {
        showToast("Button 3 hint");
    }

    private void radioButtonHint() {
        showToast("RadioButton hint");
    }

    private void switchHint() {
        showToast("Switch hint");
    }

    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}

package com.example.f_calculator_project;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button no1, no2, no3, no4, no5, no6, no7, no8, no9, no0, add, div, mul, minus, clear, equal, decimal;
    private EditText input_ans;
    double inpt1=0,inpt2=0;
    boolean addition,subtraction,multiplication,division,Decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no0 = findViewById(R.id.button0);
        no1 = findViewById(R.id.button1);
        no2 = findViewById(R.id.button2);
        no3 = findViewById(R.id.button3);
        no4 = findViewById(R.id.button4);
        no5 = findViewById(R.id.button5);
        no6 = findViewById(R.id.button6);
        no7 = findViewById(R.id.button7);
        no8 = findViewById(R.id.button8);
        no9 = findViewById(R.id.button9);
        add = findViewById(R.id.buttonadd);
        div = findViewById(R.id.buttondiv);
        mul = findViewById(R.id.buttonmul);
        minus = findViewById(R.id.buttonsub);
        clear = findViewById(R.id.buttonDel);
        equal = findViewById(R.id.buttoneql);
        decimal = findViewById(R.id.buttonDot);
        input_ans = (EditText) findViewById(R.id.display);

        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"0");
            }
        });

        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"1");
            }
        });

        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"2");
            }
        });

        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"3");
            }
        });

        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"4");
            }
        });

        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"5");
            }
        });

        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"6");
            }
        });

        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"7");
            }
        });

        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"8");
            }
        });

        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText(input_ans.getText()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_ans.getText().length() !=0){
                    inpt1=Float.parseFloat(input_ans.getText()+"");
                    addition = true;
                    Decimal = false;
                    input_ans.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_ans.getText().length() !=0){
                    inpt1=Float.parseFloat(input_ans.getText()+"");
                    subtraction = true;
                    Decimal = false;
                    input_ans.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_ans.getText().length() !=0){
                    inpt1=Float.parseFloat(input_ans.getText()+"");
                    multiplication = true;
                    Decimal = false;
                    input_ans.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(input_ans.getText().length() !=0){
                    inpt1=Float.parseFloat(input_ans.getText()+"");
                    division = true;
                    Decimal = false;
                    input_ans.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(addition || subtraction || multiplication || division){
                    inpt2 = Float.parseFloat(input_ans.getText() + "");
                }
                if (addition) {
                    input_ans.setText(inpt1 + inpt2 + "");
                    addition = false;
                }
                if (subtraction) {
                    input_ans.setText(inpt1 - inpt2 + "");
                    subtraction = false;
                }
                if(multiplication){
                    input_ans.setText(inpt1*inpt2 +"");
                    multiplication=false;
                }
                if(division){
                    input_ans.setText(inpt1/inpt2 +"");
                    division=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input_ans.setText("");
                inpt2=0.0;
                inpt1=0.0;
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Decimal){
                    input_ans.setText("Error");
                }
                else {
                    input_ans.setText(input_ans.getText()+".");
                    Decimal=false;
                }
            }
        });

    }
}


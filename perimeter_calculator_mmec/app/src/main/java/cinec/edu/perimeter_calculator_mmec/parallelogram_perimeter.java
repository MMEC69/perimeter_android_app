package cinec.edu.perimeter_calculator_mmec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class parallelogram_perimeter extends AppCompatActivity {

    EditText horizontalEdge, verticalEdge;
    Button answerProceed;
    TextView answer;

    Button goBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram_perimeter);

        horizontalEdge = findViewById(R.id.horizontalEdge);
        verticalEdge = findViewById(R.id.verticalEdge);
        answerProceed = findViewById(R.id.answerProceed);
        answer = findViewById(R.id.answer);

        goBack = findViewById(R.id.goBack);

        answerProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double input1 = Double.parseDouble(horizontalEdge.getText().toString());
                double input2 = Double.parseDouble(verticalEdge.getText().toString());

                double result = (input1 + input2)*2;

                result = Math.round(result * 100.0) / 100.0;

                answer.setText(Double.toString(result));

            }
        });

        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
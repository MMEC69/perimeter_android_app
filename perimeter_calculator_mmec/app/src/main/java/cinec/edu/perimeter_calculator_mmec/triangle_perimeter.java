package cinec.edu.perimeter_calculator_mmec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle_perimeter extends AppCompatActivity {

    EditText edge1, edge2, edge3;
    Button answerProceed;
    TextView answer;

    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_perimeter);

        edge1 = findViewById(R.id.edge1);
        edge2 = findViewById(R.id.edge2);
        edge3 = findViewById(R.id.edge3);
        answerProceed = findViewById(R.id.answerProceed);
        answer = findViewById(R.id.answer);

        goBack = findViewById(R.id.goBack);

        answerProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double input1 = Double.parseDouble(edge1.getText().toString());
                double input2 = Double.parseDouble(edge2.getText().toString());
                double input3 = Double.parseDouble(edge3.getText().toString());

                double result = (input1 + input2 + input3);

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
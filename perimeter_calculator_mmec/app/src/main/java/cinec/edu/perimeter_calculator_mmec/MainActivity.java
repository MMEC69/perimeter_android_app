package cinec.edu.perimeter_calculator_mmec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton squareB, parallelogramB, rectangleB, rhombusB, trapezoidB, triangleB, circleB;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        squareB = findViewById(R.id.imageButtonSquare);
        parallelogramB = findViewById(R.id.imageButtonParellelogram);
        rectangleB = findViewById(R.id.imageButtonRectangle);
        rhombusB = findViewById(R.id.imageButtonRhomb);
        trapezoidB = findViewById(R.id.imageButtonTrapezoid);
        triangleB = findViewById(R.id.imageButtonTriangle);
        circleB = findViewById(R.id.imageButtonCircle);
//parallelogram_perimeter
        squareB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), square_perimeter.class);
                startActivity(intent);
            }
        });

        parallelogramB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), parallelogram_perimeter.class);
                startActivity(intent);
            }
        });

        rectangleB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), rectangle_perimeter.class);
                startActivity(intent);
            }
        });

        rhombusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), rhombus_perimeter.class);
                startActivity(intent);
            }
        });

        trapezoidB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), trapezoid_perimeter.class);
                startActivity(intent);
            }
        });

        triangleB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), triangle_perimeter.class);
                startActivity(intent);
            }
        });

        circleB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), circle_perimeter.class);
                startActivity(intent);
            }
        });


    }
}
package makara.com.menu_grids;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout main = findViewById(R.id.mainGrid);
//        Input Even
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all item of child gridView
        for (int i = 0; i<mainGrid.getChildCount();i++){

            //you can see , all the child item is Cardview, so we just cast object to Cardview

            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Here you can replace Toast to start Activity code
                    Toast.makeText(MainActivity.this, "Clicked at index"+ finalI,Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}

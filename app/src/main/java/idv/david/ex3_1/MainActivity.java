package idv.david.ex3_1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    private int color;
    private String shape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.shape_circle:
                shape = "circle";
                break;
            case R.id.shape_square:
                shape = "square";
                break;
            case R.id.blue:
                color = Color.BLUE;
                break;
            case R.id.red:
                color = Color.RED;
                break;
            case R.id.menuExit:
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }

        CustomView customView = new CustomView(this, color, shape);
        setContentView(customView);

        return true;
    }
}

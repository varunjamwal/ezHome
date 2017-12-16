package app.ez.ezhome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class HouseInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_info);
        String s = getIntent().getStringExtra("Title");
        ImageView view = (ImageView)findViewById(R.id.houseimage);
        TextView housetitle = (TextView)findViewById(R.id.housetitle);
        TextView  houseinf = (TextView)findViewById(R.id.houseinfo);
        houseinf.setSingleLine(false);
        switch(s){
            case "Home 1":
                view.setImageResource(R.drawable.image1);
                housetitle.setText(s);
                houseinf.setText("2 Bedroom\n\n Rent - ₹10000");
                break;
            case "Home 2":
                view.setImageResource(R.drawable.image2);
                housetitle.setText(s);
                houseinf.setText("2 Bedroom\n hall\n Kitchen\n\n Rent - ₹12000");
                break;
            case "Home 3":
                view.setImageResource(R.drawable.image3);
                housetitle.setText("Home 3");
                houseinf.setText("3 Bedroom\n hall\n Kitchen\n\n Rent - ₹18000");
                break;
            case "Home 4":
                view.setImageResource(R.drawable.image4);
                housetitle.setText("Home 4");
                houseinf.setText("3 Bedroom\n hall\n Kitchen\n\n Rent - ₹20000");
                break;
            case "Home 5":
                view.setImageResource(R.drawable.image5);
                housetitle.setText("Home 5");
                houseinf.setText("4 Bedroom\n hall\n Kitchen\n\n Rent - ₹21000");
                break;
                default:
                    break;
        }
    }

}

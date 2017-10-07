package nguyenhoangvannha.hoccackythuatxulysukien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtA,txtB;
    Button btnTru;
    Button btnNhan,btnChia;
    View.OnClickListener suKienChiaSe = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyPhepTru();
            }
        });
        suKienChiaSe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.btnNhan){
                    xuLyPhepNhan();
                }
                if(v.getId() == R.id.btnChia){
                    xuLyPhepChia();
                }
            }
        };
        btnNhan.setOnClickListener(suKienChiaSe);
        btnChia.setOnClickListener(suKienChiaSe);
    }

    private void xuLyPhepChia() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a/b;
        Toast.makeText(MainActivity.this,"Chia = " + c, Toast.LENGTH_LONG);
    }

    private void xuLyPhepNhan() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a*b;
        Toast.makeText(MainActivity.this,"Nhan = " + c, Toast.LENGTH_LONG);
    }


    private void addControls() {
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
    }

    private void xuLyPhepTru() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int s = a - b;
        Toast.makeText(MainActivity.this,"Tru = " + s,Toast.LENGTH_LONG).show();
    }



    public void xuLyPhepCong(View v){
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int s = a + b;
        Toast.makeText(MainActivity.this,"Sum = " + s,Toast.LENGTH_LONG).show();
    }
}

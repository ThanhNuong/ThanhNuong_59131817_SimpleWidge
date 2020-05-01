package vn.edu.ntu.thanhnuong.thanhnuong_59131817_simplewidge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkMovie,checkMusic, checkCoffe ,checkHome,checkkitchen;
    EditText edtTen, edtNgaySinh, edtSoThich;
    RadioGroup rdgGioiTinh;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //thêm các phương thức
        addViews();
        addEvents();
    }

    //khai báo phương thức addViews()
    private void addViews(){
        //thêm các id vào phương thức
        checkMovie = findViewById(R.id.checkMovie);
        checkMusic = findViewById(R.id.checkMusic);
        checkCoffe = findViewById(R.id.checkCoffe);
        checkHome = findViewById(R.id.checkHome);
        checkkitchen = findViewById(R.id.checkkitchen);

        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThich = findViewById(R.id.edtSoThich);

        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);

        btnXacNhan = findViewById(R.id.btnXacNhan);
    }

    //khai báo phương thức addEvents()
    private void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xacNhanTT();
            }
        });
    }

    //khai báo phuongư thức xacNhanTT()
    private void xacNhanTT() {
        String temp = ""; //khai báo biến temp để lưu các thông tin mình check trong checkbox

        temp = temp + "" + edtTen.getText().toString();
        temp = temp + "\nNgày sinh: " + edtNgaySinh.getText().toString();

        switch (rdgGioiTinh.getCheckedRadioButtonId()) {
            case R.id.rdbNam:
                temp = temp + "\nGiới tính: Nam";
                break;
            case R.id.rdbNu:
                temp = temp +  "\nGiới tính: Nữ";
                break;
        }

        temp = temp + "\nSở thích: ";
        if (checkMovie.isChecked()) {
            temp = temp + checkMovie.getText().toString();
            temp = temp + " , ";
        }
        if (checkMusic.isChecked()) {
            temp = temp + checkMusic.getText().toString();
            temp = temp + " , ";
        }
        if (checkCoffe.isChecked()) {
            temp = temp + checkCoffe.getText().toString();
            temp = temp + " , ";
        }
        if (checkHome.isChecked()) {
            temp = temp + checkHome.getText().toString();
            temp = temp + " , ";
        }
        if (checkkitchen.isChecked()) {
            temp = temp + checkkitchen.getText().toString();
            temp = temp + " , ";
        }

        temp = temp + edtSoThich.getText().toString();
        Toast.makeText(getApplicationContext(), temp, Toast.LENGTH_SHORT).show();
    }

}


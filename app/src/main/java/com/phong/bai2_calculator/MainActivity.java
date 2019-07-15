package com.phong.bai2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

import net.sourceforge.jeval.EvaluationException;
import net.sourceforge.jeval.Evaluator;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnCong, btnTru, btnNhan, btnChia, btnBang, btnCham, btnDelete;
    EditText edtHienThi;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);
        btnBang.setOnClickListener(this);
        btnCham.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
    }

    private void addControls() {
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);
        btnCham = (Button) findViewById(R.id.btnCham);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnBang = (Button) findViewById(R.id.btnBang);

        edtHienThi = (EditText) findViewById(R.id.edtHienThi);
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
    }

    void writeBieuHien(String value)
    {
        String hienthi = edtHienThi.getText().toString();
        hienthi = hienthi + value;

        edtHienThi.setText(hienthi);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn0:
                writeBieuHien("0");
                break;
            case R.id.btn1:
                writeBieuHien("1");
                break;
            case R.id.btn2:
                writeBieuHien("2");
                break;
            case R.id.btn3:
                writeBieuHien("3");
                break;
            case R.id.btn4:
                writeBieuHien("4");
                break;
            case R.id.btn5:
                writeBieuHien("5");
                break;
            case R.id.btn6:
                writeBieuHien("6");
                break;
            case R.id.btn7:
                writeBieuHien("7");
                break;
            case R.id.btn8:
                writeBieuHien("8");
                break;
            case R.id.btn9:
                writeBieuHien("9");
                break;
            case R.id.btnCong:
                writeBieuHien("+");
                break;
            case R.id.btnTru:
                writeBieuHien("-");
                break;
            case R.id.btnNhan:
                writeBieuHien("*");
                break;
            case R.id.btnChia:
                writeBieuHien("/");
                break;
            case R.id.btnDelete:
                edtHienThi.setText("");
                txtKetQua.setText("");
                break;
            case R.id.btnCham:
                writeBieuHien(".");
                break;
            case R.id.btnBang:
                String hienthi = edtHienThi.getText().toString();

                Expression e = new Expression(hienthi);
                String ketqua = String.valueOf(e.calculate());
                txtKetQua.setText(ketqua);
                break;
        }
    }
}

package com.skypan.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.skypan.helloworld.fragment.ContainerActivity;
import com.skypan.helloworld.gridview.GridViewActivity;
import com.skypan.helloworld.jump.AActivity;
import com.skypan.helloworld.listview.ListViewActivity;
import com.skypan.helloworld.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnLifeCycle;
    private Button mBtnJump;
    private Button mBtnFragment;
    private Button mBtnRv;
    private Button mBtnWebView;
    private Button mBtnToast;
    private Button mBtnDialog;
    private Button mBtnProgress;
    private Button mBtnCustomDialog;
    private Button mBtnPop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView = (Button) findViewById(R.id.btn_textview);
        mBtnButton = (Button) findViewById(R.id.btn_button);
        mBtnEditText = (Button) findViewById(R.id.btn_edittext);
        mBtnRadioButton = (Button) findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = (Button) findViewById(R.id.btn_checkbox);
        mBtnImageView = (Button) findViewById(R.id.btn_imageview);
        mBtnListView = (Button) findViewById(R.id.btn_listview);
        mBtnGridView = (Button) findViewById(R.id.btn_gridview);
        mBtnLifeCycle = (Button) findViewById(R.id.btn_lifecycle);
        mBtnJump = (Button) findViewById(R.id.btn_jump);
        mBtnFragment = (Button) findViewById(R.id.btn_fragment);
        mBtnRv = (Button) findViewById(R.id.btn_recyclerview);
        mBtnWebView = (Button) findViewById(R.id.btn_webview);
        mBtnToast = (Button) findViewById(R.id.btn_toast);
        mBtnDialog = (Button) findViewById(R.id.btn_dialog);
        mBtnProgress = (Button) findViewById(R.id.btn_progress);
        mBtnCustomDialog = (Button) findViewById(R.id.btn_custom_dialog);
        mBtnPop = (Button) findViewById(R.id.btn_pop);
        setListeners();
    }

    private void setListeners() {
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnLifeCycle.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
        mBtnWebView.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomDialog.setOnClickListener(onClick);
        mBtnPop.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()) {
                case R.id.btn_textview:
                    //?????????TextView????????????
                    intent = new Intent(UIActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //?????????Button????????????
                    intent = new Intent(UIActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //?????????EditText????????????
                    intent = new Intent(UIActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //?????????RadioButton????????????
                    intent = new Intent(UIActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    //?????????CheckBox????????????
                    intent = new Intent(UIActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    //?????????ImageView????????????
                    intent = new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    //?????????ListView????????????
                    intent = new Intent(UIActivity.this, ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    //?????????GridView????????????
                    intent = new Intent(UIActivity.this, GridViewActivity.class);
                    break;
                case R.id.btn_lifecycle:
                    //?????????LifeCycle????????????
                    intent = new Intent(UIActivity.this, LifeCycleActivity.class);
                    break;
                case R.id.btn_jump:
                    //?????????AActivity????????????
                    intent = new Intent(UIActivity.this, AActivity.class);
                    break;
                case R.id.btn_fragment:
                    //?????????Fragment????????????
                    intent = new Intent(UIActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    //?????????RecyclerView????????????
                    intent = new Intent(UIActivity.this, RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    //?????????WebView????????????
                    intent = new Intent(UIActivity.this, WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    //?????????Toast????????????
                    intent = new Intent(UIActivity.this, ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    //?????????Dialog????????????
                    intent = new Intent(UIActivity.this, DialogActivity.class);
                    break;
                case R.id.btn_progress:
                    //?????????Progress????????????
                    intent = new Intent(UIActivity.this, ProgressActivity.class);
                    break;
                case R.id.btn_custom_dialog:
                    //??????????????????Dialog????????????
                    intent = new Intent(UIActivity.this, CustomDialogActivity.class);
                    break;
                case R.id.btn_pop:
                    //?????????PopupWindow????????????
                    intent = new Intent(UIActivity.this, PopupWindowActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}

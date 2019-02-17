package com.example.testdialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;


public class HintDialog extends Dialog {
    public HintDialog(@NonNull Context context) {
        this(context, R.style.HintDialog);
    }

    public HintDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);
    }

    public void showDialog(){
        if (isShowing()) {
            dismiss();
        }
        setCanceledOnTouchOutside(true);
        show();
    }

    public void dismissDialog() {
        if (isShowing()) {
            dismiss();
        }
    }
}

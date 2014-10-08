package com.saynomoo.mig4android.resize;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.saynomoo.mig4android.MigLayout;


public class ComponentResizer {
    public static void openResizer(final View view){
        final MigLayout.LayoutParams oldParams = (MigLayout.LayoutParams) view.getLayoutParams();
        final EditText input = new EditText(view.getContext());
        input.setText(oldParams.getConstraintString());
        final AlertDialog alert = new AlertDialog.Builder(view.getContext())
            .setTitle("Update Layout")
            .setView(input)
            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {}
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if (view.getLayoutParams() != oldParams) {
                    view.setLayoutParams(oldParams);
                }
            }
        }).show();
        input.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            public void afterTextChanged(Editable s) {}
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    view.setLayoutParams(new MigLayout.LayoutParams(s.toString()));
                    alert.getButton(DialogInterface.BUTTON_POSITIVE).setEnabled(true);

                } catch (Exception e) {
                    alert.getButton(DialogInterface.BUTTON_POSITIVE).setEnabled(false);
                }
            }
        });
    }

}

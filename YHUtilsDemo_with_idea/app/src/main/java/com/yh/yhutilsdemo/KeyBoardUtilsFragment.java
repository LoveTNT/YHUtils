package com.yh.yhutilsdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.lidroid.xutils.view.annotation.event.OnClick;
import xyz.yhsj.yhutils.tools.keyboard.KeyBoardUtils;


/**
 * A simple {@link Fragment} subclass.
 */
public class KeyBoardUtilsFragment extends Fragment {

    private Context context;

    @ViewInject(R.id.ed1)
    private EditText ed1;


    public KeyBoardUtilsFragment(Context context) {
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_keyboard_utils, container, false);
        ViewUtils.inject(this, rootView);

        return rootView;
    }

    @OnClick(R.id.screen)
    public void btnListener(View v) {
        if (v.getId() == R.id.screen) {

            KeyBoardUtils.closeKeybord(ed1, context);
        }
    }


}

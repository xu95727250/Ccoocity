package citypass.jiyun.com.citypass.control.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import citypass.jiyun.com.citypass.App;

/**
 * Created by my on 2017/5/13.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewId());
        App.activity = this;
//        ButterKnife.bind(this);
        initData();
        initListener();
    }

    @Override
    protected void onResume() {
        super.onResume();
            loadData();
    }

    public abstract int getViewId(); //获取布局
    public abstract void initData(); //初始化数据
    public abstract void loadData(); //加载数据
    public abstract void initListener(); //初始化监听
    public void initView(){}; //初始化View

}

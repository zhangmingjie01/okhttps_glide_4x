package https.android.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    private ImageView mIv_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIv_img = (ImageView) findViewById(R.id.iv_img);


    }

    public void getHttpsImg(View view) {
        String url = "https://ad.12306.cn/res/delivery/0003/2018/09/17/201809171655222864.jpg";
        RequestOptions options = new RequestOptions();
        options.placeholder(R.mipmap.ic_launcher)
                .centerCrop()
                .error(R.mipmap.ic_launcher)
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide.with(MainActivity.this)
                .load(url)
                .apply(options)
                .into(mIv_img);

    }
}

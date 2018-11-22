package strategy.strike.block.boost.boostblockstrikestrategy;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import strategy.strike.block.boost.boostblockstrikestrategy.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }

    public void start(View view) {
        if(mBinding.checkBox.isChecked()){
            startActivity(new Intent(MainActivity.this, OptionsActivity.class));
        }
        else{
            Toast.makeText(this, "Agree with our Privacy and Policy first", Toast.LENGTH_SHORT).show();
        }
    }

    public void privacy_policy(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://policiesas.blogspot.com/?m=1"));
        startActivity(browserIntent);
    }
}

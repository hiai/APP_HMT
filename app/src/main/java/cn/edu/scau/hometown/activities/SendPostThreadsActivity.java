package cn.edu.scau.hometown.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.keyboard.EmoticonsKeyBoardPopWindow;
import com.keyboard.view.EmoticonsEditText;

import cn.edu.scau.hometown.R;
import cn.edu.scau.hometown.tools.EmoticonsUtils;

public class SendPostThreadsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private String author;
    private EmoticonsKeyBoardPopWindow mKeyBoardPopWindow;
    private EmoticonsEditText et_content;
    private ImageView inputFace;
    private Button send_post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_post_threads);
        author = (String) getIntent().getSerializableExtra("author");
        et_content = (EmoticonsEditText) findViewById(R.id.et_content);
        inputFace = (ImageView) findViewById(R.id.s);

        inputFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mKeyBoardPopWindow.showPopupWindow();
            }
        });
        send_post= (Button) findViewById(R.id.send_post);
        send_post.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), et_content.getText().toString()+"\n"+getAccessToken(SendPostThreadsActivity.this), Toast.LENGTH_LONG).show();
            }
        });
        initKeyBoardPopWindow();
        InitToolBar();

    }

    public void initKeyBoardPopWindow() {
        mKeyBoardPopWindow = new EmoticonsKeyBoardPopWindow(this);
        mKeyBoardPopWindow.setBuilder(EmoticonsUtils.getSimpleBuilder(this));
        mKeyBoardPopWindow.setEditText(et_content);

    }

    private void InitToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("回复 " + author);
        toolbar.setBackgroundColor(getResources().getColor(R.color.tab_blue));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private String getAccessToken(Context context) {
        SharedPreferences sp = context.getSharedPreferences("config", MODE_PRIVATE);
        return  sp.getString("accessToken", "尚未授权").toString();
    }
}

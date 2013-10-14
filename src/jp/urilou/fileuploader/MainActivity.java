package jp.urilou.fileuploader;

import com.example.fileuploader.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		((Button)findViewById(R.id.button1)).setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.button1){
		      new Uploader(this).execute("/sdcard/1378617087449.mp4");
		      // �A�b�v���[�h����t�@�C�������w�肷��
		      // PHP�̃A�b�v���[�h�ł���ő�̃t�@�C���T�C�Y�ݒ�ɒ��ӂ���
		    }
	}

}

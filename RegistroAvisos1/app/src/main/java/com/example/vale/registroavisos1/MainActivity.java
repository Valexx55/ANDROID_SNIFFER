package com.example.vale.registroavisos1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//EJEMPLO DE CÓMO  LANZAR UNA APP SIN INTERFAZ QUE SE ACTIVE AL RECIBIR MENSAJES DE TEXTO
    /**
     *
     * public class SafetyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
    ActivityManager as = (ActivityManager) context
    .getSystemService(Activity.ACTIVITY_SERVICE);
    if (IsNavigationRunning(as)) {
    Intent i = new Intent(context, VoiceActivity.class);
    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(i);
    }
    }
    }

     <application
     android:icon="@drawable/fot"
     android:label="@string/app_name" >
     <activity
     android:name="com.Safety.VoiceActivity"
     android:launchMode="singleTop"
     android:theme="@style/Theme.CompletelyTransparentWindow" >
     </activity>
     <receiver
     android:name="com.Safety.SafetyReceiver"
     android:process=":goodprocess" >
     <intent-filter>
     <action android:name="android.provider.Telephony.SMS_RECEIVED" />
     </intent-filter>
     </receiver>
     </application>
     *
     *
     *
     */
}

package com.example.vale.registroavisos1;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import android.widget.RemoteViews;

public class ServiNotis extends NotificationListenerService {
    public ServiNotis() {
    }


    

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
       return super.onBind(intent);
    }


    /**
     *
     * @param bundle La información adjunta en la notificación
     * @return la información contenida en el bundle, concantenada y transformada en Strings
     */
    private static String bundle2string(Bundle bundle) {
        String strdev = null;

            strdev = "Inicio Bundle{";
            for (String key : bundle.keySet()) //foreach
            {
                strdev += " " + key + " => " + bundle.get(key) + ";";
            }
            strdev += " }FIN Bundle";

        return strdev;
    }



    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        super.onNotificationPosted(sbn);
        Log.d(getClass().getCanonicalName(), "NOTIFICACION RECIBIDA");
        Log.d(getClass().getCanonicalName(), "PAQUETE = " + sbn.getPackageName());

        Notification notification = sbn.getNotification();

        Bundle bundle = notification.extras;

        Log.d(getClass().getCanonicalName(), "Bundle = " + bundle2string(bundle));

        /**
         * Borrar una app tras recibir un código ...
         *
         * Intent intent=new Intent(Intent.ACTION_DELETE);
         intent.setData(Uri.parse("package:"+packageName));
         startActivity(intent);
         */

    }

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
        Log.d(getClass().getCanonicalName(), "LISTENER CONNECTED");
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn) {
        super.onNotificationRemoved(sbn);

        Log.d(getClass().getCanonicalName(), "NOTIFICACION ELIMINADA");
        Log.d(getClass().getCanonicalName(), "PAQUETE = " + sbn.getPackageName());
    }
}

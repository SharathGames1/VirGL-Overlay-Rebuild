package com.mittorn.virgloverlay.process;

public class p3 extends android.app.Service
{
    @Override
    public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
    }
	@Override
    public void onCreate() {
		super.onCreate();
		com.mittorn.virgloverlay.common.overlay.start(this,3);
		}
	@Override
    public void onDestroy() {
		super.onDestroy();
		com.mittorn.virgloverlay.common.overlay.restart_services(1);
		System.exit(0);
		}
}

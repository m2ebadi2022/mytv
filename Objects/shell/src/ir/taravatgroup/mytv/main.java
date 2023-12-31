
package ir.taravatgroup.mytv;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "ir.taravatgroup.mytv.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _player1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
public static RemoteObject _simpleexoplayerview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
public static RemoteObject _pan_all = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _isinital_player = RemoteObject.createImmutable(0);
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _web_setting = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
public static RemoteObject _current_site = RemoteObject.createImmutable(0);
public static RemoteObject _rd_vertical = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _rd_horiz = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static RemoteObject _rd_fit = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
public static ir.taravatgroup.mytv.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"current_site",main._current_site,"isinital_player",main._isinital_player,"pan_all",main.mostCurrent._pan_all,"player1",main._player1,"rd_fit",main.mostCurrent._rd_fit,"rd_horiz",main.mostCurrent._rd_horiz,"rd_vertical",main.mostCurrent._rd_vertical,"SimpleExoPlayerView1",main.mostCurrent._simpleexoplayerview1,"Starter",Debug.moduleToString(ir.taravatgroup.mytv.starter.class),"web_setting",main.mostCurrent._web_setting,"WebView1",main.mostCurrent._webview1};
}
}
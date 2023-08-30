package ir.taravatgroup.mytv;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,40);
if (RapidSub.canDelegate("activity_create")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 44;BA.debugLine="Activity.LoadLayout(\"home_layout\")";
Debug.ShouldStop(2048);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("home_layout")),main.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="web_setting.setAllowFileAccess(WebView1,True)";
Debug.ShouldStop(8192);
main.mostCurrent._web_setting.runVoidMethod ("setAllowFileAccess",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 47;BA.debugLine="web_setting.setAppCacheEnabled(WebView1,True)";
Debug.ShouldStop(16384);
main.mostCurrent._web_setting.runVoidMethod ("setAppCacheEnabled",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 48;BA.debugLine="web_setting.setDatabaseEnabled(WebView1,True)";
Debug.ShouldStop(32768);
main.mostCurrent._web_setting.runVoidMethod ("setDatabaseEnabled",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 49;BA.debugLine="web_setting.setDOMStorageEnabled(WebView1,True)";
Debug.ShouldStop(65536);
main.mostCurrent._web_setting.runVoidMethod ("setDOMStorageEnabled",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 50;BA.debugLine="web_setting.setJavaScriptCanOpenWindowsAutomatica";
Debug.ShouldStop(131072);
main.mostCurrent._web_setting.runVoidMethod ("setJavaScriptCanOpenWindowsAutomatically",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 51;BA.debugLine="web_setting.setLightTouchEnabled(WebView1,True)";
Debug.ShouldStop(262144);
main.mostCurrent._web_setting.runVoidMethod ("setLightTouchEnabled",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 52;BA.debugLine="web_setting.setLoadsImagesAutomatically(WebView1,";
Debug.ShouldStop(524288);
main.mostCurrent._web_setting.runVoidMethod ("setLoadsImagesAutomatically",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 53;BA.debugLine="web_setting.setUserAgentString(WebView1,\"Mozilla/";
Debug.ShouldStop(1048576);
main.mostCurrent._web_setting.runVoidMethod ("setUserAgentString",(Object)((main.mostCurrent._webview1.getObject())),(Object)(RemoteObject.createImmutable("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Safari/537.36 Edge/12.246")));
 BA.debugLineNum = 54;BA.debugLine="web_setting.setUseWideViewPort(WebView1,True)";
Debug.ShouldStop(2097152);
main.mostCurrent._web_setting.runVoidMethod ("setUseWideViewPort",(Object)((main.mostCurrent._webview1.getObject())),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,93);
if (RapidSub.canDelegate("activity_keypress")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 93;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 95;BA.debugLine="If(pan_all.Visible=True)Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",main.mostCurrent._pan_all.runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 96;BA.debugLine="pan_all.Visible=False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._pan_all.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="If(isinital_player=1)Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",main._isinital_player,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 98;BA.debugLine="player1.Release";
Debug.ShouldStop(2);
main._player1.runVoidMethod ("Release");
 BA.debugLineNum = 99;BA.debugLine="isinital_player=0";
Debug.ShouldStop(4);
main._isinital_player = BA.numberCast(int.class, 0);
 };
 }else 
{ BA.debugLineNum = 102;BA.debugLine="Else If (current_site=1)Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",main._current_site,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 104;BA.debugLine="If (WebView1.Url <> \"https://www.uptvs.com/\")Th";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("!",main.mostCurrent._webview1.runMethod(true,"getUrl"),RemoteObject.createImmutable("https://www.uptvs.com/")))) { 
 BA.debugLineNum = 105;BA.debugLine="WebView1.LoadUrl(\"https://www.uptvs.com/\")";
Debug.ShouldStop(256);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.uptvs.com/")));
 }else {
 BA.debugLineNum = 107;BA.debugLine="WebView1.Visible=False";
Debug.ShouldStop(1024);
main.mostCurrent._webview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="WebView1.LoadUrl(\"\")";
Debug.ShouldStop(2048);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 109;BA.debugLine="current_site=0";
Debug.ShouldStop(4096);
main._current_site = BA.numberCast(int.class, 0);
 };
 }else 
{ BA.debugLineNum = 111;BA.debugLine="Else If (current_site=2)Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",main._current_site,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 113;BA.debugLine="If (WebView1.Url <> \"https://www.namasha.com/\")";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("!",main.mostCurrent._webview1.runMethod(true,"getUrl"),RemoteObject.createImmutable("https://www.namasha.com/")))) { 
 BA.debugLineNum = 114;BA.debugLine="WebView1.LoadUrl(\"https://www.namasha.com/\")";
Debug.ShouldStop(131072);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.namasha.com/")));
 }else {
 BA.debugLineNum = 116;BA.debugLine="WebView1.Visible=False";
Debug.ShouldStop(524288);
main.mostCurrent._webview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 117;BA.debugLine="WebView1.LoadUrl(\"\")";
Debug.ShouldStop(1048576);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 118;BA.debugLine="current_site=0";
Debug.ShouldStop(2097152);
main._current_site = BA.numberCast(int.class, 0);
 };
 }else 
{ BA.debugLineNum = 121;BA.debugLine="Else If (current_site=3)Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",main._current_site,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 123;BA.debugLine="If (WebView1.Url <> \"https://www.aparat.com/\")T";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("!",main.mostCurrent._webview1.runMethod(true,"getUrl"),RemoteObject.createImmutable("https://www.aparat.com/")))) { 
 BA.debugLineNum = 124;BA.debugLine="WebView1.LoadUrl(\"https://www.aparat.com/\")";
Debug.ShouldStop(134217728);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.aparat.com/")));
 }else {
 BA.debugLineNum = 126;BA.debugLine="WebView1.Visible=False";
Debug.ShouldStop(536870912);
main.mostCurrent._webview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 127;BA.debugLine="WebView1.LoadUrl(\"\")";
Debug.ShouldStop(1073741824);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 128;BA.debugLine="current_site=0";
Debug.ShouldStop(-2147483648);
main._current_site = BA.numberCast(int.class, 0);
 };
 }else {
 BA.debugLineNum = 132;BA.debugLine="ExitApplication";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 }}}}
;
 BA.debugLineNum = 136;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 138;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,62);
if (RapidSub.canDelegate("activity_pause")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 62;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("activity_resume")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private SimpleExoPlayerView1 As SimpleExoPlayerVi";
main.mostCurrent._simpleexoplayerview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private pan_all As Panel";
main.mostCurrent._pan_all = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim isinital_player As Int=0";
main._isinital_player = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 30;BA.debugLine="Private WebView1 As WebView";
main.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim web_setting As WebViewSettings";
main.mostCurrent._web_setting = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 32;BA.debugLine="Dim current_site As Int=0";
main._current_site = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 34;BA.debugLine="Private rd_vertical As RadioButton";
main.mostCurrent._rd_vertical = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private rd_horiz As RadioButton";
main.mostCurrent._rd_horiz = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private rd_fit As RadioButton";
main.mostCurrent._rd_fit = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _pan_all_click() throws Exception{
try {
		Debug.PushSubsStack("pan_all_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,144);
if (RapidSub.canDelegate("pan_all_click")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","pan_all_click");}
 BA.debugLineNum = 144;BA.debugLine="Private Sub pan_all_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan_aparat_click() throws Exception{
try {
		Debug.PushSubsStack("pan_aparat_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,198);
if (RapidSub.canDelegate("pan_aparat_click")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","pan_aparat_click");}
 BA.debugLineNum = 198;BA.debugLine="Private Sub pan_aparat_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="WebView1.Visible=True";
Debug.ShouldStop(64);
main.mostCurrent._webview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 200;BA.debugLine="WebView1.LoadUrl(\"https://www.aparat.com/\")";
Debug.ShouldStop(128);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.aparat.com/")));
 BA.debugLineNum = 201;BA.debugLine="current_site=3";
Debug.ShouldStop(256);
main._current_site = BA.numberCast(int.class, 3);
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan_namasha_click() throws Exception{
try {
		Debug.PushSubsStack("pan_namasha_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,188);
if (RapidSub.canDelegate("pan_namasha_click")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","pan_namasha_click");}
 BA.debugLineNum = 188;BA.debugLine="Private Sub pan_namasha_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="WebView1.Visible=True";
Debug.ShouldStop(268435456);
main.mostCurrent._webview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 190;BA.debugLine="WebView1.LoadUrl(\"https://www.namasha.com/\")";
Debug.ShouldStop(536870912);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.namasha.com/")));
 BA.debugLineNum = 191;BA.debugLine="current_site=2";
Debug.ShouldStop(1073741824);
main._current_site = BA.numberCast(int.class, 2);
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan_uptv_click() throws Exception{
try {
		Debug.PushSubsStack("pan_uptv_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,182);
if (RapidSub.canDelegate("pan_uptv_click")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","pan_uptv_click");}
 BA.debugLineNum = 182;BA.debugLine="Private Sub pan_uptv_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="WebView1.Visible=True";
Debug.ShouldStop(4194304);
main.mostCurrent._webview1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 184;BA.debugLine="WebView1.LoadUrl(\"https://www.uptvs.com/\")";
Debug.ShouldStop(8388608);
main.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("https://www.uptvs.com/")));
 BA.debugLineNum = 185;BA.debugLine="current_site=1";
Debug.ShouldStop(16777216);
main._current_site = BA.numberCast(int.class, 1);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _play_now(RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("play_now (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("play_now")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","play_now", _link);}
Debug.locals.put("link", _link);
 BA.debugLineNum = 67;BA.debugLine="Sub play_now(link As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="If(rd_fit.Checked=True)Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",main.mostCurrent._rd_fit.runMethod(true,"getChecked"),main.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 70;BA.debugLine="SimpleExoPlayerView1.ResizeMode=\"FIT\"";
Debug.ShouldStop(32);
main.mostCurrent._simpleexoplayerview1.runVoidMethod ("setResizeMode",BA.ObjectToString("FIT"));
 }else 
{ BA.debugLineNum = 71;BA.debugLine="Else If (rd_horiz.Checked=True)Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("=",main.mostCurrent._rd_horiz.runMethod(true,"getChecked"),main.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 72;BA.debugLine="SimpleExoPlayerView1.ResizeMode=\"FIXED_WIDTH\"";
Debug.ShouldStop(128);
main.mostCurrent._simpleexoplayerview1.runVoidMethod ("setResizeMode",BA.ObjectToString("FIXED_WIDTH"));
 }else {
 BA.debugLineNum = 74;BA.debugLine="SimpleExoPlayerView1.ResizeMode=\"FIXED_HEIGHT\"";
Debug.ShouldStop(512);
main.mostCurrent._simpleexoplayerview1.runVoidMethod ("setResizeMode",BA.ObjectToString("FIXED_HEIGHT"));
 }}
;
 BA.debugLineNum = 77;BA.debugLine="If(isinital_player=1)Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",main._isinital_player,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 78;BA.debugLine="player1.Release";
Debug.ShouldStop(8192);
main._player1.runVoidMethod ("Release");
 BA.debugLineNum = 79;BA.debugLine="isinital_player=0";
Debug.ShouldStop(16384);
main._isinital_player = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 82;BA.debugLine="pan_all.Visible=True";
Debug.ShouldStop(131072);
main.mostCurrent._pan_all.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="player1.Initialize(\"player\")";
Debug.ShouldStop(262144);
main._player1.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("player")));
 BA.debugLineNum = 84;BA.debugLine="player1.Prepare(player1.CreateUriSource(link))";
Debug.ShouldStop(524288);
main._player1.runVoidMethod ("Prepare",(Object)(main._player1.runMethod(false,"CreateUriSource",(Object)(_link))));
 BA.debugLineNum = 87;BA.debugLine="SimpleExoPlayerView1.Player = player1 'Connect th";
Debug.ShouldStop(4194304);
main.mostCurrent._simpleexoplayerview1.runVoidMethod ("setPlayer",main._player1);
 BA.debugLineNum = 88;BA.debugLine="player1.Play";
Debug.ShouldStop(8388608);
main._player1.runVoidMethod ("Play");
 BA.debugLineNum = 89;BA.debugLine="isinital_player=1";
Debug.ShouldStop(16777216);
main._isinital_player = BA.numberCast(int.class, 1);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("ir.taravatgroup.mytv.main");
starter.myClass = BA.getDeviceClass ("ir.taravatgroup.mytv.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private player1 As SimpleExoPlayer";
main._player1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SimpleExoPlayerWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _webview1_overrideurl(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebView1_OverrideUrl (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,148);
if (RapidSub.canDelegate("webview1_overrideurl")) { return ir.taravatgroup.mytv.main.remoteMe.runUserSub(false, "main","webview1_overrideurl", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 148;BA.debugLine="Private Sub WebView1_OverrideUrl (Url As String) A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 151;BA.debugLine="If(current_site=1)Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("=",main._current_site,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 152;BA.debugLine="If(Url.Contains(\"upera.tv\") Or Url.Contains(\"150";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean(".",_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("upera.tv")))) || RemoteObject.solveBoolean(".",_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("150.uptv")))))) { 
 BA.debugLineNum = 153;BA.debugLine="play_now(Url)";
Debug.ShouldStop(16777216);
_play_now(_url);
 BA.debugLineNum = 154;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 }else 
{ BA.debugLineNum = 157;BA.debugLine="Else If (current_site=2)Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",main._current_site,BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 159;BA.debugLine="If(Url.Contains(\"videos/dl/\"))Then";
Debug.ShouldStop(1073741824);
if ((_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("videos/dl/")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 160;BA.debugLine="play_now(Url)";
Debug.ShouldStop(-2147483648);
_play_now(_url);
 BA.debugLineNum = 161;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 }else 
{ BA.debugLineNum = 164;BA.debugLine="Else If (current_site=3)Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",main._current_site,BA.numberCast(double.class, 3)))) { 
 BA.debugLineNum = 166;BA.debugLine="If(Url.Contains(\"/aparat-video/\") )Then";
Debug.ShouldStop(32);
if ((_url.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("/aparat-video/")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 167;BA.debugLine="play_now(Url)";
Debug.ShouldStop(64);
_play_now(_url);
 BA.debugLineNum = 168;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 }}}
;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
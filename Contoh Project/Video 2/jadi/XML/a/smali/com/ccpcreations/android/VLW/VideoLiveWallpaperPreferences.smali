.class public Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;
.super Landroid/preference/PreferenceActivity;
.source "VideoLiveWallpaperPreferences.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static currentVersion:I


# instance fields
.field private final DIALOG_ABOUT:I

.field private final DIALOG_CHANGELOG:I

.field private final DIALOG_DONATE:I

.field private final DIALOG_EULA:I

.field private final DIALOG_HELP:I

.field private callbackHandler:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const/4 v0, -0x1

    sput v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->currentVersion:I

    .line 36
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/preference/PreferenceActivity;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->callbackHandler:Landroid/os/Handler;

    .line 38
    const/16 v0, 0x3e9

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->DIALOG_DONATE:I

    .line 39
    const/16 v0, 0x3ea

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->DIALOG_ABOUT:I

    .line 40
    const/16 v0, 0x3eb

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->DIALOG_CHANGELOG:I

    .line 41
    const/16 v0, 0x3ec

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->DIALOG_HELP:I

    .line 42
    const/16 v0, 0x3ed

    iput v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->DIALOG_EULA:I

    .line 36
    return-void
.end method

.method static synthetic access$0(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)Landroid/os/Handler;
    .locals 1
    .parameter

    .prologue
    .line 37
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->callbackHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1()I
    .locals 1

    .prologue
    .line 43
    sget v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->currentVersion:I

    return v0
.end method

.method private getChangelogText()Ljava/lang/String;
    .locals 2

    .prologue
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .local v0, sb:Ljava/lang/StringBuilder;
    const-string v1, "<p><b>v0.84b, published 2011-03-20</b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    const-string v1, "<ul>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    const-string v1, "<li>fixed a bug which prevented this app from working on certain devices like Dell Streak (thanks to guyver3869 for testing)</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    const-string v1, "<li>fixed a minor memory usage bug, still working on the bigger one</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    const-string v1, "</ul></p>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    const-string v1, "<p><b>v0.83b, published 2010-12-06</b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    const-string v1, "<ul>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    const-string v1, "<li>fixed a bug where memory consumption would slowly raise and eventually crashed the app</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    const-string v1, "<li>a new feature/setting called Rendering mode is introduced</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    const-string v1, "</ul></p>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    const-string v1, "<p><b>v0.82b, published 2010-10-13</b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    const-string v1, "<ul>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    const-string v1, "<li>fixed a bug where changelog kept showing in settings. Sorry about this!</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    const-string v1, "</ul></p>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    const-string v1, "<p><b>v0.81b, published 2010-10-13</b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    const-string v1, "<ul>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    const-string v1, "<li>fixed a bug where selecting certain directories would cause force closes</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    const-string v1, "<li>fixed a bug where selecting a different video file would have no effect (thanks to <i>rod</i> for discovering the bug)</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    const-string v1, "<li>corrected grammatical errors in help</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    const-string v1, "</ul></p>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    const-string v1, "<p><b>v0.80b, published 2010-10-10</b>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    const-string v1, "<ul>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    const-string v1, "<li>initial release</li>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    const-string v1, "</ul></p>"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private getEulaText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 155
    const-string v0, "<p>By installing and using this application, you agree to the following: the application is provided &quot;as is&quot;, without warranty of any kind, express or implied, including but not limited to the warranties of merchantability, fitness for a particular purpose and noninfringement. In no event shall the author be liable for any claim, damages or other liability, whether in an action of contract, tort or otherwise, arising from, out of or in connection with the application.</p><p>Video Live Wallpaper is dinamically linked with the FFmpeg library licenced under the LGPLv2.1. <a href=\'http://ffmpeg.org/\'>http://ffmpeg.org/</a>. The library\'s source was taken directly from the amazing Rock Player project by Redirect Intelligence. <a href=\'http://rockplayer.freecoder.org/\'>http://rockplayer.freecoder.org/</a>. The source code of the FFmpeg library can be found there.</p>"

    return-object v0
.end method

.method private setStateBasedOnDirectory(Z)V
    .locals 2
    .parameter "isDirectory"

    .prologue
    .line 137
    const-string v1, "recursive_dir"

    invoke-virtual {p0, v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 138
    .local v0, p:Landroid/preference/Preference;
    invoke-virtual {v0, p1}, Landroid/preference/Preference;->setEnabled(Z)V

    .line 139
    const-string v1, "random_file_mode"

    invoke-virtual {p0, v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 140
    invoke-virtual {v0, p1}, Landroid/preference/Preference;->setEnabled(Z)V

    .line 141
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10
    .parameter "savedInstanceState"

    .prologue
    const/4 v9, 0x0

    .line 53
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    const/high16 v6, 0x7f04

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->addPreferencesFromResource(I)V

    .line 55
    new-instance v6, Landroid/os/Handler;

    invoke-direct {v6}, Landroid/os/Handler;-><init>()V

    iput-object v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->callbackHandler:Landroid/os/Handler;

    .line 56
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    .line 59
    .local v4, spe:Landroid/content/SharedPreferences;
    :try_start_0
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    const-string v7, "com.ccpcreations.android.VLW"

    const/16 v8, 0x80

    invoke-virtual {v6, v7, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 60
    .local v3, pi:Landroid/content/pm/PackageInfo;
    iget v6, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    sput v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->currentVersion:I

    .line 61
    sget v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->currentVersion:I

    if-gtz v6, :cond_0

    .line 62
    new-instance v6, Ljava/lang/RuntimeException;

    const-string v7, "App version is <=0!"

    invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v6
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .end local v3           #pi:Landroid/content/pm/PackageInfo;
    :catch_0
    move-exception v6

    move-object v0, v6

    .line 64
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v6, Ljava/lang/RuntimeException;

    invoke-direct {v6, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v6

    .line 67
    .end local v0           #e:Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v3       #pi:Landroid/content/pm/PackageInfo;
    :cond_0
    const-string v6, "pick_a_file"

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 68
    .local v2, p:Landroid/preference/Preference;
    new-instance v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;

    invoke-direct {v6, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v2, v6}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 79
    const-string v6, "video"

    const/4 v7, 0x0

    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 80
    .local v5, videoFileName:Ljava/lang/String;
    if-nez v5, :cond_2

    .line 81
    invoke-direct {p0, v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->setStateBasedOnDirectory(Z)V

    .line 82
    const v6, 0x7f07000c

    invoke-virtual {v2, v6}, Landroid/preference/Preference;->setSummary(I)V

    .line 89
    :goto_0
    const-string v6, "donate_btn"

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 90
    new-instance v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$2;

    invoke-direct {v6, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$2;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v2, v6}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 98
    const-string v6, "help_btn"

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 99
    new-instance v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$3;

    invoke-direct {v6, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$3;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v2, v6}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 107
    const-string v6, "about_btn"

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 108
    new-instance v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$4;

    invoke-direct {v6, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$4;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v2, v6}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 118
    const-string v6, "changelog_btn"

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v2

    .line 119
    new-instance v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$5;

    invoke-direct {v6, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$5;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v2, v6}, Landroid/preference/Preference;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 129
    const-string v6, "EulaAgreed"

    invoke-interface {v4, v6, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_3

    .line 130
    const/16 v6, 0x3ed

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->showDialog(I)V

    .line 134
    :cond_1
    :goto_1
    return-void

    .line 84
    :cond_2
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    .local v1, file:Ljava/io/File;
    invoke-virtual {v2, v5}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 86
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v6

    invoke-direct {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->setStateBasedOnDirectory(Z)V

    goto :goto_0

    .line 131
    .end local v1           #file:Ljava/io/File;
    :cond_3
    const-string v6, "ChangelogLastViewed"

    invoke-interface {v4, v6, v9}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v6

    sget v7, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->currentVersion:I

    if-eq v6, v7, :cond_1

    .line 132
    const/16 v6, 0x3eb

    invoke-virtual {p0, v6}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->showDialog(I)V

    goto :goto_1
.end method

.method protected onCreateDialog(I)Landroid/app/Dialog;
    .locals 12
    .parameter "id"

    .prologue
    const/4 v11, 0x0

    const v10, 0x7f070002

    .line 202
    new-instance v7, Ljava/lang/StringBuilder;

    const v8, 0x7f070008

    invoke-virtual {p0, v8}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, "\r\nURL: http://www.ccpcreations.com/androiddonate.html"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 203
    .local v4, message:Ljava/lang/String;
    packed-switch p1, :pswitch_data_0

    .line 333
    invoke-super {p0, p1}, Landroid/preference/PreferenceActivity;->onCreateDialog(I)Landroid/app/Dialog;

    move-result-object v7

    :goto_0
    return-object v7

    .line 205
    :pswitch_0
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 206
    const v8, 0x7f070006

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 207
    invoke-virtual {v7, v4}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 208
    const/high16 v8, 0x7f07

    new-instance v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$6;

    invoke-direct {v9, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$6;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v7, v8, v9}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 214
    const v8, 0x7f070001

    invoke-virtual {v7, v8, v11}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 215
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    goto :goto_0

    .line 218
    :pswitch_1
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const/high16 v8, 0x7f05

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    .line 219
    .local v2, is:Ljava/io/InputStream;
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v7, Ljava/io/InputStreamReader;

    invoke-direct {v7, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 220
    .local v0, br:Ljava/io/BufferedReader;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .local v5, sb:Ljava/lang/StringBuilder;
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    .local v3, line:Ljava/lang/String;
    if-nez v3, :cond_0

    .line 227
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .line 228
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    new-instance v6, Landroid/webkit/WebView;

    invoke-direct {v6, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 234
    .local v6, v:Landroid/webkit/WebView;
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    invoke-virtual {v6, v7, v8, v9}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 237
    const v8, 0x7f07002d

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 238
    invoke-virtual {v7, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 239
    invoke-virtual {v7, v10, v11}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 240
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    goto :goto_0

    .line 224
    .end local v6           #v:Landroid/webkit/WebView;
    :cond_0
    :try_start_1
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    const-string v7, "\n"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 229
    .end local v3           #line:Ljava/lang/String;
    :catch_0
    move-exception v7

    move-object v1, v7

    .line 230
    .local v1, e:Ljava/io/IOException;
    new-instance v7, Ljava/lang/RuntimeException;

    invoke-direct {v7, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v7

    .line 243
    .end local v0           #br:Ljava/io/BufferedReader;
    .end local v1           #e:Ljava/io/IOException;
    .end local v2           #is:Ljava/io/InputStream;
    .end local v5           #sb:Ljava/lang/StringBuilder;
    :pswitch_2
    new-instance v6, Landroid/webkit/WebView;

    invoke-direct {v6, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 244
    .restart local v6       #v:Landroid/webkit/WebView;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .restart local v5       #sb:Ljava/lang/StringBuilder;
    const-string v7, "<html><head><title></title></head><body>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    const-string v7, "<p>Developed by C.C.P. Cre@ions especially for PBJS inc. <a href=\'http://android.ccpcreations.com/\'>http://android.ccpcreations.com/</a>. <a href=\'http://www.pbjs.com/\'>http://www.pbjs.com/</a>.</p>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    const-string v7, "<p>Copyright 2010. All rights reserved. Home page: <a href=\'http://android.ccpcreations.com/vlw/\'>http://android.ccpcreations.com/vlw/</a>. Contact and support: <a href=\'mailto:vlw@ccpcreations.com\'>vlw@ccpcreations.com</a></p>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getEulaText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    const-string v7, "<p></p>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    const-string v7, "</body></html>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    invoke-virtual {v6, v7, v8, v9}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 257
    const v8, 0x7f070031

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 258
    invoke-virtual {v7, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 259
    invoke-virtual {v7, v10, v11}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 260
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    goto/16 :goto_0

    .line 263
    .end local v5           #sb:Ljava/lang/StringBuilder;
    .end local v6           #v:Landroid/webkit/WebView;
    :pswitch_3
    new-instance v6, Landroid/webkit/WebView;

    invoke-direct {v6, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 264
    .restart local v6       #v:Landroid/webkit/WebView;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .restart local v5       #sb:Ljava/lang/StringBuilder;
    const-string v7, "<html><head><title></title></head><body>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    const-string v7, "<p><b>IMPORTANT - PLEASE READ CAREFULLY BEFORE USING!</b> You might have to scroll down to see the entire EULA.</p>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getEulaText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    const-string v7, "<p></p>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    const-string v7, "</body></html>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    invoke-virtual {v6, v7, v8, v9}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 274
    const v8, 0x7f07002a

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 275
    invoke-virtual {v7, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 276
    const v8, 0x7f07002b

    new-instance v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$7;

    invoke-direct {v9, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$7;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v7, v8, v9}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 286
    const v8, 0x7f07002c

    new-instance v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$8;

    invoke-direct {v9, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$8;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v7, v8, v9}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 292
    new-instance v8, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$9;

    invoke-direct {v8, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$9;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 298
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    goto/16 :goto_0

    .line 301
    .end local v5           #sb:Ljava/lang/StringBuilder;
    .end local v6           #v:Landroid/webkit/WebView;
    :pswitch_4
    new-instance v6, Landroid/webkit/WebView;

    invoke-direct {v6, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 302
    .restart local v6       #v:Landroid/webkit/WebView;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 304
    .restart local v5       #sb:Ljava/lang/StringBuilder;
    const-string v7, "<html><head><title></title></head><body>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 305
    invoke-direct {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getChangelogText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    const-string v7, "</body></html>"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "text/html"

    const-string v9, "UTF-8"

    invoke-virtual {v6, v7, v8, v9}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    new-instance v7, Landroid/app/AlertDialog$Builder;

    invoke-direct {v7, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 310
    const v8, 0x7f07002f

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 311
    invoke-virtual {v7, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 312
    new-instance v8, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$10;

    invoke-direct {v8, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$10;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v7, v10, v8}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 321
    new-instance v8, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$11;

    invoke-direct {v8, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$11;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V

    invoke-virtual {v7, v8}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v7

    .line 330
    invoke-virtual {v7}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v7

    goto/16 :goto_0

    .line 203
    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_3
    .end packed-switch
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 47
    invoke-super {p0}, Landroid/preference/PreferenceActivity;->onDestroy()V

    .line 48
    const/4 v0, 0x1

    sput-boolean v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->readPreferences:Z

    .line 49
    return-void
.end method

.method public run()V
    .locals 4

    .prologue
    .line 146
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 147
    .local v1, spe:Landroid/content/SharedPreferences$Editor;
    const-string v2, "video"

    sget-object v3, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 148
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 149
    const-string v2, "pick_a_file"

    invoke-virtual {p0, v2}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->findPreference(Ljava/lang/CharSequence;)Landroid/preference/Preference;

    move-result-object v0

    .line 150
    .local v0, p:Landroid/preference/Preference;
    sget-object v2, Lcom/ccpcreations/android/VLW/FilePicker;->selFile:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/preference/Preference;->setSummary(Ljava/lang/CharSequence;)V

    .line 151
    sget-boolean v2, Lcom/ccpcreations/android/VLW/FilePicker;->isSelDirectory:Z

    invoke-direct {p0, v2}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->setStateBasedOnDirectory(Z)V

    .line 152
    return-void
.end method

.class Lcom/naing/vwallpaper/VideoWallPaperService$a;
.super Landroid/service/wallpaper/WallpaperService$Engine;

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/naing/vwallpaper/VideoWallPaperService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/VideoWallPaperService;

.field private b:Landroid/content/BroadcastReceiver;

.field private c:Landroid/media/MediaPlayer;

.field private d:Landroid/content/SharedPreferences;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:Z

.field private k:Lcom/naing/vwallpaper/VideoWallPaperService;

.field private l:Landroid/os/Handler;

.field private m:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/naing/vwallpaper/VideoWallPaperService;)V
    .locals 1

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->a:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-direct {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;-><init>(Landroid/service/wallpaper/WallpaperService;)V

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    new-instance v0, Lcom/naing/vwallpaper/VideoWallPaperService$a$1;

    invoke-direct {v0, p0, p1}, Lcom/naing/vwallpaper/VideoWallPaperService$a$1;-><init>(Lcom/naing/vwallpaper/VideoWallPaperService$a;Lcom/naing/vwallpaper/VideoWallPaperService;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->b:Landroid/content/BroadcastReceiver;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->l:Landroid/os/Handler;

    new-instance v0, Lcom/naing/vwallpaper/VideoWallPaperService$a$2;

    invoke-direct {v0, p0, p1}, Lcom/naing/vwallpaper/VideoWallPaperService$a$2;-><init>(Lcom/naing/vwallpaper/VideoWallPaperService$a;Lcom/naing/vwallpaper/VideoWallPaperService;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->m:Ljava/lang/Runnable;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-static {v0}, Lcom/naing/c/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->b()V

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/VideoWallPaperService$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f()V

    return-void
.end method

.method static synthetic b(Lcom/naing/vwallpaper/VideoWallPaperService$a;)I
    .locals 1

    iget v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f:I

    return v0
.end method

.method private b()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    const-string v1, "location"

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-static {v2}, Lcom/naing/c/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    const-string v1, "sound"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->i:Z

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    const-string v1, "scale"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->j:Z

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    const-string v1, "start"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f:I

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    const-string v1, "end"

    const v2, 0x7fffffff

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g:I

    iput v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->h:I

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->a:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-virtual {v1}, Lcom/naing/vwallpaper/VideoWallPaperService;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d002e

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method static synthetic c(Lcom/naing/vwallpaper/VideoWallPaperService$a;)Landroid/media/MediaPlayer;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    return-object v0
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->getSurfaceHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/naing/vwallpaper/VideoWallPaperService$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    return-void
.end method

.method private d()Z
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c()V

    :try_start_0
    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->reset()V

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    new-instance v3, Lcom/naing/vwallpaper/VideoWallPaperService$a$3;

    invoke-direct {v3, p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a$3;-><init>(Lcom/naing/vwallpaper/VideoWallPaperService$a;)V

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    new-instance v3, Lcom/naing/vwallpaper/VideoWallPaperService$a$4;

    invoke-direct {v3, p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a$4;-><init>(Lcom/naing/vwallpaper/VideoWallPaperService$a;)V

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    iget-object v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->prepare()V

    iget-boolean v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->j:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V

    :goto_0
    iget-boolean v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->i:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaPlayer;->setVolume(FF)V

    :goto_1
    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    iget v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f:I

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->seekTo(I)V

    iget v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->h:I

    iget v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f:I

    if-le v2, v3, :cond_0

    iget v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->h:I

    iget v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g:I

    if-ge v2, v3, :cond_0

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    iget v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->h:I

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->seekTo(I)V

    const/4 v2, 0x0

    iput v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->h:I

    :cond_0
    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->start()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f()V

    :goto_2
    return v0

    :cond_1
    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/media/MediaPlayer;->setVideoScalingMode(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    move v0, v1

    goto :goto_2

    :cond_2
    :try_start_1
    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    const/high16 v3, 0x3f80

    const/high16 v4, 0x3f80

    invoke-virtual {v2, v3, v4}, Landroid/media/MediaPlayer;->setVolume(FF)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    move v0, v1

    goto :goto_2
.end method

.method private e()V
    .locals 2

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f:I

    const v0, 0x7fffffff

    iput v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g:I

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-static {v0}, Lcom/naing/c/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e:Ljava/lang/String;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "location"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "start"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "end"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d()Z

    :cond_0
    return-void
.end method

.method private f()V
    .locals 4

    iget v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g:I

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    sub-int/2addr v0, v1

    if-gtz v0, :cond_0

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    iget v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f:I

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V

    :cond_0
    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->l:Landroid/os/Handler;

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->m:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isVisible()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->l:Landroid/os/Handler;

    iget-object v3, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->m:Ljava/lang/Runnable;

    const/16 v1, 0x64

    if-gt v0, v1, :cond_2

    int-to-long v0, v0

    :goto_0
    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void

    :cond_2
    div-int/lit8 v0, v0, 0x2

    int-to-long v0, v0

    goto :goto_0
.end method

.method private g()V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    iput v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->h:I

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    :cond_0
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e()V

    :cond_1
    return-void
.end method

.method public onCreate(Landroid/view/SurfaceHolder;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;->onCreate(Landroid/view/SurfaceHolder;)V

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.MEDIA_MOUNTED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Lcom/naing/vwallpaper/VideoWallPaperService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/service/wallpaper/WallpaperService$Engine;->onDestroy()V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->k:Lcom/naing/vwallpaper/VideoWallPaperService;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Lcom/naing/vwallpaper/VideoWallPaperService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0, p0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    return-void
.end method

.method public onEventMainThread(Lcom/naing/a/a;)V
    .locals 0
    .annotation runtime Lorg/greenrobot/eventbus/m;
        a = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    return-void
.end method

.method public onEventMainThread(Lcom/naing/a/b;)V
    .locals 1
    .annotation runtime Lorg/greenrobot/eventbus/m;
        a = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isPreview()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    :cond_0
    return-void
.end method

.method public onEventMainThread(Lcom/naing/a/c;)V
    .locals 1
    .annotation runtime Lorg/greenrobot/eventbus/m;
        a = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isPreview()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    :cond_0
    return-void
.end method

.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->b()V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e()V

    :cond_0
    return-void
.end method

.method public onSurfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;->onSurfaceCreated(Landroid/view/SurfaceHolder;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isPreview()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/naing/a/b;

    invoke-direct {v1}, Lcom/naing/a/b;-><init>()V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->c(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e:Ljava/lang/String;

    sget-object v1, Lcom/naing/c/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e()V

    :cond_0
    :goto_1
    return-void

    :cond_1
    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/naing/a/c;

    invoke-direct {v1}, Lcom/naing/a/c;-><init>()V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->e()V

    goto :goto_1
.end method

.method public onSurfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;->onSurfaceDestroyed(Landroid/view/SurfaceHolder;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    return-void
.end method

.method public onVisibilityChanged(Z)V
    .locals 2

    invoke-super {p0, p1}, Landroid/service/wallpaper/WallpaperService$Engine;->onVisibilityChanged(Z)V

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isPreview()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/naing/a/b;

    invoke-direct {v1}, Lcom/naing/a/b;-><init>()V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->c(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->d()Z

    :cond_0
    :goto_1
    return-void

    :cond_1
    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/naing/a/c;

    invoke-direct {v1}, Lcom/naing/a/c;-><init>()V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->f()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->isPreview()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->g()V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    goto :goto_1
.end method

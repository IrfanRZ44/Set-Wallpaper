.class public Lcom/naing/vwallpaper/AdjusterActivity;
.super Lcom/naing/vwallpaper/BaseActivity;

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Landroid/view/View$OnClickListener;
.implements Lcom/naing/view/RangeBar$a;


# instance fields
.field private a:Landroid/widget/ImageView;

.field private b:Landroid/widget/ImageView;

.field private c:Lcom/naing/view/WallpaperVideoView;

.field private d:Lcom/naing/view/RangeBar;

.field private e:Landroid/os/Handler;

.field private f:Ljava/lang/Runnable;

.field private g:J

.field private h:J

.field private i:Ljava/lang/String;

.field private j:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/naing/vwallpaper/BaseActivity;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    const-wide/32 v0, 0x7fffffff

    iput-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    return-void
.end method

.method private a(I)V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0, p1}, Lcom/naing/view/WallpaperVideoView;->seekTo(I)V

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/AdjusterActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->h()V

    return-void
.end method

.method private g()V
    .locals 4

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->j:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "location"

    iget-object v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->i:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "start"

    iget-wide v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    long-to-int v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "end"

    iget-wide v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    long-to-int v2, v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->i()V

    invoke-static {p0}, Lcom/naing/c/b;->d(Landroid/content/Context;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->setResult(I)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->finish()V

    return-void
.end method

.method private h()V
    .locals 6

    iget-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->j()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    iget-object v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->d:Lcom/naing/view/RangeBar;

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->j()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v2, v4, v5}, Lcom/naing/view/RangeBar;->setCurrentPosition(J)V

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->pause()V

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->f:Ljava/lang/Runnable;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private i()V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->e:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->f:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private j()I
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method private k()I
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->getDuration()I

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public a(JZ)V
    .locals 3

    long-to-int v0, p1

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    iget-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    long-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->a(I)V

    return-void
.end method

.method public b(JZ)V
    .locals 3

    long-to-int v0, p1

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    iget-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    long-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->a(I)V

    return-void
.end method

.method public c(JZ)V
    .locals 1

    long-to-int v0, p1

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->a(I)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->pause()V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->j()I

    move-result v2

    int-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    iget-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    long-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->a(I)V

    :cond_1
    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->start()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x7f08006c
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 10

    const-wide/32 v8, 0x7fffffff

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    invoke-super {p0, p1}, Lcom/naing/vwallpaper/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0a001b

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->setContentView(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, v4}, Lcom/naing/vwallpaper/AdjusterActivity;->a(ZLjava/lang/String;)V

    const v0, 0x7f08006d

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->a:Landroid/widget/ImageView;

    const v0, 0x7f08006c

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->b:Landroid/widget/ImageView;

    const v0, 0x7f0800e0

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/naing/view/RangeBar;

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->d:Lcom/naing/view/RangeBar;

    const v0, 0x7f0800f1

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/naing/view/WallpaperVideoView;

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->d:Lcom/naing/view/RangeBar;

    invoke-virtual {v0, p0}, Lcom/naing/view/RangeBar;->setOnRangeBarListener(Lcom/naing/view/RangeBar$a;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->a:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->e:Landroid/os/Handler;

    new-instance v0, Lcom/naing/vwallpaper/AdjusterActivity$1;

    invoke-direct {v0, p0}, Lcom/naing/vwallpaper/AdjusterActivity$1;-><init>(Lcom/naing/vwallpaper/AdjusterActivity;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->f:Ljava/lang/Runnable;

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->a(Ljava/lang/Object;)V

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    new-instance v1, Lcom/naing/a/a;

    invoke-direct {v1}, Lcom/naing/a/a;-><init>()V

    invoke-virtual {v0, v1}, Lorg/greenrobot/eventbus/c;->c(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/naing/c/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->j:Landroid/content/SharedPreferences;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->i:Ljava/lang/String;

    iput-wide v6, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    iput-wide v8, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    :goto_0
    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0, v3}, Lcom/naing/view/WallpaperVideoView;->setVisibility(I)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/naing/view/WallpaperVideoView;->setVideoPath(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0, v4}, Lcom/naing/view/WallpaperVideoView;->setMediaController(Landroid/widget/MediaController;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->requestFocus()Z

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0, p0}, Lcom/naing/view/WallpaperVideoView;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/naing/c/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->j:Landroid/content/SharedPreferences;

    const-string v2, "location"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->i:Ljava/lang/String;

    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->i:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->j:Landroid/content/SharedPreferences;

    const-string v1, "start"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->j:Landroid/content/SharedPreferences;

    const-string v1, "end"

    const v2, 0x7fffffff

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    goto :goto_0

    :cond_1
    iput-wide v6, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    iput-wide v8, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    goto :goto_0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const/high16 v1, 0x7f0b

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const/4 v0, 0x1

    return v0
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/naing/vwallpaper/BaseActivity;->onDestroy()V

    invoke-static {}, Lorg/greenrobot/eventbus/c;->a()Lorg/greenrobot/eventbus/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lorg/greenrobot/eventbus/c;->b(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->i()V

    return-void
.end method

.method public onEventMainThread(Lcom/naing/a/b;)V
    .locals 0
    .annotation runtime Lorg/greenrobot/eventbus/m;
        a = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->i()V

    return-void
.end method

.method public onEventMainThread(Lcom/naing/a/c;)V
    .locals 0
    .annotation runtime Lorg/greenrobot/eventbus/m;
        a = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->i()V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const/4 v0, 0x1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-super {p0, p1}, Lcom/naing/vwallpaper/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    invoke-virtual {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->finish()V

    goto :goto_0

    :sswitch_1
    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->g()V

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_0
        0x7f08001c -> :sswitch_1
    .end sparse-switch
.end method

.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 8

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->k()I

    move-result v0

    iget-wide v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    const-wide/32 v4, 0x7fffffff

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    int-to-long v2, v0

    iput-wide v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    :cond_0
    iget-object v1, p0, Lcom/naing/vwallpaper/AdjusterActivity;->d:Lcom/naing/view/RangeBar;

    iget-wide v2, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    iget-wide v4, p0, Lcom/naing/vwallpaper/AdjusterActivity;->h:J

    int-to-long v6, v0

    invoke-virtual/range {v1 .. v7}, Lcom/naing/view/RangeBar;->a(JJJ)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->d:Lcom/naing/view/RangeBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/naing/view/RangeBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getVideoHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/naing/view/WallpaperVideoView;->a(II)V

    iget-wide v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->g:J

    long-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/AdjusterActivity;->a(I)V

    iget-object v0, p0, Lcom/naing/vwallpaper/AdjusterActivity;->c:Lcom/naing/view/WallpaperVideoView;

    invoke-virtual {v0}, Lcom/naing/view/WallpaperVideoView;->start()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/AdjusterActivity;->h()V

    return-void
.end method

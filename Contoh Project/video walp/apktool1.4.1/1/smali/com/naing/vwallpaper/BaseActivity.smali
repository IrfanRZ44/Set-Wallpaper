.class public abstract Lcom/naing/vwallpaper/BaseActivity;
.super Landroid/support/v7/app/AppCompatActivity;


# instance fields
.field private a:Lcom/naing/b/f;

.field private b:Lcom/google/android/gms/ads/AdView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/BaseActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/naing/vwallpaper/BaseActivity;->h()V

    return-void
.end method

.method private g()Landroid/view/ViewGroup;
    .locals 1

    const v0, 0x7f0a004a

    invoke-super {p0, v0}, Landroid/support/v7/app/AppCompatActivity;->setContentView(I)V

    const v0, 0x7f080030

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    return-object v0
.end method

.method private h()V
    .locals 4

    const v0, 0x7f080028

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    new-instance v1, Lcom/google/android/gms/ads/AdView;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/AdView;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    iget-object v1, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    sget-object v2, Lcom/google/android/gms/ads/AdSize;->SMART_BANNER:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdSize(Lcom/google/android/gms/ads/AdSize;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    const-string v2, "ca-app-pub-4813660642432048/1976765923"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdUnitId(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    new-instance v2, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v2}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    const-string v3, "C27AC49661B726C1B32C3A7D6415FC4D"

    invoke-virtual {v2, v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->addTestDevice(Ljava/lang/String;)Lcom/google/android/gms/ads/AdRequest$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    new-instance v2, Lcom/naing/vwallpaper/BaseActivity$2;

    invoke-direct {v2, p0, v0}, Lcom/naing/vwallpaper/BaseActivity$2;-><init>(Lcom/naing/vwallpaper/BaseActivity;Landroid/widget/FrameLayout;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/AdView;->setAdListener(Lcom/google/android/gms/ads/AdListener;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/naing/vwallpaper/BaseActivity;->a()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->a(Ljava/lang/CharSequence;)V

    return-void
.end method

.method protected a(ZLjava/lang/String;)V
    .locals 1

    const v0, 0x7f08007d

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/BaseActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/BaseActivity;->a()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBar;->a(Z)V

    if-eqz p2, :cond_0

    invoke-virtual {v0, p2}, Landroid/support/v7/app/ActionBar;->a(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    invoke-virtual {v0}, Lcom/naing/b/f;->c()V

    :cond_0
    return-void
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    invoke-virtual {v0}, Lcom/naing/b/f;->a()Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onDestroy()V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->destroy()V

    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onDestroy()V

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    invoke-virtual {v0}, Lcom/naing/b/f;->b()V

    :cond_1
    return-void
.end method

.method protected onPause()V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->pause()V

    :cond_0
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onPause()V

    return-void
.end method

.method protected onResume()V
    .locals 1

    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onResume()V

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->b:Lcom/google/android/gms/ads/AdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/AdView;->resume()V

    :cond_0
    return-void
.end method

.method public setContentView(I)V
    .locals 3

    invoke-virtual {p0}, Lcom/naing/vwallpaper/BaseActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-direct {p0}, Lcom/naing/vwallpaper/BaseActivity;->g()Landroid/view/ViewGroup;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    new-instance v0, Lcom/naing/b/f;

    invoke-direct {v0, p0}, Lcom/naing/b/f;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    new-instance v1, Lcom/naing/vwallpaper/BaseActivity$1;

    invoke-direct {v1, p0}, Lcom/naing/vwallpaper/BaseActivity$1;-><init>(Lcom/naing/vwallpaper/BaseActivity;)V

    invoke-virtual {v0, v1}, Lcom/naing/b/f;->a(Lcom/naing/b/f$a;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity;->a:Lcom/naing/b/f;

    invoke-virtual {v0}, Lcom/naing/b/f;->d()V

    return-void
.end method

.class Lcom/naing/vwallpaper/BaseActivity$2;
.super Lcom/google/android/gms/ads/AdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/BaseActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/FrameLayout;

.field final synthetic b:Lcom/naing/vwallpaper/BaseActivity;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/BaseActivity;Landroid/widget/FrameLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/BaseActivity$2;->b:Lcom/naing/vwallpaper/BaseActivity;

    iput-object p2, p0, Lcom/naing/vwallpaper/BaseActivity$2;->a:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoaded()V
    .locals 2

    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity$2;->a:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method

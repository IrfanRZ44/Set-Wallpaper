.class Lcom/naing/vwallpaper/BaseActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/naing/b/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/BaseActivity;->setContentView(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/BaseActivity;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/BaseActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/BaseActivity$1;->a:Lcom/naing/vwallpaper/BaseActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity$1;->a:Lcom/naing/vwallpaper/BaseActivity;

    const v1, 0x7f080028

    invoke-virtual {v0, v1}, Lcom/naing/vwallpaper/BaseActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity$1;->a:Lcom/naing/vwallpaper/BaseActivity;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/BaseActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity$1;->a:Lcom/naing/vwallpaper/BaseActivity;

    invoke-static {v0}, Lcom/naing/vwallpaper/BaseActivity;->a(Lcom/naing/vwallpaper/BaseActivity;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/BaseActivity$1;->a:Lcom/naing/vwallpaper/BaseActivity;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/BaseActivity;->supportInvalidateOptionsMenu()V

    return-void
.end method

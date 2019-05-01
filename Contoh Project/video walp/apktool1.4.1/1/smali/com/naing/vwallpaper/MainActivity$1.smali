.class Lcom/naing/vwallpaper/MainActivity$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/design/widget/BottomNavigationView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/naing/vwallpaper/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/MainActivity;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/MainActivity$1;->a:Lcom/naing/vwallpaper/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MenuItem;)Z
    .locals 4

    const-string v1, ""

    invoke-interface {p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/naing/vwallpaper/MainActivity$1;->a:Lcom/naing/vwallpaper/MainActivity;

    invoke-static {v0, v2}, Lcom/naing/vwallpaper/MainActivity;->a(Lcom/naing/vwallpaper/MainActivity;Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    packed-switch v3, :pswitch_data_0

    :cond_0
    :goto_0
    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/naing/vwallpaper/MainActivity$1;->a:Lcom/naing/vwallpaper/MainActivity;

    invoke-static {v3, v0, v2, v1}, Lcom/naing/vwallpaper/MainActivity;->a(Lcom/naing/vwallpaper/MainActivity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    :goto_1
    return v0

    :pswitch_0
    iget-object v1, p0, Lcom/naing/vwallpaper/MainActivity$1;->a:Lcom/naing/vwallpaper/MainActivity;

    const v3, 0x7f0d002a

    invoke-virtual {v1, v3}, Lcom/naing/vwallpaper/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_0

    invoke-static {}, Lcom/naing/vwallpaper/fg/c;->a()Lcom/naing/vwallpaper/fg/c;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    iget-object v1, p0, Lcom/naing/vwallpaper/MainActivity$1;->a:Lcom/naing/vwallpaper/MainActivity;

    const v3, 0x7f0d0051

    invoke-virtual {v1, v3}, Lcom/naing/vwallpaper/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_0

    invoke-static {}, Lcom/naing/vwallpaper/fg/b;->a()Lcom/naing/vwallpaper/fg/b;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x7f080085
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

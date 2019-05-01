.class Lcom/naing/vwallpaper/fg/b$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/arch/lifecycle/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/arch/lifecycle/n",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/fg/b;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/b;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/b$3;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 3

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$3;->a:Lcom/naing/vwallpaper/fg/b;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/b;->e:Landroid/app/ProgressDialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$3;->a:Lcom/naing/vwallpaper/fg/b;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/b;->e:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$3;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/naing/vwallpaper/fg/b$3;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0d0033

    :goto_0
    invoke-virtual {v2, v0}, Lcom/naing/vwallpaper/fg/b;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    const v0, 0x7f0d0032

    goto :goto_0
.end method

.method public synthetic onChanged(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/naing/vwallpaper/fg/b$3;->a(Ljava/lang/Boolean;)V

    return-void
.end method

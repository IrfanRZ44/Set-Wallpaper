.class Lcom/naing/vwallpaper/fg/CWpViewModel$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/CWpViewModel;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/naing/vwallpaper/fg/CWpViewModel;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/CWpViewModel;I)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$2;->b:Lcom/naing/vwallpaper/fg/CWpViewModel;

    iput p2, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$2;->b:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-static {v0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->a(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/app/Application;

    move-result-object v0

    iget v1, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$2;->a:I

    invoke-static {v0, v1}, Lcom/naing/c/b;->a(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$2;->b:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-static {v0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->c(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/arch/lifecycle/m;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/m;->postValue(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$2;->b:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-static {v0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->c(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/arch/lifecycle/m;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/m;->postValue(Ljava/lang/Object;)V

    goto :goto_0
.end method

.class Lcom/naing/vwallpaper/fg/CWpViewModel$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/CWpViewModel;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/fg/CWpViewModel;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/CWpViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$1;->a:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    iget-object v3, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$1;->a:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-static {v3}, Lcom/naing/vwallpaper/fg/CWpViewModel;->a(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/app/Application;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/Application;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "colorlist"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    const-string v4, "UTF-8"

    invoke-direct {v2, v3, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    invoke-direct {v0, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Lcom/naing/model/a;

    invoke-direct {v3, v2}, Lcom/naing/model/a;-><init>(Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel$1;->a:Lcom/naing/vwallpaper/fg/CWpViewModel;

    invoke-static {v0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->b(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/arch/lifecycle/m;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/m;->postValue(Ljava/lang/Object;)V

    return-void
.end method

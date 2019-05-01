.class Lcom/naing/vwallpaper/VideoChooser$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/VideoChooser;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/VideoChooser;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/VideoChooser;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoChooser$1;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser$1;->a:Lcom/naing/vwallpaper/VideoChooser;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser$1;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-static {v1}, Lcom/naing/vwallpaper/VideoChooser;->a(Lcom/naing/vwallpaper/VideoChooser;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/naing/vwallpaper/VideoChooser$1;->a:Lcom/naing/vwallpaper/VideoChooser;

    invoke-static {v2}, Lcom/naing/vwallpaper/VideoChooser;->b(Lcom/naing/vwallpaper/VideoChooser;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/naing/vwallpaper/VideoChooser;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

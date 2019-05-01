.class Lcom/naing/vwallpaper/VideoWallPaperService$a$1;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/VideoWallPaperService$a;-><init>(Lcom/naing/vwallpaper/VideoWallPaperService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/VideoWallPaperService;

.field final synthetic b:Lcom/naing/vwallpaper/VideoWallPaperService$a;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/VideoWallPaperService$a;Lcom/naing/vwallpaper/VideoWallPaperService;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$1;->b:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    iput-object p2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$1;->a:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$1;->b:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->a()V

    return-void
.end method

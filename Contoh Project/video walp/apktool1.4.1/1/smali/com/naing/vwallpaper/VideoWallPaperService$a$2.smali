.class Lcom/naing/vwallpaper/VideoWallPaperService$a$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$2;->b:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    iput-object p2, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$2;->a:Lcom/naing/vwallpaper/VideoWallPaperService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$2;->b:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-static {v0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->a(Lcom/naing/vwallpaper/VideoWallPaperService$a;)V

    return-void
.end method

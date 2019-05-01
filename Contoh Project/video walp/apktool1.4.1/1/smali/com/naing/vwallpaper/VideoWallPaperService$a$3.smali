.class Lcom/naing/vwallpaper/VideoWallPaperService$a$3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/VideoWallPaperService$a;->d()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/VideoWallPaperService$a;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/VideoWallPaperService$a;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$3;->a:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$3;->a:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-static {v0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c(Lcom/naing/vwallpaper/VideoWallPaperService$a;)Landroid/media/MediaPlayer;

    move-result-object v0

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$3;->a:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-static {v1}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->b(Lcom/naing/vwallpaper/VideoWallPaperService$a;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoWallPaperService$a$3;->a:Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-static {v0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;->c(Lcom/naing/vwallpaper/VideoWallPaperService$a;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    return-void
.end method

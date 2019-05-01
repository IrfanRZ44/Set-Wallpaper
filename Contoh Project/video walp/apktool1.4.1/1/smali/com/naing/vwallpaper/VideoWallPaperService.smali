.class public Lcom/naing/vwallpaper/VideoWallPaperService;
.super Landroid/service/wallpaper/WallpaperService;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/naing/vwallpaper/VideoWallPaperService$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/service/wallpaper/WallpaperService;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateEngine()Landroid/service/wallpaper/WallpaperService$Engine;
    .locals 1

    new-instance v0, Lcom/naing/vwallpaper/VideoWallPaperService$a;

    invoke-direct {v0, p0}, Lcom/naing/vwallpaper/VideoWallPaperService$a;-><init>(Lcom/naing/vwallpaper/VideoWallPaperService;)V

    return-object v0
.end method

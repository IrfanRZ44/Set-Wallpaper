.class public Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;
.super Landroid/service/wallpaper/WallpaperService;
.source "VideoLiveWallpaper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;
    }
.end annotation


# static fields
.field public static readPreferences:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x1

    sput-boolean v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->readPreferences:Z

    .line 36
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/service/wallpaper/WallpaperService;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreateEngine()Landroid/service/wallpaper/WallpaperService$Engine;
    .locals 1

    .prologue
    .line 61
    new-instance v0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-direct {v0, p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;)V

    return-object v0
.end method

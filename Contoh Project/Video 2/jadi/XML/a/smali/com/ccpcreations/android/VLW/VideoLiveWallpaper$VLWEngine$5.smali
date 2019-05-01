.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$5;
.super Ljava/lang/Object;
.source "VideoLiveWallpaper.java"

# interfaces
.implements Ljava/io/FileFilter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->nthFile(ILjava/io/File;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;


# direct methods
.method constructor <init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$5;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    .line 218
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/io/File;)Z
    .locals 1
    .parameter "pathname"

    .prologue
    .line 221
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    return v0
.end method

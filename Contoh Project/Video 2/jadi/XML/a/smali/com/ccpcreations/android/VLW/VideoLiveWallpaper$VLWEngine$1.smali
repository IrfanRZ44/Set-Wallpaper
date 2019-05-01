.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;
.super Ljava/lang/Object;
.source "VideoLiveWallpaper.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;
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
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const/4 v4, 0x0

    .line 105
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wantedDelayedRunnableMode:Z

    if-nez v3, :cond_1

    .line 106
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iput-boolean v4, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    .line 107
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-boolean v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    if-nez v3, :cond_0

    .line 108
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v3, v4}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 136
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v3, :cond_2

    .line 114
    const-string v3, "Video Live Wallpaper"

    const-string v4, "Updating from delayed runnable..."

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    :cond_2
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-virtual {v3}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawFrame()I

    move-result v2

    .line 116
    .local v2, slices:I
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-wide v4, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    int-to-double v6, v2

    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v8, v8, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    iput-wide v4, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 118
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-wide v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    long-to-double v5, v5

    sub-double v0, v3, v5

    .line 119
    .local v0, delta:D
    mul-int/lit8 v3, v2, -0x5

    int-to-double v3, v3

    iget-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v5, v5, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v3, v5

    cmpg-double v3, v0, v3

    if-gez v3, :cond_5

    .line 121
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    long-to-double v4, v4

    iget-object v6, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v6, v6, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    add-double/2addr v4, v6

    iput-wide v4, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 122
    const-wide/16 v0, 0x0

    .line 131
    :goto_1
    const-wide/16 v3, 0x0

    cmpg-double v3, v0, v3

    if-gez v3, :cond_3

    const-wide/16 v0, 0x0

    .line 132
    :cond_3
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-boolean v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    if-nez v3, :cond_0

    .line 134
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mHandler:Landroid/os/Handler;

    iget-object v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-static {v4}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->access$0(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)Ljava/lang/Runnable;

    move-result-object v4

    const-wide/high16 v5, 0x3fe0

    mul-double/2addr v5, v0

    double-to-int v5, v5

    int-to-long v5, v5

    invoke-virtual {v3, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 125
    :cond_4
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-virtual {v3}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->skipFrame()I

    move-result v2

    .line 126
    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v3, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-wide v4, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    int-to-double v6, v2

    iget-object v8, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v8, v8, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v6, v8

    add-double/2addr v4, v6

    iput-wide v4, v3, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 127
    int-to-double v3, v2

    iget-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v5, v5, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v3, v5

    add-double/2addr v0, v3

    .line 124
    :cond_5
    neg-int v3, v2

    int-to-double v3, v3

    iget-object v5, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$1;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v5, v5, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v3, v5

    cmpg-double v3, v0, v3

    if-ltz v3, :cond_4

    goto :goto_1
.end method

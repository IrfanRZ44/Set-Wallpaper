.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;
.super Ljava/lang/Thread;
.source "VideoLiveWallpaper.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "WorkingThread"
.end annotation


# instance fields
.field public curTime:D

.field finished:Z

.field lockingObject:Ljava/lang/Object;

.field public paused:Z

.field final synthetic this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;


# direct methods
.method constructor <init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V
    .locals 1
    .parameter

    .prologue
    .line 626
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 627
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->lockingObject:Ljava/lang/Object;

    .line 628
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    .line 629
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->finished:Z

    return-void
.end method


# virtual methods
.method public pause(Z)V
    .locals 6
    .parameter "newState"

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x3

    .line 639
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v1, :cond_0

    .line 640
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 641
    .local v0, ste:[Ljava/lang/StackTraceElement;
    const-string v1, "Video Live Wallpaper"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Pause set to "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " by "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v0, v4

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "() ["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v0, v4

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    aget-object v3, v0, v4

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "]"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 643
    .end local v0           #ste:[Ljava/lang/StackTraceElement;
    :cond_0
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 644
    :try_start_0
    iput-boolean p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    .line 643
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 646
    if-nez p1, :cond_4

    .line 647
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    long-to-double v1, v1

    iput-wide v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 648
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fpsStart:J

    .line 649
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-wide/16 v2, -0x1

    iput-wide v2, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->curDTS:J

    .line 650
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->isAlive()Z

    move-result v1

    if-nez v1, :cond_2

    .line 651
    sput-boolean v5, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->readPreferences:Z

    .line 652
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    new-instance v2, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-object v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-direct {v2, v3}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;-><init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)V

    iput-object v2, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    .line 653
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v1, v5}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 654
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    invoke-virtual {v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->start()V

    .line 655
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 670
    :cond_1
    :goto_0
    return-void

    .line 643
    :catchall_0
    move-exception v2

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v2

    .line 658
    :cond_2
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    if-eqz v1, :cond_3

    .line 659
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-static {v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->access$0(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 661
    :cond_3
    invoke-virtual {p0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->interrupt()V

    goto :goto_0

    .line 664
    :cond_4
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v1, :cond_5

    .line 665
    const-string v1, "Video Live Wallpaper"

    const-string v2, "Going to sleep..."

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 666
    :cond_5
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    if-eqz v1, :cond_1

    .line 667
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v1, v1, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-static {v2}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->access$0(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)Ljava/lang/Runnable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method public run()V
    .locals 15

    .prologue
    .line 676
    :cond_0
    :goto_0
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->lockingObject:Ljava/lang/Object;

    monitor-enter v9

    .line 677
    :try_start_0
    iget-boolean v10, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->finished:Z

    if-nez v10, :cond_1

    sget-boolean v10, Lcom/ccpcreations/android/VLW/SimpleDecoder;->forceShutdown:Z

    if-eqz v10, :cond_3

    .line 678
    :cond_1
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 769
    sget-boolean v9, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-eqz v9, :cond_2

    .line 770
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_close()V

    .line 771
    const/4 v9, 0x0

    sput-boolean v9, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 773
    :cond_2
    return-void

    .line 679
    :cond_3
    :try_start_1
    iget-boolean v4, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    .line 676
    .local v4, p:Z
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 681
    sget-boolean v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->readPreferences:Z

    if-eqz v9, :cond_8

    .line 682
    const/4 v9, 0x0

    sput-boolean v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->readPreferences:Z

    .line 683
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-static {v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->access$1(Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;)Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;

    move-result-object v9

    invoke-virtual {v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v8

    .line 684
    .local v8, spe:Landroid/content/SharedPreferences;
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "playing_mode"

    const-string v11, "dr"

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "dr"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wantedDelayedRunnableMode:Z

    .line 685
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "debug_mode"

    const/4 v11, 0x0

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    .line 686
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "do_not_skip"

    const/4 v11, 0x0

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->doNotSkip:Z

    .line 687
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "shift_video"

    const/4 v11, 0x1

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_9

    const/4 v10, 0x0

    :goto_1
    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->keepCentered:Z

    .line 688
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "swiping_lag"

    const-string v11, "v4"

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    int-to-float v10, v10

    iput v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->swipingLag:F

    .line 689
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "recursive_dir"

    const/4 v11, 0x1

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->recursiveDir:Z

    .line 690
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "random_file_mode"

    const/4 v11, 0x1

    invoke-interface {v8, v10, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->randomFile:Z

    .line 691
    const-string v9, "zooming_mode"

    const-string v10, "cl"

    invoke-interface {v8, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 692
    .local v6, s:Ljava/lang/String;
    const-string v9, "lb"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/4 v9, 0x1

    move v5, v9

    .line 693
    .local v5, renderingMode2:I
    :goto_2
    const-string v9, "video"

    const/4 v10, 0x0

    invoke-interface {v8, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 694
    .local v2, mFileName:Ljava/lang/String;
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    if-ne v5, v9, :cond_4

    if-eqz v2, :cond_7

    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileName:Ljava/lang/String;

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    .line 695
    :cond_4
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iput v5, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    .line 696
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iput-object v2, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->fileName:Ljava/lang/String;

    .line 697
    iget-boolean v3, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    .line 698
    .local v3, mPaused:Z
    if-nez v3, :cond_5

    const/4 v9, 0x1

    invoke-virtual {p0, v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 699
    :cond_5
    sget-boolean v9, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-eqz v9, :cond_6

    .line 700
    const/4 v9, 0x0

    sput-boolean v9, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 701
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "Loading a new video..."

    invoke-virtual {v9, v10}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawMessage(Ljava/lang/String;)V

    .line 703
    const-wide/16 v9, 0x1f4

    :try_start_2
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 706
    :goto_3
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_close()V

    .line 708
    :cond_6
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-virtual {v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->tryToOpen()V

    .line 709
    if-nez v3, :cond_7

    const/4 v9, 0x0

    invoke-virtual {p0, v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    .line 711
    .end local v3           #mPaused:Z
    :cond_7
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v9, :cond_8

    .line 712
    const-string v9, "Video Live Wallpaper"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Read settings: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wantedDelayedRunnableMode:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->doNotSkip:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->keepCentered:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->swipingLag:F

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->recursiveDir:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->randomFile:Z

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->renderingMode:I

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 714
    .end local v2           #mFileName:Ljava/lang/String;
    .end local v5           #renderingMode2:I
    .end local v6           #s:Ljava/lang/String;
    .end local v8           #spe:Landroid/content/SharedPreferences;
    :cond_8
    sget-boolean v9, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-nez v9, :cond_c

    .line 715
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-virtual {v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->tryToOpen()V

    .line 716
    sget-boolean v9, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    if-nez v9, :cond_0

    .line 718
    :try_start_3
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const-string v10, "No video found or available.\nYou might want to provide some settings\nor unmount the SD card /\nturn off USB storage."

    invoke-virtual {v9, v10}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawMessage(Ljava/lang/String;)V

    .line 719
    const-wide/16 v9, 0x3e8

    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_0

    .line 720
    :catch_0
    move-exception v9

    goto/16 :goto_0

    .line 676
    .end local v4           #p:Z
    :catchall_0
    move-exception v10

    :try_start_4
    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v10

    .line 687
    .restart local v4       #p:Z
    .restart local v8       #spe:Landroid/content/SharedPreferences;
    :cond_9
    const/4 v10, 0x1

    goto/16 :goto_1

    .line 692
    .restart local v6       #s:Ljava/lang/String;
    :cond_a
    const-string v9, "st"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/4 v9, 0x2

    move v5, v9

    goto/16 :goto_2

    :cond_b
    const/4 v9, 0x0

    move v5, v9

    goto/16 :goto_2

    .line 725
    .end local v6           #s:Ljava/lang/String;
    .end local v8           #spe:Landroid/content/SharedPreferences;
    :cond_c
    if-nez v4, :cond_d

    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    if-eqz v9, :cond_f

    .line 727
    :cond_d
    :try_start_5
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v9, :cond_e

    .line 728
    const-string v9, "Video Live Wallpaper"

    const-string v10, "Sleeping..."

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 729
    :cond_e
    const-wide/16 v9, 0x3e8

    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_0

    .line 730
    :catch_1
    move-exception v9

    goto/16 :goto_0

    .line 734
    :cond_f
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wantedDelayedRunnableMode:Z

    if-eqz v9, :cond_10

    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    if-nez v9, :cond_10

    .line 735
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    const/4 v10, 0x1

    iput-boolean v10, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->delayedRunnableMode:Z

    .line 736
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->paused:Z

    if-nez v9, :cond_0

    .line 737
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-object v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->wt:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->pause(Z)V

    goto/16 :goto_0

    .line 741
    :cond_10
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-boolean v9, v9, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->debugOn:Z

    if-eqz v9, :cond_11

    .line 742
    const-string v9, "Video Live Wallpaper"

    const-string v10, "Updating from thread..."

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 743
    :cond_11
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-virtual {v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->drawFrame()I

    move-result v7

    .line 744
    .local v7, slices:I
    iget-wide v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    int-to-double v11, v7

    iget-object v13, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v13, v13, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v11, v13

    add-double/2addr v9, v11

    iput-wide v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 746
    iget-wide v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    long-to-double v11, v11

    sub-double v0, v9, v11

    .line 747
    .local v0, delta:D
    mul-int/lit8 v9, v7, -0x5

    int-to-double v9, v9

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v9, v11

    cmpg-double v9, v0, v9

    if-gez v9, :cond_13

    .line 749
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    long-to-double v9, v9

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    add-double/2addr v9, v11

    iput-wide v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 750
    const-wide/16 v0, 0x0

    .line 759
    :goto_4
    const-wide/16 v9, 0x0

    cmpg-double v9, v0, v9

    if-gtz v9, :cond_14

    .line 760
    invoke-static {}, Ljava/lang/Thread;->yield()V

    goto/16 :goto_0

    .line 753
    :cond_12
    iget-object v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    invoke-virtual {v9}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->skipFrame()I

    move-result v7

    .line 754
    iget-wide v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    int-to-double v11, v7

    iget-object v13, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v13, v13, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v11, v13

    add-double/2addr v9, v11

    iput-wide v9, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->curTime:D

    .line 755
    int-to-double v9, v7

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v9, v11

    add-double/2addr v0, v9

    .line 752
    :cond_13
    neg-int v9, v7

    int-to-double v9, v9

    iget-object v11, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->this$1:Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;

    iget-wide v11, v11, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine;->videoFR:D

    mul-double/2addr v9, v11

    cmpg-double v9, v0, v9

    if-ltz v9, :cond_12

    goto :goto_4

    .line 763
    :cond_14
    const-wide/high16 v9, 0x3fe0

    mul-double/2addr v9, v0

    double-to-int v9, v9

    int-to-long v9, v9

    :try_start_6
    invoke-static {v9, v10}, Ljava/lang/Thread;->sleep(J)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_2

    goto/16 :goto_0

    .line 764
    :catch_2
    move-exception v9

    goto/16 :goto_0

    .line 704
    .end local v0           #delta:D
    .end local v7           #slices:I
    .restart local v2       #mFileName:Ljava/lang/String;
    .restart local v3       #mPaused:Z
    .restart local v5       #renderingMode2:I
    .restart local v6       #s:Ljava/lang/String;
    .restart local v8       #spe:Landroid/content/SharedPreferences;
    :catch_3
    move-exception v9

    goto/16 :goto_3
.end method

.method public stopRunning()V
    .locals 2

    .prologue
    .line 633
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->lockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 634
    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaper$VLWEngine$WorkingThread;->finished:Z

    .line 633
    monitor-exit v0

    .line 636
    return-void

    .line 633
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

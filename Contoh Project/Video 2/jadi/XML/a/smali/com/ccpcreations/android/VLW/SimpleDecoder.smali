.class public Lcom/ccpcreations/android/VLW/SimpleDecoder;
.super Ljava/lang/Object;
.source "SimpleDecoder.java"


# static fields
.field public static forceShutdown:Z

.field public static lockingObject:Ljava/lang/Object;

.field public static opened:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 4
    sput-boolean v0, Lcom/ccpcreations/android/VLW/SimpleDecoder;->opened:Z

    .line 5
    sput-boolean v0, Lcom/ccpcreations/android/VLW/SimpleDecoder;->forceShutdown:Z

    .line 7
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    .line 137
    const-string v0, "/data/data/com.ccpcreations.android.VLW/lib/libffmpeg.so"

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 138
    const-string v0, "/data/data/com.ccpcreations.android.VLW/lib/libsimpledecoder.so"

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 139
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->_init()V

    .line 3
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static _close()V
    .locals 2

    .prologue
    .line 128
    sget-object v0, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 129
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->close()V

    .line 128
    monitor-exit v0

    .line 133
    return-void

    .line 128
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static _convertFrameData()I
    .locals 3

    .prologue
    .line 105
    sget-object v1, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 106
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->convertFrameData()I

    move-result v0

    .line 109
    .local v0, r:I
    monitor-exit v1

    return v0

    .line 105
    .end local v0           #r:I
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static _getDTS()J
    .locals 4

    .prologue
    .line 72
    sget-object v2, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v2

    .line 73
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getDTS()J

    move-result-wide v0

    .line 76
    .local v0, r:J
    monitor-exit v2

    return-wide v0

    .line 72
    .end local v0           #r:J
    :catchall_0
    move-exception v3

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public static _getDirectFrameData(Ljava/lang/Object;IIII)V
    .locals 2
    .parameter "byteBuffer"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 117
    sget-object v0, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 118
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getDirectFrameData(Ljava/lang/Object;IIII)V

    .line 117
    monitor-exit v0

    .line 122
    return-void

    .line 117
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static _getDuration()I
    .locals 3

    .prologue
    .line 81
    sget-object v1, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 82
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getDuration()I

    move-result v0

    .line 85
    .local v0, r:I
    monitor-exit v1

    return v0

    .line 81
    .end local v0           #r:I
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static _getNextFrame()I
    .locals 3

    .prologue
    .line 93
    sget-object v1, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 94
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getNextFrame()I

    move-result v0

    .line 97
    .local v0, r:I
    monitor-exit v1

    return v0

    .line 93
    .end local v0           #r:I
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static _getVideoFrameRate()D
    .locals 4

    .prologue
    .line 36
    sget-object v2, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v2

    .line 37
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getVideoFrameRate()D

    move-result-wide v0

    .line 40
    .local v0, r:D
    monitor-exit v2

    return-wide v0

    .line 36
    .end local v0           #r:D
    :catchall_0
    move-exception v3

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v3
.end method

.method public static _getVideoHeight()I
    .locals 3

    .prologue
    .line 59
    sget-object v1, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 60
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getVideoHeight()I

    move-result v0

    .line 63
    .local v0, r:I
    monitor-exit v1

    return v0

    .line 59
    .end local v0           #r:I
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static _getVideoWidth()I
    .locals 3

    .prologue
    .line 50
    sget-object v1, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 51
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->getVideoWidth()I

    move-result v0

    .line 54
    .local v0, r:I
    monitor-exit v1

    return v0

    .line 50
    .end local v0           #r:I
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method public static _init()V
    .locals 2

    .prologue
    .line 13
    sget-object v0, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 14
    :try_start_0
    invoke-static {}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->init()V

    .line 13
    monitor-exit v0

    .line 18
    return-void

    .line 13
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static _open(Ljava/lang/String;)I
    .locals 3
    .parameter "fileName"

    .prologue
    .line 24
    sget-object v1, Lcom/ccpcreations/android/VLW/SimpleDecoder;->lockingObject:Ljava/lang/Object;

    monitor-enter v1

    .line 25
    :try_start_0
    invoke-static {p0}, Lcom/ccpcreations/android/VLW/SimpleDecoder;->open(Ljava/lang/String;)I

    move-result v0

    .line 28
    .local v0, r:I
    monitor-exit v1

    return v0

    .line 24
    .end local v0           #r:I
    :catchall_0
    move-exception v2

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v2
.end method

.method private static native close()V
.end method

.method private static native convertFrameData()I
.end method

.method private static native getDTS()J
.end method

.method private static native getDirectFrameData(Ljava/lang/Object;IIII)V
.end method

.method private static native getDuration()I
.end method

.method private static native getNextFrame()I
.end method

.method private static native getVideoFrameRate()D
.end method

.method private static native getVideoHeight()I
.end method

.method private static native getVideoWidth()I
.end method

.method private static native init()V
.end method

.method private static native open(Ljava/lang/String;)I
.end method

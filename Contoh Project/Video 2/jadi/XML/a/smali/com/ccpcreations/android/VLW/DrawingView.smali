.class public Lcom/ccpcreations/android/VLW/DrawingView;
.super Landroid/view/View;
.source "DrawingView.java"


# instance fields
.field drawingBitmap:Landroid/graphics/Bitmap;

.field lockingObject:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 14
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 11
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->lockingObject:Ljava/lang/Object;

    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 11
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->lockingObject:Ljava/lang/Object;

    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 11
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->lockingObject:Ljava/lang/Object;

    .line 23
    return-void
.end method


# virtual methods
.method public exchangeBitmap(Landroid/graphics/Bitmap;)V
    .locals 2
    .parameter "newBitmap"

    .prologue
    .line 35
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->lockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 36
    :try_start_0
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 37
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 38
    :cond_0
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    .line 35
    monitor-exit v0

    .line 40
    return-void

    .line 35
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5
    .parameter "canvas"

    .prologue
    .line 28
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/DrawingView;->lockingObject:Ljava/lang/Object;

    monitor-enter v0

    .line 29
    :try_start_0
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 30
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/DrawingView;->drawingBitmap:Landroid/graphics/Bitmap;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 28
    :cond_0
    monitor-exit v0

    .line 32
    return-void

    .line 28
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

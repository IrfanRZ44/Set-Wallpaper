.class public Lcom/naing/view/WallpaperVideoView;
.super Landroid/widget/VideoView;


# instance fields
.field private a:I

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/VideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 0

    iput p1, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    iput p2, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    iget v0, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    invoke-static {v0, p1}, Lcom/naing/view/WallpaperVideoView;->getDefaultSize(II)I

    move-result v1

    iget v0, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    invoke-static {v0, p2}, Lcom/naing/view/WallpaperVideoView;->getDefaultSize(II)I

    move-result v0

    iget v2, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    if-lez v2, :cond_0

    iget v2, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    if-lez v2, :cond_0

    iget v2, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    mul-int/2addr v2, v0

    iget v3, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    mul-int/2addr v3, v1

    if-le v2, v3, :cond_1

    iget v0, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    div-int/2addr v0, v2

    :cond_0
    :goto_0
    invoke-virtual {p0, v1, v0}, Lcom/naing/view/WallpaperVideoView;->setMeasuredDimension(II)V

    return-void

    :cond_1
    iget v2, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    mul-int/2addr v2, v0

    iget v3, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    mul-int/2addr v3, v1

    if-ge v2, v3, :cond_0

    iget v1, p0, Lcom/naing/view/WallpaperVideoView;->a:I

    mul-int/2addr v1, v0

    iget v2, p0, Lcom/naing/view/WallpaperVideoView;->b:I

    div-int/2addr v1, v2

    goto :goto_0
.end method

.class public abstract Lcom/flask/colorpicker/slider/AbsCustomSlider;
.super Landroid/view/View;


# instance fields
.field protected a:Landroid/graphics/Bitmap;

.field protected b:Landroid/graphics/Canvas;

.field protected c:Landroid/graphics/Bitmap;

.field protected d:Landroid/graphics/Canvas;

.field protected e:Lcom/flask/colorpicker/slider/a;

.field protected f:I

.field protected g:I

.field protected h:I

.field protected i:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x14

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->h:I

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x14

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->h:I

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0x14

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    const/4 v0, 0x5

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->h:I

    const/high16 v0, 0x3f80

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    return-void
.end method


# virtual methods
.method protected a(I)I
    .locals 1

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method protected a()V
    .locals 1

    sget v0, Lcom/flask/colorpicker/e$a;->default_slider_handler_radius:I

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a(I)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    sget v0, Lcom/flask/colorpicker/e$a;->default_slider_bar_height:I

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a(I)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->h:I

    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->f:I

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->b()V

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->d:Landroid/graphics/Canvas;

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->invalidate()V

    return-void
.end method

.method protected abstract a(F)V
.end method

.method protected abstract a(Landroid/graphics/Canvas;)V
.end method

.method protected abstract a(Landroid/graphics/Canvas;FF)V
.end method

.method protected b()V
    .locals 5

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v1

    iget v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->f:I

    mul-int/lit8 v2, v2, 0x2

    sub-int v2, v0, v2

    iget v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->h:I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    new-instance v2, Landroid/graphics/Canvas;

    iget-object v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->d:Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-ne v2, v0, :cond_0

    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-eq v2, v1, :cond_2

    :cond_0
    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->b:Landroid/graphics/Canvas;

    :cond_2
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 7

    const/4 v6, 0x0

    const/4 v5, 0x0

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->b:Landroid/graphics/Canvas;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->b:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->b:Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    iget v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->f:I

    int-to-float v2, v2

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    invoke-virtual {v0, v1, v2, v3, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    int-to-float v0, v0

    iget v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getWidth()I

    move-result v2

    iget v3, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->g:I

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x4000

    div-float/2addr v1, v2

    iget-object v2, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->b:Landroid/graphics/Canvas;

    invoke-virtual {p0, v2, v0, v1}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a(Landroid/graphics/Canvas;FF)V

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v5, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    const/high16 v3, 0x4000

    const/4 v0, 0x0

    const/high16 v2, -0x8000

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-nez v1, :cond_2

    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->setMeasuredDimension(II)V

    return-void

    :cond_0
    if-ne v1, v2, :cond_1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_1
    if-ne v1, v3, :cond_5

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_2
    if-ne v1, v2, :cond_3

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_3
    if-ne v1, v3, :cond_4

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_4
    move p2, v0

    goto :goto_1

    :cond_5
    move p1, v0

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->f:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    iget-object v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    const/4 v0, 0x0

    iget v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    const/high16 v2, 0x3f80

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a(F)V

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->invalidate()V

    goto :goto_0

    :pswitch_1
    iget v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->a(F)V

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->e:Lcom/flask/colorpicker/slider/a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->e:Lcom/flask/colorpicker/slider/a;

    iget v1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->i:F

    invoke-interface {v0, v1}, Lcom/flask/colorpicker/slider/a;->a(F)V

    :cond_1
    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/AbsCustomSlider;->invalidate()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setOnValueChangedListener(Lcom/flask/colorpicker/slider/a;)V
    .locals 0

    iput-object p1, p0, Lcom/flask/colorpicker/slider/AbsCustomSlider;->e:Lcom/flask/colorpicker/slider/a;

    return-void
.end method

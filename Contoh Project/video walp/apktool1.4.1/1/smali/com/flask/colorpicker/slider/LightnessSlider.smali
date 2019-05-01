.class public Lcom/flask/colorpicker/slider/LightnessSlider;
.super Lcom/flask/colorpicker/slider/AbsCustomSlider;


# instance fields
.field private j:I

.field private k:Landroid/graphics/Paint;

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/Paint;

.field private n:Lcom/flask/colorpicker/ColorPickerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/slider/AbsCustomSlider;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->k:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->l:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/PorterDuff$Mode;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->m:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/slider/AbsCustomSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->k:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->l:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/PorterDuff$Mode;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->m:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Lcom/flask/colorpicker/slider/AbsCustomSlider;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->k:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->l:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/PorterDuff$Mode;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->m:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method protected a(F)V
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->n:Lcom/flask/colorpicker/ColorPickerView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->n:Lcom/flask/colorpicker/ColorPickerView;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setLightness(F)V

    :cond_0
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;)V
    .locals 12

    const/4 v11, 0x2

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v7

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v8

    const/4 v0, 0x3

    new-array v9, v0, [F

    iget v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->j:I

    invoke-static {v0, v9}, Landroid/graphics/Color;->colorToHSV(I[F)V

    div-int/lit16 v0, v7, 0x100

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v10

    const/4 v0, 0x0

    move v6, v0

    :goto_0
    if-gt v6, v7, :cond_0

    int-to-float v0, v6

    add-int/lit8 v1, v7, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    aput v0, v9, v11

    iget-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->k:Landroid/graphics/Paint;

    invoke-static {v9}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, v6

    const/4 v2, 0x0

    add-int v0, v6, v10

    int-to-float v3, v0

    int-to-float v4, v8

    iget-object v5, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->k:Landroid/graphics/Paint;

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    add-int v0, v6, v10

    move v6, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected a(Landroid/graphics/Canvas;FF)V
    .locals 3

    iget-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->l:Landroid/graphics/Paint;

    iget v1, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->j:I

    iget v2, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->i:F

    invoke-static {v1, v2}, Lcom/flask/colorpicker/f;->a(IF)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->g:I

    int-to-float v0, v0

    iget-object v1, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->g:I

    int-to-float v0, v0

    const/high16 v1, 0x3f40

    mul-float/2addr v0, v1

    iget-object v1, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->j:I

    invoke-static {p1}, Lcom/flask/colorpicker/f;->b(I)F

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->i:F

    iget-object v0, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/LightnessSlider;->a()V

    invoke-virtual {p0}, Lcom/flask/colorpicker/slider/LightnessSlider;->invalidate()V

    :cond_0
    return-void
.end method

.method public setColorPicker(Lcom/flask/colorpicker/ColorPickerView;)V
    .locals 0

    iput-object p1, p0, Lcom/flask/colorpicker/slider/LightnessSlider;->n:Lcom/flask/colorpicker/ColorPickerView;

    return-void
.end method

.class public Lcom/flask/colorpicker/a;
.super Landroid/graphics/drawable/ColorDrawable;


# instance fields
.field private a:F

.field private b:Landroid/graphics/Paint;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/a;->a:F

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(F)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/a;->b:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/a;->c:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v1}, Lcom/flask/colorpicker/a/d;->a(I)Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/Shader;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/a;->d:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/a;->a:F

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(F)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/a;->b:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/Paint$Style;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/a;->c:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v1}, Lcom/flask/colorpicker/a/d;->a(I)Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(Landroid/graphics/Shader;)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/a;->d:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    const/high16 v3, 0x3fc0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x4000

    div-float/2addr v0, v1

    const/high16 v1, 0x4140

    div-float v1, v0, v1

    iput v1, p0, Lcom/flask/colorpicker/a;->a:F

    iget-object v1, p0, Lcom/flask/colorpicker/a;->b:Landroid/graphics/Paint;

    iget v2, p0, Lcom/flask/colorpicker/a;->a:F

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v1, p0, Lcom/flask/colorpicker/a;->c:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lcom/flask/colorpicker/a;->getColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/flask/colorpicker/a;->a:F

    mul-float/2addr v1, v3

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/flask/colorpicker/a;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/flask/colorpicker/a;->a:F

    mul-float/2addr v1, v3

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/flask/colorpicker/a;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lcom/flask/colorpicker/a;->a:F

    sub-float v1, v0, v1

    iget-object v2, p0, Lcom/flask/colorpicker/a;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public setColor(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    invoke-virtual {p0}, Lcom/flask/colorpicker/a;->invalidateSelf()V

    return-void
.end method

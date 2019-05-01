.class public Lcom/flask/colorpicker/b;
.super Ljava/lang/Object;


# instance fields
.field private a:F

.field private b:F

.field private c:[F

.field private d:[F

.field private e:I


# direct methods
.method public constructor <init>(FF[F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    invoke-virtual {p0, p1, p2, p3}, Lcom/flask/colorpicker/b;->a(FF[F)V

    return-void
.end method


# virtual methods
.method public a(FF)D
    .locals 4

    iget v0, p0, Lcom/flask/colorpicker/b;->a:F

    sub-float/2addr v0, p1

    float-to-double v0, v0

    iget v2, p0, Lcom/flask/colorpicker/b;->b:F

    sub-float/2addr v2, p2

    float-to-double v2, v2

    mul-double/2addr v0, v0

    mul-double/2addr v2, v2

    add-double/2addr v0, v2

    return-wide v0
.end method

.method public a()F
    .locals 1

    iget v0, p0, Lcom/flask/colorpicker/b;->a:F

    return v0
.end method

.method public a(FF[F)V
    .locals 5

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    iput p1, p0, Lcom/flask/colorpicker/b;->a:F

    iput p2, p0, Lcom/flask/colorpicker/b;->b:F

    iget-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    aget v1, p3, v2

    aput v1, v0, v2

    iget-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    aget v1, p3, v3

    aput v1, v0, v3

    iget-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    aget v1, p3, v4

    aput v1, v0, v4

    iget-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/b;->e:I

    return-void
.end method

.method public a(F)[F
    .locals 4

    const/4 v3, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/flask/colorpicker/b;->d:[F

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lcom/flask/colorpicker/b;->d:[F

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/b;->d:[F

    iget-object v1, p0, Lcom/flask/colorpicker/b;->c:[F

    aget v1, v1, v2

    aput v1, v0, v2

    iget-object v0, p0, Lcom/flask/colorpicker/b;->d:[F

    iget-object v1, p0, Lcom/flask/colorpicker/b;->c:[F

    aget v1, v1, v3

    aput v1, v0, v3

    iget-object v0, p0, Lcom/flask/colorpicker/b;->d:[F

    const/4 v1, 0x2

    aput p1, v0, v1

    iget-object v0, p0, Lcom/flask/colorpicker/b;->d:[F

    return-object v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/flask/colorpicker/b;->b:F

    return v0
.end method

.method public c()[F
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/b;->c:[F

    return-object v0
.end method

.class public Lcom/flask/colorpicker/b/e;
.super Lcom/flask/colorpicker/b/a;


# instance fields
.field private c:Landroid/graphics/Paint;

.field private d:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/flask/colorpicker/b/a;-><init>()V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/b/e;->c:Landroid/graphics/Paint;

    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/flask/colorpicker/b/e;->d:[F

    return-void
.end method


# virtual methods
.method public d()V
    .locals 20

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v3, 0x0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget-object v2, v2, Lcom/flask/colorpicker/b/b;->g:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v4, 0x4000

    div-float v7, v2, v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget v8, v2, Lcom/flask/colorpicker/b/b;->a:I

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget v9, v2, Lcom/flask/colorpicker/b/b;->b:F

    const/4 v2, 0x0

    move v5, v2

    :goto_0
    if-ge v5, v8, :cond_2

    int-to-float v2, v5

    add-int/lit8 v4, v8, -0x1

    int-to-float v4, v4

    div-float/2addr v2, v4

    mul-float v10, v9, v2

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget v11, v2, Lcom/flask/colorpicker/b/b;->c:F

    move-object/from16 v0, p0

    invoke-virtual {v0, v10, v11}, Lcom/flask/colorpicker/b/e;->a(FF)I

    move-result v12

    const/4 v2, 0x0

    move v4, v3

    move v3, v2

    :goto_1
    if-ge v3, v12, :cond_1

    const-wide v14, 0x401921fb54442d18L

    int-to-double v0, v3

    move-wide/from16 v16, v0

    mul-double v14, v14, v16

    int-to-double v0, v12

    move-wide/from16 v16, v0

    div-double v14, v14, v16

    const-wide v16, 0x400921fb54442d18L

    int-to-double v0, v12

    move-wide/from16 v18, v0

    div-double v16, v16, v18

    add-int/lit8 v2, v5, 0x1

    rem-int/lit8 v2, v2, 0x2

    int-to-double v0, v2

    move-wide/from16 v18, v0

    mul-double v16, v16, v18

    add-double v14, v14, v16

    float-to-double v0, v10

    move-wide/from16 v16, v0

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    mul-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v2, v0

    add-float v13, v7, v2

    float-to-double v0, v10

    move-wide/from16 v16, v0

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v18

    mul-double v16, v16, v18

    move-wide/from16 v0, v16

    double-to-float v2, v0

    add-float v16, v7, v2

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->d:[F

    const/16 v17, 0x0

    const-wide v18, 0x4066800000000000L

    mul-double v14, v14, v18

    const-wide v18, 0x400921fb54442d18L

    div-double v14, v14, v18

    double-to-float v14, v14

    aput v14, v2, v17

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->d:[F

    const/4 v14, 0x1

    div-float v15, v10, v9

    aput v15, v2, v14

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->d:[F

    const/4 v14, 0x2

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget v15, v15, Lcom/flask/colorpicker/b/b;->f:F

    aput v15, v2, v14

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->c:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/flask/colorpicker/b/e;->d:[F

    invoke-static {v14}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v14

    invoke-virtual {v2, v14}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->c:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lcom/flask/colorpicker/b/e;->c()I

    move-result v14

    invoke-virtual {v2, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget-object v2, v2, Lcom/flask/colorpicker/b/b;->g:Landroid/graphics/Canvas;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/flask/colorpicker/b/e;->a:Lcom/flask/colorpicker/b/b;

    iget v14, v14, Lcom/flask/colorpicker/b/b;->d:F

    sub-float v14, v11, v14

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/flask/colorpicker/b/e;->c:Landroid/graphics/Paint;

    move/from16 v0, v16

    invoke-virtual {v2, v13, v0, v14, v15}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-lt v4, v6, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->b:Ljava/util/List;

    new-instance v14, Lcom/flask/colorpicker/b;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/flask/colorpicker/b/e;->d:[F

    move/from16 v0, v16

    invoke-direct {v14, v13, v0, v15}, Lcom/flask/colorpicker/b;-><init>(FF[F)V

    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v4, v4, 0x1

    add-int/lit8 v2, v3, 0x1

    move v3, v2

    goto/16 :goto_1

    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/b/e;->b:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flask/colorpicker/b;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/flask/colorpicker/b/e;->d:[F

    move/from16 v0, v16

    invoke-virtual {v2, v13, v0, v14}, Lcom/flask/colorpicker/b;->a(FF[F)V

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v3, v4

    goto/16 :goto_0

    :cond_2
    return-void
.end method

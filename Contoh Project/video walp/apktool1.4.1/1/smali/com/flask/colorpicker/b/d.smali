.class public Lcom/flask/colorpicker/b/d;
.super Lcom/flask/colorpicker/b/a;


# instance fields
.field private c:Landroid/graphics/Paint;

.field private d:[F

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/flask/colorpicker/b/a;-><init>()V

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/b/d;->c:Landroid/graphics/Paint;

    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Lcom/flask/colorpicker/b/d;->d:[F

    const v0, 0x3f99999a

    iput v0, p0, Lcom/flask/colorpicker/b/d;->e:F

    return-void
.end method


# virtual methods
.method public d()V
    .locals 24

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    const/4 v5, 0x0

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    iget-object v4, v4, Lcom/flask/colorpicker/b/b;->g:Landroid/graphics/Canvas;

    invoke-virtual {v4}, Landroid/graphics/Canvas;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v6, 0x4000

    div-float v9, v4, v6

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    iget v10, v4, Lcom/flask/colorpicker/b/b;->a:I

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    iget v11, v4, Lcom/flask/colorpicker/b/b;->d:F

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    iget v12, v4, Lcom/flask/colorpicker/b/b;->b:F

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    iget v13, v4, Lcom/flask/colorpicker/b/b;->c:F

    const/4 v4, 0x0

    move v7, v4

    :goto_0
    if-ge v7, v10, :cond_3

    int-to-float v4, v7

    add-int/lit8 v6, v10, -0x1

    int-to-float v6, v6

    div-float/2addr v4, v6

    int-to-float v6, v7

    int-to-float v14, v10

    const/high16 v15, 0x4000

    div-float/2addr v14, v15

    sub-float/2addr v6, v14

    int-to-float v14, v10

    div-float/2addr v6, v14

    mul-float v14, v12, v4

    const/high16 v4, 0x3fc0

    add-float v15, v4, v11

    if-nez v7, :cond_0

    const/4 v4, 0x0

    :goto_1
    add-float/2addr v4, v13

    invoke-static {v15, v4}, Ljava/lang/Math;->max(FF)F

    move-result v15

    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v15}, Lcom/flask/colorpicker/b/d;->a(FF)I

    move-result v4

    mul-int/lit8 v6, v10, 0x2

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v16

    const/4 v4, 0x0

    move v6, v5

    move v5, v4

    :goto_2
    move/from16 v0, v16

    if-ge v5, v0, :cond_2

    const-wide v18, 0x401921fb54442d18L

    int-to-double v0, v5

    move-wide/from16 v20, v0

    mul-double v18, v18, v20

    move/from16 v0, v16

    int-to-double v0, v0

    move-wide/from16 v20, v0

    div-double v18, v18, v20

    const-wide v20, 0x400921fb54442d18L

    move/from16 v0, v16

    int-to-double v0, v0

    move-wide/from16 v22, v0

    div-double v20, v20, v22

    add-int/lit8 v4, v7, 0x1

    rem-int/lit8 v4, v4, 0x2

    int-to-double v0, v4

    move-wide/from16 v22, v0

    mul-double v20, v20, v22

    add-double v18, v18, v20

    float-to-double v0, v14

    move-wide/from16 v20, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v22

    mul-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v4, v0

    add-float v17, v9, v4

    float-to-double v0, v14

    move-wide/from16 v20, v0

    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->sin(D)D

    move-result-wide v22

    mul-double v20, v20, v22

    move-wide/from16 v0, v20

    double-to-float v4, v0

    add-float v20, v9, v4

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->d:[F

    const/16 v21, 0x0

    const-wide v22, 0x4066800000000000L

    mul-double v18, v18, v22

    const-wide v22, 0x400921fb54442d18L

    div-double v18, v18, v22

    move-wide/from16 v0, v18

    double-to-float v0, v0

    move/from16 v18, v0

    aput v18, v4, v21

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->d:[F

    const/16 v18, 0x1

    div-float v19, v14, v12

    aput v19, v4, v18

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->d:[F

    const/16 v18, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget v0, v0, Lcom/flask/colorpicker/b/b;->f:F

    move/from16 v19, v0

    aput v19, v4, v18

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->c:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/flask/colorpicker/b/d;->d:[F

    move-object/from16 v18, v0

    invoke-static/range {v18 .. v18}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v18

    move/from16 v0, v18

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->c:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lcom/flask/colorpicker/b/d;->c()I

    move-result v18

    move/from16 v0, v18

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->a:Lcom/flask/colorpicker/b/b;

    iget-object v4, v4, Lcom/flask/colorpicker/b/b;->g:Landroid/graphics/Canvas;

    sub-float v18, v15, v11

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/flask/colorpicker/b/d;->c:Landroid/graphics/Paint;

    move-object/from16 v19, v0

    move/from16 v0, v17

    move/from16 v1, v20

    move/from16 v2, v18

    move-object/from16 v3, v19

    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-lt v6, v8, :cond_1

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->b:Ljava/util/List;

    new-instance v18, Lcom/flask/colorpicker/b;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/flask/colorpicker/b/d;->d:[F

    move-object/from16 v19, v0

    move-object/from16 v0, v18

    move/from16 v1, v17

    move/from16 v2, v20

    move-object/from16 v3, v19

    invoke-direct {v0, v1, v2, v3}, Lcom/flask/colorpicker/b;-><init>(FF[F)V

    move-object/from16 v0, v18

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v6, v6, 0x1

    add-int/lit8 v4, v5, 0x1

    move v5, v4

    goto/16 :goto_2

    :cond_0
    move-object/from16 v0, p0

    iget v4, v0, Lcom/flask/colorpicker/b/d;->e:F

    mul-float/2addr v4, v13

    mul-float/2addr v4, v6

    goto/16 :goto_1

    :cond_1
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/flask/colorpicker/b/d;->b:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/flask/colorpicker/b;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/flask/colorpicker/b/d;->d:[F

    move-object/from16 v18, v0

    move/from16 v0, v17

    move/from16 v1, v20

    move-object/from16 v2, v18

    invoke-virtual {v4, v0, v1, v2}, Lcom/flask/colorpicker/b;->a(FF[F)V

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    move v5, v6

    goto/16 :goto_0

    :cond_3
    return-void
.end method

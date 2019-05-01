.class public Lcom/flask/colorpicker/ColorPickerView;
.super Landroid/view/View;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/flask/colorpicker/ColorPickerView$a;
    }
.end annotation


# instance fields
.field private a:Landroid/graphics/Bitmap;

.field private b:Landroid/graphics/Canvas;

.field private c:I

.field private d:F

.field private e:F

.field private f:I

.field private g:[Ljava/lang/Integer;

.field private h:I

.field private i:Ljava/lang/Integer;

.field private j:Ljava/lang/Integer;

.field private k:Landroid/graphics/Paint;

.field private l:Landroid/graphics/Paint;

.field private m:Landroid/graphics/Paint;

.field private n:Landroid/graphics/Paint;

.field private o:Lcom/flask/colorpicker/b;

.field private p:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/flask/colorpicker/c;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/flask/colorpicker/d;",
            ">;"
        }
    .end annotation
.end field

.field private r:Lcom/flask/colorpicker/slider/LightnessSlider;

.field private s:Lcom/flask/colorpicker/slider/AlphaSlider;

.field private t:Landroid/widget/EditText;

.field private u:Landroid/text/TextWatcher;

.field private v:Landroid/widget/LinearLayout;

.field private w:Lcom/flask/colorpicker/b/c;

.field private x:I

.field private y:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/high16 v1, 0x3f80

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0xa

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    iput v3, p0, Lcom/flask/colorpicker/ColorPickerView;->f:I

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    aput-object v2, v0, v3

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iput v3, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->n:Landroid/graphics/Paint;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->p:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->q:Ljava/util/ArrayList;

    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->u:Landroid/text/TextWatcher;

    invoke-direct {p0, p1, v2}, Lcom/flask/colorpicker/ColorPickerView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/high16 v1, 0x3f80

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0xa

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    iput v3, p0, Lcom/flask/colorpicker/ColorPickerView;->f:I

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    aput-object v2, v0, v3

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iput v3, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->n:Landroid/graphics/Paint;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->p:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->q:Ljava/util/ArrayList;

    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->u:Landroid/text/TextWatcher;

    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const/high16 v1, 0x3f80

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v0, 0xa

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    iput v3, p0, Lcom/flask/colorpicker/ColorPickerView;->f:I

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Integer;

    aput-object v2, v0, v3

    const/4 v1, 0x1

    aput-object v2, v0, v1

    const/4 v1, 0x2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    aput-object v2, v0, v1

    const/4 v1, 0x4

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iput v3, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    const/high16 v1, -0x100

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/a/d$a;->a(I)Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-static {}, Lcom/flask/colorpicker/a/d;->a()Lcom/flask/colorpicker/a/d$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flask/colorpicker/a/d$a;->a()Landroid/graphics/Paint;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->n:Landroid/graphics/Paint;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->p:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->q:Ljava/util/ArrayList;

    new-instance v0, Lcom/flask/colorpicker/ColorPickerView$1;

    invoke-direct {v0, p0}, Lcom/flask/colorpicker/ColorPickerView$1;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->u:Landroid/text/TextWatcher;

    invoke-direct {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(FF)Lcom/flask/colorpicker/b;
    .locals 10

    const/4 v1, 0x0

    const-wide v4, 0x7fefffffffffffffL

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    invoke-interface {v0}, Lcom/flask/colorpicker/b/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/b;

    invoke-virtual {v0, p1, p2}, Lcom/flask/colorpicker/b;->a(FF)D

    move-result-wide v2

    cmpl-double v7, v4, v2

    if-lez v7, :cond_1

    move-wide v8, v2

    move-object v2, v0

    move-wide v0, v8

    :goto_1
    move-wide v4, v0

    move-object v1, v2

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    move-object v2, v1

    move-wide v0, v4

    goto :goto_1
.end method

.method private a(I)Lcom/flask/colorpicker/b;
    .locals 22

    const/4 v2, 0x3

    new-array v2, v2, [F

    move/from16 v0, p1

    invoke-static {v0, v2}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v3, 0x0

    const-wide v6, 0x7fefffffffffffffL

    const/4 v4, 0x1

    aget v4, v2, v4

    float-to-double v4, v4

    const/4 v8, 0x0

    aget v8, v2, v8

    float-to-double v8, v8

    const-wide v10, 0x400921fb54442d18L

    mul-double/2addr v8, v10

    const-wide v10, 0x4066800000000000L

    div-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->cos(D)D

    move-result-wide v8

    mul-double/2addr v8, v4

    const/4 v4, 0x1

    aget v4, v2, v4

    float-to-double v4, v4

    const/4 v10, 0x0

    aget v2, v2, v10

    float-to-double v10, v2

    const-wide v12, 0x400921fb54442d18L

    mul-double/2addr v10, v12

    const-wide v12, 0x4066800000000000L

    div-double/2addr v10, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double/2addr v10, v4

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    invoke-interface {v2}, Lcom/flask/colorpicker/b/c;->b()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/flask/colorpicker/b;

    invoke-virtual {v2}, Lcom/flask/colorpicker/b;->c()[F

    move-result-object v4

    const/4 v5, 0x1

    aget v5, v4, v5

    float-to-double v14, v5

    const/4 v5, 0x0

    aget v5, v4, v5

    float-to-double v0, v5

    move-wide/from16 v16, v0

    const-wide v18, 0x400921fb54442d18L

    mul-double v16, v16, v18

    const-wide v18, 0x4066800000000000L

    div-double v16, v16, v18

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v16

    mul-double v14, v14, v16

    const/4 v5, 0x1

    aget v5, v4, v5

    float-to-double v0, v5

    move-wide/from16 v16, v0

    const/4 v5, 0x0

    aget v4, v4, v5

    float-to-double v4, v4

    const-wide v18, 0x400921fb54442d18L

    mul-double v4, v4, v18

    const-wide v18, 0x4066800000000000L

    div-double v4, v4, v18

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    mul-double v4, v4, v16

    sub-double v14, v8, v14

    sub-double v4, v10, v4

    mul-double/2addr v14, v14

    mul-double/2addr v4, v4

    add-double/2addr v4, v14

    cmpg-double v13, v4, v6

    if-gez v13, :cond_1

    move-wide/from16 v20, v4

    move-object v4, v2

    move-wide/from16 v2, v20

    :goto_1
    move-wide v6, v2

    move-object v3, v4

    goto :goto_0

    :cond_0
    return-object v3

    :cond_1
    move-object v4, v3

    move-wide v2, v6

    goto :goto_1
.end method

.method private a()V
    .locals 2

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getMeasuredHeight()I

    move-result v0

    if-ge v0, v1, :cond_2

    :goto_0
    if-gtz v0, :cond_0

    :goto_1
    return-void

    :cond_0
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->a:Landroid/graphics/Bitmap;

    if-nez v1, :cond_1

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->a:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->a:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->b:Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->n:Landroid/graphics/Paint;

    const/16 v1, 0x8

    invoke-static {v1}, Lcom/flask/colorpicker/a/d;->a(I)Landroid/graphics/Shader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_1
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->b()V

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/4 v4, -0x1

    const/4 v3, 0x0

    sget-object v0, Lcom/flask/colorpicker/e$d;->ColorPickerPreference:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_density:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    sget v1, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_initialColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    sget v1, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_pickerColorEditTextColor:I

    invoke-virtual {v0, v1, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->j:Ljava/lang/Integer;

    sget v1, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_wheelType:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    invoke-static {v1}, Lcom/flask/colorpicker/ColorPickerView$a;->a(I)Lcom/flask/colorpicker/ColorPickerView$a;

    move-result-object v1

    invoke-static {v1}, Lcom/flask/colorpicker/a/c;->a(Lcom/flask/colorpicker/ColorPickerView$a;)Lcom/flask/colorpicker/b/c;

    move-result-object v1

    sget v2, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_alphaSliderView:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lcom/flask/colorpicker/ColorPickerView;->x:I

    sget v2, Lcom/flask/colorpicker/e$d;->ColorPickerPreference_lightnessSliderView:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lcom/flask/colorpicker/ColorPickerView;->y:I

    invoke-virtual {p0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setRenderer(Lcom/flask/colorpicker/b/c;)V

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    invoke-virtual {p0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setDensity(I)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->a(IZ)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private b()V
    .locals 5

    const/high16 v4, 0x4000

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->b:Landroid/graphics/Canvas;

    const/4 v1, 0x0

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->b:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    const v1, 0x40033333

    sub-float v2, v0, v1

    iget v3, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    sub-float v0, v2, v0

    iget v2, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    div-float v2, v0, v2

    div-float/2addr v2, v4

    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    invoke-interface {v3}, Lcom/flask/colorpicker/b/c;->a()Lcom/flask/colorpicker/b/b;

    move-result-object v3

    iget v4, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    iput v4, v3, Lcom/flask/colorpicker/b/b;->a:I

    iput v0, v3, Lcom/flask/colorpicker/b/b;->b:F

    iput v2, v3, Lcom/flask/colorpicker/b/b;->c:F

    iput v1, v3, Lcom/flask/colorpicker/b/b;->d:F

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    iput v0, v3, Lcom/flask/colorpicker/b/b;->e:F

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    iput v0, v3, Lcom/flask/colorpicker/b/b;->f:F

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->b:Landroid/graphics/Canvas;

    iput-object v0, v3, Lcom/flask/colorpicker/b/b;->g:Landroid/graphics/Canvas;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    invoke-interface {v0, v3}, Lcom/flask/colorpicker/b/c;->a(Lcom/flask/colorpicker/b/b;)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    invoke-interface {v0}, Lcom/flask/colorpicker/b/c;->d()V

    goto :goto_0
.end method

.method private setColorPreviewColor(I)V
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    array-length v1, v1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    aget-object v0, v0, v1

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/LinearLayout;

    sget v1, Lcom/flask/colorpicker/e$b;->image_preview:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    new-instance v1, Lcom/flask/colorpicker/a;

    invoke-direct {v1, p1}, Lcom/flask/colorpicker/a;-><init>(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method private setColorText(I)V
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-static {p1, v0}, Lcom/flask/colorpicker/f;->a(IZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private setColorToSliders(I)V
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v0, p1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    :cond_1
    return-void
.end method

.method private setHighlightedColor(I)V
    .locals 5

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    if-eqz v3, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    move v1, v2

    :goto_0
    if-ge v1, v3, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v4, v0, Landroid/widget/LinearLayout;

    if-nez v4, :cond_2

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    check-cast v0, Landroid/widget/LinearLayout;

    if-ne v1, p1, :cond_3

    const/4 v4, -0x1

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_1
.end method


# virtual methods
.method protected a(II)V
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->p:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eq p1, p2, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/c;

    :try_start_0
    invoke-interface {v0, p2}, Lcom/flask/colorpicker/c;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(IZ)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [F

    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    invoke-static {p1}, Lcom/flask/colorpicker/f;->a(I)F

    move-result v1

    iput v1, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    const/4 v1, 0x2

    aget v0, v0, v1

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorPreviewColor(I)V

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorToSliders(I)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setColorText(I)V

    :cond_0
    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->a(I)Lcom/flask/colorpicker/b;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    return-void
.end method

.method public a(Landroid/widget/LinearLayout;Ljava/lang/Integer;)V
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    return-void

    :cond_1
    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->v:Landroid/widget/LinearLayout;

    if-nez p2, :cond_2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_2
    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    instance-of v3, v0, Landroid/widget/LinearLayout;

    if-nez v3, :cond_3

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_3
    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v1, v3, :cond_4

    const/4 v3, -0x1

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    :cond_4
    sget v3, Lcom/flask/colorpicker/e$b;->image_preview:I

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setClickable(Z)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    new-instance v3, Lcom/flask/colorpicker/ColorPickerView$2;

    invoke-direct {v3, p0}, Lcom/flask/colorpicker/ColorPickerView$2;-><init>(Lcom/flask/colorpicker/ColorPickerView;)V

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1
.end method

.method public a(Lcom/flask/colorpicker/d;)V
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public a([Ljava/lang/Integer;I)V
    .locals 2

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iput p2, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->a(IZ)V

    return-void
.end method

.method public b(IZ)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/flask/colorpicker/ColorPickerView;->a(IZ)V

    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->a()V

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public getAllColors()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    return-object v0
.end method

.method public getSelectedColor()I
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/b;->a(F)[F

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    :cond_0
    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    invoke-static {v1, v0}, Lcom/flask/colorpicker/f;->a(FI)I

    move-result v0

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    const/4 v2, 0x0

    const/high16 v4, 0x4000

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->f:I

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->a:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v4

    const v1, 0x40033333

    sub-float/2addr v0, v1

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    div-float/2addr v0, v4

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    iget v3, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    invoke-virtual {v2, v3}, Lcom/flask/colorpicker/b;->a(F)[F

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    iget v2, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    const/high16 v3, 0x437f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v1}, Lcom/flask/colorpicker/b;->a()F

    move-result v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v2}, Lcom/flask/colorpicker/b;->b()F

    move-result v2

    mul-float v3, v0, v4

    iget-object v4, p0, Lcom/flask/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v1}, Lcom/flask/colorpicker/b;->a()F

    move-result v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v2}, Lcom/flask/colorpicker/b;->b()F

    move-result v2

    const/high16 v3, 0x3fc0

    mul-float/2addr v3, v0

    iget-object v4, p0, Lcom/flask/colorpicker/ColorPickerView;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v1}, Lcom/flask/colorpicker/b;->a()F

    move-result v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v2}, Lcom/flask/colorpicker/b;->b()F

    move-result v2

    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v1}, Lcom/flask/colorpicker/b;->a()F

    move-result v1

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v2}, Lcom/flask/colorpicker/b;->b()F

    move-result v2

    iget-object v3, p0, Lcom/flask/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 2

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->x:I

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getRootView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->x:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerView;->setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V

    :cond_0
    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->y:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getRootView()Landroid/view/View;

    move-result-object v0

    iget v1, p0, Lcom/flask/colorpicker/ColorPickerView;->y:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerView;->setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V

    :cond_1
    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->a()V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/flask/colorpicker/ColorPickerView;->a(I)Lcom/flask/colorpicker/b;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    return-void
.end method

.method protected onMeasure(II)V
    .locals 6

    const/high16 v5, 0x4000

    const/4 v1, 0x0

    const/high16 v4, -0x8000

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    if-nez v2, :cond_2

    move v0, p1

    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    if-nez v3, :cond_4

    move v1, p1

    :cond_0
    :goto_1
    if-ge v1, v0, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {p0, v0, v0}, Lcom/flask/colorpicker/ColorPickerView;->setMeasuredDimension(II)V

    return-void

    :cond_2
    if-ne v2, v4, :cond_3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    goto :goto_0

    :cond_3
    if-ne v2, v5, :cond_6

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    goto :goto_0

    :cond_4
    if-ne v3, v4, :cond_5

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    goto :goto_1

    :cond_5
    if-ne v2, v5, :cond_0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    goto :goto_1

    :cond_6
    move v0, v1

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->a()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/flask/colorpicker/ColorPickerView;->a(FF)Lcom/flask/colorpicker/b;

    move-result-object v1

    iput-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->a(II)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-direct {p0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setColorToSliders(I)V

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flask/colorpicker/d;

    :try_start_0
    invoke-interface {v0, v1}, Lcom/flask/colorpicker/d;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-direct {p0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setColorToSliders(I)V

    invoke-direct {p0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setColorText(I)V

    invoke-direct {p0, v1}, Lcom/flask/colorpicker/ColorPickerView;->setColorPreviewColor(I)V

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->a()V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/flask/colorpicker/ColorPickerView;->a(I)Lcom/flask/colorpicker/b;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    return-void
.end method

.method public setAlphaSlider(Lcom/flask/colorpicker/slider/AlphaSlider;)V
    .locals 2

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {v0, p0}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColorPicker(Lcom/flask/colorpicker/ColorPickerView;)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setAlphaValue(F)V
    .locals 4

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v1

    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    invoke-static {v0}, Lcom/flask/colorpicker/f;->a(F)I

    move-result v0

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    iget v3, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    invoke-virtual {v2, v3}, Lcom/flask/colorpicker/b;->a(F)[F

    move-result-object v2

    invoke-static {v0, v2}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-static {v3, v0}, Lcom/flask/colorpicker/f;->a(IZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    :cond_1
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/flask/colorpicker/ColorPickerView;->a(II)V

    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->a()V

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setColorEdit(Landroid/widget/EditText;)V
    .locals 2

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/flask/colorpicker/ColorPickerView;->u:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->j:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/flask/colorpicker/ColorPickerView;->setColorEditTextColor(I)V

    :cond_0
    return-void
.end method

.method public setColorEditTextColor(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->j:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setDensity(I)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/flask/colorpicker/ColorPickerView;->c:I

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public setLightness(F)V
    .locals 4

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v1

    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->d:F

    iget v0, p0, Lcom/flask/colorpicker/ColorPickerView;->e:F

    invoke-static {v0}, Lcom/flask/colorpicker/f;->a(F)I

    move-result v0

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->o:Lcom/flask/colorpicker/b;

    invoke-virtual {v2, p1}, Lcom/flask/colorpicker/b;->a(F)[F

    move-result-object v2

    invoke-static {v0, v2}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->t:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    invoke-static {v3, v0}, Lcom/flask/colorpicker/f;->a(IZ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->s:Lcom/flask/colorpicker/slider/AlphaSlider;

    iget-object v2, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/flask/colorpicker/slider/AlphaSlider;->setColor(I)V

    :cond_1
    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->i:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v1, v0}, Lcom/flask/colorpicker/ColorPickerView;->a(II)V

    invoke-direct {p0}, Lcom/flask/colorpicker/ColorPickerView;->a()V

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setLightnessSlider(Lcom/flask/colorpicker/slider/LightnessSlider;)V
    .locals 2

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {v0, p0}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColorPicker(Lcom/flask/colorpicker/ColorPickerView;)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->r:Lcom/flask/colorpicker/slider/LightnessSlider;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->getSelectedColor()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/flask/colorpicker/slider/LightnessSlider;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setRenderer(Lcom/flask/colorpicker/b/c;)V
    .locals 0

    iput-object p1, p0, Lcom/flask/colorpicker/ColorPickerView;->w:Lcom/flask/colorpicker/b/c;

    invoke-virtual {p0}, Lcom/flask/colorpicker/ColorPickerView;->invalidate()V

    return-void
.end method

.method public setSelectedColor(I)V
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    array-length v0, v0

    if-ge v0, p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput p1, p0, Lcom/flask/colorpicker/ColorPickerView;->h:I

    invoke-direct {p0, p1}, Lcom/flask/colorpicker/ColorPickerView;->setHighlightedColor(I)V

    iget-object v0, p0, Lcom/flask/colorpicker/ColorPickerView;->g:[Ljava/lang/Integer;

    aget-object v0, v0, p1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/flask/colorpicker/ColorPickerView;->b(IZ)V

    goto :goto_0
.end method

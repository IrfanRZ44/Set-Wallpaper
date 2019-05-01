.class public Landroid/support/transition/ArcMotion;
.super Landroid/support/transition/PathMotion;


# static fields
.field private static final a:F


# instance fields
.field private b:F

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, 0x4041800000000000L

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float v0, v0

    sput v0, Landroid/support/transition/ArcMotion;->a:F

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/support/transition/PathMotion;-><init>()V

    iput v1, p0, Landroid/support/transition/ArcMotion;->b:F

    iput v1, p0, Landroid/support/transition/ArcMotion;->c:F

    const/high16 v0, 0x428c

    iput v0, p0, Landroid/support/transition/ArcMotion;->d:F

    iput v1, p0, Landroid/support/transition/ArcMotion;->e:F

    iput v1, p0, Landroid/support/transition/ArcMotion;->f:F

    sget v0, Landroid/support/transition/ArcMotion;->a:F

    iput v0, p0, Landroid/support/transition/ArcMotion;->g:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/high16 v4, 0x428c

    const/4 v3, 0x0

    invoke-direct {p0, p1, p2}, Landroid/support/transition/PathMotion;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput v3, p0, Landroid/support/transition/ArcMotion;->b:F

    iput v3, p0, Landroid/support/transition/ArcMotion;->c:F

    iput v4, p0, Landroid/support/transition/ArcMotion;->d:F

    iput v3, p0, Landroid/support/transition/ArcMotion;->e:F

    iput v3, p0, Landroid/support/transition/ArcMotion;->f:F

    sget v0, Landroid/support/transition/ArcMotion;->a:F

    iput v0, p0, Landroid/support/transition/ArcMotion;->g:F

    sget-object v0, Landroid/support/transition/ac;->j:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    check-cast p2, Lorg/xmlpull/v1/XmlPullParser;

    const-string v1, "minimumVerticalAngle"

    const/4 v2, 0x1

    invoke-static {v0, p2, v1, v2, v3}, Landroid/support/v4/content/a/c;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/transition/ArcMotion;->b(F)V

    const-string v1, "minimumHorizontalAngle"

    const/4 v2, 0x0

    invoke-static {v0, p2, v1, v2, v3}, Landroid/support/v4/content/a/c;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/transition/ArcMotion;->a(F)V

    const-string v1, "maximumAngle"

    const/4 v2, 0x2

    invoke-static {v0, p2, v1, v2, v4}, Landroid/support/v4/content/a/c;->a(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;IF)F

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/transition/ArcMotion;->c(F)V

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private static d(F)F
    .locals 2

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42b4

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Arc must be between 0 and 90 degrees"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/high16 v0, 0x4000

    div-float v0, p0, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method


# virtual methods
.method public a(FFFF)Landroid/graphics/Path;
    .locals 11

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual {v0, p1, p2}, Landroid/graphics/Path;->moveTo(FF)V

    sub-float v2, p3, p1

    sub-float v3, p4, p2

    mul-float v1, v2, v2

    mul-float v4, v3, v3

    add-float/2addr v4, v1

    add-float v1, p1, p3

    const/high16 v5, 0x4000

    div-float v6, v1, v5

    add-float v1, p2, p4

    const/high16 v5, 0x4000

    div-float v7, v1, v5

    const/high16 v1, 0x3e80

    mul-float v5, v4, v1

    cmpl-float v1, p2, p4

    if-lez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v8

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpg-float v8, v8, v9

    if-gez v8, :cond_2

    const/high16 v2, 0x4000

    mul-float/2addr v2, v3

    div-float v2, v4, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    if-eqz v1, :cond_1

    add-float v1, p4, v2

    move v2, p3

    :goto_1
    iget v3, p0, Landroid/support/transition/ArcMotion;->f:F

    mul-float/2addr v3, v5

    iget v4, p0, Landroid/support/transition/ArcMotion;->f:F

    mul-float/2addr v3, v4

    move v10, v3

    move v3, v2

    move v2, v1

    move v1, v10

    :goto_2
    sub-float v4, v6, v3

    sub-float v8, v7, v2

    mul-float/2addr v4, v4

    mul-float/2addr v8, v8

    add-float/2addr v8, v4

    iget v4, p0, Landroid/support/transition/ArcMotion;->g:F

    mul-float/2addr v4, v5

    iget v5, p0, Landroid/support/transition/ArcMotion;->g:F

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    cmpg-float v9, v8, v1

    if-gez v9, :cond_4

    :goto_3
    const/4 v4, 0x0

    cmpl-float v4, v1, v4

    if-eqz v4, :cond_5

    div-float/2addr v1, v8

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    double-to-float v1, v4

    sub-float/2addr v3, v6

    mul-float/2addr v3, v1

    add-float/2addr v3, v6

    sub-float/2addr v2, v7

    mul-float/2addr v1, v2

    add-float v2, v7, v1

    move v4, v2

    :goto_4
    add-float v1, p1, v3

    const/high16 v2, 0x4000

    div-float/2addr v1, v2

    add-float v2, p2, v4

    const/high16 v5, 0x4000

    div-float/2addr v2, v5

    add-float/2addr v3, p3

    const/high16 v5, 0x4000

    div-float/2addr v3, v5

    add-float/2addr v4, p4

    const/high16 v5, 0x4000

    div-float/2addr v4, v5

    move v5, p3

    move v6, p4

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    return-object v0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    add-float v1, p2, v2

    move v2, p1

    goto :goto_1

    :cond_2
    const/high16 v3, 0x4000

    mul-float/2addr v2, v3

    div-float v2, v4, v2

    if-eqz v1, :cond_3

    add-float v1, p1, v2

    move v2, v1

    move v1, p2

    :goto_5
    iget v3, p0, Landroid/support/transition/ArcMotion;->e:F

    mul-float/2addr v3, v5

    iget v4, p0, Landroid/support/transition/ArcMotion;->e:F

    mul-float/2addr v3, v4

    move v10, v3

    move v3, v2

    move v2, v1

    move v1, v10

    goto :goto_2

    :cond_3
    sub-float v1, p3, v2

    move v2, v1

    move v1, p4

    goto :goto_5

    :cond_4
    cmpl-float v1, v8, v4

    if-lez v1, :cond_6

    move v1, v4

    goto :goto_3

    :cond_5
    move v4, v2

    goto :goto_4

    :cond_6
    move v1, v5

    goto :goto_3
.end method

.method public a(F)V
    .locals 1

    iput p1, p0, Landroid/support/transition/ArcMotion;->b:F

    invoke-static {p1}, Landroid/support/transition/ArcMotion;->d(F)F

    move-result v0

    iput v0, p0, Landroid/support/transition/ArcMotion;->e:F

    return-void
.end method

.method public b(F)V
    .locals 1

    iput p1, p0, Landroid/support/transition/ArcMotion;->c:F

    invoke-static {p1}, Landroid/support/transition/ArcMotion;->d(F)F

    move-result v0

    iput v0, p0, Landroid/support/transition/ArcMotion;->f:F

    return-void
.end method

.method public c(F)V
    .locals 1

    iput p1, p0, Landroid/support/transition/ArcMotion;->d:F

    invoke-static {p1}, Landroid/support/transition/ArcMotion;->d(F)F

    move-result v0

    iput v0, p0, Landroid/support/transition/ArcMotion;->g:F

    return-void
.end method

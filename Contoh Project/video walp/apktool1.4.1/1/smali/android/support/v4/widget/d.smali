.class public Landroid/support/v4/widget/d;
.super Landroid/graphics/drawable/Drawable;

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/d$a;
    }
.end annotation


# static fields
.field private static final a:Landroid/view/animation/Interpolator;

.field private static final b:Landroid/view/animation/Interpolator;

.field private static final c:[I


# instance fields
.field private final d:Landroid/support/v4/widget/d$a;

.field private e:F

.field private f:Landroid/content/res/Resources;

.field private g:Landroid/animation/Animator;

.field private h:F

.field private i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Landroid/support/v4/widget/d;->a:Landroid/view/animation/Interpolator;

    new-instance v0, Landroid/support/v4/view/b/b;

    invoke-direct {v0}, Landroid/support/v4/view/b/b;-><init>()V

    sput-object v0, Landroid/support/v4/widget/d;->b:Landroid/view/animation/Interpolator;

    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/high16 v2, -0x100

    aput v2, v0, v1

    sput-object v0, Landroid/support/v4/widget/d;->c:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    invoke-static {p1}, Landroid/support/v4/f/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/widget/d;->f:Landroid/content/res/Resources;

    new-instance v0, Landroid/support/v4/widget/d$a;

    invoke-direct {v0}, Landroid/support/v4/widget/d$a;-><init>()V

    iput-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    sget-object v1, Landroid/support/v4/widget/d;->c:[I

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/d$a;->a([I)V

    const/high16 v0, 0x4020

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/d;->a(F)V

    invoke-direct {p0}, Landroid/support/v4/widget/d;->a()V

    return-void
.end method

.method static synthetic a(Landroid/support/v4/widget/d;F)F
    .locals 0

    iput p1, p0, Landroid/support/v4/widget/d;->h:F

    return p1
.end method

.method private a(FII)I
    .locals 8

    shr-int/lit8 v0, p2, 0x18

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v2, p2, 0x8

    and-int/lit16 v2, v2, 0xff

    and-int/lit16 v3, p2, 0xff

    shr-int/lit8 v4, p3, 0x18

    and-int/lit16 v4, v4, 0xff

    shr-int/lit8 v5, p3, 0x10

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v6, p3, 0x8

    and-int/lit16 v6, v6, 0xff

    and-int/lit16 v7, p3, 0xff

    sub-int/2addr v4, v0

    int-to-float v4, v4

    mul-float/2addr v4, p1

    float-to-int v4, v4

    add-int/2addr v0, v4

    shl-int/lit8 v0, v0, 0x18

    sub-int v4, v5, v1

    int-to-float v4, v4

    mul-float/2addr v4, p1

    float-to-int v4, v4

    add-int/2addr v1, v4

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    sub-int v1, v6, v2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v1, v2

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    sub-int v1, v7, v3

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    add-int/2addr v1, v3

    or-int/2addr v0, v1

    return v0
.end method

.method private a()V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-instance v2, Landroid/support/v4/widget/d$1;

    invoke-direct {v2, p0, v0}, Landroid/support/v4/widget/d$1;-><init>(Landroid/support/v4/widget/d;Landroid/support/v4/widget/d$a;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    sget-object v2, Landroid/support/v4/widget/d;->a:Landroid/view/animation/Interpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v2, Landroid/support/v4/widget/d$2;

    invoke-direct {v2, p0, v0}, Landroid/support/v4/widget/d$2;-><init>(Landroid/support/v4/widget/d;Landroid/support/v4/widget/d$a;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iput-object v1, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    return-void

    :array_0
    .array-data 0x4
        0x0t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x80t 0x3ft
    .end array-data
.end method

.method private a(FFFF)V
    .locals 3

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    iget-object v1, p0, Landroid/support/v4/widget/d;->f:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v2, p2, v1

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/d$a;->a(F)V

    mul-float v2, p1, v1

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/d$a;->e(F)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/d$a;->b(I)V

    mul-float v2, p3, v1

    mul-float/2addr v1, p4

    invoke-virtual {v0, v2, v1}, Landroid/support/v4/widget/d$a;->a(FF)V

    return-void
.end method

.method private a(FLandroid/support/v4/widget/d$a;)V
    .locals 3

    const/high16 v1, 0x3f40

    cmpl-float v0, p1, v1

    if-lez v0, :cond_0

    sub-float v0, p1, v1

    const/high16 v1, 0x3e80

    div-float/2addr v0, v1

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->h()I

    move-result v1

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->a()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Landroid/support/v4/widget/d;->a(FII)I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/d$a;->a(I)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->h()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/d$a;->a(I)V

    goto :goto_0
.end method

.method private a(FLandroid/support/v4/widget/d$a;Z)V
    .locals 7

    const/high16 v6, 0x3f80

    const v5, 0x3c23d70a

    const v4, 0x3f4a3d71

    const/high16 v1, 0x3f00

    iget-boolean v0, p0, Landroid/support/v4/widget/d;->i:Z

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/d;->b(FLandroid/support/v4/widget/d$a;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    cmpl-float v0, p1, v6

    if-nez v0, :cond_2

    if-eqz p3, :cond_0

    :cond_2
    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->j()F

    move-result v2

    cmpg-float v0, p1, v1

    if-gez v0, :cond_3

    div-float v0, p1, v1

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->f()F

    move-result v1

    sget-object v3, Landroid/support/v4/widget/d;->b:Landroid/view/animation/Interpolator;

    invoke-interface {v3, v0}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v0

    mul-float/2addr v0, v4

    add-float/2addr v0, v5

    add-float/2addr v0, v1

    :goto_1
    const v3, 0x3e570a3c

    mul-float/2addr v3, p1

    add-float/2addr v2, v3

    const/high16 v3, 0x4358

    iget v4, p0, Landroid/support/v4/widget/d;->h:F

    add-float/2addr v4, p1

    mul-float/2addr v3, v4

    invoke-virtual {p2, v1}, Landroid/support/v4/widget/d$a;->b(F)V

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/d$a;->c(F)V

    invoke-virtual {p2, v2}, Landroid/support/v4/widget/d$a;->d(F)V

    invoke-direct {p0, v3}, Landroid/support/v4/widget/d;->d(F)V

    goto :goto_0

    :cond_3
    sub-float v0, p1, v1

    div-float v1, v0, v1

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->f()F

    move-result v0

    add-float/2addr v0, v4

    sget-object v3, Landroid/support/v4/widget/d;->b:Landroid/view/animation/Interpolator;

    invoke-interface {v3, v1}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v1

    sub-float v1, v6, v1

    mul-float/2addr v1, v4

    add-float/2addr v1, v5

    sub-float v1, v0, v1

    goto :goto_1
.end method

.method static synthetic a(Landroid/support/v4/widget/d;FLandroid/support/v4/widget/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/d;->a(FLandroid/support/v4/widget/d$a;)V

    return-void
.end method

.method static synthetic a(Landroid/support/v4/widget/d;FLandroid/support/v4/widget/d$a;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/v4/widget/d;->a(FLandroid/support/v4/widget/d$a;Z)V

    return-void
.end method

.method static synthetic a(Landroid/support/v4/widget/d;)Z
    .locals 1

    iget-boolean v0, p0, Landroid/support/v4/widget/d;->i:Z

    return v0
.end method

.method static synthetic a(Landroid/support/v4/widget/d;Z)Z
    .locals 0

    iput-boolean p1, p0, Landroid/support/v4/widget/d;->i:Z

    return p1
.end method

.method static synthetic b(Landroid/support/v4/widget/d;)F
    .locals 1

    iget v0, p0, Landroid/support/v4/widget/d;->h:F

    return v0
.end method

.method private b(FLandroid/support/v4/widget/d$a;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/d;->a(FLandroid/support/v4/widget/d$a;)V

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->j()F

    move-result v0

    const v1, 0x3f4ccccd

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0

    add-double/2addr v0, v2

    double-to-float v0, v0

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->f()F

    move-result v1

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->g()F

    move-result v2

    const v3, 0x3c23d70a

    sub-float/2addr v2, v3

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->f()F

    move-result v3

    sub-float/2addr v2, v3

    mul-float/2addr v2, p1

    add-float/2addr v1, v2

    invoke-virtual {p2, v1}, Landroid/support/v4/widget/d$a;->b(F)V

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->g()F

    move-result v1

    invoke-virtual {p2, v1}, Landroid/support/v4/widget/d$a;->c(F)V

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->j()F

    move-result v1

    invoke-virtual {p2}, Landroid/support/v4/widget/d$a;->j()F

    move-result v2

    sub-float/2addr v0, v2

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    invoke-virtual {p2, v0}, Landroid/support/v4/widget/d$a;->d(F)V

    return-void
.end method

.method private d(F)V
    .locals 0

    iput p1, p0, Landroid/support/v4/widget/d;->e:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->a(F)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public a(FF)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->b(F)V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p2}, Landroid/support/v4/widget/d$a;->c(F)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public a(I)V
    .locals 4

    if-nez p1, :cond_0

    const/high16 v0, 0x4130

    const/high16 v1, 0x4040

    const/high16 v2, 0x4140

    const/high16 v3, 0x40c0

    invoke-direct {p0, v0, v1, v2, v3}, Landroid/support/v4/widget/d;->a(FFFF)V

    :goto_0
    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void

    :cond_0
    const/high16 v0, 0x40f0

    const/high16 v1, 0x4020

    const/high16 v2, 0x4120

    const/high16 v3, 0x40a0

    invoke-direct {p0, v0, v1, v2, v3}, Landroid/support/v4/widget/d;->a(FFFF)V

    goto :goto_0
.end method

.method public a(Z)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->a(Z)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public varargs a([I)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->a([I)V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/d$a;->b(I)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public b(F)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->f(F)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public c(F)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->d(F)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 4

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget v1, p0, Landroid/support/v4/widget/d;->e:F

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterX()F

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v3

    invoke-virtual {p1, v1, v2, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v1, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v1, p1, v0}, Landroid/support/v4/widget/d$a;->a(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public getAlpha()I
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->d()I

    move-result v0

    return v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public isRunning()Z
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->c(I)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, p1}, Landroid/support/v4/widget/d$a;->a(Landroid/graphics/ColorFilter;)V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

.method public start()V
    .locals 4

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->k()V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->i()F

    move-result v0

    iget-object v1, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v1}, Landroid/support/v4/widget/d$a;->e()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v4/widget/d;->i:Z

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    const-wide/16 v2, 0x29a

    invoke-virtual {v0, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/d$a;->b(I)V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->l()V

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    const-wide/16 v2, 0x534

    invoke-virtual {v0, v2, v3}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    goto :goto_0
.end method

.method public stop()V
    .locals 2

    const/4 v1, 0x0

    iget-object v0, p0, Landroid/support/v4/widget/d;->g:Landroid/animation/Animator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v4/widget/d;->d(F)V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/d$a;->a(Z)V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/d$a;->b(I)V

    iget-object v0, p0, Landroid/support/v4/widget/d;->d:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->l()V

    invoke-virtual {p0}, Landroid/support/v4/widget/d;->invalidateSelf()V

    return-void
.end method

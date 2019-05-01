.class Landroid/support/v7/widget/m;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/support/v7/widget/p;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/o;->c()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/x;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/support/v7/widget/o;)F
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/m;->j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/x;->a()F

    move-result v0

    return v0
.end method

.method public a()V
    .locals 0

    return-void
.end method

.method public a(Landroid/support/v7/widget/o;F)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/m;->j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/x;->a(F)V

    return-void
.end method

.method public a(Landroid/support/v7/widget/o;Landroid/content/Context;Landroid/content/res/ColorStateList;FFF)V
    .locals 2

    new-instance v0, Landroid/support/v7/widget/x;

    invoke-direct {v0, p3, p4}, Landroid/support/v7/widget/x;-><init>(Landroid/content/res/ColorStateList;F)V

    invoke-interface {p1, v0}, Landroid/support/v7/widget/o;->a(Landroid/graphics/drawable/Drawable;)V

    invoke-interface {p1}, Landroid/support/v7/widget/o;->d()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setClipToOutline(Z)V

    invoke-virtual {v0, p5}, Landroid/view/View;->setElevation(F)V

    invoke-virtual {p0, p1, p6}, Landroid/support/v7/widget/m;->b(Landroid/support/v7/widget/o;F)V

    return-void
.end method

.method public a(Landroid/support/v7/widget/o;Landroid/content/res/ColorStateList;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/m;->j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/support/v7/widget/x;->a(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public b(Landroid/support/v7/widget/o;)F
    .locals 2

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->d(Landroid/support/v7/widget/o;)F

    move-result v0

    const/high16 v1, 0x4000

    mul-float/2addr v0, v1

    return v0
.end method

.method public b(Landroid/support/v7/widget/o;F)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/support/v7/widget/m;->j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;

    move-result-object v0

    invoke-interface {p1}, Landroid/support/v7/widget/o;->a()Z

    move-result v1

    invoke-interface {p1}, Landroid/support/v7/widget/o;->b()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, Landroid/support/v7/widget/x;->a(FZZ)V

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->f(Landroid/support/v7/widget/o;)V

    return-void
.end method

.method public c(Landroid/support/v7/widget/o;)F
    .locals 2

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->d(Landroid/support/v7/widget/o;)F

    move-result v0

    const/high16 v1, 0x4000

    mul-float/2addr v0, v1

    return v0
.end method

.method public c(Landroid/support/v7/widget/o;F)V
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/o;->d()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public d(Landroid/support/v7/widget/o;)F
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/m;->j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/x;->b()F

    move-result v0

    return v0
.end method

.method public e(Landroid/support/v7/widget/o;)F
    .locals 1

    invoke-interface {p1}, Landroid/support/v7/widget/o;->d()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    move-result v0

    return v0
.end method

.method public f(Landroid/support/v7/widget/o;)V
    .locals 4

    const/4 v1, 0x0

    invoke-interface {p1}, Landroid/support/v7/widget/o;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, v1, v1, v1, v1}, Landroid/support/v7/widget/o;->a(IIII)V

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->a(Landroid/support/v7/widget/o;)F

    move-result v0

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->d(Landroid/support/v7/widget/o;)F

    move-result v1

    invoke-interface {p1}, Landroid/support/v7/widget/o;->b()Z

    move-result v2

    invoke-static {v0, v1, v2}, Landroid/support/v7/widget/y;->b(FFZ)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-interface {p1}, Landroid/support/v7/widget/o;->b()Z

    move-result v3

    invoke-static {v0, v1, v3}, Landroid/support/v7/widget/y;->a(FFZ)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    invoke-interface {p1, v2, v0, v2, v0}, Landroid/support/v7/widget/o;->a(IIII)V

    goto :goto_0
.end method

.method public g(Landroid/support/v7/widget/o;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->a(Landroid/support/v7/widget/o;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/m;->b(Landroid/support/v7/widget/o;F)V

    return-void
.end method

.method public h(Landroid/support/v7/widget/o;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/support/v7/widget/m;->a(Landroid/support/v7/widget/o;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/support/v7/widget/m;->b(Landroid/support/v7/widget/o;F)V

    return-void
.end method

.method public i(Landroid/support/v7/widget/o;)Landroid/content/res/ColorStateList;
    .locals 1

    invoke-direct {p0, p1}, Landroid/support/v7/widget/m;->j(Landroid/support/v7/widget/o;)Landroid/support/v7/widget/x;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/x;->c()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

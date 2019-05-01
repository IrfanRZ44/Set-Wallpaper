.class Landroid/support/transition/ChangeTransform$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/graphics/Matrix;

.field private final b:Landroid/view/View;

.field private final c:[F

.field private d:F

.field private e:F


# direct methods
.method constructor <init>(Landroid/view/View;[F)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroid/support/transition/ChangeTransform$b;->a:Landroid/graphics/Matrix;

    iput-object p1, p0, Landroid/support/transition/ChangeTransform$b;->b:Landroid/view/View;

    invoke-virtual {p2}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    const/4 v1, 0x2

    aget v0, v0, v1

    iput v0, p0, Landroid/support/transition/ChangeTransform$b;->d:F

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    const/4 v1, 0x5

    aget v0, v0, v1

    iput v0, p0, Landroid/support/transition/ChangeTransform$b;->e:F

    invoke-direct {p0}, Landroid/support/transition/ChangeTransform$b;->b()V

    return-void
.end method

.method private b()V
    .locals 3

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    const/4 v1, 0x2

    iget v2, p0, Landroid/support/transition/ChangeTransform$b;->d:F

    aput v2, v0, v1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    const/4 v1, 0x5

    iget v2, p0, Landroid/support/transition/ChangeTransform$b;->e:F

    aput v2, v0, v1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->a:Landroid/graphics/Matrix;

    iget-object v1, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->b:Landroid/view/View;

    iget-object v1, p0, Landroid/support/transition/ChangeTransform$b;->a:Landroid/graphics/Matrix;

    invoke-static {v0, v1}, Landroid/support/transition/au;->c(Landroid/view/View;Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method a()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->a:Landroid/graphics/Matrix;

    return-object v0
.end method

.method a(Landroid/graphics/PointF;)V
    .locals 1

    iget v0, p1, Landroid/graphics/PointF;->x:F

    iput v0, p0, Landroid/support/transition/ChangeTransform$b;->d:F

    iget v0, p1, Landroid/graphics/PointF;->y:F

    iput v0, p0, Landroid/support/transition/ChangeTransform$b;->e:F

    invoke-direct {p0}, Landroid/support/transition/ChangeTransform$b;->b()V

    return-void
.end method

.method a([F)V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$b;->c:[F

    array-length v1, p1

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0}, Landroid/support/transition/ChangeTransform$b;->b()V

    return-void
.end method

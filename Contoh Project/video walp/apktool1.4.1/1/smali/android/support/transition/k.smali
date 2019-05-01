.class Landroid/support/transition/k;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/transition/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/transition/m;

    invoke-direct {v0}, Landroid/support/transition/m;-><init>()V

    sput-object v0, Landroid/support/transition/k;->a:Landroid/support/transition/n;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/transition/l;

    invoke-direct {v0}, Landroid/support/transition/l;-><init>()V

    sput-object v0, Landroid/support/transition/k;->a:Landroid/support/transition/n;

    goto :goto_0
.end method

.method static a(Landroid/widget/ImageView;)V
    .locals 1

    sget-object v0, Landroid/support/transition/k;->a:Landroid/support/transition/n;

    invoke-interface {v0, p0}, Landroid/support/transition/n;->a(Landroid/widget/ImageView;)V

    return-void
.end method

.method static a(Landroid/widget/ImageView;Landroid/animation/Animator;)V
    .locals 1

    sget-object v0, Landroid/support/transition/k;->a:Landroid/support/transition/n;

    invoke-interface {v0, p0, p1}, Landroid/support/transition/n;->a(Landroid/widget/ImageView;Landroid/animation/Animator;)V

    return-void
.end method

.method static a(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V
    .locals 1

    sget-object v0, Landroid/support/transition/k;->a:Landroid/support/transition/n;

    invoke-interface {v0, p0, p1}, Landroid/support/transition/n;->a(Landroid/widget/ImageView;Landroid/graphics/Matrix;)V

    return-void
.end method

.class Landroid/support/transition/j;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/transition/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/transition/h$a;

    invoke-direct {v0}, Landroid/support/transition/h$a;-><init>()V

    sput-object v0, Landroid/support/transition/j;->a:Landroid/support/transition/i$a;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/transition/g$a;

    invoke-direct {v0}, Landroid/support/transition/g$a;-><init>()V

    sput-object v0, Landroid/support/transition/j;->a:Landroid/support/transition/i$a;

    goto :goto_0
.end method

.method static a(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)Landroid/support/transition/i;
    .locals 1

    sget-object v0, Landroid/support/transition/j;->a:Landroid/support/transition/i$a;

    invoke-interface {v0, p0, p1, p2}, Landroid/support/transition/i$a;->a(Landroid/view/View;Landroid/view/ViewGroup;Landroid/graphics/Matrix;)Landroid/support/transition/i;

    move-result-object v0

    return-object v0
.end method

.method static a(Landroid/view/View;)V
    .locals 1

    sget-object v0, Landroid/support/transition/j;->a:Landroid/support/transition/i$a;

    invoke-interface {v0, p0}, Landroid/support/transition/i$a;->a(Landroid/view/View;)V

    return-void
.end method

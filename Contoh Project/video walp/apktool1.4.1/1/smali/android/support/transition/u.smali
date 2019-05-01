.class Landroid/support/transition/u;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/transition/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/transition/w;

    invoke-direct {v0}, Landroid/support/transition/w;-><init>()V

    sput-object v0, Landroid/support/transition/u;->a:Landroid/support/transition/x;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/transition/v;

    invoke-direct {v0}, Landroid/support/transition/v;-><init>()V

    sput-object v0, Landroid/support/transition/u;->a:Landroid/support/transition/x;

    goto :goto_0
.end method

.method static a(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Property",
            "<*",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Path;",
            ")",
            "Landroid/animation/PropertyValuesHolder;"
        }
    .end annotation

    sget-object v0, Landroid/support/transition/u;->a:Landroid/support/transition/x;

    invoke-interface {v0, p0, p1}, Landroid/support/transition/x;->a(Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;

    move-result-object v0

    return-object v0
.end method

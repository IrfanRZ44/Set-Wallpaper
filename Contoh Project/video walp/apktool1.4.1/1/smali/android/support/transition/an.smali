.class Landroid/support/transition/an;
.super Ljava/lang/Object;


# static fields
.field private static final a:Landroid/support/transition/aq;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/transition/ap;

    invoke-direct {v0}, Landroid/support/transition/ap;-><init>()V

    sput-object v0, Landroid/support/transition/an;->a:Landroid/support/transition/aq;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/transition/ao;

    invoke-direct {v0}, Landroid/support/transition/ao;-><init>()V

    sput-object v0, Landroid/support/transition/an;->a:Landroid/support/transition/aq;

    goto :goto_0
.end method

.method static a(Landroid/view/ViewGroup;)Landroid/support/transition/am;
    .locals 1

    sget-object v0, Landroid/support/transition/an;->a:Landroid/support/transition/aq;

    invoke-interface {v0, p0}, Landroid/support/transition/aq;->a(Landroid/view/ViewGroup;)Landroid/support/transition/am;

    move-result-object v0

    return-object v0
.end method

.method static a(Landroid/view/ViewGroup;Z)V
    .locals 1

    sget-object v0, Landroid/support/transition/an;->a:Landroid/support/transition/aq;

    invoke-interface {v0, p0, p1}, Landroid/support/transition/aq;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

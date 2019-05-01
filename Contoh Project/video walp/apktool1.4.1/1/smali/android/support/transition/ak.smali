.class Landroid/support/transition/ak;
.super Landroid/support/transition/ar;

# interfaces
.implements Landroid/support/transition/am;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/support/transition/ar;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method static a(Landroid/view/ViewGroup;)Landroid/support/transition/ak;
    .locals 1

    invoke-static {p0}, Landroid/support/transition/ar;->d(Landroid/view/View;)Landroid/support/transition/ar;

    move-result-object v0

    check-cast v0, Landroid/support/transition/ak;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroid/support/transition/ak;->a:Landroid/support/transition/ar$a;

    invoke-virtual {v0, p1}, Landroid/support/transition/ar$a;->a(Landroid/view/View;)V

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroid/support/transition/ak;->a:Landroid/support/transition/ar$a;

    invoke-virtual {v0, p1}, Landroid/support/transition/ar$a;->b(Landroid/view/View;)V

    return-void
.end method

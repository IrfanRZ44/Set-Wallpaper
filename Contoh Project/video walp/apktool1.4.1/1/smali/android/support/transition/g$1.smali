.class Landroid/support/transition/g$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/transition/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/transition/g;


# direct methods
.method constructor <init>(Landroid/support/transition/g;)V
    .locals 0

    iput-object p1, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v1, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v1, v1, Landroid/support/transition/g;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    iput-object v1, v0, Landroid/support/transition/g;->e:Landroid/graphics/Matrix;

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    invoke-static {v0}, Landroid/support/v4/view/s;->c(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v0, v0, Landroid/support/transition/g;->b:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v0, v0, Landroid/support/transition/g;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v0, v0, Landroid/support/transition/g;->b:Landroid/view/ViewGroup;

    iget-object v1, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v1, v1, Landroid/support/transition/g;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iget-object v0, v0, Landroid/support/transition/g;->b:Landroid/view/ViewGroup;

    invoke-static {v0}, Landroid/support/v4/view/s;->c(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iput-object v2, v0, Landroid/support/transition/g;->b:Landroid/view/ViewGroup;

    iget-object v0, p0, Landroid/support/transition/g$1;->a:Landroid/support/transition/g;

    iput-object v2, v0, Landroid/support/transition/g;->c:Landroid/view/View;

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

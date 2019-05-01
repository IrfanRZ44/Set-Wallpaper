.class Landroid/support/transition/ChangeTransform$3;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/transition/ChangeTransform;->a(Landroid/support/transition/ah;Landroid/support/transition/ah;Z)Landroid/animation/ObjectAnimator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Landroid/graphics/Matrix;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Landroid/support/transition/ChangeTransform$c;

.field final synthetic e:Landroid/support/transition/ChangeTransform$b;

.field final synthetic f:Landroid/support/transition/ChangeTransform;

.field private g:Z

.field private h:Landroid/graphics/Matrix;


# direct methods
.method constructor <init>(Landroid/support/transition/ChangeTransform;ZLandroid/graphics/Matrix;Landroid/view/View;Landroid/support/transition/ChangeTransform$c;Landroid/support/transition/ChangeTransform$b;)V
    .locals 1

    iput-object p1, p0, Landroid/support/transition/ChangeTransform$3;->f:Landroid/support/transition/ChangeTransform;

    iput-boolean p2, p0, Landroid/support/transition/ChangeTransform$3;->a:Z

    iput-object p3, p0, Landroid/support/transition/ChangeTransform$3;->b:Landroid/graphics/Matrix;

    iput-object p4, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    iput-object p5, p0, Landroid/support/transition/ChangeTransform$3;->d:Landroid/support/transition/ChangeTransform$c;

    iput-object p6, p0, Landroid/support/transition/ChangeTransform$3;->e:Landroid/support/transition/ChangeTransform$b;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroid/support/transition/ChangeTransform$3;->h:Landroid/graphics/Matrix;

    return-void
.end method

.method private a(Landroid/graphics/Matrix;)V
    .locals 3

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    sget v1, Landroid/support/transition/y$a;->transition_transform:I

    iget-object v2, p0, Landroid/support/transition/ChangeTransform$3;->h:Landroid/graphics/Matrix;

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->d:Landroid/support/transition/ChangeTransform$c;

    iget-object v1, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/transition/ChangeTransform$c;->a(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/transition/ChangeTransform$3;->g:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    const/4 v2, 0x0

    iget-boolean v0, p0, Landroid/support/transition/ChangeTransform$3;->g:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/transition/ChangeTransform$3;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->f:Landroid/support/transition/ChangeTransform;

    invoke-static {v0}, Landroid/support/transition/ChangeTransform;->a(Landroid/support/transition/ChangeTransform;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->b:Landroid/graphics/Matrix;

    invoke-direct {p0, v0}, Landroid/support/transition/ChangeTransform$3;->a(Landroid/graphics/Matrix;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    invoke-static {v0, v2}, Landroid/support/transition/au;->c(Landroid/view/View;Landroid/graphics/Matrix;)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->d:Landroid/support/transition/ChangeTransform$c;

    iget-object v1, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/transition/ChangeTransform$c;->a(Landroid/view/View;)V

    return-void

    :cond_1
    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    sget v1, Landroid/support/transition/y$a;->transition_transform:I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    sget v1, Landroid/support/transition/y$a;->parent_matrix:I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method public onAnimationPause(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->e:Landroid/support/transition/ChangeTransform$b;

    invoke-virtual {v0}, Landroid/support/transition/ChangeTransform$b;->a()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/support/transition/ChangeTransform$3;->a(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public onAnimationResume(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$3;->c:Landroid/view/View;

    invoke-static {v0}, Landroid/support/transition/ChangeTransform;->a(Landroid/view/View;)V

    return-void
.end method

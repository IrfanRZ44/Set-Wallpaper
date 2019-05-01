.class Landroid/support/v4/widget/d$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/widget/d;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/v4/widget/d$a;

.field final synthetic b:Landroid/support/v4/widget/d;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/d;Landroid/support/v4/widget/d$a;)V
    .locals 0

    iput-object p1, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    iput-object p2, p0, Landroid/support/v4/widget/d$2;->a:Landroid/support/v4/widget/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 5

    const/4 v4, 0x0

    const/high16 v3, 0x3f80

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    iget-object v1, p0, Landroid/support/v4/widget/d$2;->a:Landroid/support/v4/widget/d$a;

    const/4 v2, 0x1

    invoke-static {v0, v3, v1, v2}, Landroid/support/v4/widget/d;->a(Landroid/support/v4/widget/d;FLandroid/support/v4/widget/d$a;Z)V

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->a:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->k()V

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->a:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0}, Landroid/support/v4/widget/d$a;->c()V

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    invoke-static {v0}, Landroid/support/v4/widget/d;->a(Landroid/support/v4/widget/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    invoke-static {v0, v4}, Landroid/support/v4/widget/d;->a(Landroid/support/v4/widget/d;Z)Z

    invoke-virtual {p1}, Landroid/animation/Animator;->cancel()V

    const-wide/16 v0, 0x534

    invoke-virtual {p1, v0, v1}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {p1}, Landroid/animation/Animator;->start()V

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->a:Landroid/support/v4/widget/d$a;

    invoke-virtual {v0, v4}, Landroid/support/v4/widget/d$a;->a(Z)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    iget-object v1, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    invoke-static {v1}, Landroid/support/v4/widget/d;->b(Landroid/support/v4/widget/d;)F

    move-result v1

    add-float/2addr v1, v3

    invoke-static {v0, v1}, Landroid/support/v4/widget/d;->a(Landroid/support/v4/widget/d;F)F

    goto :goto_0
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    iget-object v0, p0, Landroid/support/v4/widget/d$2;->b:Landroid/support/v4/widget/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/v4/widget/d;->a(Landroid/support/v4/widget/d;F)F

    return-void
.end method

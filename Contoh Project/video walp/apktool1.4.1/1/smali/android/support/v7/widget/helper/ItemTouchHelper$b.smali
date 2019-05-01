.class Landroid/support/v7/widget/helper/ItemTouchHelper$b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/helper/ItemTouchHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/animation/ValueAnimator;

.field private b:F

.field final d:F

.field final e:F

.field final f:F

.field final g:F

.field final h:Landroid/support/v7/widget/RecyclerView$ViewHolder;

.field final i:I

.field final j:I

.field public k:Z

.field l:F

.field m:F

.field n:Z

.field o:Z


# direct methods
.method constructor <init>(Landroid/support/v7/widget/RecyclerView$ViewHolder;IIFFFF)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->n:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->o:Z

    iput p3, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->i:I

    iput p2, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->j:I

    iput-object p1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->h:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iput p4, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->d:F

    iput p5, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->e:F

    iput p6, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->f:F

    iput p7, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->g:F

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/support/v7/widget/helper/ItemTouchHelper$b$1;

    invoke-direct {v1, p0}, Landroid/support/v7/widget/helper/ItemTouchHelper$b$1;-><init>(Landroid/support/v7/widget/helper/ItemTouchHelper$b;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    iget-object v1, p1, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setTarget(Ljava/lang/Object;)V

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p0}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a(F)V

    return-void

    nop

    :array_0
    .array-data 0x4
        0x0t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x80t 0x3ft
    .end array-data
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->h:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->setIsRecyclable(Z)V

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->b:F

    return-void
.end method

.method public a(J)V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v0, p1, p2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    return-void
.end method

.method public c()V
    .locals 4

    iget v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->d:F

    iget v1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->f:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->h:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->l:F

    :goto_0
    iget v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->e:F

    iget v1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->g:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->h:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->m:F

    :goto_1
    return-void

    :cond_0
    iget v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->d:F

    iget v1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->b:F

    iget v2, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->f:F

    iget v3, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->d:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->l:F

    goto :goto_0

    :cond_1
    iget v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->e:F

    iget v1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->b:F

    iget v2, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->g:F

    iget v3, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->e:F

    sub-float/2addr v2, v3

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->m:F

    goto :goto_1
.end method

.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    const/high16 v0, 0x3f80

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->a(F)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    const/4 v1, 0x1

    iget-boolean v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->o:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->h:Landroid/support/v7/widget/RecyclerView$ViewHolder;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->setIsRecyclable(Z)V

    :cond_0
    iput-boolean v1, p0, Landroid/support/v7/widget/helper/ItemTouchHelper$b;->o:Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

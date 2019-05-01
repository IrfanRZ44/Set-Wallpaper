.class Landroid/support/transition/ChangeBounds$10;
.super Landroid/support/transition/ad;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/transition/ChangeBounds;->a(Landroid/view/ViewGroup;Landroid/support/transition/ah;Landroid/support/transition/ah;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Landroid/support/transition/ChangeBounds;


# direct methods
.method constructor <init>(Landroid/support/transition/ChangeBounds;Landroid/view/ViewGroup;)V
    .locals 1

    iput-object p1, p0, Landroid/support/transition/ChangeBounds$10;->c:Landroid/support/transition/ChangeBounds;

    iput-object p2, p0, Landroid/support/transition/ChangeBounds$10;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Landroid/support/transition/ad;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/transition/ChangeBounds$10;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/support/transition/Transition;)V
    .locals 2

    iget-boolean v0, p0, Landroid/support/transition/ChangeBounds$10;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/transition/ChangeBounds$10;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/transition/an;->a(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Landroid/support/transition/Transition;->b(Landroid/support/transition/Transition$c;)Landroid/support/transition/Transition;

    return-void
.end method

.method public b(Landroid/support/transition/Transition;)V
    .locals 2

    iget-object v0, p0, Landroid/support/transition/ChangeBounds$10;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/support/transition/an;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public c(Landroid/support/transition/Transition;)V
    .locals 2

    iget-object v0, p0, Landroid/support/transition/ChangeBounds$10;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Landroid/support/transition/an;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

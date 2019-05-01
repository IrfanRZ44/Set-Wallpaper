.class Landroid/support/transition/ChangeTransform$a;
.super Landroid/support/transition/ad;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/transition/ChangeTransform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/view/View;

.field private b:Landroid/support/transition/i;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/support/transition/i;)V
    .locals 0

    invoke-direct {p0}, Landroid/support/transition/ad;-><init>()V

    iput-object p1, p0, Landroid/support/transition/ChangeTransform$a;->a:Landroid/view/View;

    iput-object p2, p0, Landroid/support/transition/ChangeTransform$a;->b:Landroid/support/transition/i;

    return-void
.end method


# virtual methods
.method public a(Landroid/support/transition/Transition;)V
    .locals 3

    const/4 v2, 0x0

    invoke-virtual {p1, p0}, Landroid/support/transition/Transition;->b(Landroid/support/transition/Transition$c;)Landroid/support/transition/Transition;

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$a;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/transition/j;->a(Landroid/view/View;)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$a;->a:Landroid/view/View;

    sget v1, Landroid/support/transition/y$a;->transition_transform:I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$a;->a:Landroid/view/View;

    sget v1, Landroid/support/transition/y$a;->parent_matrix:I

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/support/transition/Transition;)V
    .locals 2

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$a;->b:Landroid/support/transition/i;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Landroid/support/transition/i;->setVisibility(I)V

    return-void
.end method

.method public c(Landroid/support/transition/Transition;)V
    .locals 2

    iget-object v0, p0, Landroid/support/transition/ChangeTransform$a;->b:Landroid/support/transition/i;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/support/transition/i;->setVisibility(I)V

    return-void
.end method

.class Landroid/support/transition/ChangeBounds$8;
.super Landroid/animation/AnimatorListenerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/transition/ChangeBounds;->a(Landroid/view/ViewGroup;Landroid/support/transition/ah;Landroid/support/transition/ah;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/support/transition/ChangeBounds$a;

.field final synthetic b:Landroid/support/transition/ChangeBounds;

.field private mViewBounds:Landroid/support/transition/ChangeBounds$a;


# direct methods
.method constructor <init>(Landroid/support/transition/ChangeBounds;Landroid/support/transition/ChangeBounds$a;)V
    .locals 1

    iput-object p1, p0, Landroid/support/transition/ChangeBounds$8;->b:Landroid/support/transition/ChangeBounds;

    iput-object p2, p0, Landroid/support/transition/ChangeBounds$8;->a:Landroid/support/transition/ChangeBounds$a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iget-object v0, p0, Landroid/support/transition/ChangeBounds$8;->a:Landroid/support/transition/ChangeBounds$a;

    iput-object v0, p0, Landroid/support/transition/ChangeBounds$8;->mViewBounds:Landroid/support/transition/ChangeBounds$a;

    return-void
.end method
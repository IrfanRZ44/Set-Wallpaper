.class public Landroid/support/transition/ae;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/transition/ae$a;
    }
.end annotation


# static fields
.field private static a:Landroid/support/transition/Transition;

.field private static b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/support/v4/f/a",
            "<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/transition/Transition;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field private static c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/support/transition/AutoTransition;

    invoke-direct {v0}, Landroid/support/transition/AutoTransition;-><init>()V

    sput-object v0, Landroid/support/transition/ae;->a:Landroid/support/transition/Transition;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroid/support/transition/ae;->b:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Landroid/support/transition/ae;->c:Ljava/util/ArrayList;

    return-void
.end method

.method static a()Landroid/support/v4/f/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/f/a",
            "<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/transition/Transition;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Landroid/support/transition/ae;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Landroid/support/v4/f/a;

    invoke-direct {v1}, Landroid/support/v4/f/a;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v1, Landroid/support/transition/ae;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/f/a;

    return-object v0
.end method

.method public static a(Landroid/view/ViewGroup;Landroid/support/transition/Transition;)V
    .locals 2

    sget-object v0, Landroid/support/transition/ae;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Landroid/support/v4/view/s;->x(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Landroid/support/transition/ae;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    sget-object p1, Landroid/support/transition/ae;->a:Landroid/support/transition/Transition;

    :cond_0
    invoke-virtual {p1}, Landroid/support/transition/Transition;->n()Landroid/support/transition/Transition;

    move-result-object v0

    invoke-static {p0, v0}, Landroid/support/transition/ae;->c(Landroid/view/ViewGroup;Landroid/support/transition/Transition;)V

    const/4 v1, 0x0

    invoke-static {p0, v1}, Landroid/support/transition/aa;->a(Landroid/view/View;Landroid/support/transition/aa;)V

    invoke-static {p0, v0}, Landroid/support/transition/ae;->b(Landroid/view/ViewGroup;Landroid/support/transition/Transition;)V

    :cond_1
    return-void
.end method

.method static synthetic b()Ljava/util/ArrayList;
    .locals 1

    sget-object v0, Landroid/support/transition/ae;->c:Ljava/util/ArrayList;

    return-object v0
.end method

.method private static b(Landroid/view/ViewGroup;Landroid/support/transition/Transition;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    new-instance v0, Landroid/support/transition/ae$a;

    invoke-direct {v0, p1, p0}, Landroid/support/transition/ae$a;-><init>(Landroid/support/transition/Transition;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    return-void
.end method

.method private static c(Landroid/view/ViewGroup;Landroid/support/transition/Transition;)V
    .locals 2

    invoke-static {}, Landroid/support/transition/ae;->a()Landroid/support/v4/f/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/support/v4/f/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/transition/Transition;

    invoke-virtual {v0, p0}, Landroid/support/transition/Transition;->e(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Landroid/support/transition/Transition;->a(Landroid/view/ViewGroup;Z)V

    :cond_1
    invoke-static {p0}, Landroid/support/transition/aa;->a(Landroid/view/View;)Landroid/support/transition/aa;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/support/transition/aa;->a()V

    :cond_2
    return-void
.end method

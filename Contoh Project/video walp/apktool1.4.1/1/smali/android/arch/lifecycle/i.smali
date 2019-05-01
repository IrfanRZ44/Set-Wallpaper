.class public Landroid/arch/lifecycle/i;
.super Landroid/arch/lifecycle/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/arch/lifecycle/i$a;
    }
.end annotation


# instance fields
.field private a:Landroid/arch/a/b/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/arch/a/b/a",
            "<",
            "Landroid/arch/lifecycle/g;",
            "Landroid/arch/lifecycle/i$a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/arch/lifecycle/e$b;

.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/arch/lifecycle/h;",
            ">;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z

.field private f:Z

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/arch/lifecycle/e$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/arch/lifecycle/h;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/arch/lifecycle/e;-><init>()V

    new-instance v0, Landroid/arch/a/b/a;

    invoke-direct {v0}, Landroid/arch/a/b/a;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    iput v1, p0, Landroid/arch/lifecycle/i;->d:I

    iput-boolean v1, p0, Landroid/arch/lifecycle/i;->e:Z

    iput-boolean v1, p0, Landroid/arch/lifecycle/i;->f:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Landroid/arch/lifecycle/i;->c:Ljava/lang/ref/WeakReference;

    sget-object v0, Landroid/arch/lifecycle/e$b;->b:Landroid/arch/lifecycle/e$b;

    iput-object v0, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    return-void
.end method

.method static a(Landroid/arch/lifecycle/e$b;Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$b;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroid/arch/lifecycle/e$b;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    :goto_0
    return-object p1

    :cond_0
    move-object p1, p0

    goto :goto_0
.end method

.method private a(Landroid/arch/lifecycle/h;)V
    .locals 5

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0}, Landroid/arch/a/b/a;->c()Landroid/arch/a/b/b$d;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroid/arch/lifecycle/i;->f:Z

    if-nez v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/arch/lifecycle/i$a;

    :goto_0
    iget-object v3, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    iget-object v4, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    invoke-virtual {v3, v4}, Landroid/arch/lifecycle/e$b;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_0

    iget-boolean v3, p0, Landroid/arch/lifecycle/i;->f:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/arch/a/b/a;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-direct {p0, v3}, Landroid/arch/lifecycle/i;->c(Landroid/arch/lifecycle/e$b;)V

    iget-object v3, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-static {v3}, Landroid/arch/lifecycle/i;->e(Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$a;

    move-result-object v3

    invoke-virtual {v1, p1, v3}, Landroid/arch/lifecycle/i$a;->a(Landroid/arch/lifecycle/h;Landroid/arch/lifecycle/e$a;)V

    invoke-direct {p0}, Landroid/arch/lifecycle/i;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method static b(Landroid/arch/lifecycle/e$a;)Landroid/arch/lifecycle/e$b;
    .locals 3

    sget-object v0, Landroid/arch/lifecycle/i$1;->a:[I

    invoke-virtual {p0}, Landroid/arch/lifecycle/e$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected event value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Landroid/arch/lifecycle/e$b;->c:Landroid/arch/lifecycle/e$b;

    :goto_0
    return-object v0

    :pswitch_1
    sget-object v0, Landroid/arch/lifecycle/e$b;->d:Landroid/arch/lifecycle/e$b;

    goto :goto_0

    :pswitch_2
    sget-object v0, Landroid/arch/lifecycle/e$b;->e:Landroid/arch/lifecycle/e$b;

    goto :goto_0

    :pswitch_3
    sget-object v0, Landroid/arch/lifecycle/e$b;->a:Landroid/arch/lifecycle/e$b;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private b(Landroid/arch/lifecycle/e$b;)V
    .locals 2

    const/4 v1, 0x1

    iget-object v0, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    if-ne v0, p1, :cond_0

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    iget-boolean v0, p0, Landroid/arch/lifecycle/i;->e:Z

    if-nez v0, :cond_1

    iget v0, p0, Landroid/arch/lifecycle/i;->d:I

    if-eqz v0, :cond_2

    :cond_1
    iput-boolean v1, p0, Landroid/arch/lifecycle/i;->f:Z

    goto :goto_0

    :cond_2
    iput-boolean v1, p0, Landroid/arch/lifecycle/i;->e:Z

    invoke-direct {p0}, Landroid/arch/lifecycle/i;->d()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/arch/lifecycle/i;->e:Z

    goto :goto_0
.end method

.method private b(Landroid/arch/lifecycle/h;)V
    .locals 5

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0}, Landroid/arch/a/b/a;->b()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroid/arch/lifecycle/i;->f:Z

    if-nez v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/arch/lifecycle/i$a;

    :goto_0
    iget-object v3, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    iget-object v4, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    invoke-virtual {v3, v4}, Landroid/arch/lifecycle/e$b;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-lez v3, :cond_0

    iget-boolean v3, p0, Landroid/arch/lifecycle/i;->f:Z

    if-nez v3, :cond_0

    iget-object v3, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/arch/a/b/a;->c(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-static {v3}, Landroid/arch/lifecycle/i;->d(Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$a;

    move-result-object v3

    invoke-static {v3}, Landroid/arch/lifecycle/i;->b(Landroid/arch/lifecycle/e$a;)Landroid/arch/lifecycle/e$b;

    move-result-object v4

    invoke-direct {p0, v4}, Landroid/arch/lifecycle/i;->c(Landroid/arch/lifecycle/e$b;)V

    invoke-virtual {v1, p1, v3}, Landroid/arch/lifecycle/i$a;->a(Landroid/arch/lifecycle/h;Landroid/arch/lifecycle/e$a;)V

    invoke-direct {p0}, Landroid/arch/lifecycle/i;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private b()Z
    .locals 3

    const/4 v1, 0x1

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0}, Landroid/arch/a/b/a;->a()I

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return v1

    :cond_0
    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0}, Landroid/arch/a/b/a;->d()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/i$a;

    iget-object v2, v0, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0}, Landroid/arch/a/b/a;->e()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/i$a;

    iget-object v0, v0, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    if-ne v2, v0, :cond_1

    iget-object v2, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    if-ne v2, v0, :cond_1

    move v0, v1

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private c(Landroid/arch/lifecycle/g;)Landroid/arch/lifecycle/e$b;
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0, p1}, Landroid/arch/a/b/a;->d(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/i$a;

    iget-object v0, v0, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    move-object v1, v0

    :goto_0
    iget-object v0, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/e$b;

    :goto_1
    iget-object v2, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    invoke-static {v2, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$b;Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$b;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$b;Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$b;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v1, v2

    goto :goto_0

    :cond_1
    move-object v0, v2

    goto :goto_1
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void
.end method

.method private c(Landroid/arch/lifecycle/e$b;)V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/i;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static d(Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$a;
    .locals 3

    sget-object v0, Landroid/arch/lifecycle/i$1;->b:[I

    invoke-virtual {p0}, Landroid/arch/lifecycle/e$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :pswitch_1
    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_DESTROY:Landroid/arch/lifecycle/e$a;

    :goto_0
    return-object v0

    :pswitch_2
    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_STOP:Landroid/arch/lifecycle/e$a;

    goto :goto_0

    :pswitch_3
    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_PAUSE:Landroid/arch/lifecycle/e$a;

    goto :goto_0

    :pswitch_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private d()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Landroid/arch/lifecycle/i;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/h;

    if-nez v0, :cond_0

    const-string v0, "LifecycleRegistry"

    const-string v1, "LifecycleOwner is garbage collected, you shouldn\'t try dispatch new events from it."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void

    :cond_0
    :goto_1
    invoke-direct {p0}, Landroid/arch/lifecycle/i;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iput-boolean v3, p0, Landroid/arch/lifecycle/i;->f:Z

    iget-object v2, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    iget-object v1, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v1}, Landroid/arch/a/b/a;->d()Ljava/util/Map$Entry;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/arch/lifecycle/i$a;

    iget-object v1, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-virtual {v2, v1}, Landroid/arch/lifecycle/e$b;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_1

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/i;->b(Landroid/arch/lifecycle/h;)V

    :cond_1
    iget-object v1, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v1}, Landroid/arch/a/b/a;->e()Ljava/util/Map$Entry;

    move-result-object v1

    iget-boolean v2, p0, Landroid/arch/lifecycle/i;->f:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/arch/lifecycle/i$a;

    iget-object v1, v1, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-virtual {v2, v1}, Landroid/arch/lifecycle/e$b;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/h;)V

    goto :goto_1

    :cond_2
    iput-boolean v3, p0, Landroid/arch/lifecycle/i;->f:Z

    goto :goto_0
.end method

.method private static e(Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$a;
    .locals 3

    sget-object v0, Landroid/arch/lifecycle/i$1;->b:[I

    invoke-virtual {p0}, Landroid/arch/lifecycle/e$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected state value "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_CREATE:Landroid/arch/lifecycle/e$a;

    :goto_0
    return-object v0

    :pswitch_1
    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_START:Landroid/arch/lifecycle/e$a;

    goto :goto_0

    :pswitch_2
    sget-object v0, Landroid/arch/lifecycle/e$a;->ON_RESUME:Landroid/arch/lifecycle/e$a;

    goto :goto_0

    :pswitch_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Landroid/arch/lifecycle/e$b;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    return-object v0
.end method

.method public a(Landroid/arch/lifecycle/e$a;)V
    .locals 1

    invoke-static {p1}, Landroid/arch/lifecycle/i;->b(Landroid/arch/lifecycle/e$a;)Landroid/arch/lifecycle/e$b;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/arch/lifecycle/i;->b(Landroid/arch/lifecycle/e$b;)V

    return-void
.end method

.method public a(Landroid/arch/lifecycle/e$b;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/arch/lifecycle/i;->b(Landroid/arch/lifecycle/e$b;)V

    return-void
.end method

.method public a(Landroid/arch/lifecycle/g;)V
    .locals 5

    iget-object v0, p0, Landroid/arch/lifecycle/i;->b:Landroid/arch/lifecycle/e$b;

    sget-object v1, Landroid/arch/lifecycle/e$b;->a:Landroid/arch/lifecycle/e$b;

    if-ne v0, v1, :cond_1

    sget-object v0, Landroid/arch/lifecycle/e$b;->a:Landroid/arch/lifecycle/e$b;

    :goto_0
    new-instance v3, Landroid/arch/lifecycle/i$a;

    invoke-direct {v3, p1, v0}, Landroid/arch/lifecycle/i$a;-><init>(Landroid/arch/lifecycle/g;Landroid/arch/lifecycle/e$b;)V

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0, p1, v3}, Landroid/arch/a/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/i$a;

    if-eqz v0, :cond_2

    :cond_0
    :goto_1
    return-void

    :cond_1
    sget-object v0, Landroid/arch/lifecycle/e$b;->b:Landroid/arch/lifecycle/e$b;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroid/arch/lifecycle/i;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/h;

    if-eqz v0, :cond_0

    iget v1, p0, Landroid/arch/lifecycle/i;->d:I

    if-nez v1, :cond_3

    iget-boolean v1, p0, Landroid/arch/lifecycle/i;->e:Z

    if-eqz v1, :cond_4

    :cond_3
    const/4 v1, 0x1

    :goto_2
    invoke-direct {p0, p1}, Landroid/arch/lifecycle/i;->c(Landroid/arch/lifecycle/g;)Landroid/arch/lifecycle/e$b;

    move-result-object v2

    iget v4, p0, Landroid/arch/lifecycle/i;->d:I

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Landroid/arch/lifecycle/i;->d:I

    :goto_3
    iget-object v4, v3, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-virtual {v4, v2}, Landroid/arch/lifecycle/e$b;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_5

    iget-object v2, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v2, p1}, Landroid/arch/a/b/a;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v3, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-direct {p0, v2}, Landroid/arch/lifecycle/i;->c(Landroid/arch/lifecycle/e$b;)V

    iget-object v2, v3, Landroid/arch/lifecycle/i$a;->a:Landroid/arch/lifecycle/e$b;

    invoke-static {v2}, Landroid/arch/lifecycle/i;->e(Landroid/arch/lifecycle/e$b;)Landroid/arch/lifecycle/e$a;

    move-result-object v2

    invoke-virtual {v3, v0, v2}, Landroid/arch/lifecycle/i$a;->a(Landroid/arch/lifecycle/h;Landroid/arch/lifecycle/e$a;)V

    invoke-direct {p0}, Landroid/arch/lifecycle/i;->c()V

    invoke-direct {p0, p1}, Landroid/arch/lifecycle/i;->c(Landroid/arch/lifecycle/g;)Landroid/arch/lifecycle/e$b;

    move-result-object v2

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    goto :goto_2

    :cond_5
    if-nez v1, :cond_6

    invoke-direct {p0}, Landroid/arch/lifecycle/i;->d()V

    :cond_6
    iget v0, p0, Landroid/arch/lifecycle/i;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/arch/lifecycle/i;->d:I

    goto :goto_1
.end method

.method public b(Landroid/arch/lifecycle/g;)V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/i;->a:Landroid/arch/a/b/a;

    invoke-virtual {v0, p1}, Landroid/arch/a/b/a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.class public Lcom/a/a/d/k;
.super Landroid/app/Fragment;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/a/a/d/k$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/a/a/d/a;

.field private final b:Lcom/a/a/d/m;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/a/a/d/k;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/a/a/j;

.field private e:Lcom/a/a/d/k;

.field private f:Landroid/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/a/a/d/a;

    invoke-direct {v0}, Lcom/a/a/d/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/a/a/d/k;-><init>(Lcom/a/a/d/a;)V

    return-void
.end method

.method constructor <init>(Lcom/a/a/d/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    new-instance v0, Lcom/a/a/d/k$a;

    invoke-direct {v0, p0}, Lcom/a/a/d/k$a;-><init>(Lcom/a/a/d/k;)V

    iput-object v0, p0, Lcom/a/a/d/k;->b:Lcom/a/a/d/m;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/a/a/d/k;->c:Ljava/util/Set;

    iput-object p1, p0, Lcom/a/a/d/k;->a:Lcom/a/a/d/a;

    return-void
.end method

.method private a(Landroid/app/Activity;)V
    .locals 3

    invoke-direct {p0}, Lcom/a/a/d/k;->e()V

    invoke-static {p1}, Lcom/a/a/c;->a(Landroid/content/Context;)Lcom/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/a/a/c;->g()Lcom/a/a/d/l;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/a/a/d/l;->a(Landroid/app/FragmentManager;Landroid/app/Fragment;)Lcom/a/a/d/k;

    move-result-object v0

    iput-object v0, p0, Lcom/a/a/d/k;->e:Lcom/a/a/d/k;

    iget-object v0, p0, Lcom/a/a/d/k;->e:Lcom/a/a/d/k;

    invoke-virtual {p0, v0}, Lcom/a/a/d/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/a/a/d/k;->e:Lcom/a/a/d/k;

    invoke-direct {v0, p0}, Lcom/a/a/d/k;->a(Lcom/a/a/d/k;)V

    :cond_0
    return-void
.end method

.method private a(Lcom/a/a/d/k;)V
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/k;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private b(Lcom/a/a/d/k;)V
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/k;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private d()Landroid/app/Fragment;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/a/a/d/k;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    :goto_1
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/a/a/d/k;->f:Landroid/app/Fragment;

    goto :goto_1
.end method

.method private e()V
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/k;->e:Lcom/a/a/d/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/a/a/d/k;->e:Lcom/a/a/d/k;

    invoke-direct {v0, p0}, Lcom/a/a/d/k;->b(Lcom/a/a/d/k;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/d/k;->e:Lcom/a/a/d/k;

    :cond_0
    return-void
.end method


# virtual methods
.method a()Lcom/a/a/d/a;
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/k;->a:Lcom/a/a/d/a;

    return-object v0
.end method

.method a(Landroid/app/Fragment;)V
    .locals 1

    iput-object p1, p0, Lcom/a/a/d/k;->f:Landroid/app/Fragment;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/a/a/d/k;->a(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/a/a/j;)V
    .locals 0

    iput-object p1, p0, Lcom/a/a/d/k;->d:Lcom/a/a/j;

    return-void
.end method

.method public b()Lcom/a/a/j;
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/k;->d:Lcom/a/a/j;

    return-object v0
.end method

.method public c()Lcom/a/a/d/m;
    .locals 1

    iget-object v0, p0, Lcom/a/a/d/k;->b:Lcom/a/a/d/m;

    return-object v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    :try_start_0
    invoke-direct {p0, p1}, Lcom/a/a/d/k;->a(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "RMFragment"

    const/4 v2, 0x5

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "RMFragment"

    const-string v2, "Unable to register fragment with root"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/a/a/d/k;->a:Lcom/a/a/d/a;

    invoke-virtual {v0}, Lcom/a/a/d/a;->c()V

    invoke-direct {p0}, Lcom/a/a/d/k;->e()V

    return-void
.end method

.method public onDetach()V
    .locals 0

    invoke-super {p0}, Landroid/app/Fragment;->onDetach()V

    invoke-direct {p0}, Lcom/a/a/d/k;->e()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/a/a/d/k;->a:Lcom/a/a/d/a;

    invoke-virtual {v0}, Lcom/a/a/d/a;->a()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/a/a/d/k;->a:Lcom/a/a/d/a;

    invoke-virtual {v0}, Lcom/a/a/d/a;->b()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroid/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-direct {p0}, Lcom/a/a/d/k;->d()Landroid/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

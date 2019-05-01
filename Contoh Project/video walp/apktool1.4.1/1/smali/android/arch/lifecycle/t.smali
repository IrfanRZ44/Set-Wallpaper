.class public Landroid/arch/lifecycle/t;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/arch/lifecycle/t$a;,
        Landroid/arch/lifecycle/t$c;,
        Landroid/arch/lifecycle/t$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/arch/lifecycle/t$b;

.field private final b:Landroid/arch/lifecycle/v;


# direct methods
.method public constructor <init>(Landroid/arch/lifecycle/v;Landroid/arch/lifecycle/t$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroid/arch/lifecycle/t;->a:Landroid/arch/lifecycle/t$b;

    iput-object p1, p0, Landroid/arch/lifecycle/t;->b:Landroid/arch/lifecycle/v;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroid/arch/lifecycle/s;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/arch/lifecycle/s;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "android.arch.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Landroid/arch/lifecycle/t;->a(Ljava/lang/String;Ljava/lang/Class;)Landroid/arch/lifecycle/s;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Class;)Landroid/arch/lifecycle/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/arch/lifecycle/s;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Landroid/arch/lifecycle/t;->b:Landroid/arch/lifecycle/v;

    invoke-virtual {v0, p1}, Landroid/arch/lifecycle/v;->a(Ljava/lang/String;)Landroid/arch/lifecycle/s;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    if-eqz v0, :cond_1

    :cond_1
    iget-object v0, p0, Landroid/arch/lifecycle/t;->a:Landroid/arch/lifecycle/t$b;

    invoke-interface {v0, p2}, Landroid/arch/lifecycle/t$b;->create(Ljava/lang/Class;)Landroid/arch/lifecycle/s;

    move-result-object v0

    iget-object v1, p0, Landroid/arch/lifecycle/t;->b:Landroid/arch/lifecycle/v;

    invoke-virtual {v1, p1, v0}, Landroid/arch/lifecycle/v;->a(Ljava/lang/String;Landroid/arch/lifecycle/s;)V

    goto :goto_0
.end method

.class final Lcom/a/a/c/b/a$b;
.super Ljava/lang/ref/WeakReference;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/a/a/c/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ref/WeakReference",
        "<",
        "Lcom/a/a/c/b/o",
        "<*>;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/a/a/c/h;

.field final b:Z

.field c:Lcom/a/a/c/b/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/a/a/c/b/u",
            "<*>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/a/a/c/h;Lcom/a/a/c/b/o;Ljava/lang/ref/ReferenceQueue;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/a/a/c/h;",
            "Lcom/a/a/c/b/o",
            "<*>;",
            "Ljava/lang/ref/ReferenceQueue",
            "<-",
            "Lcom/a/a/c/b/o",
            "<*>;>;Z)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    invoke-static {p1}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/h;

    iput-object v0, p0, Lcom/a/a/c/b/a$b;->a:Lcom/a/a/c/h;

    invoke-virtual {p2}, Lcom/a/a/c/b/o;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p4, :cond_0

    invoke-virtual {p2}, Lcom/a/a/c/b/o;->a()Lcom/a/a/c/b/u;

    move-result-object v0

    invoke-static {v0}, Lcom/a/a/i/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/c/b/u;

    :goto_0
    iput-object v0, p0, Lcom/a/a/c/b/a$b;->c:Lcom/a/a/c/b/u;

    invoke-virtual {p2}, Lcom/a/a/c/b/o;->b()Z

    move-result v0

    iput-boolean v0, p0, Lcom/a/a/c/b/a$b;->b:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/a/a/c/b/a$b;->c:Lcom/a/a/c/b/u;

    invoke-virtual {p0}, Lcom/a/a/c/b/a$b;->clear()V

    return-void
.end method

.class public final Lcom/google/android/gms/internal/ads/gx;
.super Lcom/google/android/gms/internal/ads/hg;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private volatile a:Lcom/google/android/gms/internal/ads/gv;

.field private volatile b:Lcom/google/android/gms/internal/ads/gy;

.field private volatile c:Lcom/google/android/gms/internal/ads/gw;

.field private volatile d:Lcom/google/android/gms/internal/ads/hd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/gw;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->d:Lcom/google/android/gms/internal/ads/hd;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->d:Lcom/google/android/gms/internal/ads/hd;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/hd;->a(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/gv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/gv;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gv;->g()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/a/a;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/gv;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/gv;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/gv;->a(I)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/a/a;Lcom/google/android/gms/internal/ads/zzaig;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0, p2}, Lcom/google/android/gms/internal/ads/gw;->a_(Lcom/google/android/gms/internal/ads/zzaig;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/gv;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/gy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/gy;

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/hd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->d:Lcom/google/android/gms/internal/ads/hd;

    return-void
.end method

.method public final b(Lcom/google/android/gms/a/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/gy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/gy;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/gy;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/a/a;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/gy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/gy;

    invoke-static {p1}, Lcom/google/android/gms/a/b;->a(Lcom/google/android/gms/a/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/google/android/gms/internal/ads/gy;->a(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public final c(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gw;->a()V

    :cond_0
    return-void
.end method

.method public final d(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gw;->b()V

    :cond_0
    return-void
.end method

.method public final e(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gw;->c()V

    :cond_0
    return-void
.end method

.method public final f(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gw;->d_()V

    :cond_0
    return-void
.end method

.method public final g(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gw;->e()V

    :cond_0
    return-void
.end method

.method public final h(Lcom/google/android/gms/a/a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/gw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/gw;->f()V

    :cond_0
    return-void
.end method

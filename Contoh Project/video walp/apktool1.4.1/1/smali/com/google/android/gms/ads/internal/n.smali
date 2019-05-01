.class final Lcom/google/android/gms/ads/internal/n;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzv;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/ads/internal/gmsg/zzv",
        "<",
        "Lcom/google/android/gms/internal/ads/qe;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bcw;

.field private final synthetic b:Lcom/google/android/gms/ads/internal/zzac;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/bda;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bcw;Lcom/google/android/gms/ads/internal/zzac;Lcom/google/android/gms/internal/ads/bda;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/n;->a:Lcom/google/android/gms/internal/ads/bcw;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/n;->b:Lcom/google/android/gms/ads/internal/zzac;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/n;->c:Lcom/google/android/gms/internal/ads/bda;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/qe;->getView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n;->a:Lcom/google/android/gms/internal/ads/bcw;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n;->a:Lcom/google/android/gms/internal/ads/bcw;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/bcw;->k()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n;->a:Lcom/google/android/gms/internal/ads/bcw;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/bcw;->a(Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/n;->b:Lcom/google/android/gms/ads/internal/zzac;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzac;->a:Lcom/google/android/gms/ads/internal/zzy;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->onAdClicked()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/qe;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Unable to call handleClick on mapper"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n;->c:Lcom/google/android/gms/internal/ads/bda;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n;->c:Lcom/google/android/gms/internal/ads/bda;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/bda;->i()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/n;->c:Lcom/google/android/gms/internal/ads/bda;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/bda;->a(Lcom/google/android/gms/a/a;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/n;->b:Lcom/google/android/gms/ads/internal/zzac;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzac;->a:Lcom/google/android/gms/ads/internal/zzy;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zza;->onAdClicked()V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/qe;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

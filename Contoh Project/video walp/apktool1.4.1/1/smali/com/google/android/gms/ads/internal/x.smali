.class final Lcom/google/android/gms/ads/internal/x;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Ljava/lang/String;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/ij;

.field private final synthetic c:Lcom/google/android/gms/ads/internal/zzbc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzbc;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ij;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/x;->c:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/x;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/x;->b:Lcom/google/android/gms/internal/ads/ij;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/x;->c:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->m:Landroid/support/v4/f/m;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/x;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/support/v4/f/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/avy;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/x;->b:Lcom/google/android/gms/internal/ads/ij;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ij;->C:Lcom/google/android/gms/internal/ads/att;

    check-cast v1, Lcom/google/android/gms/internal/ads/atj;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/avy;->a(Lcom/google/android/gms/internal/ads/avk;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.class final synthetic Lcom/google/android/gms/internal/ads/axh;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/axg;

.field private final b:Lcom/google/android/gms/internal/ads/awz;

.field private final c:Lcom/google/android/gms/internal/ads/np;

.field private final d:Lcom/google/android/gms/internal/ads/zzsg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axg;Lcom/google/android/gms/internal/ads/awz;Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/zzsg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/axh;->a:Lcom/google/android/gms/internal/ads/axg;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/axh;->b:Lcom/google/android/gms/internal/ads/awz;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/axh;->c:Lcom/google/android/gms/internal/ads/np;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/axh;->d:Lcom/google/android/gms/internal/ads/zzsg;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/axh;->a:Lcom/google/android/gms/internal/ads/axg;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axh;->b:Lcom/google/android/gms/internal/ads/awz;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/axh;->c:Lcom/google/android/gms/internal/ads/np;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/axh;->d:Lcom/google/android/gms/internal/ads/zzsg;

    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/awz;->x()Lcom/google/android/gms/internal/ads/axc;

    move-result-object v0

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/axc;->a(Lcom/google/android/gms/internal/ads/zzsg;)Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v3, "Unable to obtain a cache service instance."

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/axg;->a:Lcom/google/android/gms/internal/ads/axe;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axe;->a(Lcom/google/android/gms/internal/ads/axe;)V

    goto :goto_0
.end method

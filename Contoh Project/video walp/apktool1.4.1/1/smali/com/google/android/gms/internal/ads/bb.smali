.class final Lcom/google/android/gms/internal/ads/bb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/np;

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/ay;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ay;Lcom/google/android/gms/internal/ads/np;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bb;->c:Lcom/google/android/gms/internal/ads/ay;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bb;->a:Lcom/google/android/gms/internal/ads/np;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bb;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bb;->a:Lcom/google/android/gms/internal/ads/np;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bb;->c:Lcom/google/android/gms/internal/ads/ay;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ay;->a(Lcom/google/android/gms/internal/ads/ay;)Lcom/google/android/gms/ads/internal/zzbc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdv()Landroid/support/v4/f/m;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bb;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/support/v4/f/m;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/avy;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V

    return-void
.end method

.class final Lcom/google/android/gms/ads/internal/r;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ik;

.field private final synthetic b:Lcom/google/android/gms/ads/internal/zzbc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/ik;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/r;->b:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/r;->a:Lcom/google/android/gms/internal/ads/ik;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v2, 0x0

    iget-object v9, p0, Lcom/google/android/gms/ads/internal/r;->b:Lcom/google/android/gms/ads/internal/zzbc;

    new-instance v0, Lcom/google/android/gms/internal/ads/ij;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/r;->a:Lcom/google/android/gms/internal/ads/ik;

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move-object v6, v2

    move-object v7, v2

    move-object v8, v2

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/ij;-><init>(Lcom/google/android/gms/internal/ads/ik;Lcom/google/android/gms/internal/ads/qe;Lcom/google/android/gms/internal/ads/bbt;Lcom/google/android/gms/internal/ads/bcn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbx;Lcom/google/android/gms/internal/ads/att;Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/ads/ij;)V

    return-void
.end method

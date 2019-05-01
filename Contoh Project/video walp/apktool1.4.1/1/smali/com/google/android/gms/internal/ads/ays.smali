.class final Lcom/google/android/gms/internal/ads/ays;
.super Ljava/lang/Object;


# instance fields
.field a:Lcom/google/android/gms/ads/internal/zzal;

.field b:Lcom/google/android/gms/internal/ads/zzjj;

.field c:Lcom/google/android/gms/internal/ads/axl;

.field d:J

.field e:Z

.field f:Z

.field private final synthetic g:Lcom/google/android/gms/internal/ads/ayr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ayr;Lcom/google/android/gms/internal/ads/axk;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ays;->g:Lcom/google/android/gms/internal/ads/ayr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ayr;->a(Lcom/google/android/gms/internal/ads/ayr;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/axk;->b(Ljava/lang/String;)Lcom/google/android/gms/ads/internal/zzal;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ays;->a:Lcom/google/android/gms/ads/internal/zzal;

    new-instance v0, Lcom/google/android/gms/internal/ads/axl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/axl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/ays;->c:Lcom/google/android/gms/internal/ads/axl;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ays;->c:Lcom/google/android/gms/internal/ads/axl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ays;->a:Lcom/google/android/gms/ads/internal/zzal;

    new-instance v2, Lcom/google/android/gms/internal/ads/axm;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/axm;-><init>(Lcom/google/android/gms/internal/ads/axl;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/aoy;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/axv;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/axv;-><init>(Lcom/google/android/gms/internal/ads/axl;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/aps;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/axx;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/axx;-><init>(Lcom/google/android/gms/internal/ads/axl;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/asu;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/axz;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/axz;-><init>(Lcom/google/android/gms/internal/ads/axl;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/aov;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/ayb;

    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/ayb;-><init>(Lcom/google/android/gms/internal/ads/axl;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/gh;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/ads/ayr;Lcom/google/android/gms/internal/ads/axk;Lcom/google/android/gms/internal/ads/zzjj;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/ays;-><init>(Lcom/google/android/gms/internal/ads/ayr;Lcom/google/android/gms/internal/ads/axk;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ays;->b:Lcom/google/android/gms/internal/ads/zzjj;

    return-void
.end method


# virtual methods
.method final a()Z
    .locals 4

    const/4 v1, 0x1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/ays;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ays;->b:Lcom/google/android/gms/internal/ads/zzjj;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ays;->b:Lcom/google/android/gms/internal/ads/zzjj;

    :goto_1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ayp;->b(Lcom/google/android/gms/internal/ads/zzjj;)Lcom/google/android/gms/internal/ads/zzjj;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ays;->a:Lcom/google/android/gms/ads/internal/zzal;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/ads/zzjj;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/ays;->f:Z

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/ays;->e:Z

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzer()Lcom/google/android/gms/common/util/c;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/c;->a()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/ays;->d:J

    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ays;->g:Lcom/google/android/gms/internal/ads/ayr;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ayr;->b(Lcom/google/android/gms/internal/ads/ayr;)Lcom/google/android/gms/internal/ads/zzjj;

    move-result-object v0

    goto :goto_1
.end method

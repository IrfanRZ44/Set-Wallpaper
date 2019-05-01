.class final Lcom/google/android/gms/ads/internal/t;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/att;

.field private final synthetic b:I

.field private final synthetic c:Ljava/util/List;

.field private final synthetic d:Lcom/google/android/gms/ads/internal/zzbc;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/att;ILjava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    iput p3, p0, Lcom/google/android/gms/ads/internal/t;->b:I

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/t;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    instance-of v2, v2, Lcom/google/android/gms/internal/ads/ath;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget v3, p0, Lcom/google/android/gms/ads/internal/t;->b:I

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/t;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v3, v4, :cond_0

    :goto_0
    iput-boolean v0, v2, Lcom/google/android/gms/ads/internal/zzbc;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzbc;->a(Lcom/google/android/gms/internal/ads/att;)Lcom/google/android/gms/internal/ads/atm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/awe;->a(Lcom/google/android/gms/internal/ads/awk;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/atm;->n()Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzbc;->a(Lcom/google/android/gms/a/a;)V

    :goto_1
    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    instance-of v2, v2, Lcom/google/android/gms/internal/ads/ath;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->j:Lcom/google/android/gms/internal/ads/avr;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget v3, p0, Lcom/google/android/gms/ads/internal/t;->b:I

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/t;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v3, v4, :cond_2

    :goto_2
    iput-boolean v0, v2, Lcom/google/android/gms/ads/internal/zzbc;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    check-cast v0, Lcom/google/android/gms/internal/ads/ath;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->j:Lcom/google/android/gms/internal/ads/avr;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/avr;->a(Lcom/google/android/gms/internal/ads/avg;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ath;->j()Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzbc;->a(Lcom/google/android/gms/a/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_2

    :cond_3
    :try_start_1
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    instance-of v2, v2, Lcom/google/android/gms/internal/ads/atf;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget v3, p0, Lcom/google/android/gms/ads/internal/t;->b:I

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/t;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v3, v4, :cond_4

    :goto_3
    iput-boolean v0, v2, Lcom/google/android/gms/ads/internal/zzbc;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzbc;->a(Lcom/google/android/gms/internal/ads/att;)Lcom/google/android/gms/internal/ads/atm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->k:Lcom/google/android/gms/internal/ads/awe;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/awe;->a(Lcom/google/android/gms/internal/ads/awk;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/atm;->n()Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzbc;->a(Lcom/google/android/gms/a/a;)V

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_3

    :cond_5
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    instance-of v2, v2, Lcom/google/android/gms/internal/ads/atf;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->i:Lcom/google/android/gms/internal/ads/avo;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget v3, p0, Lcom/google/android/gms/ads/internal/t;->b:I

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/t;->c:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-eq v3, v4, :cond_6

    :goto_4
    iput-boolean v0, v2, Lcom/google/android/gms/ads/internal/zzbc;->c:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/t;->a:Lcom/google/android/gms/internal/ads/att;

    check-cast v0, Lcom/google/android/gms/internal/ads/atf;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->i:Lcom/google/android/gms/internal/ads/avo;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/avo;->a(Lcom/google/android/gms/internal/ads/avc;)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/atf;->j()Lcom/google/android/gms/a/a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzbc;->a(Lcom/google/android/gms/a/a;)V

    goto/16 :goto_1

    :cond_6
    move v0, v1

    goto :goto_4

    :cond_7
    iget-object v2, p0, Lcom/google/android/gms/ads/internal/t;->d:Lcom/google/android/gms/ads/internal/zzbc;

    const/4 v3, 0x3

    iget v4, p0, Lcom/google/android/gms/ads/internal/t;->b:I

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/t;->c:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-eq v4, v5, :cond_8

    :goto_5
    invoke-virtual {v2, v3, v0}, Lcom/google/android/gms/ads/internal/zza;->a(IZ)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    :cond_8
    move v0, v1

    goto :goto_5
.end method

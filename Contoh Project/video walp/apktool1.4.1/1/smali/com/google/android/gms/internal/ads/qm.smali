.class final synthetic Lcom/google/android/gms/internal/ads/qm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/mo;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/agw;

.field private final c:Lcom/google/android/gms/internal/ads/zzang;

.field private final d:Lcom/google/android/gms/ads/internal/zzw;

.field private final e:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/qm;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/qm;->b:Lcom/google/android/gms/internal/ads/agw;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/qm;->c:Lcom/google/android/gms/internal/ads/zzang;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/qm;->d:Lcom/google/android/gms/ads/internal/zzw;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/qm;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ne;
    .locals 12

    const/4 v7, 0x0

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/qm;->a:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/qm;->b:Lcom/google/android/gms/internal/ads/agw;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/qm;->c:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/qm;->d:Lcom/google/android/gms/ads/internal/zzw;

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/qm;->e:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/ql;

    invoke-static {}, Lcom/google/android/gms/internal/ads/rs;->a()Lcom/google/android/gms/internal/ads/rs;

    move-result-object v1

    const-string v2, ""

    invoke-static {}, Lcom/google/android/gms/internal/ads/amj;->a()Lcom/google/android/gms/internal/ads/amj;

    move-result-object v10

    move v4, v3

    move-object v8, v7

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/ql;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rs;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/asn;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/amj;)Lcom/google/android/gms/internal/ads/qe;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/no;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/no;

    move-result-object v1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/qe;->t()Lcom/google/android/gms/internal/ads/rm;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ads/qo;

    invoke-direct {v3, v1}, Lcom/google/android/gms/internal/ads/qo;-><init>(Lcom/google/android/gms/internal/ads/no;)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/rm;->a(Lcom/google/android/gms/internal/ads/rn;)V

    invoke-interface {v0, v11}, Lcom/google/android/gms/internal/ads/qe;->loadUrl(Ljava/lang/String;)V

    return-object v1
.end method

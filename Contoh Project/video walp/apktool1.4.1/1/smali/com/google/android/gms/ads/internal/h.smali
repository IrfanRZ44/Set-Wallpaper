.class final Lcom/google/android/gms/ads/internal/h;
.super Lcom/google/android/gms/internal/ads/iz;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/internal/zzal;

.field private final b:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzal;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/iz;-><init>()V

    iput p2, p0, Lcom/google/android/gms/ads/internal/h;->b:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 10

    const/4 v9, -0x1

    new-instance v0, Lcom/google/android/gms/ads/internal/zzaq;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-boolean v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->x:Z

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    invoke-virtual {v2}, Lcom/google/android/gms/ads/internal/zzal;->i()Z

    move-result v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    invoke-static {v3}, Lcom/google/android/gms/ads/internal/zzal;->a(Lcom/google/android/gms/ads/internal/zzal;)Z

    move-result v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    invoke-static {v4}, Lcom/google/android/gms/ads/internal/zzal;->b(Lcom/google/android/gms/ads/internal/zzal;)F

    move-result v4

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-boolean v5, v5, Lcom/google/android/gms/ads/internal/zzbw;->x:Z

    if-eqz v5, :cond_1

    iget v5, p0, Lcom/google/android/gms/ads/internal/h;->b:I

    :goto_0
    iget-object v6, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    invoke-static {v6}, Lcom/google/android/gms/ads/internal/zzal;->c(Lcom/google/android/gms/ads/internal/zzal;)Z

    move-result v6

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-boolean v7, v7, Lcom/google/android/gms/internal/ads/ij;->L:Z

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v8, v8, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v8, v8, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-boolean v8, v8, Lcom/google/android/gms/internal/ads/ij;->O:Z

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/ads/internal/zzaq;-><init>(ZZZFIZZZ)V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/ij;->b:Lcom/google/android/gms/internal/ads/qe;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/qe;->getRequestedOrientation()I

    move-result v6

    if-ne v6, v9, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget v6, v1, Lcom/google/android/gms/internal/ads/ij;->h:I

    :cond_0
    new-instance v1, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/ij;->b:Lcom/google/android/gms/internal/ads/qe;

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/zzbw;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v8, p0, Lcom/google/android/gms/ads/internal/h;->a:Lcom/google/android/gms/ads/internal/zzal;

    iget-object v8, v8, Lcom/google/android/gms/ads/internal/zzal;->e:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v8, v8, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/ij;

    iget-object v8, v8, Lcom/google/android/gms/internal/ads/ij;->A:Ljava/lang/String;

    move-object v9, v0

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;-><init>(Lcom/google/android/gms/internal/ads/anw;Lcom/google/android/gms/ads/internal/overlay/zzn;Lcom/google/android/gms/ads/internal/overlay/zzt;Lcom/google/android/gms/internal/ads/qe;ILcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;Lcom/google/android/gms/ads/internal/zzaq;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/ads/internal/i;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/ads/internal/i;-><init>(Lcom/google/android/gms/ads/internal/h;Lcom/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    move v5, v9

    goto :goto_0
.end method

.method public final b_()V
    .locals 0

    return-void
.end method

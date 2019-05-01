.class public final Lcom/google/android/gms/ads/internal/zzak;
.super Lcom/google/android/gms/internal/ads/apf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/aoy;

.field private b:Lcom/google/android/gms/internal/ads/avo;

.field private c:Lcom/google/android/gms/internal/ads/awe;

.field private d:Lcom/google/android/gms/internal/ads/avr;

.field private e:Landroid/support/v4/f/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/f/m",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/avv;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroid/support/v4/f/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/f/m",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/avy;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/ads/awb;

.field private h:Lcom/google/android/gms/internal/ads/zzjn;

.field private i:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

.field private j:Lcom/google/android/gms/internal/ads/zzpl;

.field private k:Lcom/google/android/gms/internal/ads/apy;

.field private final l:Landroid/content/Context;

.field private final m:Lcom/google/android/gms/internal/ads/bck;

.field private final n:Ljava/lang/String;

.field private final o:Lcom/google/android/gms/internal/ads/zzang;

.field private final p:Lcom/google/android/gms/ads/internal/zzw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/apf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->l:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzak;->n:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzak;->m:Lcom/google/android/gms/internal/ads/bck;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzak;->o:Lcom/google/android/gms/internal/ads/zzang;

    new-instance v0, Landroid/support/v4/f/m;

    invoke-direct {v0}, Landroid/support/v4/f/m;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzak;->f:Landroid/support/v4/f/m;

    new-instance v0, Landroid/support/v4/f/m;

    invoke-direct {v0}, Landroid/support/v4/f/m;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzak;->e:Landroid/support/v4/f/m;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzak;->p:Lcom/google/android/gms/ads/internal/zzw;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->i:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/avo;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->b:Lcom/google/android/gms/internal/ads/avo;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/avr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->d:Lcom/google/android/gms/internal/ads/avr;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/awb;Lcom/google/android/gms/internal/ads/zzjn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->g:Lcom/google/android/gms/internal/ads/awb;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzak;->h:Lcom/google/android/gms/internal/ads/zzjn;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/awe;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->c:Lcom/google/android/gms/internal/ads/awe;

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzpl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->j:Lcom/google/android/gms/internal/ads/zzpl;

    return-void
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/avy;Lcom/google/android/gms/internal/ads/avv;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Custom template ID for native custom template ad is empty. Please provide a valid template id."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzak;->f:Landroid/support/v4/f/m;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/f/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzak;->e:Landroid/support/v4/f/m;

    invoke-virtual {v0, p1, p3}, Landroid/support/v4/f/m;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/aoy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->a:Lcom/google/android/gms/internal/ads/aoy;

    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/apy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzak;->k:Lcom/google/android/gms/internal/ads/apy;

    return-void
.end method

.method public final zzdh()Lcom/google/android/gms/internal/ads/apb;
    .locals 18

    new-instance v1, Lcom/google/android/gms/ads/internal/zzah;

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzak;->l:Landroid/content/Context;

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzak;->n:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/ads/internal/zzak;->m:Lcom/google/android/gms/internal/ads/bck;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/ads/internal/zzak;->o:Lcom/google/android/gms/internal/ads/zzang;

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/google/android/gms/ads/internal/zzak;->a:Lcom/google/android/gms/internal/ads/aoy;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/ads/internal/zzak;->b:Lcom/google/android/gms/internal/ads/avo;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/ads/internal/zzak;->c:Lcom/google/android/gms/internal/ads/awe;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/ads/internal/zzak;->d:Lcom/google/android/gms/internal/ads/avr;

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/ads/internal/zzak;->f:Landroid/support/v4/f/m;

    move-object/from16 v0, p0

    iget-object v11, v0, Lcom/google/android/gms/ads/internal/zzak;->e:Landroid/support/v4/f/m;

    move-object/from16 v0, p0

    iget-object v12, v0, Lcom/google/android/gms/ads/internal/zzak;->j:Lcom/google/android/gms/internal/ads/zzpl;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/ads/internal/zzak;->k:Lcom/google/android/gms/internal/ads/apy;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/ads/internal/zzak;->p:Lcom/google/android/gms/ads/internal/zzw;

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/ads/internal/zzak;->g:Lcom/google/android/gms/internal/ads/awb;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzak;->h:Lcom/google/android/gms/internal/ads/zzjn;

    move-object/from16 v16, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzak;->i:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    move-object/from16 v17, v0

    invoke-direct/range {v1 .. v17}, Lcom/google/android/gms/ads/internal/zzah;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/aoy;Lcom/google/android/gms/internal/ads/avo;Lcom/google/android/gms/internal/ads/awe;Lcom/google/android/gms/internal/ads/avr;Landroid/support/v4/f/m;Landroid/support/v4/f/m;Lcom/google/android/gms/internal/ads/zzpl;Lcom/google/android/gms/internal/ads/apy;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/awb;Lcom/google/android/gms/internal/ads/zzjn;Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;)V

    return-object v1
.end method

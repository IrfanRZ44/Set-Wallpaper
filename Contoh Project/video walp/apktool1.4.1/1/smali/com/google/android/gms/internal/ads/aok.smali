.class final Lcom/google/android/gms/internal/ads/aok;
.super Lcom/google/android/gms/internal/ads/aoh$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/aoh$a",
        "<",
        "Lcom/google/android/gms/internal/ads/apj;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Landroid/content/Context;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/zzjn;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:Lcom/google/android/gms/internal/ads/bck;

.field private final synthetic e:Lcom/google/android/gms/internal/ads/aoh;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aok;->e:Lcom/google/android/gms/internal/ads/aoh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aok;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aok;->b:Lcom/google/android/gms/internal/ads/zzjn;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aok;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/aok;->d:Lcom/google/android/gms/internal/ads/bck;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/aoh$a;-><init>(Lcom/google/android/gms/internal/ads/aoh;)V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aok;->e:Lcom/google/android/gms/internal/ads/aoh;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aoh;->b(Lcom/google/android/gms/internal/ads/aoh;)Lcom/google/android/gms/internal/ads/aoa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aok;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aok;->b:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aok;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aok;->d:Lcom/google/android/gms/internal/ads/bck;

    const/4 v5, 0x2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/aoa;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;I)Lcom/google/android/gms/internal/ads/apj;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aok;->e:Lcom/google/android/gms/internal/ads/aoh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aok;->a:Landroid/content/Context;

    const-string v2, "interstitial"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/aoh;->a(Lcom/google/android/gms/internal/ads/aoh;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/arb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/arb;-><init>()V

    goto :goto_0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/apv;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aok;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/a/b;->a(Ljava/lang/Object;)Lcom/google/android/gms/a/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/aok;->b:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/aok;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/aok;->d:Lcom/google/android/gms/internal/ads/bck;

    const v5, 0xbdfcb8

    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/apv;->createInterstitialAdManager(Lcom/google/android/gms/a/a;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bck;I)Lcom/google/android/gms/internal/ads/apj;

    move-result-object v0

    return-object v0
.end method

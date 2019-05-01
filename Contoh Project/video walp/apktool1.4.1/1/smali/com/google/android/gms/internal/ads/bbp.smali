.class final Lcom/google/android/gms/internal/ads/bbp;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/ads/internal/gmsg/zzag;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ban;

.field private final b:Lcom/google/android/gms/internal/ads/np;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/bbm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/bbm;Lcom/google/android/gms/internal/ads/ban;Lcom/google/android/gms/internal/ads/np;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bbp;->c:Lcom/google/android/gms/internal/ads/bbm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bbp;->b:Lcom/google/android/gms/internal/ads/np;

    return-void
.end method


# virtual methods
.method public final zzau(Ljava/lang/String;)V
    .locals 2
    .parameter
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end parameter

    if-nez p1, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->b:Lcom/google/android/gms/internal/ads/np;

    new-instance v1, Lcom/google/android/gms/internal/ads/bba;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/bba;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    :goto_1
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->b:Lcom/google/android/gms/internal/ads/np;

    new-instance v1, Lcom/google/android/gms/internal/ads/bba;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/bba;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ban;->c()V

    throw v0
.end method

.method public final zzd(Lorg/json/JSONObject;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->b:Lcom/google/android/gms/internal/ads/np;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bbp;->c:Lcom/google/android/gms/internal/ads/bbm;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/bbm;->a(Lcom/google/android/gms/internal/ads/bbm;)Lcom/google/android/gms/internal/ads/bbd;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/ads/bbd;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    goto :goto_0

    :catch_1
    move-exception v0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bbp;->b:Lcom/google/android/gms/internal/ads/np;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/np;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bbp;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ban;->c()V

    throw v0
.end method

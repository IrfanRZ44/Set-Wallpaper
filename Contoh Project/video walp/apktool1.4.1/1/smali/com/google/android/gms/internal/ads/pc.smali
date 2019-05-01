.class public final Lcom/google/android/gms/internal/ads/pc;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:I

.field private final d:I

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v1, v0

    :goto_1
    const-string v0, "aggressive_media_codec_release"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->B:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/pc;->a:Z

    const-string v0, "byte_buffer_precache_limit"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->m:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/pc;->b:I

    const-string v0, "exo_cache_buffer_size"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->p:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/pc;->c:I

    const-string v0, "exo_connect_timeout_millis"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->i:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/pc;->d:I

    const-string v0, "exo_player_version"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->h:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/pc;->e:Ljava/lang/String;

    const-string v0, "exo_read_timeout_millis"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->j:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/pc;->f:I

    const-string v0, "load_check_interval_bytes"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->k:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/pc;->g:I

    const-string v0, "player_precache_limit"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->l:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/pc;->h:I

    const-string v0, "use_cache_data_source"

    sget-object v2, Lcom/google/android/gms/internal/ads/asa;->cH:Lcom/google/android/gms/internal/ads/arq;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/pc;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/pc;->i:Z

    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method

.method private static a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/arq",
            "<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method private static b(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/arq",
            "<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method private static c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/arq",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/aos;->f()Lcom/google/android/gms/internal/ads/ary;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/arq;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0
.end method

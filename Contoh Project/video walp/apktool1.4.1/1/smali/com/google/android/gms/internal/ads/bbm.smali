.class public final Lcom/google/android/gms/internal/ads/bbm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/bbb;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/bbb",
        "<TI;TO;>;"
    }
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/bbd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/bbd",
            "<TO;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/ads/bbe;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/bbe",
            "<TI;>;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/ads/baa;

.field private final d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbe;Lcom/google/android/gms/internal/ads/bbd;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/baa;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/bbe",
            "<TI;>;",
            "Lcom/google/android/gms/internal/ads/bbd",
            "<TO;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bbm;->c:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bbm;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bbm;->b:Lcom/google/android/gms/internal/ads/bbe;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bbm;->a:Lcom/google/android/gms/internal/ads/bbd;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bbm;)Lcom/google/android/gms/internal/ads/bbd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbm;->a:Lcom/google/android/gms/internal/ads/bbd;

    return-object v0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/ban;Lcom/google/android/gms/internal/ads/bax;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/np;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/ban;",
            "Lcom/google/android/gms/internal/ads/bax;",
            "TI;",
            "Lcom/google/android/gms/internal/ads/np",
            "<TO;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/jn;->a()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmc:Lcom/google/android/gms/ads/internal/gmsg/zzaf;

    new-instance v2, Lcom/google/android/gms/internal/ads/bbp;

    invoke-direct {v2, p0, p1, p4}, Lcom/google/android/gms/internal/ads/bbp;-><init>(Lcom/google/android/gms/internal/ads/bbm;Lcom/google/android/gms/internal/ads/ban;Lcom/google/android/gms/internal/ads/np;)V

    invoke-virtual {v1, v0, v2}, Lcom/google/android/gms/ads/internal/gmsg/zzaf;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzag;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "id"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "args"

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bbm;->b:Lcom/google/android/gms/internal/ads/bbe;

    invoke-interface {v2, p3}, Lcom/google/android/gms/internal/ads/bbe;->a(Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbm;->d:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Lcom/google/android/gms/internal/ads/bax;->b(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {p4, v0}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    const-string v1, "Unable to invokeJavaScript"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/je;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ban;->c()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/ban;->c()V

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/bbm;Lcom/google/android/gms/internal/ads/ban;Lcom/google/android/gms/internal/ads/bax;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/np;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/bbm;->a(Lcom/google/android/gms/internal/ads/ban;Lcom/google/android/gms/internal/ads/bax;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/np;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ne;
    .locals 1
    .parameter
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TO;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/bbm;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ne;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ne;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)",
            "Lcom/google/android/gms/internal/ads/ne",
            "<TO;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/np;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bbm;->c:Lcom/google/android/gms/internal/ads/baa;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/baa;->b(Lcom/google/android/gms/internal/ads/agw;)Lcom/google/android/gms/internal/ads/ban;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/bbn;

    invoke-direct {v2, p0, v1, p1, v0}, Lcom/google/android/gms/internal/ads/bbn;-><init>(Lcom/google/android/gms/internal/ads/bbm;Lcom/google/android/gms/internal/ads/ban;Ljava/lang/Object;Lcom/google/android/gms/internal/ads/np;)V

    new-instance v3, Lcom/google/android/gms/internal/ads/bbo;

    invoke-direct {v3, p0, v0, v1}, Lcom/google/android/gms/internal/ads/bbo;-><init>(Lcom/google/android/gms/internal/ads/bbm;Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/ban;)V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ads/nv;->a(Lcom/google/android/gms/internal/ads/nu;Lcom/google/android/gms/internal/ads/ns;)V

    return-object v0
.end method

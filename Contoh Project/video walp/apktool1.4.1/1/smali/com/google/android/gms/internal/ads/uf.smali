.class final Lcom/google/android/gms/internal/ads/uf;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/to;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/to",
        "<",
        "Lcom/google/android/gms/internal/ads/tg;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static c(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/tg;
    .locals 2

    instance-of v0, p0, Lcom/google/android/gms/internal/ads/xg;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected KmsAeadKey proto"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p0, Lcom/google/android/gms/internal/ads/xg;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xg;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zd;->a(II)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/xg;->b()Lcom/google/android/gms/internal/ads/xi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xi;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tr;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/tq;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/tq;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/tg;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/tg;
    .locals 3

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/xg;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/xg;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/uf;->c(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/tg;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/abk; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "expected KmsAeadKey proto"

    invoke-direct {v1, v2, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/acl;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uf;->c(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/tg;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/zw;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/uf;->d(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/tg;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/acl;
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/xi;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected KmsAeadKeyFormat proto"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/xi;

    invoke-static {}, Lcom/google/android/gms/internal/ads/xg;->c()Lcom/google/android/gms/internal/ads/xg$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/xg$a;->a(Lcom/google/android/gms/internal/ads/xi;)Lcom/google/android/gms/internal/ads/xg$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/xg$a;->a(I)Lcom/google/android/gms/internal/ads/xg$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abe$a;->c()Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/acl;
    .locals 3

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/xi;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/xi;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/uf;->b(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/acl;
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/abk; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "expected serialized KmsAeadKeyFormat proto"

    invoke-direct {v1, v2, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/wt;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/uf;->b(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/acl;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/xg;

    invoke-static {}, Lcom/google/android/gms/internal/ads/wt;->d()Lcom/google/android/gms/internal/ads/wt$a;

    move-result-object v1

    const-string v2, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/wt$a;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/wt$a;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zl;->h()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/wt$a;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/wt$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/wt$b;->e:Lcom/google/android/gms/internal/ads/wt$b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/wt$a;->a(Lcom/google/android/gms/internal/ads/wt$b;)Lcom/google/android/gms/internal/ads/wt$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abe$a;->c()Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    check-cast v0, Lcom/google/android/gms/internal/ads/wt;

    return-object v0
.end method

.class final Lcom/google/android/gms/internal/ads/uk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/to;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/to",
        "<",
        "Lcom/google/android/gms/internal/ads/tn;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final d(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/tn;
    .locals 6

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/we;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/we;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/we;

    if-nez v1, :cond_0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected EciesAeadHkdfPublicKey proto"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/abk; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "expected serialized EciesAeadHkdfPublicKey proto"

    invoke-direct {v1, v2, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :try_start_1
    check-cast v0, Lcom/google/android/gms/internal/ads/we;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/we;->a()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zd;->a(II)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/we;->b()Lcom/google/android/gms/internal/ads/wa;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/wa;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/we;->b()Lcom/google/android/gms/internal/ads/wa;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/wa;->a()Lcom/google/android/gms/internal/ads/wg;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/wg;->a()Lcom/google/android/gms/internal/ads/wi;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/wi;)Lcom/google/android/gms/internal/ads/yh;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/we;->c()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zw;->b()[B

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/we;->d()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zw;->b()[B

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/yh;[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v1

    new-instance v5, Lcom/google/android/gms/internal/ads/us;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/wa;->b()Lcom/google/android/gms/internal/ads/vw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vw;->a()Lcom/google/android/gms/internal/ads/wy;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/ads/us;-><init>(Lcom/google/android/gms/internal/ads/wy;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/yb;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/wg;->c()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zw;->b()[B

    move-result-object v2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/wg;->b()Lcom/google/android/gms/internal/ads/wl;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/wl;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/wa;->c()Lcom/google/android/gms/internal/ads/vu;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/vu;)Lcom/google/android/gms/internal/ads/yi;

    move-result-object v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/yb;-><init>(Ljava/security/interfaces/ECPublicKey;[BLjava/lang/String;Lcom/google/android/gms/internal/ads/yi;Lcom/google/android/gms/internal/ads/xz;)V

    check-cast v0, Lcom/google/android/gms/internal/ads/tn;
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/abk; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/acl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcom/google/android/gms/internal/ads/we;

    if-nez v0, :cond_0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected EciesAeadHkdfPublicKey proto"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p1, Lcom/google/android/gms/internal/ads/we;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/we;->a()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zd;->a(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/we;->b()Lcom/google/android/gms/internal/ads/wa;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/wa;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/we;->b()Lcom/google/android/gms/internal/ads/wa;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/wa;->a()Lcom/google/android/gms/internal/ads/wg;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/wg;->a()Lcom/google/android/gms/internal/ads/wi;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/wi;)Lcom/google/android/gms/internal/ads/yh;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/we;->c()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zw;->b()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/we;->d()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zw;->b()[B

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/yh;[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v1

    new-instance v5, Lcom/google/android/gms/internal/ads/us;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/wa;->b()Lcom/google/android/gms/internal/ads/vw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vw;->a()Lcom/google/android/gms/internal/ads/wy;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/google/android/gms/internal/ads/us;-><init>(Lcom/google/android/gms/internal/ads/wy;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/yb;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/wg;->c()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zw;->b()[B

    move-result-object v2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/wg;->b()Lcom/google/android/gms/internal/ads/wl;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/wl;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/wa;->c()Lcom/google/android/gms/internal/ads/vu;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/uq;->a(Lcom/google/android/gms/internal/ads/vu;)Lcom/google/android/gms/internal/ads/yi;

    move-result-object v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/yb;-><init>(Ljava/security/interfaces/ECPublicKey;[BLjava/lang/String;Lcom/google/android/gms/internal/ads/yi;Lcom/google/android/gms/internal/ads/xz;)V

    return-object v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/zw;)Ljava/lang/Object;
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/uk;->d(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/tn;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/acl;)Lcom/google/android/gms/internal/ads/acl;
    .locals 2

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Not implemented."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/acl;
    .locals 2

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Not implemented."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/wt;
    .locals 2

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Not implemented."

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

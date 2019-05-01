.class final Lcom/google/android/gms/internal/ads/us;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/xz;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/google/android/gms/internal/ads/vo;

.field private d:Lcom/google/android/gms/internal/ads/ux;

.field private e:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/wy;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wy;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wy;->b()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/vq;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/vq;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/tw;->b(Lcom/google/android/gms/internal/ads/wy;)Lcom/google/android/gms/internal/ads/acl;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/vo;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/us;->c:Lcom/google/android/gms/internal/ads/vo;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/vq;->a()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/us;->b:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/abk; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    invoke-direct {v1, v2, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/wy;->b()Lcom/google/android/gms/internal/ads/zw;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/uz;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/uz;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/tw;->b(Lcom/google/android/gms/internal/ads/wy;)Lcom/google/android/gms/internal/ads/acl;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/ux;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/us;->d:Lcom/google/android/gms/internal/ads/ux;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/uz;->a()Lcom/google/android/gms/internal/ads/vd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/vd;->b()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/us;->e:I

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/uz;->b()Lcom/google/android/gms/internal/ads/wp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/wp;->b()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/us;->e:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/us;->b:I
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/abk; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    invoke-direct {v1, v2, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/security/GeneralSecurityException;

    const-string v2, "unsupported AEAD DEM key type: "

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/us;->b:I

    return v0
.end method

.method public final a([B)Lcom/google/android/gms/internal/ads/tg;
    .locals 4

    const/4 v2, 0x0

    array-length v0, p1

    iget v1, p0, Lcom/google/android/gms/internal/ads/us;->b:I

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Symmetric key has incorrect length"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/vo;->c()Lcom/google/android/gms/internal/ads/vo$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/us;->c:Lcom/google/android/gms/internal/ads/vo;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/abe$a;->a(Lcom/google/android/gms/internal/ads/abe;)Lcom/google/android/gms/internal/ads/abe$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/vo$a;

    iget v1, p0, Lcom/google/android/gms/internal/ads/us;->b:I

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/ads/zw;->a([BII)Lcom/google/android/gms/internal/ads/zw;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vo$a;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/vo$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abe$a;->c()Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    check-cast v0, Lcom/google/android/gms/internal/ads/vo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/tw;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/acl;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tg;

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/ads/us;->e:I

    invoke-static {p1, v2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget v0, p0, Lcom/google/android/gms/internal/ads/us;->e:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/us;->b:I

    invoke-static {p1, v0, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/vb;->d()Lcom/google/android/gms/internal/ads/vb$a;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/us;->d:Lcom/google/android/gms/internal/ads/ux;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/ux;->b()Lcom/google/android/gms/internal/ads/vb;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/abe$a;->a(Lcom/google/android/gms/internal/ads/abe;)Lcom/google/android/gms/internal/ads/abe$a;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/vb$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zw;->a([B)Lcom/google/android/gms/internal/ads/zw;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vb$a;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/vb$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abe$a;->c()Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    check-cast v0, Lcom/google/android/gms/internal/ads/vb;

    invoke-static {}, Lcom/google/android/gms/internal/ads/wn;->d()Lcom/google/android/gms/internal/ads/wn$a;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/us;->d:Lcom/google/android/gms/internal/ads/ux;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/ux;->c()Lcom/google/android/gms/internal/ads/wn;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/ads/abe$a;->a(Lcom/google/android/gms/internal/ads/abe;)Lcom/google/android/gms/internal/ads/abe$a;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/wn$a;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zw;->a([B)Lcom/google/android/gms/internal/ads/zw;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/wn$a;->a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/wn$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/abe$a;->c()Lcom/google/android/gms/internal/ads/abe;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/abe;

    check-cast v1, Lcom/google/android/gms/internal/ads/wn;

    invoke-static {}, Lcom/google/android/gms/internal/ads/ux;->d()Lcom/google/android/gms/internal/ads/ux$a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/us;->d:Lcom/google/android/gms/internal/ads/ux;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/ux;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/ux$a;->a(I)Lcom/google/android/gms/internal/ads/ux$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/ux$a;->a(Lcom/google/android/gms/internal/ads/vb;)Lcom/google/android/gms/internal/ads/ux$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ux$a;->a(Lcom/google/android/gms/internal/ads/wn;)Lcom/google/android/gms/internal/ads/ux$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/abe$a;->c()Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe;

    check-cast v0, Lcom/google/android/gms/internal/ads/ux;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/us;->a:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/tw;->b(Ljava/lang/String;Lcom/google/android/gms/internal/ads/acl;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tg;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "unknown DEM key type"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

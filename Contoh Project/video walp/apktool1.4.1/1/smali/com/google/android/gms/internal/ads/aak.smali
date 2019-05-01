.class public abstract Lcom/google/android/gms/internal/ads/aak;
.super Lcom/google/android/gms/internal/ads/zv;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/aak$a;,
        Lcom/google/android/gms/internal/ads/aak$b;
    }
.end annotation


# static fields
.field private static final b:Ljava/util/logging/Logger;

.field private static final c:Z


# instance fields
.field a:Lcom/google/android/gms/internal/ads/aam;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/ads/aak;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/aak;->b:Ljava/util/logging/Logger;

    invoke-static {}, Lcom/google/android/gms/internal/ads/aed;->a()Z

    move-result v0

    sput-boolean v0, Lcom/google/android/gms/internal/ads/aak;->c:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zv;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/aal;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/aak;-><init>()V

    return-void
.end method

.method public static a(ILcom/google/android/gms/internal/ads/abs;)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/abs;->b()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method public static a(Lcom/google/android/gms/internal/ads/abs;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/abs;->b()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method static a(Lcom/google/android/gms/internal/ads/acl;Lcom/google/android/gms/internal/ads/ade;)I
    .locals 2

    check-cast p0, Lcom/google/android/gms/internal/ads/zl;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zl;->j()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/ade;->b(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zl;->a(I)V

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static a([B)Lcom/google/android/gms/internal/ads/aak;
    .locals 3

    array-length v0, p0

    new-instance v1, Lcom/google/android/gms/internal/ads/aak$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lcom/google/android/gms/internal/ads/aak$a;-><init>([BII)V

    return-object v1
.end method

.method public static b(D)I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public static b(F)I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public static b(ID)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public static b(IF)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public static b(ILcom/google/android/gms/internal/ads/abs;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/ads/aak;->g(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/aak;->a(ILcom/google/android/gms/internal/ads/abs;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(ILcom/google/android/gms/internal/ads/acl;)I
    .locals 3

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/ads/aak;->g(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->b(Lcom/google/android/gms/internal/ads/acl;)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method static b(ILcom/google/android/gms/internal/ads/acl;Lcom/google/android/gms/internal/ads/ade;)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/aak;->a(Lcom/google/android/gms/internal/ads/acl;Lcom/google/android/gms/internal/ads/ade;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(ILjava/lang/String;)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->b(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(IZ)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static b(Lcom/google/android/gms/internal/ads/acl;)I
    .locals 2

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/acl;->l()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(Lcom/google/android/gms/internal/ads/zw;)I
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zw;->a()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static b(Ljava/lang/String;)I
    .locals 2

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aef;->a(Ljava/lang/CharSequence;)I
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/aei; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :catch_0
    move-exception v0

    sget-object v0, Lcom/google/android/gms/internal/ads/abg;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v0, v0

    goto :goto_0
.end method

.method public static b(Z)I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static b([B)I
    .locals 2

    array-length v0, p0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method static c(ILcom/google/android/gms/internal/ads/acl;Lcom/google/android/gms/internal/ads/ade;)I
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    shl-int/lit8 v1, v0, 0x1

    check-cast p1, Lcom/google/android/gms/internal/ads/zl;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zl;->j()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/ade;->b(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zl;->a(I)V

    :cond_0
    add-int/2addr v0, v1

    return v0
.end method

.method public static c(ILcom/google/android/gms/internal/ads/zw;)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zw;->a()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method public static c(Lcom/google/android/gms/internal/ads/acl;)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/acl;->l()I

    move-result v0

    return v0
.end method

.method static synthetic c()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/gms/internal/ads/aak;->c:Z

    return v0
.end method

.method public static d(IJ)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/aak;->e(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(ILcom/google/android/gms/internal/ads/zw;)I
    .locals 2

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    shl-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    invoke-static {v1, p0}, Lcom/google/android/gms/internal/ads/aak;->g(II)I

    move-result v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/aak;->c(ILcom/google/android/gms/internal/ads/zw;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static d(J)I
    .locals 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/aak;->e(J)I

    move-result v0

    return v0
.end method

.method public static e(I)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v0

    return v0
.end method

.method public static e(IJ)I
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/aak;->e(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static e(J)I
    .locals 8

    const-wide/16 v6, 0x0

    const-wide/16 v0, -0x80

    and-long/2addr v0, p0

    cmp-long v0, v0, v6

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    cmp-long v0, p0, v6

    if-gez v0, :cond_2

    const/16 v0, 0xa

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    const-wide v2, -0x800000000L

    and-long/2addr v2, p0

    cmp-long v1, v2, v6

    if-eqz v1, :cond_4

    const/4 v0, 0x6

    const/16 v1, 0x1c

    ushr-long v2, p0, v1

    :goto_1
    const-wide/32 v4, -0x200000

    and-long/2addr v4, v2

    cmp-long v1, v4, v6

    if-eqz v1, :cond_3

    add-int/lit8 v0, v0, 0x2

    const/16 v1, 0xe

    ushr-long/2addr v2, v1

    :cond_3
    const-wide/16 v4, -0x4000

    and-long/2addr v2, v4

    cmp-long v1, v2, v6

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    move-wide v2, p0

    goto :goto_1
.end method

.method public static f(I)I
    .locals 1

    if-ltz p0, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/16 v0, 0xa

    goto :goto_0
.end method

.method public static f(II)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static f(IJ)I
    .locals 5

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/aak;->i(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/aak;->e(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static f(J)I
    .locals 2

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/aak;->i(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/aak;->e(J)I

    move-result v0

    return v0
.end method

.method public static g(I)I
    .locals 1

    and-int/lit8 v0, p0, -0x80

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    and-int/lit16 v0, p0, -0x4000

    if-nez v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/high16 v0, -0x20

    and-int/2addr v0, p0

    if-nez v0, :cond_2

    const/4 v0, 0x3

    goto :goto_0

    :cond_2
    const/high16 v0, -0x1000

    and-int/2addr v0, p0

    if-nez v0, :cond_3

    const/4 v0, 0x4

    goto :goto_0

    :cond_3
    const/4 v0, 0x5

    goto :goto_0
.end method

.method public static g(II)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static g(IJ)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public static g(J)I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public static h(I)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->m(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v0

    return v0
.end method

.method public static h(II)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->m(I)I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static h(IJ)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    return v0
.end method

.method public static h(J)I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public static i(I)I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public static i(II)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method private static i(J)J
    .locals 4

    const/4 v0, 0x1

    shl-long v0, p0, v0

    const/16 v2, 0x3f

    shr-long v2, p0, v2

    xor-long/2addr v0, v2

    return-wide v0
.end method

.method public static j(I)I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public static j(II)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public static k(I)I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->f(I)I

    move-result v0

    return v0
.end method

.method public static k(II)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->e(I)I

    move-result v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public static l(I)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/aak;->g(I)I

    move-result v0

    return v0
.end method

.method private static m(I)I
    .locals 2

    shl-int/lit8 v0, p0, 0x1

    shr-int/lit8 v1, p0, 0x1f

    xor-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(B)V
.end method

.method public final a(D)V
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/aak;->c(J)V

    return-void
.end method

.method public final a(F)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/aak;->d(I)V

    return-void
.end method

.method public abstract a(I)V
.end method

.method public final a(ID)V
    .locals 2

    invoke-static {p2, p3}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/aak;->c(IJ)V

    return-void
.end method

.method public final a(IF)V
    .locals 1

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/aak;->e(II)V

    return-void
.end method

.method public abstract a(II)V
.end method

.method public abstract a(IJ)V
.end method

.method public abstract a(ILcom/google/android/gms/internal/ads/acl;)V
.end method

.method abstract a(ILcom/google/android/gms/internal/ads/acl;Lcom/google/android/gms/internal/ads/ade;)V
.end method

.method public abstract a(ILcom/google/android/gms/internal/ads/zw;)V
.end method

.method public abstract a(ILjava/lang/String;)V
.end method

.method public abstract a(IZ)V
.end method

.method public abstract a(J)V
.end method

.method public abstract a(Lcom/google/android/gms/internal/ads/acl;)V
.end method

.method public abstract a(Lcom/google/android/gms/internal/ads/zw;)V
.end method

.method public abstract a(Ljava/lang/String;)V
.end method

.method final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/aei;)V
    .locals 6

    sget-object v0, Lcom/google/android/gms/internal/ads/aak;->b:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "com.google.protobuf.CodedOutputStream"

    const-string v3, "inefficientWriteStringNoTag"

    const-string v4, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/abg;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    :try_start_0
    array-length v1, v0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/aak;->b(I)V

    const/4 v1, 0x0

    array-length v2, v0

    invoke-virtual {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zv;->a([BII)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/google/android/gms/internal/ads/aak$b; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/internal/ads/aak$b;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/aak$b;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    throw v0
.end method

.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/aak;->a(B)V

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/aak;->a()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method public abstract b(I)V
.end method

.method public abstract b(II)V
.end method

.method public final b(IJ)V
    .locals 2

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/ads/aak;->i(J)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/aak;->a(IJ)V

    return-void
.end method

.method public abstract b(ILcom/google/android/gms/internal/ads/zw;)V
.end method

.method public final b(J)V
    .locals 3

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/aak;->i(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/internal/ads/aak;->a(J)V

    return-void
.end method

.method public abstract b([BII)V
.end method

.method public final c(I)V
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/aak;->m(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/aak;->b(I)V

    return-void
.end method

.method public abstract c(II)V
.end method

.method public abstract c(IJ)V
.end method

.method public abstract c(J)V
.end method

.method abstract c([BII)V
.end method

.method public abstract d(I)V
.end method

.method public final d(II)V
    .locals 1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/aak;->m(I)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/aak;->c(II)V

    return-void
.end method

.method public abstract e(II)V
.end method

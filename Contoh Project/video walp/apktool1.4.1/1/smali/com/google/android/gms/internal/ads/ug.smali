.class public final Lcom/google/android/gms/internal/ads/ug;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/tg;


# static fields
.field private static final a:[B


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/wy;

.field private final c:Lcom/google/android/gms/internal/ads/tg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/ads/ug;->a:[B

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/wy;Lcom/google/android/gms/internal/ads/tg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ug;->b:Lcom/google/android/gms/internal/ads/wy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ug;->c:Lcom/google/android/gms/internal/ads/tg;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ug;->b:Lcom/google/android/gms/internal/ads/wy;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/tw;->b(Lcom/google/android/gms/internal/ads/wy;)Lcom/google/android/gms/internal/ads/acl;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/acl;->i()[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ug;->c:Lcom/google/android/gms/internal/ads/tg;

    sget-object v2, Lcom/google/android/gms/internal/ads/ug;->a:[B

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/ads/tg;->a([B[B)[B

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ug;->b:Lcom/google/android/gms/internal/ads/wy;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/wy;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/tw;->a(Ljava/lang/String;[B)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tg;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/tg;->a([B[B)[B

    move-result-object v0

    array-length v2, v1

    add-int/lit8 v2, v2, 0x4

    array-length v3, v0

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    array-length v3, v1

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.class public final Lcom/google/android/gms/internal/ads/bbg;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/bbf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/bbf",
            "<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/nio/charset/Charset;

.field private static final c:Lcom/google/android/gms/internal/ads/bbd;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/bbd",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/bbg;->b:Ljava/nio/charset/Charset;

    new-instance v0, Lcom/google/android/gms/internal/ads/bbi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bbi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bbg;->a:Lcom/google/android/gms/internal/ads/bbf;

    sget-object v0, Lcom/google/android/gms/internal/ads/bbh;->a:Lcom/google/android/gms/internal/ads/bbd;

    sput-object v0, Lcom/google/android/gms/internal/ads/bbg;->c:Lcom/google/android/gms/internal/ads/bbd;

    return-void
.end method

.method static final synthetic a(Lorg/json/JSONObject;)Ljava/io/InputStream;
    .locals 3

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/bbg;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
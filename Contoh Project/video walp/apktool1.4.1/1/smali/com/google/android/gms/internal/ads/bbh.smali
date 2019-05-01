.class final synthetic Lcom/google/android/gms/internal/ads/bbh;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/bbd;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/bbd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/bbh;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/bbh;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/bbh;->a:Lcom/google/android/gms/internal/ads/bbd;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/bbg;->a(Lorg/json/JSONObject;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

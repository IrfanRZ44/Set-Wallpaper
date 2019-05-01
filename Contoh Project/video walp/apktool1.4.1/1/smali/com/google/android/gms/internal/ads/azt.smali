.class final synthetic Lcom/google/android/gms/internal/ads/azt;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ro;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/azp;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/azp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/azt;->a:Lcom/google/android/gms/internal/ads/azp;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/azp;)Lcom/google/android/gms/internal/ads/ro;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/azt;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/azt;-><init>(Lcom/google/android/gms/internal/ads/azp;)V

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/azt;->a:Lcom/google/android/gms/internal/ads/azp;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/azp;->a()V

    return-void
.end method

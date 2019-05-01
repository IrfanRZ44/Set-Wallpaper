.class final synthetic Lcom/google/android/gms/internal/ads/bae;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/azo;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/azo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bae;->a:Lcom/google/android/gms/internal/ads/azo;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/ads/azo;)Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/bae;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/bae;-><init>(Lcom/google/android/gms/internal/ads/azo;)V

    return-object v0
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bae;->a:Lcom/google/android/gms/internal/ads/azo;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/azo;->a()V

    return-void
.end method

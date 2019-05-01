.class final synthetic Lcom/google/android/gms/internal/ads/bad;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/baa;

.field private final b:Lcom/google/android/gms/internal/ads/bar;

.field private final c:Lcom/google/android/gms/internal/ads/azo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bad;->a:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bad;->b:Lcom/google/android/gms/internal/ads/bar;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bad;->c:Lcom/google/android/gms/internal/ads/azo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bad;->a:Lcom/google/android/gms/internal/ads/baa;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bad;->b:Lcom/google/android/gms/internal/ads/bar;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bad;->c:Lcom/google/android/gms/internal/ads/azo;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V

    return-void
.end method

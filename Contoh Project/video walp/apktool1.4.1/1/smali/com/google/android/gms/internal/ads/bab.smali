.class final synthetic Lcom/google/android/gms/internal/ads/bab;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/baa;

.field private final b:Lcom/google/android/gms/internal/ads/agw;

.field private final c:Lcom/google/android/gms/internal/ads/bar;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bab;->a:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bab;->b:Lcom/google/android/gms/internal/ads/agw;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bab;->c:Lcom/google/android/gms/internal/ads/bar;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bab;->a:Lcom/google/android/gms/internal/ads/baa;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bab;->b:Lcom/google/android/gms/internal/ads/agw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bab;->c:Lcom/google/android/gms/internal/ads/bar;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/baa;->a(Lcom/google/android/gms/internal/ads/agw;Lcom/google/android/gms/internal/ads/bar;)V

    return-void
.end method

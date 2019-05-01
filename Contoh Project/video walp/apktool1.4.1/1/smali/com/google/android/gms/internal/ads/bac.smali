.class final synthetic Lcom/google/android/gms/internal/ads/bac;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/azp;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/baa;

.field private final b:Lcom/google/android/gms/internal/ads/bar;

.field private final c:Lcom/google/android/gms/internal/ads/azo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bac;->a:Lcom/google/android/gms/internal/ads/baa;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bac;->b:Lcom/google/android/gms/internal/ads/bar;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bac;->c:Lcom/google/android/gms/internal/ads/azo;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bac;->a:Lcom/google/android/gms/internal/ads/baa;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bac;->b:Lcom/google/android/gms/internal/ads/bar;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bac;->c:Lcom/google/android/gms/internal/ads/azo;

    sget-object v3, Lcom/google/android/gms/internal/ads/jn;->a:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/ads/bad;

    invoke-direct {v4, v0, v1, v2}, Lcom/google/android/gms/internal/ads/bad;-><init>(Lcom/google/android/gms/internal/ads/baa;Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/azo;)V

    sget v0, Lcom/google/android/gms/internal/ads/bal;->b:I

    int-to-long v0, v0

    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

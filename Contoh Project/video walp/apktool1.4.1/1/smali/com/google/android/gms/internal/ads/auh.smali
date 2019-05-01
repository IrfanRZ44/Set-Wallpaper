.class final Lcom/google/android/gms/internal/ads/auh;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/atv;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/aug;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/aug;Lcom/google/android/gms/internal/ads/atv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/auh;->b:Lcom/google/android/gms/internal/ads/aug;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/auh;->a:Lcom/google/android/gms/internal/ads/atv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/auh;->b:Lcom/google/android/gms/internal/ads/aug;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/auh;->a:Lcom/google/android/gms/internal/ads/atv;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/aug;->a(Lcom/google/android/gms/internal/ads/aug;Lcom/google/android/gms/internal/ads/atv;)V

    return-void
.end method

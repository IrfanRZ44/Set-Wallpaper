.class final Lcom/google/android/gms/internal/ads/arz;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/arq;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/ary;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ary;Lcom/google/android/gms/internal/ads/arq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/arz;->b:Lcom/google/android/gms/internal/ads/ary;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/arz;->a:Lcom/google/android/gms/internal/ads/arq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/arz;->a:Lcom/google/android/gms/internal/ads/arq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/arz;->b:Lcom/google/android/gms/internal/ads/ary;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/ary;->a(Lcom/google/android/gms/internal/ads/ary;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/arq;->a(Landroid/content/SharedPreferences;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

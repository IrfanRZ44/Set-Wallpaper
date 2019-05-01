.class final Lcom/google/android/gms/internal/ads/bap;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/nu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/nu",
        "<",
        "Lcom/google/android/gms/internal/ads/bax;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ban;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ban;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bap;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "Releasing engine reference."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bap;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ban;->a(Lcom/google/android/gms/internal/ads/ban;)Lcom/google/android/gms/internal/ads/bar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bar;->d()V

    return-void
.end method

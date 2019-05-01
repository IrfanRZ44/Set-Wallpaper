.class final Lcom/google/android/gms/internal/ads/bas;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/nu;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/nu",
        "<",
        "Lcom/google/android/gms/internal/ads/azo;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ban;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bar;Lcom/google/android/gms/internal/ads/ban;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bas;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/azo;

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/je;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bas;->a:Lcom/google/android/gms/internal/ads/ban;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/azo;->b()Lcom/google/android/gms/internal/ads/bay;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/nv;->a(Ljava/lang/Object;)V

    return-void
.end method

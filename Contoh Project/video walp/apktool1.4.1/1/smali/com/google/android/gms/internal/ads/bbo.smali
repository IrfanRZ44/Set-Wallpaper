.class final Lcom/google/android/gms/internal/ads/bbo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/ns;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/np;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/ban;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bbm;Lcom/google/android/gms/internal/ads/np;Lcom/google/android/gms/internal/ads/ban;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bbo;->a:Lcom/google/android/gms/internal/ads/np;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bbo;->b:Lcom/google/android/gms/internal/ads/ban;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbo;->a:Lcom/google/android/gms/internal/ads/np;

    new-instance v1, Lcom/google/android/gms/internal/ads/bba;

    const-string v2, "Unable to obtain a JavascriptEngine."

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/bba;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/np;->a(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bbo;->b:Lcom/google/android/gms/internal/ads/ban;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ban;->c()V

    return-void
.end method

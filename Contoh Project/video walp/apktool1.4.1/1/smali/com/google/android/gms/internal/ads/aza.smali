.class final synthetic Lcom/google/android/gms/internal/ads/aza;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/sh;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ayz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ayz;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aza;->a:Lcom/google/android/gms/internal/ads/ayz;

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/internal/ads/se;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aza;->a:Lcom/google/android/gms/internal/ads/ayz;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/se;->b:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/azm;->a(Landroid/net/Uri;)Z

    move-result v0

    return v0
.end method

.class final Lcom/google/android/gms/internal/ads/ahs;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ahn;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ahn;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ahs;->a:Lcom/google/android/gms/internal/ads/ahn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ahs;->a:Lcom/google/android/gms/internal/ads/ahn;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/ahn;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/asa;->a(Landroid/content/Context;)V

    return-void
.end method

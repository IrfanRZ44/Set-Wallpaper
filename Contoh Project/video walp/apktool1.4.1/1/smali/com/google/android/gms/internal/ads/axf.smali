.class final Lcom/google/android/gms/internal/ads/axf;
.super Lcom/google/android/gms/internal/ads/np;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/np",
        "<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/axe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/axe;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/axf;->a:Lcom/google/android/gms/internal/ads/axe;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/np;-><init>()V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/axf;->a:Lcom/google/android/gms/internal/ads/axe;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/axe;->a(Lcom/google/android/gms/internal/ads/axe;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/np;->cancel(Z)Z

    move-result v0

    return v0
.end method

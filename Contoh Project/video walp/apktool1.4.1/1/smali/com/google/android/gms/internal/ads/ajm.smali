.class final Lcom/google/android/gms/internal/ads/ajm;
.super Landroid/database/ContentObserver;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/ajj;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ajj;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ajm;->a:Lcom/google/android/gms/internal/ads/ajj;

    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/database/ContentObserver;->onChange(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ajm;->a:Lcom/google/android/gms/internal/ads/ajj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ajj;->a()V

    return-void
.end method

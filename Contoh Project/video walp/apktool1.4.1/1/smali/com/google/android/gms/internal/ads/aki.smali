.class final Lcom/google/android/gms/internal/ads/aki;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/akg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/akg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aki;->a:Lcom/google/android/gms/internal/ads/akg;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aki;->a:Lcom/google/android/gms/internal/ads/akg;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/akg;->a(Lcom/google/android/gms/internal/ads/akg;I)V

    return-void
.end method

.class final Lcom/google/android/gms/internal/ads/bew;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/bev;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bev;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bew;->a:Lcom/google/android/gms/internal/ads/bev;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bew;->a:Lcom/google/android/gms/internal/ads/bev;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bev;->b()Landroid/content/Intent;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/jn;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bew;->a:Lcom/google/android/gms/internal/ads/bev;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/bev;->a(Lcom/google/android/gms/internal/ads/bev;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/jn;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

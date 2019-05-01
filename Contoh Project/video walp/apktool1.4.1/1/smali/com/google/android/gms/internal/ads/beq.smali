.class final Lcom/google/android/gms/internal/ads/beq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/so;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/so",
        "<",
        "Lcom/google/android/gms/internal/ads/sp;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/beg;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/bcq;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/beo;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/beo;Lcom/google/android/gms/internal/ads/beg;Lcom/google/android/gms/internal/ads/bcq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/beq;->c:Lcom/google/android/gms/internal/ads/beo;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/beq;->a:Lcom/google/android/gms/internal/ads/beg;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/beq;->b:Lcom/google/android/gms/internal/ads/bcq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/beq;->a:Lcom/google/android/gms/internal/ads/beg;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/beg;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/mk;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

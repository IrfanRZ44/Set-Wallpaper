.class final synthetic Lcom/google/android/gms/ads/internal/j;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/rn;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/atf;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/qe;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/atf;Ljava/lang/String;Lcom/google/android/gms/internal/ads/qe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/j;->a:Lcom/google/android/gms/internal/ads/atf;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/j;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/j;->c:Lcom/google/android/gms/internal/ads/qe;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/j;->a:Lcom/google/android/gms/internal/ads/atf;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/j;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/j;->c:Lcom/google/android/gms/internal/ads/qe;

    invoke-static {v0, v1, v2, p1}, Lcom/google/android/gms/ads/internal/zzas;->a(Lcom/google/android/gms/internal/ads/atf;Ljava/lang/String;Lcom/google/android/gms/internal/ads/qe;Z)V

    return-void
.end method

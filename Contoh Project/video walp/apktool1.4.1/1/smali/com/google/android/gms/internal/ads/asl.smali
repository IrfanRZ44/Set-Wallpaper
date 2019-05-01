.class public final Lcom/google/android/gms/internal/ads/asl;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/asl;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/google/android/gms/internal/ads/asl;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/asl;->a:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/asl;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/asl;->c:Lcom/google/android/gms/internal/ads/asl;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/asl;->a:J

    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/asl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/asl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/asl;->c:Lcom/google/android/gms/internal/ads/asl;

    return-object v0
.end method

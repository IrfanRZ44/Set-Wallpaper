.class public abstract Lcom/google/android/gms/internal/ads/ash;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/ads/ash;
    .annotation runtime Lcom/google/android/gms/internal/ads/cm;
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/internal/ads/ash;
    .annotation runtime Lcom/google/android/gms/internal/ads/cm;
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/internal/ads/ash;
    .annotation runtime Lcom/google/android/gms/internal/ads/cm;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/asi;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/asi;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ash;->a:Lcom/google/android/gms/internal/ads/ash;

    new-instance v0, Lcom/google/android/gms/internal/ads/asj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/asj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ash;->b:Lcom/google/android/gms/internal/ads/ash;

    new-instance v0, Lcom/google/android/gms/internal/ads/ask;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ask;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/ash;->c:Lcom/google/android/gms/internal/ads/ash;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

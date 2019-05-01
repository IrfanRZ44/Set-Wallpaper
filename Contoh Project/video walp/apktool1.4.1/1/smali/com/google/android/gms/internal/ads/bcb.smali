.class public final Lcom/google/android/gms/internal/ads/bcb;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/cm;
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/internal/ads/bbt;

.field public final c:Lcom/google/android/gms/internal/ads/bcn;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/google/android/gms/internal/ads/bbx;

.field public final f:Lcom/google/android/gms/internal/ads/bct;

.field public final g:J


# direct methods
.method public constructor <init>(I)V
    .locals 10

    const/4 v2, 0x0

    const-wide/16 v8, 0x0

    move-object v1, p0

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    move v6, p1

    move-object v7, v2

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/bcb;-><init>(Lcom/google/android/gms/internal/ads/bbt;Lcom/google/android/gms/internal/ads/bcn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbx;ILcom/google/android/gms/internal/ads/bct;J)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/bbt;Lcom/google/android/gms/internal/ads/bcn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/bbx;ILcom/google/android/gms/internal/ads/bct;J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bcb;->b:Lcom/google/android/gms/internal/ads/bbt;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bcb;->c:Lcom/google/android/gms/internal/ads/bcn;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bcb;->d:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bcb;->e:Lcom/google/android/gms/internal/ads/bbx;

    iput p5, p0, Lcom/google/android/gms/internal/ads/bcb;->a:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/bcb;->f:Lcom/google/android/gms/internal/ads/bct;

    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/bcb;->g:J

    return-void
.end method

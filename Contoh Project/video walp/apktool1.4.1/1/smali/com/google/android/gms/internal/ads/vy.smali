.class public final Lcom/google/android/gms/internal/ads/vy;
.super Lcom/google/android/gms/internal/ads/abe;

# interfaces
.implements Lcom/google/android/gms/internal/ads/acn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/vy$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/abe",
        "<",
        "Lcom/google/android/gms/internal/ads/vy;",
        "Lcom/google/android/gms/internal/ads/vy$a;",
        ">;",
        "Lcom/google/android/gms/internal/ads/acn;"
    }
.end annotation


# static fields
.field private static volatile zzakh:Lcom/google/android/gms/internal/ads/acx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/acx",
            "<",
            "Lcom/google/android/gms/internal/ads/vy;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdjk:Lcom/google/android/gms/internal/ads/vy;


# instance fields
.field private zzdjj:Lcom/google/android/gms/internal/ads/wa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/vy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/vy;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    const-class v0, Lcom/google/android/gms/internal/ads/vy;

    sget-object v1, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/abe;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/abe;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/abe;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/vy;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/abe;->a(Lcom/google/android/gms/internal/ads/abe;Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/vy;

    return-object v0
.end method

.method static synthetic b()Lcom/google/android/gms/internal/ads/vy;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/wa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vy;->zzdjj:Lcom/google/android/gms/internal/ads/wa;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/wa;->d()Lcom/google/android/gms/internal/ads/wa;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vy;->zzdjj:Lcom/google/android/gms/internal/ads/wa;

    goto :goto_0
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v1, 0x0

    const/4 v3, 0x1

    sget-object v0, Lcom/google/android/gms/internal/ads/vz;->a:[I

    add-int/lit8 v2, p1, -0x1

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/ads/vy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/vy;-><init>()V

    :cond_0
    :goto_0
    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/ads/vy$a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/vy$a;-><init>(Lcom/google/android/gms/internal/ads/vz;)V

    goto :goto_0

    :pswitch_2
    new-array v0, v3, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "zzdjj"

    aput-object v2, v0, v1

    const-string v1, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\t"

    sget-object v2, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/vy;->a(Lcom/google/android/gms/internal/ads/acl;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/ads/vy;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_0

    const-class v1, Lcom/google/android/gms/internal/ads/vy;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/vy;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/abe$b;

    sget-object v2, Lcom/google/android/gms/internal/ads/vy;->zzdjk:Lcom/google/android/gms/internal/ads/vy;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/abe$b;-><init>(Lcom/google/android/gms/internal/ads/abe;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/vy;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    :cond_1
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_5
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    move-object v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
.class public final Lcom/google/android/gms/internal/ads/we;
.super Lcom/google/android/gms/internal/ads/abe;

# interfaces
.implements Lcom/google/android/gms/internal/ads/acn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/we$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/abe",
        "<",
        "Lcom/google/android/gms/internal/ads/we;",
        "Lcom/google/android/gms/internal/ads/we$a;",
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
            "Lcom/google/android/gms/internal/ads/we;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdjt:Lcom/google/android/gms/internal/ads/we;


# instance fields
.field private zzdih:I

.field private zzdjj:Lcom/google/android/gms/internal/ads/wa;

.field private zzdjr:Lcom/google/android/gms/internal/ads/zw;

.field private zzdjs:Lcom/google/android/gms/internal/ads/zw;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/we;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/we;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    const-class v0, Lcom/google/android/gms/internal/ads/we;

    sget-object v1, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/abe;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/abe;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/abe;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/zw;->a:Lcom/google/android/gms/internal/ads/zw;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdjr:Lcom/google/android/gms/internal/ads/zw;

    sget-object v0, Lcom/google/android/gms/internal/ads/zw;->a:Lcom/google/android/gms/internal/ads/zw;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdjs:Lcom/google/android/gms/internal/ads/zw;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/we;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/abe;->a(Lcom/google/android/gms/internal/ads/abe;Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/we;

    return-object v0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/wa;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/we;->zzdjj:Lcom/google/android/gms/internal/ads/wa;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/we;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/we;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/we;Lcom/google/android/gms/internal/ads/wa;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/we;->a(Lcom/google/android/gms/internal/ads/wa;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/we;Lcom/google/android/gms/internal/ads/zw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/we;->b(Lcom/google/android/gms/internal/ads/zw;)V

    return-void
.end method

.method private final b(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/we;->zzdih:I

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/we;Lcom/google/android/gms/internal/ads/zw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/we;->c(Lcom/google/android/gms/internal/ads/zw;)V

    return-void
.end method

.method private final b(Lcom/google/android/gms/internal/ads/zw;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/we;->zzdjr:Lcom/google/android/gms/internal/ads/zw;

    return-void
.end method

.method private final c(Lcom/google/android/gms/internal/ads/zw;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/we;->zzdjs:Lcom/google/android/gms/internal/ads/zw;

    return-void
.end method

.method public static e()Lcom/google/android/gms/internal/ads/we$a;
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    sget v1, Lcom/google/android/gms/internal/ads/abe$e;->e:I

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/abe;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe$a;

    check-cast v0, Lcom/google/android/gms/internal/ads/we$a;

    return-object v0
.end method

.method public static f()Lcom/google/android/gms/internal/ads/we;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    return-object v0
.end method

.method static synthetic g()Lcom/google/android/gms/internal/ads/we;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdih:I

    return v0
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v1, 0x0

    const/4 v3, 0x1

    sget-object v0, Lcom/google/android/gms/internal/ads/wf;->a:[I

    add-int/lit8 v2, p1, -0x1

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/ads/we;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/we;-><init>()V

    :cond_0
    :goto_0
    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/ads/we$a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/we$a;-><init>(Lcom/google/android/gms/internal/ads/wf;)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "zzdih"

    aput-object v2, v0, v1

    const-string v1, "zzdjj"

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v2, "zzdjr"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "zzdjs"

    aput-object v2, v0, v1

    const-string v1, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n"

    sget-object v2, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/we;->a(Lcom/google/android/gms/internal/ads/acl;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_0

    const-class v1, Lcom/google/android/gms/internal/ads/we;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/we;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/abe$b;

    sget-object v2, Lcom/google/android/gms/internal/ads/we;->zzdjt:Lcom/google/android/gms/internal/ads/we;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/abe$b;-><init>(Lcom/google/android/gms/internal/ads/abe;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/we;->zzakh:Lcom/google/android/gms/internal/ads/acx;

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

    nop

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

.method public final b()Lcom/google/android/gms/internal/ads/wa;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdjj:Lcom/google/android/gms/internal/ads/wa;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/wa;->d()Lcom/google/android/gms/internal/ads/wa;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdjj:Lcom/google/android/gms/internal/ads/wa;

    goto :goto_0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/zw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdjr:Lcom/google/android/gms/internal/ads/zw;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/zw;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/we;->zzdjs:Lcom/google/android/gms/internal/ads/zw;

    return-object v0
.end method

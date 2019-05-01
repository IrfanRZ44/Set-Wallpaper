.class public final Lcom/google/android/gms/internal/ads/xe;
.super Lcom/google/android/gms/internal/ads/abe;

# interfaces
.implements Lcom/google/android/gms/internal/ads/acn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/xe$a;,
        Lcom/google/android/gms/internal/ads/xe$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/abe",
        "<",
        "Lcom/google/android/gms/internal/ads/xe;",
        "Lcom/google/android/gms/internal/ads/xe$a;",
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
            "Lcom/google/android/gms/internal/ads/xe;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdlz:Lcom/google/android/gms/internal/ads/xe;


# instance fields
.field private zzdlq:I

.field private zzdlr:I

.field private zzdly:Lcom/google/android/gms/internal/ads/abj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/abj",
            "<",
            "Lcom/google/android/gms/internal/ads/xe$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/xe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/xe;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    const-class v0, Lcom/google/android/gms/internal/ads/xe;

    sget-object v1, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/abe;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/abe;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/abe;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/xe;->m()Lcom/google/android/gms/internal/ads/abj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/xe;->zzdly:Lcom/google/android/gms/internal/ads/abj;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ads/xe$a;
    .locals 3

    const/4 v2, 0x0

    sget-object v0, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    sget v1, Lcom/google/android/gms/internal/ads/abe$e;->e:I

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/abe;->a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/abe$a;

    check-cast v0, Lcom/google/android/gms/internal/ads/xe$a;

    return-object v0
.end method

.method private final a(Lcom/google/android/gms/internal/ads/xe$b;)V
    .locals 2

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xe;->zzdly:Lcom/google/android/gms/internal/ads/abj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/abj;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xe;->zzdly:Lcom/google/android/gms/internal/ads/abj;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/abj;->size()I

    move-result v0

    if-nez v0, :cond_2

    const/16 v0, 0xa

    :goto_0
    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/abj;->a(I)Lcom/google/android/gms/internal/ads/abj;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/xe;->zzdly:Lcom/google/android/gms/internal/ads/abj;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xe;->zzdly:Lcom/google/android/gms/internal/ads/abj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/abj;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/xe;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/xe;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/xe;Lcom/google/android/gms/internal/ads/xe$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/xe;->a(Lcom/google/android/gms/internal/ads/xe$b;)V

    return-void
.end method

.method static synthetic b()Lcom/google/android/gms/internal/ads/xe;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    return-object v0
.end method

.method private final b(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/xe;->zzdlr:I

    return-void
.end method


# virtual methods
.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v1, 0x0

    const/4 v3, 0x1

    sget-object v0, Lcom/google/android/gms/internal/ads/xf;->a:[I

    add-int/lit8 v2, p1, -0x1

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/ads/xe;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/xe;-><init>()V

    :cond_0
    :goto_0
    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/ads/xe$a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/xe$a;-><init>(Lcom/google/android/gms/internal/ads/xf;)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "zzdlq"

    aput-object v2, v0, v1

    const-string v1, "zzdlr"

    aput-object v1, v0, v3

    const/4 v1, 0x2

    const-string v2, "zzdly"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-class v2, Lcom/google/android/gms/internal/ads/xe$b;

    aput-object v2, v0, v1

    const-string v1, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object v2, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/xe;->a(Lcom/google/android/gms/internal/ads/acl;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/ads/xe;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_0

    const-class v1, Lcom/google/android/gms/internal/ads/xe;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/xe;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/abe$b;

    sget-object v2, Lcom/google/android/gms/internal/ads/xe;->zzdlz:Lcom/google/android/gms/internal/ads/xe;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/abe$b;-><init>(Lcom/google/android/gms/internal/ads/abe;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/xe;->zzakh:Lcom/google/android/gms/internal/ads/acx;

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

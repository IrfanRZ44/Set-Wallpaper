.class public final Lcom/google/android/gms/internal/ads/uz;
.super Lcom/google/android/gms/internal/ads/abe;

# interfaces
.implements Lcom/google/android/gms/internal/ads/acn;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/uz$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/abe",
        "<",
        "Lcom/google/android/gms/internal/ads/uz;",
        "Lcom/google/android/gms/internal/ads/uz$a;",
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
            "Lcom/google/android/gms/internal/ads/uz;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdin:Lcom/google/android/gms/internal/ads/uz;


# instance fields
.field private zzdil:Lcom/google/android/gms/internal/ads/vd;

.field private zzdim:Lcom/google/android/gms/internal/ads/wp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/uz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/uz;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    const-class v0, Lcom/google/android/gms/internal/ads/uz;

    sget-object v1, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/abe;->a(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/abe;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/abe;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/uz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/abe;->a(Lcom/google/android/gms/internal/ads/abe;Lcom/google/android/gms/internal/ads/zw;)Lcom/google/android/gms/internal/ads/abe;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/uz;

    return-object v0
.end method

.method static synthetic c()Lcom/google/android/gms/internal/ads/uz;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/vd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->zzdil:Lcom/google/android/gms/internal/ads/vd;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/vd;->c()Lcom/google/android/gms/internal/ads/vd;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->zzdil:Lcom/google/android/gms/internal/ads/vd;

    goto :goto_0
.end method

.method protected final a(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v1, 0x0

    const/4 v3, 0x1

    sget-object v0, Lcom/google/android/gms/internal/ads/va;->a:[I

    add-int/lit8 v2, p1, -0x1

    aget v0, v0, v2

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/ads/uz;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/uz;-><init>()V

    :cond_0
    :goto_0
    return-object v0

    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/ads/uz$a;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/uz$a;-><init>(Lcom/google/android/gms/internal/ads/va;)V

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "zzdil"

    aput-object v2, v0, v1

    const-string v1, "zzdim"

    aput-object v1, v0, v3

    const-string v1, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\t\u0002\t"

    sget-object v2, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    invoke-static {v2, v1, v0}, Lcom/google/android/gms/internal/ads/uz;->a(Lcom/google/android/gms/internal/ads/acl;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/android/gms/internal/ads/uz;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_0

    const-class v1, Lcom/google/android/gms/internal/ads/uz;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/uz;->zzakh:Lcom/google/android/gms/internal/ads/acx;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/abe$b;

    sget-object v2, Lcom/google/android/gms/internal/ads/uz;->zzdin:Lcom/google/android/gms/internal/ads/uz;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/abe$b;-><init>(Lcom/google/android/gms/internal/ads/abe;)V

    sput-object v0, Lcom/google/android/gms/internal/ads/uz;->zzakh:Lcom/google/android/gms/internal/ads/acx;

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

.method public final b()Lcom/google/android/gms/internal/ads/wp;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->zzdim:Lcom/google/android/gms/internal/ads/wp;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/wp;->c()Lcom/google/android/gms/internal/ads/wp;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/uz;->zzdim:Lcom/google/android/gms/internal/ads/wp;

    goto :goto_0
.end method

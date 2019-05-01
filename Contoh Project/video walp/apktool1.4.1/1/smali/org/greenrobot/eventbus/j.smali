.class final Lorg/greenrobot/eventbus/j;
.super Ljava/lang/Object;


# static fields
.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lorg/greenrobot/eventbus/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:Ljava/lang/Object;

.field b:Lorg/greenrobot/eventbus/q;

.field c:Lorg/greenrobot/eventbus/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lorg/greenrobot/eventbus/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/greenrobot/eventbus/j;->a:Ljava/lang/Object;

    iput-object p2, p0, Lorg/greenrobot/eventbus/j;->b:Lorg/greenrobot/eventbus/q;

    return-void
.end method

.method static a(Lorg/greenrobot/eventbus/q;Ljava/lang/Object;)Lorg/greenrobot/eventbus/j;
    .locals 3

    sget-object v1, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v2, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    add-int/lit8 v0, v0, -0x1

    invoke-interface {v2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/greenrobot/eventbus/j;

    iput-object p1, v0, Lorg/greenrobot/eventbus/j;->a:Ljava/lang/Object;

    iput-object p0, v0, Lorg/greenrobot/eventbus/j;->b:Lorg/greenrobot/eventbus/q;

    const/4 v2, 0x0

    iput-object v2, v0, Lorg/greenrobot/eventbus/j;->c:Lorg/greenrobot/eventbus/j;

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lorg/greenrobot/eventbus/j;

    invoke-direct {v0, p1, p0}, Lorg/greenrobot/eventbus/j;-><init>(Ljava/lang/Object;Lorg/greenrobot/eventbus/q;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static a(Lorg/greenrobot/eventbus/j;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/greenrobot/eventbus/j;->a:Ljava/lang/Object;

    iput-object v0, p0, Lorg/greenrobot/eventbus/j;->b:Lorg/greenrobot/eventbus/q;

    iput-object v0, p0, Lorg/greenrobot/eventbus/j;->c:Lorg/greenrobot/eventbus/j;

    sget-object v1, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v2, 0x2710

    if-ge v0, v2, :cond_0

    sget-object v0, Lorg/greenrobot/eventbus/j;->d:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

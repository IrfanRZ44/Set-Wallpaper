.class public Landroid/arch/lifecycle/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/arch/lifecycle/h;


# static fields
.field private static final i:Landroid/arch/lifecycle/p;


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Landroid/os/Handler;

.field private final f:Landroid/arch/lifecycle/i;

.field private g:Ljava/lang/Runnable;

.field private h:Landroid/arch/lifecycle/q$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/arch/lifecycle/p;

    invoke-direct {v0}, Landroid/arch/lifecycle/p;-><init>()V

    sput-object v0, Landroid/arch/lifecycle/p;->i:Landroid/arch/lifecycle/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Landroid/arch/lifecycle/p;->a:I

    iput v0, p0, Landroid/arch/lifecycle/p;->b:I

    iput-boolean v1, p0, Landroid/arch/lifecycle/p;->c:Z

    iput-boolean v1, p0, Landroid/arch/lifecycle/p;->d:Z

    new-instance v0, Landroid/arch/lifecycle/i;

    invoke-direct {v0, p0}, Landroid/arch/lifecycle/i;-><init>(Landroid/arch/lifecycle/h;)V

    iput-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    new-instance v0, Landroid/arch/lifecycle/p$1;

    invoke-direct {v0, p0}, Landroid/arch/lifecycle/p$1;-><init>(Landroid/arch/lifecycle/p;)V

    iput-object v0, p0, Landroid/arch/lifecycle/p;->g:Ljava/lang/Runnable;

    new-instance v0, Landroid/arch/lifecycle/p$2;

    invoke-direct {v0, p0}, Landroid/arch/lifecycle/p$2;-><init>(Landroid/arch/lifecycle/p;)V

    iput-object v0, p0, Landroid/arch/lifecycle/p;->h:Landroid/arch/lifecycle/q$a;

    return-void
.end method

.method static synthetic a(Landroid/arch/lifecycle/p;)V
    .locals 0

    invoke-direct {p0}, Landroid/arch/lifecycle/p;->e()V

    return-void
.end method

.method static a(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Landroid/arch/lifecycle/p;->i:Landroid/arch/lifecycle/p;

    invoke-virtual {v0, p0}, Landroid/arch/lifecycle/p;->b(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic b(Landroid/arch/lifecycle/p;)V
    .locals 0

    invoke-direct {p0}, Landroid/arch/lifecycle/p;->f()V

    return-void
.end method

.method static synthetic c(Landroid/arch/lifecycle/p;)Landroid/arch/lifecycle/q$a;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/p;->h:Landroid/arch/lifecycle/q$a;

    return-object v0
.end method

.method private e()V
    .locals 2

    iget v0, p0, Landroid/arch/lifecycle/p;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/arch/lifecycle/p;->c:Z

    iget-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    sget-object v1, Landroid/arch/lifecycle/e$a;->ON_PAUSE:Landroid/arch/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$a;)V

    :cond_0
    return-void
.end method

.method private f()V
    .locals 2

    iget v0, p0, Landroid/arch/lifecycle/p;->a:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/arch/lifecycle/p;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    sget-object v1, Landroid/arch/lifecycle/e$a;->ON_STOP:Landroid/arch/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/arch/lifecycle/p;->d:Z

    :cond_0
    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    iget v0, p0, Landroid/arch/lifecycle/p;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/arch/lifecycle/p;->a:I

    iget v0, p0, Landroid/arch/lifecycle/p;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroid/arch/lifecycle/p;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    sget-object v1, Landroid/arch/lifecycle/e$a;->ON_START:Landroid/arch/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/arch/lifecycle/p;->d:Z

    :cond_0
    return-void
.end method

.method b()V
    .locals 2

    iget v0, p0, Landroid/arch/lifecycle/p;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/arch/lifecycle/p;->b:I

    iget v0, p0, Landroid/arch/lifecycle/p;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroid/arch/lifecycle/p;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    sget-object v1, Landroid/arch/lifecycle/e$a;->ON_RESUME:Landroid/arch/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/arch/lifecycle/p;->c:Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroid/arch/lifecycle/p;->e:Landroid/os/Handler;

    iget-object v1, p0, Landroid/arch/lifecycle/p;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method b(Landroid/content/Context;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/p;->e:Landroid/os/Handler;

    iget-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    sget-object v1, Landroid/arch/lifecycle/e$a;->ON_CREATE:Landroid/arch/lifecycle/e$a;

    invoke-virtual {v0, v1}, Landroid/arch/lifecycle/i;->a(Landroid/arch/lifecycle/e$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    new-instance v1, Landroid/arch/lifecycle/p$3;

    invoke-direct {v1, p0}, Landroid/arch/lifecycle/p$3;-><init>(Landroid/arch/lifecycle/p;)V

    invoke-virtual {v0, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method c()V
    .locals 4

    iget v0, p0, Landroid/arch/lifecycle/p;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/arch/lifecycle/p;->b:I

    iget v0, p0, Landroid/arch/lifecycle/p;->b:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/arch/lifecycle/p;->e:Landroid/os/Handler;

    iget-object v1, p0, Landroid/arch/lifecycle/p;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method d()V
    .locals 1

    iget v0, p0, Landroid/arch/lifecycle/p;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroid/arch/lifecycle/p;->a:I

    invoke-direct {p0}, Landroid/arch/lifecycle/p;->f()V

    return-void
.end method

.method public getLifecycle()Landroid/arch/lifecycle/e;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/p;->f:Landroid/arch/lifecycle/i;

    return-object v0
.end method

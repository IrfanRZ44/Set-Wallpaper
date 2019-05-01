.class public Lcom/naing/vwallpaper/fg/CWpViewModel;
.super Landroid/arch/lifecycle/AndroidViewModel;


# instance fields
.field private a:Landroid/arch/lifecycle/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/arch/lifecycle/m",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/a;",
            ">;>;"
        }
    .end annotation
.end field

.field private b:Landroid/arch/lifecycle/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/arch/lifecycle/m",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/app/Application;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/arch/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    new-instance v0, Landroid/arch/lifecycle/m;

    invoke-direct {v0}, Landroid/arch/lifecycle/m;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->b:Landroid/arch/lifecycle/m;

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->c:Landroid/app/Application;

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/app/Application;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->c:Landroid/app/Application;

    return-object v0
.end method

.method static synthetic b(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/arch/lifecycle/m;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->a:Landroid/arch/lifecycle/m;

    return-object v0
.end method

.method static synthetic c(Lcom/naing/vwallpaper/fg/CWpViewModel;)Landroid/arch/lifecycle/m;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->b:Landroid/arch/lifecycle/m;

    return-object v0
.end method

.method private c()V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/naing/vwallpaper/fg/CWpViewModel$1;

    invoke-direct {v1, p0}, Lcom/naing/vwallpaper/fg/CWpViewModel$1;-><init>(Lcom/naing/vwallpaper/fg/CWpViewModel;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public a()Landroid/arch/lifecycle/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/arch/lifecycle/m",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/a;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->a:Landroid/arch/lifecycle/m;

    if-nez v0, :cond_0

    new-instance v0, Landroid/arch/lifecycle/m;

    invoke-direct {v0}, Landroid/arch/lifecycle/m;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->a:Landroid/arch/lifecycle/m;

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/CWpViewModel;->c()V

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->a:Landroid/arch/lifecycle/m;

    return-object v0
.end method

.method public a(I)V
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/naing/vwallpaper/fg/CWpViewModel$2;

    invoke-direct {v1, p0, p1}, Lcom/naing/vwallpaper/fg/CWpViewModel$2;-><init>(Lcom/naing/vwallpaper/fg/CWpViewModel;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public b()Landroid/arch/lifecycle/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/arch/lifecycle/m",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/CWpViewModel;->b:Landroid/arch/lifecycle/m;

    return-object v0
.end method

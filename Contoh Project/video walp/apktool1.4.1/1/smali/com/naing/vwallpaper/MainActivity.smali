.class public Lcom/naing/vwallpaper/MainActivity;
.super Lcom/naing/vwallpaper/BaseActivity;


# instance fields
.field private a:Landroid/support/design/widget/BottomNavigationView$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/naing/vwallpaper/BaseActivity;-><init>()V

    new-instance v0, Lcom/naing/vwallpaper/MainActivity$1;

    invoke-direct {v0, p0}, Lcom/naing/vwallpaper/MainActivity$1;-><init>(Lcom/naing/vwallpaper/MainActivity;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/MainActivity;->a:Landroid/support/design/widget/BottomNavigationView$b;

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/MainActivity;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 1

    invoke-direct {p0, p1}, Lcom/naing/vwallpaper/MainActivity;->b(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p3}, Lcom/naing/vwallpaper/MainActivity;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    const v1, 0x7f080046

    invoke-virtual {v0, v1, p1, p2}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/MainActivity;Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/naing/vwallpaper/MainActivity;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
    .locals 1

    invoke-virtual {p0}, Lcom/naing/vwallpaper/MainActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    return-object v0
.end method

.method private g()V
    .locals 1

    invoke-static {p0}, Lcom/naing/c/b;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/naing/view/a;

    invoke-direct {v0, p0}, Lcom/naing/view/a;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/naing/view/a;->a()Landroid/app/Dialog;

    :goto_0
    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/naing/vwallpaper/MainActivity;->finish()V

    goto :goto_0
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    invoke-super {p0}, Lcom/naing/vwallpaper/BaseActivity;->onBackPressed()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/MainActivity;->g()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/naing/vwallpaper/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0a001c

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/MainActivity;->setContentView(I)V

    const v0, 0x7f08007d

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/MainActivity;->a(Landroid/support/v7/widget/Toolbar;)V

    const v0, 0x7f080087

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/MainActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/BottomNavigationView;

    iget-object v1, p0, Lcom/naing/vwallpaper/MainActivity;->a:Landroid/support/design/widget/BottomNavigationView$b;

    invoke-virtual {v0, v1}, Landroid/support/design/widget/BottomNavigationView;->setOnNavigationItemSelectedListener(Landroid/support/design/widget/BottomNavigationView$b;)V

    const v1, 0x7f080086

    invoke-virtual {v0, v1}, Landroid/support/design/widget/BottomNavigationView;->setSelectedItemId(I)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lcom/naing/vwallpaper/MainActivity;->g()V

    :cond_0
    invoke-super {p0, p1, p2}, Lcom/naing/vwallpaper/BaseActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

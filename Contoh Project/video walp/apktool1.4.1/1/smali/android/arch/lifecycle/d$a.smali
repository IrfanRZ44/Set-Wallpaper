.class Landroid/arch/lifecycle/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/arch/lifecycle/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/app/Activity;",
            "Landroid/arch/lifecycle/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/support/v4/app/Fragment;",
            "Landroid/arch/lifecycle/d;",
            ">;"
        }
    .end annotation
.end field

.field private c:Landroid/app/Application$ActivityLifecycleCallbacks;

.field private d:Z

.field private e:Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/d$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroid/arch/lifecycle/d$a;->b:Ljava/util/Map;

    new-instance v0, Landroid/arch/lifecycle/d$a$1;

    invoke-direct {v0, p0}, Landroid/arch/lifecycle/d$a$1;-><init>(Landroid/arch/lifecycle/d$a;)V

    iput-object v0, p0, Landroid/arch/lifecycle/d$a;->c:Landroid/app/Application$ActivityLifecycleCallbacks;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/arch/lifecycle/d$a;->d:Z

    new-instance v0, Landroid/arch/lifecycle/d$a$2;

    invoke-direct {v0, p0}, Landroid/arch/lifecycle/d$a$2;-><init>(Landroid/arch/lifecycle/d$a;)V

    iput-object v0, p0, Landroid/arch/lifecycle/d$a;->e:Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;

    return-void
.end method

.method private static a(Landroid/support/v4/app/FragmentManager;)Landroid/arch/lifecycle/d;
    .locals 2

    invoke-virtual {p0}, Landroid/support/v4/app/FragmentManager;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from onDestroy"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    const-string v0, "android.arch.lifecycle.state.StateProviderHolderFragment"

    invoke-virtual {p0, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroid/arch/lifecycle/d;

    if-nez v1, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected fragment instance was returned by HOLDER_TAG"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    check-cast v0, Landroid/arch/lifecycle/d;

    return-object v0
.end method

.method static synthetic a(Landroid/arch/lifecycle/d$a;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/d$a;->a:Ljava/util/Map;

    return-object v0
.end method

.method private static b(Landroid/support/v4/app/FragmentManager;)Landroid/arch/lifecycle/d;
    .locals 3

    new-instance v0, Landroid/arch/lifecycle/d;

    invoke-direct {v0}, Landroid/arch/lifecycle/d;-><init>()V

    invoke-virtual {p0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    const-string v2, "android.arch.lifecycle.state.StateProviderHolderFragment"

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    return-object v0
.end method

.method static synthetic b(Landroid/arch/lifecycle/d$a;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/d$a;->b:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method a(Landroid/support/v4/app/Fragment;)V
    .locals 2

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getParentFragment()Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/arch/lifecycle/d$a;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/support/v4/app/Fragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iget-object v1, p0, Landroid/arch/lifecycle/d$a;->e:Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->unregisterFragmentLifecycleCallbacks(Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Landroid/arch/lifecycle/d$a;->a:Ljava/util/Map;

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method b(Landroid/support/v4/app/Fragment;)Landroid/arch/lifecycle/d;
    .locals 4

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-static {v1}, Landroid/arch/lifecycle/d$a;->a(Landroid/support/v4/app/FragmentManager;)Landroid/arch/lifecycle/d;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Landroid/arch/lifecycle/d$a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/arch/lifecycle/d;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iget-object v2, p0, Landroid/arch/lifecycle/d$a;->e:Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/FragmentManager;->registerFragmentLifecycleCallbacks(Landroid/support/v4/app/FragmentManager$FragmentLifecycleCallbacks;Z)V

    invoke-static {v1}, Landroid/arch/lifecycle/d$a;->b(Landroid/support/v4/app/FragmentManager;)Landroid/arch/lifecycle/d;

    move-result-object v0

    iget-object v1, p0, Landroid/arch/lifecycle/d$a;->b:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.class Landroid/arch/lifecycle/p$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/arch/lifecycle/q$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/arch/lifecycle/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/arch/lifecycle/p;


# direct methods
.method constructor <init>(Landroid/arch/lifecycle/p;)V
    .locals 0

    iput-object p1, p0, Landroid/arch/lifecycle/p$2;->a:Landroid/arch/lifecycle/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/p$2;->a:Landroid/arch/lifecycle/p;

    invoke-virtual {v0}, Landroid/arch/lifecycle/p;->a()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Landroid/arch/lifecycle/p$2;->a:Landroid/arch/lifecycle/p;

    invoke-virtual {v0}, Landroid/arch/lifecycle/p;->b()V

    return-void
.end method

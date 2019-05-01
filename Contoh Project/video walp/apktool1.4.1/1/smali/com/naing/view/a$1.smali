.class Lcom/naing/view/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/view/a;->a()Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/view/a;


# direct methods
.method constructor <init>(Lcom/naing/view/a;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/view/a$1;->a:Lcom/naing/view/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lcom/naing/view/a$1;->a:Lcom/naing/view/a;

    invoke-static {v0}, Lcom/naing/view/a;->a(Lcom/naing/view/a;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/naing/c/b;->a(Landroid/content/Context;Z)V

    return-void
.end method

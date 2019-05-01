.class Lcom/flask/colorpicker/a/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/flask/colorpicker/a/b;->a(Ljava/lang/CharSequence;Lcom/flask/colorpicker/a/a;)Lcom/flask/colorpicker/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/flask/colorpicker/a/a;

.field final synthetic b:Lcom/flask/colorpicker/a/b;


# direct methods
.method constructor <init>(Lcom/flask/colorpicker/a/b;Lcom/flask/colorpicker/a/a;)V
    .locals 0

    iput-object p1, p0, Lcom/flask/colorpicker/a/b$1;->b:Lcom/flask/colorpicker/a/b;

    iput-object p2, p0, Lcom/flask/colorpicker/a/b$1;->a:Lcom/flask/colorpicker/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcom/flask/colorpicker/a/b$1;->b:Lcom/flask/colorpicker/a/b;

    iget-object v1, p0, Lcom/flask/colorpicker/a/b$1;->a:Lcom/flask/colorpicker/a/a;

    invoke-static {v0, p1, v1}, Lcom/flask/colorpicker/a/b;->a(Lcom/flask/colorpicker/a/b;Landroid/content/DialogInterface;Lcom/flask/colorpicker/a/a;)V

    return-void
.end method

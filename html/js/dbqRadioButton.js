class DbqRadioButton extends HTMLElement {
    constructor() {
        super();
        console.log("Inicializado...");
    }

    /*connectedCallback() {
        var element = document.getElementById("lienzo");
        var lienzo = element.getContext("2d");

        var degradado = lienzo.createRadialGradient(250,150,50,250,150,300);
        degradado.addColorStop(1,"#f00");
        degradado.addColorStop(0,"#0f0");

        lienzo.fillStyle = degradado;
        lienzo.fillRect(0,0,500,300);
    }*/

    connectedCallback() {
        const canvas = document.getElementById("lienzo");
        const ctx = canvas.getContext("2d");

        ctx.beginPath();
        ctx.arc(100,75,50,0,2*Math.PI);
        ctx.strokeStyle = "White";
        ctx.stroke();

        var degradado = ctx.createRadialGradient(100,75,1,100,75,60);
        degradado.addColorStop(1,"white");
        degradado.addColorStop(0,"red");
        ctx.fillStyle = degradado;
        ctx.fill();

        ctx.beginPath();
        ctx.arc(100,75,20,0,2*Math.PI);
        ctx.fillStyle = "black";
        ctx.fill();

    }

}
    
customElements.define("dbq-radiobutton", DbqRadioButton);
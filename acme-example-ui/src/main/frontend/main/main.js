import "@babel/polyfill";

function main(){
	console.log("Initializing app...")

	btnGetData.onclick = async () => {

		const resp = await fetch("../api/greetings");
		const payload = await resp.json();
		console.log(payload);

		responseText.innerText=JSON.stringify(payload);
	};
}

main();

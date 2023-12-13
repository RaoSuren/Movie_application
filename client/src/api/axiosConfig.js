import axios from "axios";

export default axios.create({
  baseURL: "https://e96xj9t6.cdpad.io",
  headers: { "ngrok-skip-browser-warning": "true" },
});

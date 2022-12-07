(ns ogbe.fulcro.mui.icons.web-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WebSharp" :default WebSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-web-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WebSharp)))
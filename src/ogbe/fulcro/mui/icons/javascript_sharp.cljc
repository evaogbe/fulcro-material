(ns ogbe.fulcro.mui.icons.javascript-sharp
  #?(:cljs (:require
            ["@mui/icons-material/JavascriptSharp" :default JavascriptSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-javascript-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JavascriptSharp)))
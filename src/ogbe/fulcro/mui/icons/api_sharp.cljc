(ns ogbe.fulcro.mui.icons.api-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ApiSharp" :default ApiSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-api-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApiSharp)))
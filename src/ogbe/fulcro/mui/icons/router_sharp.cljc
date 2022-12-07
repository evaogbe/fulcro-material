(ns ogbe.fulcro.mui.icons.router-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RouterSharp" :default RouterSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-router-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouterSharp)))
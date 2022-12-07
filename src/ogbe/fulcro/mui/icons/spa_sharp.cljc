(ns ogbe.fulcro.mui.icons.spa-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SpaSharp" :default SpaSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spa-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaSharp)))
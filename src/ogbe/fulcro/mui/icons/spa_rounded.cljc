(ns ogbe.fulcro.mui.icons.spa-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SpaRounded" :default SpaRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spa-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpaRounded)))
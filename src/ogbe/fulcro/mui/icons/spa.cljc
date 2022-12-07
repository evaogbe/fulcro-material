(ns ogbe.fulcro.mui.icons.spa
  #?(:cljs (:require
            ["@mui/icons-material/Spa" :default Spa]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-spa
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Spa)))
(ns ogbe.fulcro.mui.icons.loyalty
  #?(:cljs (:require
            ["@mui/icons-material/Loyalty" :default Loyalty]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-loyalty
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Loyalty)))
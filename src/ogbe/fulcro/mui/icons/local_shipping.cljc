(ns ogbe.fulcro.mui.icons.local-shipping
  #?(:cljs (:require
            ["@mui/icons-material/LocalShipping" :default LocalShipping]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-shipping
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalShipping)))
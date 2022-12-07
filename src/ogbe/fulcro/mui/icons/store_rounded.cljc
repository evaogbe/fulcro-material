(ns ogbe.fulcro.mui.icons.store-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StoreRounded" :default StoreRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-store-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StoreRounded)))
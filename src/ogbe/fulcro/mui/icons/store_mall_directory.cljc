(ns ogbe.fulcro.mui.icons.store-mall-directory
  #?(:cljs (:require
            ["@mui/icons-material/StoreMallDirectory" :default StoreMallDirectory]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-store-mall-directory
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StoreMallDirectory)))
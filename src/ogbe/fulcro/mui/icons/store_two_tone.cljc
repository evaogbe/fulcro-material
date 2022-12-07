(ns ogbe.fulcro.mui.icons.store-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/StoreTwoTone" :default StoreTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-store-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StoreTwoTone)))
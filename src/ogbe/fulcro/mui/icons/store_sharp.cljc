(ns ogbe.fulcro.mui.icons.store-sharp
  #?(:cljs (:require
            ["@mui/icons-material/StoreSharp" :default StoreSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-store-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StoreSharp)))
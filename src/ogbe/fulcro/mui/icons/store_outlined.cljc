(ns ogbe.fulcro.mui.icons.store-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StoreOutlined" :default StoreOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-store-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StoreOutlined)))
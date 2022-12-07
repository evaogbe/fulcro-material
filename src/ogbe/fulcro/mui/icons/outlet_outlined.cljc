(ns ogbe.fulcro.mui.icons.outlet-outlined
  #?(:cljs (:require
            ["@mui/icons-material/OutletOutlined" :default OutletOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outlet-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutletOutlined)))
(ns ogbe.fulcro.mui.icons.streetview-outlined
  #?(:cljs (:require
            ["@mui/icons-material/StreetviewOutlined" :default StreetviewOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-streetview-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StreetviewOutlined)))